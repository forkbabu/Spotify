package com.spotify.music.features.playlistentity.itemlist.adapter;

import android.content.Context;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import java.util.Map;

final class b implements a {
    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.a
    public ContextMenuItem a(Context context, l lVar, int i) {
        ContextMenuItem.Type type;
        o g = lVar.g();
        Episode c = lVar.c();
        Map<String, String> d = lVar.d();
        if (g != null) {
            ContextMenuItem.a a = ContextMenuItem.a();
            a.c(i);
            a.d(lVar.e());
            a.g(lVar.getUri());
            a.e(lVar.f());
            a.a(d);
            a.f(ContextMenuItem.Type.TRACK);
            return a.b();
        } else if (c == null) {
            return null;
        } else {
            ContextMenuItem.a a2 = ContextMenuItem.a();
            a2.c(i);
            a2.d(lVar.e());
            a2.g(lVar.getUri());
            a2.e(lVar.f());
            if (c.l() == Episode.MediaType.VIDEO) {
                type = ContextMenuItem.Type.VIDEO_EPISODE;
            } else if (c.g()) {
                type = ContextMenuItem.Type.MUSIC_AND_TALK_EPISODE;
            } else {
                type = ContextMenuItem.Type.AUDIO_EPISODE;
            }
            a2.f(type);
            a2.a(d);
            return a2.b();
        }
    }
}
