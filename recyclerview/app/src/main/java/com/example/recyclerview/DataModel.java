package com.example.recyclerview;

public class DataModel {
    private final String name;
    private final String version;
    private final int id;
    private final int image;

    public DataModel(String name, String version, int id, int image) {
        this.name = name;
        this.version = version;
        this.id = id;
        this.image = image;
    }
    public String getName() { return name; }
    public String getVersion() { return version; }
    public int getId() { return id; }
    public int getImage() { return image; }
}
