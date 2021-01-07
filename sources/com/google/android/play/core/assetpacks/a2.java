package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.x;
import java.io.File;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class a2 {
    private final z a;
    private final x<f3> b;
    private final i1 c;
    private final x<Executor> d;
    private final u0 e;

    a2(z zVar, x<f3> xVar, i1 i1Var, x<Executor> xVar2, u0 u0Var) {
        this.a = zVar;
        this.b = xVar;
        this.c = i1Var;
        this.d = xVar2;
        this.e = u0Var;
    }

    public final void a(y1 y1Var) {
        File j = this.a.j(y1Var.b, y1Var.c, y1Var.d);
        File q = this.a.q(y1Var.b, y1Var.c, y1Var.d);
        if (!j.exists() || !q.exists()) {
            throw new bv(String.format("Cannot find pack files to move for pack %s.", y1Var.b), y1Var.a);
        }
        File a2 = this.a.a(y1Var.b, y1Var.c, y1Var.d);
        a2.mkdirs();
        if (j.renameTo(a2)) {
            new File(this.a.a(y1Var.b, y1Var.c, y1Var.d), "merge.tmp").delete();
            z zVar = this.a;
            String str = y1Var.b;
            int i = y1Var.c;
            long j2 = y1Var.d;
            zVar.getClass();
            File file = new File(zVar.a(str, i, j2), "_metadata");
            file.mkdirs();
            if (q.renameTo(file)) {
                z zVar2 = this.a;
                zVar2.getClass();
                this.d.e().execute(z1.a(zVar2));
                this.c.d(y1Var.b, y1Var.c, y1Var.d);
                this.e.b(y1Var.b);
                this.b.e().a(y1Var.a, y1Var.b);
                return;
            }
            throw new bv("Cannot move metadata files to final location.", y1Var.a);
        }
        throw new bv("Cannot move merged pack files to final location.", y1Var.a);
    }
}
