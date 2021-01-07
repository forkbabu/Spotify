package com.spotify.music.features.connectui.picker.contextmenu.entries;

import android.net.Uri;
import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;

public class c implements DeviceContextMenuEntry {
    private final String a;
    private final String b;
    private final Uri c;
    private final Uri d;

    public c(String str, String str2, Uri uri, Uri uri2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = uri2;
    }

    public Uri a() {
        return this.c;
    }

    public Uri b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry
    public DeviceContextMenuEntry.Type getType() {
        return DeviceContextMenuEntry.Type.THIRD_PARTY;
    }
}
