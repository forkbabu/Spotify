package com.airbnb.lottie.network;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.extension;
    }
}
