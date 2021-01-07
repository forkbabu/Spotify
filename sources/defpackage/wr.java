package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.e;

/* renamed from: wr  reason: default package */
public class wr {
    private final Context a;

    public wr(@RecentlyNonNull Context context) {
        this.a = context;
    }

    public int a(@RecentlyNonNull String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public int b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo c(@RecentlyNonNull String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    public CharSequence d(@RecentlyNonNull String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public PackageInfo e(@RecentlyNonNull String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return vr.a(this.a);
        }
        if (!e.c() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean g(int i, @RecentlyNonNull String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
