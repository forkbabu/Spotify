package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: dla  reason: default package */
public class dla {
    private final String a;

    public dla(Context context) {
        this.a = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public Uri a(String str) {
        if ("com.android.vending".equals(this.a)) {
            return Uri.parse("market://details?id=" + str);
        } else if ("com.amazon.venezia".equals(this.a)) {
            return Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + str);
        } else {
            return Uri.parse("https://play.google.com/store/apps/details?id=" + str);
        }
    }
}
