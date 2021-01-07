package com.spotify.music.features.carepackage.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.carepackage.CarePackageInjector;
import com.spotify.music.preview.q;
import com.spotify.pageloader.s0;
import com.spotify.playlist.models.k;
import com.squareup.picasso.Picasso;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class a implements s0 {
    private MobiusLoop.g<dh4, bh4> a;
    private CarePackageViews b;
    private final Picasso c;
    private final CarePackageInjector f;
    private final q n;
    private final s<k> o;
    private final ui4 p;

    public a(Picasso picasso, CarePackageInjector carePackageInjector, q qVar, s<k> sVar, ui4 ui4) {
        h.e(picasso, "picasso");
        h.e(carePackageInjector, "injector");
        h.e(qVar, "previewOverlay");
        h.e(sVar, "playlistEntityObservable");
        h.e(ui4, "audioPlusLogger");
        this.c = picasso;
        this.f = carePackageInjector;
        this.n = qVar;
        this.o = sVar;
        this.p = ui4;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        CarePackageViews carePackageViews = this.b;
        if (carePackageViews != null) {
            return carePackageViews.g();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "container");
        h.e(layoutInflater, "inflater");
        this.b = new CarePackageViews(layoutInflater, viewGroup, this.c, this.n, this.p);
        MobiusLoop.g<dh4, bh4> b2 = this.f.b(new dh4(null, null, 3), this.o);
        this.a = b2;
        if (b2 != null) {
            CarePackageViews carePackageViews = this.b;
            h.c(carePackageViews);
            b2.c(carePackageViews);
            return;
        }
        h.k("controller");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<dh4, bh4> gVar = this.a;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<dh4, bh4> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
