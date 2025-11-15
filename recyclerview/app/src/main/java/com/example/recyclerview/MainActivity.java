package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private CustomAdapter adapter;

    private int nextId = 1000;
    private final Set<Integer> usedIds = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        setSupportActionBar(ui.topAppBar);

        ArrayList<DataModel> data = new ArrayList<>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(MyData.nameArray[i], MyData.versionArray[i], MyData.id_[i], MyData.drawableArray[i]));
            usedIds.add(MyData.id_[i]);
        }

        adapter = new CustomAdapter(data);
        ui.myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ui.myRecyclerView.setHasFixedSize(true);
        ui.myRecyclerView.setAdapter(adapter);

        adapter.setOnItemClick((item, position, view) -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", item.getName());
            intent.putExtra("version", item.getVersion());
            intent.putExtra("image", item.getImage());
            startActivity(intent);
        });

        ItemTouchHelper.SimpleCallback swipe = new ItemTouchHelper.SimpleCallback(0,
                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override public boolean onMove(@NonNull RecyclerView rv, @NonNull RecyclerView.ViewHolder vh, @NonNull RecyclerView.ViewHolder tgt) { return false; }
            @Override public void onSwiped(@NonNull RecyclerView.ViewHolder vh, int dir) {
                int pos = vh.getBindingAdapterPosition();
                DataModel removed = adapter.removeAt(pos);
                Snackbar.make(ui.myRecyclerView, "Đã xóa " + removed.getName(), Snackbar.LENGTH_LONG)
                        .setAction("HOÀN TÁC", v -> adapter.insertAt(removed, pos))
                        .setBackgroundTint(getColor(R.color.teal_700))
                        .setTextColor(getColor(R.color.white))
                        .setActionTextColor(getColor(R.color.teal_100))
                        .show();
            }
        };
        new ItemTouchHelper(swipe).attachToRecyclerView(ui.myRecyclerView);

        ui.fabAdd.setOnClickListener(v -> showAddDialog());
        ui.topAppBar.setOnMenuItemClickListener(this::onToolbarMenu);
    }

    private boolean onToolbarMenu(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_add) {
            showAddDialog();
            return true;
        } else if (id == R.id.action_shuffle) {
            adapter.shuffle();
            return true;
        }
        return false;
    }

    private void showAddDialog() {
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_item, null, false);
        TextInputLayout tilName = dialogView.findViewById(R.id.tilName);
        TextInputLayout tilVersion = dialogView.findViewById(R.id.tilVersion);
        TextInputEditText etName = dialogView.findViewById(R.id.etName);
        TextInputEditText etVersion = dialogView.findViewById(R.id.etVersion);

        AlertDialog dlg = new AlertDialog.Builder(this)
                .setView(dialogView)
                .setPositiveButton("Thêm", null)
                .setNegativeButton("Hủy", (d, w) -> d.dismiss())
                .create();

        dlg.setOnShowListener(d -> {
            dlg.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(v -> {
                String name = etName.getText() == null ? "" : etName.getText().toString().trim();
                String version = etVersion.getText() == null ? "" : etVersion.getText().toString().trim();

                boolean ok = true;
                tilName.setError(null);
                tilVersion.setError(null);

                if (name.isEmpty()) { tilName.setError("Nhập tên"); ok = false; }
                if (version.isEmpty()) { tilVersion.setError("Nhập version"); ok = false; }
                if (!ok) return;

                int newId = nextId;
                while (usedIds.contains(newId)) newId++;
                usedIds.add(newId);
                nextId = newId + 1;

                DataModel model = new DataModel(name, version, newId, android.R.drawable.ic_menu_add);
                adapter.insertAt(model, 0);

                Toast.makeText(this, "Đã thêm \"" + name + "\"", Toast.LENGTH_SHORT).show();
                dlg.dismiss();
            });
        });

        dlg.show();
    }
}
