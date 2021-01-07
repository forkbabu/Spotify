package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import android.content.Context;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import defpackage.j1c;
import io.reactivex.functions.l;
import io.reactivex.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final j1c.a.AbstractC0624a.b a;
    private final g<a.C0316a> b;
    private final Context c;
    private final q1c d;
    private final i e;

    static final class a<T, R> implements l<c, a.C0316a> {
        final /* synthetic */ b a;
        final /* synthetic */ n1c b;

        a(b bVar, n1c n1c) {
            this.a = bVar;
            this.b = n1c;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public a.C0316a apply(c cVar) {
            c cVar2 = cVar;
            h.e(cVar2, "trackListModel");
            this.b.reset();
            List<com.spotify.music.nowplaying.podcast.mixedmedia.model.b> d = cVar2.d();
            Pair pair = new Pair(j1c.a.c.c, new j1c.b.C0628b(0, false, 2));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T t : d) {
                int i2 = i + 1;
                if (i >= 0) {
                    T t2 = t;
                    j1c.a aVar = (j1c.a) pair.a();
                    j1c.b.C0628b bVar = (j1c.b.C0628b) pair.b();
                    j1c.b.a a2 = iyb.a(t2);
                    m1c a3 = this.a.d.a(a2);
                    arrayList.add(new f(t2, i, aVar, bVar, a3));
                    int b2 = aVar.b();
                    pair = new Pair(new j1c.a.b.C0626a(this.a.c, a3.a().b() + b2), new j1c.b.C0628b(a2.a() + bVar.a(), false, 2));
                    i = i2;
                } else {
                    d.L();
                    throw null;
                }
            }
            this.a.e.h(new j1c.a.b.C0626a(this.a.c, this.a.a.b() + ((j1c.a) pair.a()).b()));
            return new a.C0316a(cVar2, arrayList, new j1c.b.a(((j1c.b.C0628b) pair.b()).a()));
        }
    }

    public b(Context context, q1c q1c, i iVar, g<c> gVar, n1c n1c) {
        h.e(context, "context");
        h.e(q1c, "densityHelper");
        h.e(iVar, "positionState");
        h.e(gVar, "trackListModelFlowable");
        h.e(n1c, "timeLineDragHelper");
        this.c = context;
        this.d = q1c;
        this.e = iVar;
        this.a = new j1c.a.AbstractC0624a.b(context, 2.0f);
        this.b = gVar.O(new a(this, n1c)).Z();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.a
    public g<a.C0316a> a() {
        return this.b;
    }
}
