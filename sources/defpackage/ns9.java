package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.music.homething.addnewdevice.wifi.view.HomethingWifiFragment;
import defpackage.ks9;
import java.util.regex.Pattern;

/* renamed from: ns9  reason: default package */
public class ns9 implements ks9.a {
    private static final Pattern f = Pattern.compile("^\".*\"$");
    private final ws9 a;
    private final rt9 b;
    private final WifiManager c;
    private final ConnectivityManager d;
    private ks9 e;

    ns9(ws9 ws9, rt9 rt9, WifiManager wifiManager, ConnectivityManager connectivityManager) {
        this.a = ws9;
        this.b = rt9;
        this.c = wifiManager;
        this.d = connectivityManager;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT < 27;
    }

    @Override // defpackage.ks9.a
    public void a() {
        this.a.a();
    }

    @Override // defpackage.ks9.a
    public void b(String str) {
        this.b.h(str);
    }

    @Override // defpackage.ks9.a
    public void c(ks9 ks9) {
        this.e = ks9;
        if (h()) {
            String e2 = this.b.e();
            if (!TextUtils.isEmpty(e2)) {
                e2.getClass();
            } else {
                e2 = g();
                if (!TextUtils.isEmpty(e2)) {
                    e2.getClass();
                } else {
                    e2 = "";
                }
            }
            ((HomethingWifiFragment) ks9).M4(e2);
        } else {
            ((HomethingWifiFragment) ks9).M4(this.b.e());
        }
        ((HomethingWifiFragment) ks9).L4((String) MoreObjects.firstNonNull(this.b.c(), ""));
    }

    @Override // defpackage.ks9.a
    public void d() {
        f(true);
    }

    @Override // defpackage.ks9.a
    public void e(String str) {
        this.b.i(str);
    }

    @Override // defpackage.ks9.a
    public void f(boolean z) {
        if (z || h()) {
            ((HomethingWifiFragment) this.e).M4(g());
            return;
        }
        ((HomethingWifiFragment) this.e).K4();
    }

    public String g() {
        WifiInfo connectionInfo;
        NetworkInfo activeNetworkInfo = this.d.getActiveNetworkInfo();
        boolean z = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting() || activeNetworkInfo.getType() != 1) {
            z = false;
        }
        if (!z || (connectionInfo = this.c.getConnectionInfo()) == null) {
            return null;
        }
        String ssid = connectionInfo.getSSID();
        if (f.matcher(ssid).matches()) {
            return ssid.replace("\"", "");
        }
        return null;
    }
}
