package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: xc8  reason: default package */
public class xc8 implements dd8 {
    private final h0 a;
    private final ij9 b;
    private final c c;
    private View d;
    private ViewLoadingTracker e;

    /* renamed from: xc8$a */
    class a extends m {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.a.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            xc8.this.a();
        }
    }

    public xc8(k kVar, h0 h0Var, ij9 ij9, c cVar) {
        this.a = h0Var;
        this.b = ij9;
        this.c = cVar;
        kVar.y0(new a(kVar));
    }

    @Override // defpackage.dd8
    public void a() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
    }

    @Override // defpackage.dd8
    public void b(View view) {
        this.d = view;
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null && !viewLoadingTracker.l()) {
            Assertion.g("Should not be called after the tracker is created");
        }
    }

    @Override // defpackage.dd8
    public void c() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.j();
        }
    }

    @Override // defpackage.dd8
    public void d() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null && !viewLoadingTracker.l()) {
            this.e.g();
        }
    }

    @Override // defpackage.dd8
    public void e() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
        this.e = this.a.b(this.d, this.c.toString(), null, this.b);
    }

    @Override // defpackage.dd8
    public void reset() {
        this.e = null;
    }
}
