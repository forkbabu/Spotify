package com.spotify.music.features.connectui.picker.contextmenu.entries;

import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;

public class b implements DeviceContextMenuEntry {
    private final String a;
    private final boolean b;
    private final boolean c;

    public b(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry
    public DeviceContextMenuEntry.Type getType() {
        return DeviceContextMenuEntry.Type.INCARNATION;
    }
}
