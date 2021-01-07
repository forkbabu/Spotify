package com.spotify.music.features.connectui.picker.contextmenu.entries;

import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;

public class a implements DeviceContextMenuEntry {
    @Override // com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry
    public DeviceContextMenuEntry.Type getType() {
        return DeviceContextMenuEntry.Type.FORGET_DEVICE;
    }
}
