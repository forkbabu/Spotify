package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.spotify.base.java.logging.Logger;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: vs0  reason: default package */
public final class vs0 implements ss0 {
    private final Context a;
    private final d b;

    public vs0(Context context, d dVar) {
        h.e(context, "context");
        h.e(dVar, "googleApiAvailability");
        this.a = context;
        this.b = dVar;
    }

    @Override // defpackage.ss0
    public void a(Activity activity) {
        h.e(activity, "activity");
        Intent a2 = this.b.a(activity, this.b.c(activity, e.a), null);
        if (a2 == null) {
            Assertion.v("Play Service not available, and no action can be taken. No dialog will be shown to the user.");
            return;
        }
        String string = activity.getString(C0707R.string.connect_gps_update_title);
        h.d(string, "activity.getString(R.str…connect_gps_update_title)");
        String string2 = activity.getString(C0707R.string.connect_gps_update_body);
        h.d(string2, "activity.getString(R.str….connect_gps_update_body)");
        String string3 = activity.getString(C0707R.string.connect_gps_update_positive_button);
        h.d(string3, "activity.getString(R.str…s_update_positive_button)");
        String string4 = activity.getString(C0707R.string.connect_gps_update_negative_button);
        h.d(string4, "activity.getString(R.str…s_update_negative_button)");
        Assertion.v("Google Play Services update dialog shown");
        f c = m.c(activity, string, string2);
        c.e(string4, new ts0(activity));
        c.f(string3, new us0(activity, a2));
        c.b().a();
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0038: APUT  
      (r4v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Integer : 0x0034: INVOKE  (r5v5 java.lang.Integer) = (r5v4 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
     */
    @Override // defpackage.ss0
    public boolean b() {
        int i;
        try {
            int g = this.b.g(this.a);
            Logger.b("Minimum version required: %d", Integer.valueOf(d.e));
            Object[] objArr = new Object[1];
            d dVar = this.b;
            Context context = this.a;
            dVar.getClass();
            int i2 = g.e;
            try {
                i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            Logger.b("Current version of Google Play Services: %d", objArr);
            Logger.b("Status of Google Play Services: %d", Integer.valueOf(g));
            if (g == 0) {
                Logger.b("Google Play Services OK", new Object[0]);
            } else if (this.b.h(g)) {
                Logger.g("Resolvable Google Play Services error", new Object[0]);
                return true;
            } else {
                Logger.n("Not resolvable Google Play Services error", new Object[0]);
            }
        } catch (Exception e) {
            Assertion.w("Check for Google Play Services failed", e);
        }
        return false;
    }
}
