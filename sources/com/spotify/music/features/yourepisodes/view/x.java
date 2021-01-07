package com.spotify.music.features.yourepisodes.view;

import com.spotify.mobile.android.ui.view.y;
import com.spotify.mobius.h;
import com.spotify.music.features.yourepisodes.a0;
import com.spotify.music.features.yourepisodes.domain.HeaderAction;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.domain.l;

public final class x implements t {
    private da2<j> a;
    private final o b;
    private final a c;
    private final y f;
    private final a0 n;

    public static final class a implements h<l> {
        final /* synthetic */ x a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(x xVar) {
            this.a = xVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            l lVar = (l) obj;
            kotlin.jvm.internal.h.e(lVar, "model");
            this.a.c.a(lVar);
            this.a.b.a(lVar);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public x(o oVar, a aVar, y yVar, a0 a0Var) {
        kotlin.jvm.internal.h.e(oVar, "viewBinder");
        kotlin.jvm.internal.h.e(aVar, "headerViewBinder");
        kotlin.jvm.internal.h.e(yVar, "removeDownloadConfirmationDialog");
        kotlin.jvm.internal.h.e(a0Var, "logger");
        this.b = oVar;
        this.c = aVar;
        this.f = yVar;
        this.n = a0Var;
        aVar.c(new YourEpisodesViewConnectableImpl$setupHeader$1(this), new YourEpisodesViewConnectableImpl$setupHeader$2(this), new YourEpisodesViewConnectableImpl$setupHeader$3(this));
        oVar.b();
    }

    public static final void a(x xVar) {
        xVar.n.g();
        da2<j> da2 = xVar.a;
        if (da2 != null) {
            da2.accept(new j.b(HeaderAction.DOWNLOAD));
        } else {
            kotlin.jvm.internal.h.k("eventConsumer");
            throw null;
        }
    }

    public static final /* synthetic */ da2 b(x xVar) {
        da2<j> da2 = xVar.a;
        if (da2 != null) {
            return da2;
        }
        kotlin.jvm.internal.h.k("eventConsumer");
        throw null;
    }

    public static final void f(x xVar) {
        xVar.n.f();
        xVar.f.a(new y(xVar), new z(xVar));
    }

    public static final void g(x xVar) {
        xVar.n.e();
        da2<j> da2 = xVar.a;
        if (da2 != null) {
            da2.accept(new j.b(HeaderAction.REMOVE_DOWNLOADS));
        } else {
            kotlin.jvm.internal.h.k("eventConsumer");
            throw null;
        }
    }

    @Override // com.spotify.mobius.g
    public h<l> t(da2<j> da2) {
        kotlin.jvm.internal.h.e(da2, "yourEpisodesEventConsumer");
        this.a = da2;
        this.c.b();
        return new a(this);
    }
}
