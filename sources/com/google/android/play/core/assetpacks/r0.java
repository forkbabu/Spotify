package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class r0 {
    private static final a j = new a("ExtractorLooper");
    private final i1 a;
    private final p0 b;
    private final m2 c;
    private final w1 d;
    private final a2 e;
    private final f2 f;
    private final x<f3> g;
    private final l1 h;
    private final AtomicBoolean i = new AtomicBoolean(false);

    r0(i1 i1Var, x<f3> xVar, p0 p0Var, m2 m2Var, w1 w1Var, a2 a2Var, f2 f2Var, l1 l1Var) {
        this.a = i1Var;
        this.g = xVar;
        this.b = p0Var;
        this.c = m2Var;
        this.d = w1Var;
        this.e = a2Var;
        this.f = f2Var;
        this.h = l1Var;
    }

    private final void b(int i2, Exception exc) {
        try {
            this.a.o(i2);
            this.a.c(i2);
        } catch (bv unused) {
            j.e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a aVar = j;
        aVar.c("Run extractor loop", new Object[0]);
        if (this.i.compareAndSet(false, true)) {
            while (true) {
                k1 k1Var = null;
                try {
                    k1Var = this.h.a();
                } catch (bv e2) {
                    j.e("Error while getting next extraction task: %s", e2.getMessage());
                    if (e2.a >= 0) {
                        this.g.e().D(e2.a);
                        b(e2.a, e2);
                    }
                }
                if (k1Var != null) {
                    try {
                        if (k1Var instanceof o0) {
                            this.b.a((o0) k1Var);
                        } else if (k1Var instanceof l2) {
                            this.c.a((l2) k1Var);
                        } else if (k1Var instanceof v1) {
                            this.d.a((v1) k1Var);
                        } else if (k1Var instanceof y1) {
                            this.e.a((y1) k1Var);
                        } else if (k1Var instanceof e2) {
                            this.f.a((e2) k1Var);
                        } else {
                            j.e("Unknown task type: %s", k1Var.getClass().getName());
                        }
                    } catch (Exception e3) {
                        j.e("Error during extraction task: %s", e3.getMessage());
                        this.g.e().D(k1Var.a);
                        b(k1Var.a, e3);
                    }
                } else {
                    this.i.set(false);
                    return;
                }
            }
        } else {
            aVar.g("runLoop already looping; return", new Object[0]);
        }
    }
}
