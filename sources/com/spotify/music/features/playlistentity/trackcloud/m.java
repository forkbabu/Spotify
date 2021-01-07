package com.spotify.music.features.playlistentity.trackcloud;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.components.trackcloud.a;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;

public final /* synthetic */ class m implements Function {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        l lVar = (l) obj;
        int i = d0.w;
        lVar.getClass();
        o g = lVar.g();
        if (g != null) {
            ImmutableList<b> artists = g.getArtists();
            return new a.C0145a(g.getName(), (artists == null || artists.isEmpty()) ? null : artists.get(0).f(), g.isInCollection(), true);
        }
        Episode c = lVar.c();
        c.getClass();
        String n = c.n();
        Show w = c.w();
        w.getClass();
        return new a.C0145a(n, w.h(), false, true);
    }
}
