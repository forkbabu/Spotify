package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import com.google.android.play.core.tasks.c;
import java.util.List;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class s2 {
    private static final a e = new a("AssetPackManager");
    private final z a;
    private final x<f3> b;
    private final t c;
    private final x<Executor> d;

    s2(z zVar, x<f3> xVar, t tVar, com.google.android.play.core.splitinstall.a aVar, i1 i1Var, u0 u0Var, j0 j0Var, x<Executor> xVar2) {
        new Handler(Looper.getMainLooper());
        this.a = zVar;
        this.b = xVar;
        this.c = tVar;
        this.d = xVar2;
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        boolean d2 = this.c.d();
        this.c.c(z);
        if (z && !d2) {
            this.d.e().execute(new p2(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        c<List<String>> G = this.b.e().G(this.a.i());
        z zVar = this.a;
        zVar.getClass();
        G.b(this.d.e(), q2.a(zVar));
        G.a(this.d.e(), r2.a);
    }
}
