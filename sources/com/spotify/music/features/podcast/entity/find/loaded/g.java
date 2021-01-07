package com.spotify.music.features.podcast.entity.find.loaded;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.pageloader.s0;
import defpackage.x37;
import kotlin.jvm.internal.h;

public final class g implements s0 {
    private View a;
    private MobiusLoop.g<w37, u37> b;
    private final i c;
    private final f f;
    private final o37 n;

    public interface a {
    }

    public g(i iVar, f fVar, o37 o37) {
        h.e(iVar, "viewBinder");
        h.e(fVar, "injector");
        h.e(o37, "dataModel");
        this.c = iVar;
        this.f = fVar;
        this.n = o37;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a = this.c.h1(context, viewGroup, layoutInflater);
        MobiusLoop.g<w37, u37> a2 = this.f.a(new w37(new x37.b(this.n.a().getItems()), "", this.n.a()));
        this.b = a2;
        if (a2 != null) {
            a2.c(this.c);
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<w37, u37> gVar = this.b;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<w37, u37> gVar = this.b;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
