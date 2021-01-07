package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.h;

/* renamed from: ae2  reason: default package */
public final class ae2 implements zd2 {
    private final Context a;

    public ae2(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.zd2
    public boolean a() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            h.d(packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo("com.amazon.dee.app", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                h.d(packageInfo, "packageInfo");
                if (packageInfo.getLongVersionCode() <= ((long) 866607211)) {
                    return false;
                }
            } else if (packageInfo == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
