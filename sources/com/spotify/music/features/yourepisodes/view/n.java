package com.spotify.music.features.yourepisodes.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.entrypoint.EncoreConsumerYourEpisodesHeaderExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.domain.l;
import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.w;
import com.spotify.pageloader.s0;
import defpackage.zf9;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class n implements s0 {
    private a0 a;
    private t b;
    private MobiusLoop.g<l, j> c;
    private final s<c> f;
    private final w n;
    private final b0 o;
    private final p p;
    private final b q;
    private final u r;
    private final e s;
    private final EncoreConsumerEntryPoint t;

    public n(s<c> sVar, w wVar, b0 b0Var, p pVar, b bVar, u uVar, e eVar, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        h.e(sVar, "data");
        h.e(wVar, "injector");
        h.e(b0Var, "viewsFactory");
        h.e(pVar, "viewBinderFactory");
        h.e(bVar, "headerViewBinderFactory");
        h.e(uVar, "viewConnectableFactory");
        h.e(eVar, "downloadListener");
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        this.f = sVar;
        this.n = wVar;
        this.o = b0Var;
        this.p = pVar;
        this.q = bVar;
        this.r = uVar;
        this.s = eVar;
        this.t = encoreConsumerEntryPoint;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        a0 a0Var = this.a;
        if (a0Var == null) {
            return null;
        }
        if (a0Var != null) {
            return a0Var.i();
        }
        h.k("views");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a = this.o.a(layoutInflater, viewGroup);
        YourEpisodesHeader make = EncoreConsumerYourEpisodesHeaderExtensions.yourEpisodesHeaderFactory(this.t.getHeaders()).make();
        p pVar = this.p;
        a0 a0Var = this.a;
        if (a0Var != null) {
            this.b = this.r.a(pVar.a(a0Var, make), this.q.a(context, make));
            w wVar = this.n;
            l.a aVar = l.e;
            this.c = wVar.a(l.d, this.f);
            return;
        }
        h.k("views");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<l, j> gVar = this.c;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            h.k("controller");
            throw null;
        } else if (!gVar.isRunning()) {
            zf9.b a2 = zf9.a();
            t tVar = this.b;
            if (tVar != null) {
                a2.a(tVar);
                a2.a(this.s);
                zf9 b2 = a2.b();
                MobiusLoop.g<l, j> gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.c(b2);
                    MobiusLoop.g<l, j> gVar3 = this.c;
                    if (gVar3 != null) {
                        gVar3.start();
                    } else {
                        h.k("controller");
                        throw null;
                    }
                } else {
                    h.k("controller");
                    throw null;
                }
            } else {
                h.k("viewConnectable");
                throw null;
            }
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<l, j> gVar = this.c;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            h.k("controller");
            throw null;
        } else if (gVar.isRunning()) {
            MobiusLoop.g<l, j> gVar2 = this.c;
            if (gVar2 != null) {
                gVar2.stop();
                MobiusLoop.g<l, j> gVar3 = this.c;
                if (gVar3 != null) {
                    gVar3.d();
                } else {
                    h.k("controller");
                    throw null;
                }
            } else {
                h.k("controller");
                throw null;
            }
        }
    }
}
