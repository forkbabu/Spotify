package com.spotify.music.features.podcast.entity.loadedpage.data;

import android.net.Uri;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.q;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T, R> implements l<Show, a> {
    final /* synthetic */ g a;

    c(g gVar) {
        this.a = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public a apply(Show show) {
        Show show2 = show;
        h.e(show2, "it");
        String h = show2.h();
        String i = show2.i();
        g gVar = this.a;
        Covers c = show2.c();
        gVar.getClass();
        Uri parse = Uri.parse(q.c(c, Covers.Size.LARGE));
        h.d(parse, "it.covers.toImageUri()");
        return new a(h, i, parse, show2.getUri(), show2.g());
    }
}
