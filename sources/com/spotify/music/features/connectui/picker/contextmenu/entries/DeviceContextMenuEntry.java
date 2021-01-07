package com.spotify.music.features.connectui.picker.contextmenu.entries;

public interface DeviceContextMenuEntry {

    public enum Type {
        FORGET_DEVICE,
        INCARNATION,
        THIRD_PARTY
    }

    Type getType();
}
