package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.g1;
import com.google.android.gms.common.internal.h1;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.f;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
public final class l {
    private static volatile h1 a;
    private static final Object b = new Object();
    private static Context c;

    static a0 a(String str, m mVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, mVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static a0 b(String str, boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return g(str, z, false);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final String c(boolean z, String str, m mVar) {
        String str2 = !z && f(str, mVar, true, false).a ? "debug cert rejected" : "not allowed";
        MessageDigest a2 = a.a(Constants.SHA1);
        g.l(a2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, f.a(a2.digest(mVar.E3())), Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void d(Context context) {
        synchronized (l.class) {
            if (c == null) {
                c = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            boolean a2 = a.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a2;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static a0 f(String str, m mVar, boolean z, boolean z2) {
        try {
            h();
            g.l(c);
            try {
                if (a.A2(new y(str, mVar, z, z2), b.F3(c.getPackageManager()))) {
                    return a0.a();
                }
                return new b0(new n(z, str, mVar), null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return a0.c("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return a0.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    private static a0 g(String str, boolean z, boolean z2) {
        g.l(c);
        try {
            h();
            try {
                u x0 = a.x0(new s(str, z, z2, (rt) b.F3(c), false));
                if (x0.a()) {
                    return a0.a();
                }
                String I1 = x0.I1();
                if (I1 == null) {
                    I1 = "error checking package certificate";
                }
                if (x0.Q1().equals(zzo.PACKAGE_NOT_FOUND)) {
                    return a0.c(I1, new PackageManager.NameNotFoundException());
                }
                return a0.b(I1);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return a0.c("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return a0.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    private static void h() {
        if (a == null) {
            g.l(c);
            synchronized (b) {
                if (a == null) {
                    a = g1.D3(DynamiteModule.c(c, DynamiteModule.l, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
