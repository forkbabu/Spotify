package com.spotify.music.features.collectionartist.adapter;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.o;

public final class a {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<h> c;

    public a(wlf<Context> wlf, wlf<c> wlf2, wlf<h> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public AlbumsWithTracksAdapter b(boolean z, b4<o> b4Var, b4<AlbumsWithTracksAdapter.a> b4Var2) {
        a(b4Var, 2);
        a(b4Var2, 3);
        Context context = this.a.get();
        a(context, 4);
        Context context2 = context;
        c cVar = this.b.get();
        a(cVar, 5);
        c cVar2 = cVar;
        h hVar = this.c.get();
        a(hVar, 6);
        return new AlbumsWithTracksAdapter(z, b4Var, b4Var2, context2, cVar2, hVar);
    }
}
