package com.spotify.music.playlist.service;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.h;

public final class c implements b {
    private final Context a;

    public c(Context context) {
        h.e(context, "mContext");
        this.a = context;
    }

    private final void g(String str, String str2, Boolean bool) {
        Intent intent = new Intent(this.a, PlaylistService.class);
        intent.setAction(str);
        intent.putExtra("playlist_uri", str2);
        if (bool != null) {
            intent.putExtra("new_state", bool.booleanValue());
        }
        this.a.startService(intent);
    }

    public void a(String str) {
        h.e(str, "playlistUri");
        g("com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, null);
    }

    public void b(String str, boolean z) {
        h.e(str, "playlistUri");
        g("com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, Boolean.valueOf(z));
    }

    public void c(String str, String str2) {
        h.e(str, "playlistUri");
        h.e(str2, "rowId");
        Intent intent = new Intent(this.a, PlaylistService.class);
        intent.setAction("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE_ITEM");
        intent.putExtra("playlist_uri", str);
        intent.putExtra("row_id", str2);
        this.a.startService(intent);
    }

    public void d(String str) {
        h.e(str, "playlistUri");
        g("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE", str, null);
    }

    public void e(String str, boolean z) {
        h.e(str, "playlistUri");
        g("com.spotify.mobile.android.spotlets.playlist.service.action.COLLABORATIVE", str, Boolean.valueOf(z));
    }

    public void f(String str, boolean z) {
        h.e(str, "playlistUri");
        g("com.spotify.mobile.android.spotlets.playlist.service.action.PUBLISH", str, Boolean.valueOf(z));
    }
}
