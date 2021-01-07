package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.a;

/* renamed from: u60  reason: default package */
public class u60 {
    private PackageInfo a = null;

    public void a(Context context) {
        if (!a.a()) {
            throw new SsdkUnsupportedException("This is not samsung product", 0);
        } else if (context != null) {
            try {
                this.a = context.getPackageManager().getPackageInfo("com.samsung.android.app.spage", 1);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new SsdkUnsupportedException("This device is not supported Bixby Home.", 1);
            }
        } else {
            throw new NullPointerException("You should set context.");
        }
    }

    public boolean b(int i) {
        if (i == 1) {
            try {
                return 210200007 <= this.a.versionCode;
            } catch (NullPointerException unused) {
            }
        } else {
            throw new IllegalArgumentException("This type is not support");
        }
    }
}
