package com.spotify.music.features.playlistentity.itemlist.adapter;

import android.text.TextUtils;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;

final class e implements d {
    private String a;

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.d
    public boolean a(l lVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        o g = lVar.g();
        if (g != null) {
            str = g.getPreviewId();
        } else {
            Episode c = lVar.c();
            str = c != null ? c.s() : null;
        }
        sb.append(str);
        sb.append(lVar.f());
        return TextUtils.equals(this.a, sb.toString());
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.d
    public boolean b(l lVar) {
        return TextUtils.equals(this.a, lVar.f());
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.d
    public boolean c(String str) {
        if (TextUtils.equals(this.a, str)) {
            return false;
        }
        this.a = str;
        return true;
    }
}
