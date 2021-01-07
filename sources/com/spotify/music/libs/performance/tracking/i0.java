package com.spotify.music.libs.performance.tracking;

import android.os.Bundle;
import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.s;
import io.reactivex.w;

public abstract class i0<T> implements w<T, T> {
    private final h0 a;
    private final ij9 b;
    private View c;
    private ViewLoadingTracker d;
    private ViewLoadingTracker.DataSource e = ViewLoadingTracker.DataSource.UNKNOWN;
    private ViewLoadingTracker.Reason f = ViewLoadingTracker.Reason.UNKNOWN;

    class a extends m {
        final /* synthetic */ k a;
        final /* synthetic */ c b;

        a(k kVar, c cVar) {
            this.a = kVar;
            this.b = cVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            ViewLoadingTracker viewLoadingTracker = i0.this.d;
            if (viewLoadingTracker != null) {
                viewLoadingTracker.t(bundle);
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            if (i0.this.d == null) {
                i0 i0Var = i0.this;
                i0Var.d = i0Var.a.c(i0.this.c, this.b.toString(), bundle, i0.this.b, i0.this.f);
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.a.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            ViewLoadingTracker viewLoadingTracker = i0.this.d;
            if (viewLoadingTracker != null) {
                viewLoadingTracker.f();
            }
        }
    }

    protected i0(k kVar, h0 h0Var, c cVar, ij9 ij9) {
        this.a = h0Var;
        this.b = ij9;
        kVar.y0(new a(kVar, cVar));
    }

    public static void k(i0 i0Var, Object obj) {
        ViewLoadingTracker viewLoadingTracker = i0Var.d;
        if (viewLoadingTracker != null && !viewLoadingTracker.l() && i0Var.i(obj)) {
            viewLoadingTracker.h(i0Var.e);
        }
    }

    public s<T> g(s<T> sVar) {
        return sVar.N(new k(this)).L(new j(this));
    }

    /* access modifiers changed from: protected */
    public void h() {
        ViewLoadingTracker viewLoadingTracker = this.d;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.j();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean i(T t);

    public boolean j() {
        return this.d != null;
    }

    public void l(ViewLoadingTracker.DataSource dataSource) {
        this.e = dataSource;
    }

    public void m(View view) {
        this.c = view;
        Assertion.m(view == null || this.d == null, "%s", "Should not be called after the tracker is created");
    }

    public void n(ViewLoadingTracker.Reason reason) {
        this.f = reason;
    }
}
