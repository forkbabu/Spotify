package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: fla  reason: default package */
public class fla {
    private final Context a;

    public fla(Context context) {
        this.a = context;
    }

    public boolean a(String str) {
        for (PackageInfo packageInfo : this.a.getPackageManager().getInstalledPackages(0)) {
            if (str.equals(packageInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}
