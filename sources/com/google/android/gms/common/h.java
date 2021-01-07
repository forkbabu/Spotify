package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;

public class h {
    private static h c;
    private final Context a;
    private volatile String b;

    private h(Context context) {
        this.a = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static h a(@RecentlyNonNull Context context) {
        if (context != null) {
            synchronized (h.class) {
                if (c == null) {
                    l.d(context);
                    c = new h(context);
                }
            }
            return c;
        }
        throw new NullPointerException("null reference");
    }

    private static m d(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        p pVar = new p(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < mVarArr.length; i++) {
            if (mVarArr[i].equals(pVar)) {
                return mVarArr[i];
            }
        }
        return null;
    }

    public static boolean e(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        m mVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                mVar = d(packageInfo, r.a);
            } else {
                mVar = d(packageInfo, r.a[0]);
            }
            if (mVar != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(@RecentlyNonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && g.a(this.a);
    }

    public boolean c(int i) {
        a0 a0Var;
        a0 a0Var2;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            a0Var = a0.b("no pkgs");
        } else {
            a0Var = null;
            int length = packagesForUid.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    g.l(a0Var);
                    a0Var = a0Var;
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    a0Var = a0.b("null pkg");
                } else if (str.equals(this.b)) {
                    a0Var = a0.a();
                } else {
                    if (l.e()) {
                        a0Var2 = l.b(str, g.a(this.a));
                    } else {
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                            boolean a2 = g.a(this.a);
                            if (packageInfo == null) {
                                a0Var2 = a0.b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    a0Var2 = a0.b("single cert required");
                                } else {
                                    p pVar = new p(packageInfo.signatures[0].toByteArray());
                                    String str2 = packageInfo.packageName;
                                    a0 a3 = l.a(str2, pVar, a2, false);
                                    a0Var2 = (!a3.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !l.a(str2, pVar, false, true).a) ? a3 : a0.b("debuggable release cert app rejected");
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            a0Var = a0.c(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e);
                        }
                    }
                    if (a0Var2.a) {
                        this.b = str;
                    }
                    a0Var = a0Var2;
                }
                if (a0Var.a) {
                    break;
                }
                i2++;
            }
        }
        a0Var.e();
        return a0Var.a;
    }
}
