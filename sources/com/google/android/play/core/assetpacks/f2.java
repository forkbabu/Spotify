package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.m;
import com.google.android.play.core.internal.w;
import com.google.android.play.core.internal.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* access modifiers changed from: package-private */
public final class f2 {
    private static final a d = new a("PatchSliceTaskHandler");
    private final z a;
    private final x<f3> b;
    private final com.google.android.play.core.common.a c;

    f2(z zVar, x<f3> xVar, com.google.android.play.core.common.a aVar) {
        this.a = zVar;
        this.b = xVar;
        this.c = aVar;
    }

    public final void a(e2 e2Var) {
        File a2 = this.a.a(e2Var.b, e2Var.c, e2Var.d);
        z zVar = this.a;
        String str = e2Var.b;
        int i = e2Var.c;
        long j = e2Var.d;
        String str2 = e2Var.h;
        zVar.getClass();
        File file = new File(new File(zVar.a(str, i, j), "_metadata"), str2);
        try {
            InputStream inputStream = e2Var.j;
            if (e2Var.g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                c0 c0Var = new c0(a2, file);
                if (this.c.b()) {
                    File b2 = this.a.b(e2Var.b, e2Var.e, e2Var.f, e2Var.h);
                    if (!b2.exists()) {
                        b2.mkdirs();
                    }
                    i2 i2Var = new i2(this.a, e2Var.b, e2Var.e, e2Var.f, e2Var.h);
                    m.b(c0Var, inputStream, new t0(b2, i2Var), e2Var.i);
                    i2Var.j(0);
                } else {
                    File file2 = new File(this.a.t(e2Var.b, e2Var.e, e2Var.f, e2Var.h), "slice.zip.tmp");
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    m.b(c0Var, inputStream, new FileOutputStream(file2), e2Var.i);
                    if (!file2.renameTo(this.a.r(e2Var.b, e2Var.e, e2Var.f, e2Var.h))) {
                        throw new bv(String.format("Error moving patch for slice %s of pack %s.", e2Var.h, e2Var.b), e2Var.a);
                    }
                }
                inputStream.close();
                if (this.c.b()) {
                    d.f("Patching and extraction finished for slice %s of pack %s.", e2Var.h, e2Var.b);
                } else {
                    d.f("Patching finished for slice %s of pack %s.", e2Var.h, e2Var.b);
                }
                this.b.e().F(e2Var.a, e2Var.b, e2Var.h, 0);
                try {
                    e2Var.j.close();
                    return;
                } catch (IOException unused) {
                    d.g("Could not close file for slice %s of pack %s.", e2Var.h, e2Var.b);
                    return;
                }
            } catch (Throwable th) {
                w.a(th, th);
            }
            throw th;
        } catch (IOException e) {
            d.e("IOException during patching %s.", e.getMessage());
            throw new bv(String.format("Error patching slice %s of pack %s.", e2Var.h, e2Var.b), e, e2Var.a);
        }
    }
}
