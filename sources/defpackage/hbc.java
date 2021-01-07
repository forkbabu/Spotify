package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;

/* access modifiers changed from: package-private */
/* renamed from: hbc  reason: default package */
public class hbc implements PageLoaderView.c {
    private final h0 a;
    private final c b;
    private final ij9 c;
    private ViewLoadingTracker d;

    public hbc(h0 h0Var, c cVar, ij9 ij9) {
        h0Var.getClass();
        this.a = h0Var;
        cVar.getClass();
        this.b = cVar;
        ij9.getClass();
        this.c = ij9;
    }

    private void h(Bundle bundle) {
        ViewLoadingTracker viewLoadingTracker = this.d;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
        this.d = this.a.a(null, this.b.toString(), bundle, this.c);
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void a() {
        h(null);
        this.d.x(ViewLoadingTracker.Reason.RELOAD);
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void b(View view) {
        ViewLoadingTracker viewLoadingTracker = this.d;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.i(ViewLoadingTracker.DataSource.UNKNOWN, view);
        }
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void c() {
        h(null);
        this.d.x(ViewLoadingTracker.Reason.LOAD);
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void d(Bundle bundle) {
        h(bundle);
        this.d.x(ViewLoadingTracker.Reason.LOAD);
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void e() {
        ViewLoadingTracker viewLoadingTracker = this.d;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public Bundle f() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        this.d.t(bundle);
        return bundle;
    }

    @Override // com.spotify.pageloader.PageLoaderView.c
    public void g() {
        ViewLoadingTracker viewLoadingTracker = this.d;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.j();
        }
    }
}
