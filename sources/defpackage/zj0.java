package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.protobuf.u;
import com.spotify.contexts.ApplicationAndroid;

/* access modifiers changed from: package-private */
/* renamed from: zj0  reason: default package */
public class zj0 implements fk0 {
    private final kl0 a;
    private int b = 0;
    private String c = "";

    zj0(Context context, kl0 kl0) {
        PackageInfo packageInfo;
        this.a = kl0;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            this.a.a(e, "Error in retrieving package information.");
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.b = packageInfo.versionCode;
            String str = packageInfo.versionName;
            this.c = str == null ? this.c : str;
        }
    }

    @Override // defpackage.fk0
    public u c() {
        ApplicationAndroid.b l = ApplicationAndroid.l();
        l.m((long) this.b);
        l.n(this.c);
        return l.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_application_android";
    }
}
