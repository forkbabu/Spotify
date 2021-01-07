package com.squareup.picasso;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import java.io.File;
import okhttp3.a0;
import okhttp3.c;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.y;

public final class v implements l {
    final e.a a;

    public v(Context context) {
        long j;
        StringBuilder sb = j0.a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            int i = Build.VERSION.SDK_INT;
            j = ((i < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (i < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        long max = Math.max(Math.min(j, 52428800L), 5242880L);
        y.b bVar = new y.b();
        bVar.d(new c(file, max));
        this.a = bVar.c();
    }

    @Override // com.squareup.picasso.l
    public d0 a(a0 a0Var) {
        return this.a.b(a0Var).h();
    }

    public v(y yVar) {
        this.a = yVar;
        yVar.d();
    }
}
