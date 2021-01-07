package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import java.io.File;

/* access modifiers changed from: package-private */
public final class p0 {
    private static final a f = new a("ExtractChunkTaskHandler");
    private final byte[] a = new byte[8192];
    private final z b;
    private final x<f3> c;
    private final x<t> d;
    private final u0 e;

    p0(z zVar, x<f3> xVar, x<t> xVar2, u0 u0Var) {
        this.b = zVar;
        this.c = xVar;
        this.d = xVar2;
        this.e = u0Var;
    }

    private final File b(o0 o0Var) {
        File b2 = this.b.b(o0Var.b, o0Var.c, o0Var.d, o0Var.e);
        if (!b2.exists()) {
            b2.mkdirs();
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0188 A[Catch:{ all -> 0x033b, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029f A[SYNTHETIC, Splitter:B:92:0x029f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.play.core.assetpacks.o0 r23) {
        /*
        // Method dump skipped, instructions count: 899
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.p0.a(com.google.android.play.core.assetpacks.o0):void");
    }
}
