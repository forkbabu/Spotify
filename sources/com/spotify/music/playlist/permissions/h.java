package com.spotify.music.playlist.permissions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.playlist.permissions.j;
import com.spotify.music.playlist.permissions.l;
import com.spotify.music.playlist.permissions.o;
import com.spotify.pageloader.s0;
import kotlin.f;

public final class h implements s0, e {
    private View a;
    private o b;
    private l c;
    private final l.a f;
    private final o.a n;
    private final s o;
    private final cmf<f> p;
    private final j.b q;

    public interface a {
    }

    public h(l.a aVar, o.a aVar2, s sVar, cmf<f> cmf, j.b bVar) {
        kotlin.jvm.internal.h.e(aVar, "presenterFactory");
        kotlin.jvm.internal.h.e(aVar2, "viewBinderFactory");
        kotlin.jvm.internal.h.e(sVar, "logger");
        kotlin.jvm.internal.h.e(cmf, "dismissDialog");
        kotlin.jvm.internal.h.e(bVar, "result");
        this.f = aVar;
        this.n = aVar2;
        this.o = sVar;
        this.p = cmf;
        this.q = bVar;
    }

    @Override // com.spotify.music.playlist.permissions.e
    public void a(boolean z) {
        o oVar = this.b;
        if (oVar != null) {
            ((p) oVar).c(z);
        }
    }

    @Override // com.spotify.music.playlist.permissions.e
    public void dismiss() {
        this.p.invoke();
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        l a2 = this.f.a(this, this.q);
        this.c = a2;
        o.a aVar = this.n;
        if (a2 != null) {
            p pVar = (p) aVar.a(a2);
            this.a = pVar.a(context, layoutInflater, viewGroup);
            pVar.b(this.q.c());
            this.b = pVar;
            this.o.c();
            return;
        }
        kotlin.jvm.internal.h.k("presenter");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        l lVar = this.c;
        if (lVar != null) {
            lVar.stop();
        } else {
            kotlin.jvm.internal.h.k("presenter");
            throw null;
        }
    }
}
