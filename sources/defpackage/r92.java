package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.waze.sdk.WazeSDKManager;

/* renamed from: r92  reason: default package */
public class r92 {
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("waze_is_turned_on");
    private static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("waze_goto_closed");
    public static final /* synthetic */ int e = 0;
    private final Context a;
    private final i b;

    public r92(Context context, i iVar) {
        this.a = context;
        this.b = iVar;
    }

    public boolean a() {
        return this.b.d(this.a).d(d, false);
    }

    public boolean b() {
        if (d()) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dspotify"));
            intent.addFlags(268435456);
            this.a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dspotify"));
            intent2.addFlags(268435456);
            this.a.startActivity(intent2);
            return true;
        }
    }

    public void c(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.b.d(this.a).b();
        b2.a(d, z);
        b2.i();
    }

    public boolean d() {
        String str;
        WazeSDKManager p = WazeSDKManager.p();
        Context context = this.a;
        p.getClass();
        try {
            str = context.getPackageManager().getPackageInfo("com.waze", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        try {
            String[] split = "4.19.0.901".split("\\.");
            String[] split2 = str.split("\\.");
            for (int i = 0; i < split.length; i++) {
                if (split2.length - 1 < i) {
                    return false;
                }
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt2 < parseInt) {
                    return false;
                }
                if (parseInt2 > parseInt) {
                    break;
                }
            }
            return true;
        } catch (NumberFormatException e2) {
            Logger.e(e2, "Unsupported version number: %s", str);
            return false;
        }
    }

    @Deprecated
    public boolean e() {
        return this.b.d(this.a).d(c, true);
    }
}
