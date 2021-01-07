package com.spotify.music.features.charts;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.android.glue.patterns.prettylist.u;
import kotlin.jvm.internal.h;

public final class ChartsHubsViewBinder implements i, m {
    private Parcelable a;
    private u b;
    private final b61 c;
    private final e61 f;
    private final n n;

    public ChartsHubsViewBinder(b61 b61, e61 e61, w51 w51, n nVar) {
        h.e(b61, "hubsPresenter");
        h.e(e61, "hubsViewBinder");
        h.e(w51, "hubsConfig");
        h.e(nVar, "lifecycleOwner");
        this.c = b61;
        this.f = e61;
        this.n = nVar;
        View b2 = e61.b();
        h.d(b2, "hubsViewBinder.rootView");
        this.b = l70.k(b2.getContext());
        nVar.A().a(this);
    }

    @Override // com.spotify.music.features.charts.i
    public void a(b91 b91) {
        h.e(b91, "viewModel");
        this.c.k(b91);
        int i = t71.c;
        if (!"hubs/placeholder".equals(b91.id())) {
            this.c.i(this.a);
            this.a = null;
        }
    }

    @Override // com.spotify.music.features.charts.i
    public View b() {
        View b2 = this.f.b();
        h.d(b2, "hubsViewBinder.rootView");
        return b2;
    }

    @Override // com.spotify.music.features.charts.i
    public void c(Bundle bundle) {
        h.e(bundle, "outState");
        bundle.putParcelable("hubsPresenterState", this.c.j());
    }

    @Override // com.spotify.music.features.charts.i
    public void d(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(b61.class.getClassLoader());
            this.a = bundle.getParcelable("hubsPresenterState");
        }
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        u uVar = this.b;
        if (uVar != null) {
            uVar.u(null);
        }
        this.n.A().c(this);
    }
}
