package com.spotify.http;

import android.content.Context;
import android.os.StatFs;
import android.os.StrictMode;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.io.IOException;
import okhttp3.c;
import okhttp3.y;

/* access modifiers changed from: package-private */
public final class r implements q {
    private final File a;
    private c b;
    private final long c;

    private r(File file, long j) {
        this.a = file;
        this.c = j;
    }

    private void a() {
        c cVar = this.b;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
                Logger.d("Could not clear cache, %s", this.a.getAbsolutePath());
            }
        }
    }

    static r e(Context context, String str) {
        long j;
        File file = new File(context.getApplicationContext().getCacheDir(), str);
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return new r(file, Math.max(Math.min(j, 52428800L), 5242880L));
    }

    static r f(Context context, String str) {
        return new r(new File(context.getApplicationContext().getCacheDir(), str), 5242880);
    }

    @Override // com.spotify.http.q
    public void b() {
        a();
    }

    @Override // com.spotify.http.q
    public void c() {
        a();
    }

    @Override // com.spotify.http.q
    public void d(y.b bVar) {
        try {
            File file = this.a;
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            if (!file.exists()) {
                if (!file.mkdir()) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw new IOException();
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            c cVar = new c(this.a, this.c);
            this.b = cVar;
            bVar.d(cVar);
        } catch (IOException unused) {
            Logger.d("Could not create cache, %s", this.a.getAbsolutePath());
            Assertion.g("Could not create cache");
        }
    }
}
