package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.homething.addnewdevice.connected.view.ConnectedFragment;
import com.spotify.music.homething.addnewdevice.connecting.view.ConnectingFragment;
import com.spotify.music.homething.addnewdevice.error.view.ErrorFragment;
import com.spotify.music.homething.addnewdevice.scandevices.view.ScanDevicesFragment;
import com.spotify.music.homething.addnewdevice.welcome.view.HomethingWelcomeFragment;
import com.spotify.music.homething.addnewdevice.wifi.view.HomethingWifiFragment;
import com.spotify.music.homething.settings.view.HomethingSettingsFragment;

/* renamed from: ws9  reason: default package */
public class ws9 {
    private final o a;
    private final c b;
    private final int c;

    public ws9(o oVar, c cVar, int i) {
        this.a = oVar;
        this.c = i;
        this.b = cVar;
    }

    public void a() {
        ConnectingFragment connectingFragment = new ConnectingFragment();
        x i = this.a.i();
        i.q(this.c, connectingFragment, "TAG_CONNECTING");
        i.i();
    }

    public void b() {
        ErrorFragment errorFragment = new ErrorFragment();
        x i = this.a.i();
        i.q(this.c, errorFragment, "TAG_ERROR");
        i.i();
    }

    public void c() {
        ScanDevicesFragment scanDevicesFragment = new ScanDevicesFragment();
        x i = this.a.i();
        i.q(this.c, scanDevicesFragment, "TAG_SCAN_DEVICES");
        i.i();
    }

    public void d() {
        HomethingSettingsFragment homethingSettingsFragment = new HomethingSettingsFragment();
        x i = this.a.i();
        i.q(this.c, homethingSettingsFragment, "TAG_SETTINGS");
        i.i();
    }

    public void e() {
        ConnectedFragment connectedFragment = new ConnectedFragment();
        x i = this.a.i();
        i.q(this.c, connectedFragment, "TAG_SUCCESS");
        i.i();
    }

    public void f() {
        HomethingWelcomeFragment homethingWelcomeFragment = new HomethingWelcomeFragment();
        x i = this.a.i();
        i.q(this.c, homethingWelcomeFragment, "TAG_WELCOME");
        i.i();
    }

    public void g() {
        HomethingWifiFragment homethingWifiFragment = new HomethingWifiFragment();
        x i = this.a.i();
        i.q(this.c, homethingWifiFragment, "TAG_WIFI");
        i.i();
    }

    public void h() {
        Fragment T = this.a.T(this.c);
        if (T != null) {
            String X2 = T.X2();
            X2.hashCode();
            char c2 = 65535;
            switch (X2.hashCode()) {
                case -1639455928:
                    if (X2.equals("TAG_SETTINGS")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1174671968:
                    if (X2.equals("TAG_SCAN_DEVICES")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -35885923:
                    if (X2.equals("TAG_CONNECTING")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 25556861:
                    if (X2.equals("TAG_WELCOME")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 48445626:
                    if (X2.equals("TAG_WIFI")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1220254750:
                    if (X2.equals("TAG_SUCCESS")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1485470947:
                    if (X2.equals("TAG_ERROR")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.b.a();
                    return;
                case 1:
                case 2:
                    f();
                    return;
                case 3:
                    this.b.a();
                    return;
                case 4:
                    ScanDevicesFragment scanDevicesFragment = new ScanDevicesFragment();
                    x i = this.a.i();
                    i.q(this.c, scanDevicesFragment, "TAG_SCAN_DEVICES");
                    i.i();
                    return;
                case 5:
                    this.b.a();
                    return;
                case 6:
                    HomethingWifiFragment homethingWifiFragment = new HomethingWifiFragment();
                    x i2 = this.a.i();
                    i2.q(this.c, homethingWifiFragment, "TAG_WIFI");
                    i2.i();
                    return;
                default:
                    Assertion.g("Unhandled back button press in navigator.");
                    return;
            }
        }
    }
}
