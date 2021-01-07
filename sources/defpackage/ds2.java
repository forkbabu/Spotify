package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import com.google.common.base.Joiner;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.t;
import java.util.ArrayList;

/* renamed from: ds2  reason: default package */
public class ds2 implements t {
    private final Context a;
    private PackageInfo b;
    private final String c;
    private final String d;
    private final yyd e;

    public ds2(Context context, String str, boolean z, yyd yyd) {
        String str2;
        this.a = context;
        this.c = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (packageInfo.signatures != null) {
                ArrayList arrayList = new ArrayList();
                for (Signature signature : packageInfo.signatures) {
                    arrayList.add(Hashing.sha1().hashBytes(signature.toByteArray()).toString());
                }
                str2 = Joiner.on(':').join(arrayList.toArray());
                this.d = str2;
                this.e = yyd;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.h(e2, "Failed to get the application signatures", new Object[0]);
        }
        str2 = "";
        this.d = str2;
        this.e = yyd;
    }

    private void i() {
        if (this.b == null) {
            String packageName = this.a.getPackageName();
            try {
                this.b = this.a.getPackageManager().getPackageInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder a1 = je.a1("Could not load package or application info for package ", packageName, ": ");
                a1.append(e2.getMessage());
                throw new AssertionError(a1.toString());
            }
        }
    }

    @Override // com.spotify.mobile.android.util.t
    public String a() {
        return "9a8d2f0ce77a4e248bb71fefcb557637";
    }

    @Override // com.spotify.mobile.android.util.t
    public Uri b() {
        i();
        if ("com.android.vending".equals(this.c)) {
            StringBuilder V0 = je.V0("market://details?id=");
            V0.append(this.b.packageName);
            return Uri.parse(V0.toString());
        } else if (!"com.amazon.venezia".equals(this.c)) {
            return null;
        } else {
            StringBuilder V02 = je.V0("http://www.amazon.com/gp/mas/dl/android?p=");
            V02.append(this.b.packageName);
            return Uri.parse(V02.toString());
        }
    }

    @Override // com.spotify.mobile.android.util.t
    public String c() {
        i();
        return this.b.versionName;
    }

    @Override // com.spotify.mobile.android.util.t
    public String d() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.util.t
    public boolean e() {
        return "com.android.vending".equals(this.c) || "com.google.android.feedback".equals(this.c) || this.e.d();
    }

    @Override // com.spotify.mobile.android.util.t
    public String f() {
        return "8.5.89";
    }

    @Override // com.spotify.mobile.android.util.t
    public String g() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.util.t
    public int h() {
        return 858900901;
    }

    @Override // com.spotify.mobile.android.util.t
    public String y() {
        return "com.spotify.music";
    }
}
