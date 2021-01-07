package com.spotify.music.features.charts;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.C0707R;
import defpackage.o1e;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class c implements d {
    private final Resources a;
    private final z<HubsJsonViewModel> b;
    private final y c;
    private final y d;

    static final class a<T, R> implements l<Throwable, b91> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(Throwable th) {
            h.e(th, "it");
            return t71.a(SpotifyIconV2.WARNING, this.a.a.getString(C0707R.string.error_general_title), this.a.a.getString(C0707R.string.error_general_body));
        }
    }

    public c(Resources resources, z<HubsJsonViewModel> zVar, y yVar, y yVar2) {
        h.e(resources, "resources");
        h.e(zVar, "dataSource");
        h.e(yVar, "mainThread");
        h.e(yVar2, "computation");
        this.a = resources;
        this.b = zVar;
        this.c = yVar;
        this.d = yVar2;
    }

    @Override // com.spotify.music.features.charts.d
    public s<b91> a() {
        s<U> r0 = this.b.P().h(b91.class).r0(new a(this));
        o1e.b bVar = new o1e.b(t71.c(), this.d);
        bVar.b(300);
        s<R> o0 = r0.q(bVar.a()).o0(this.c);
        h.d(o0, "dataSource\n            .…  ).observeOn(mainThread)");
        return o0;
    }
}
