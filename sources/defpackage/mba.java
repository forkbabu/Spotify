package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.libs.connect.instrumentation.f;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mba  reason: default package */
public class mba {
    private final jz1 a;
    private final aqe b;
    private final f c;

    public mba(jz1 jz1, aqe aqe, f fVar) {
        this.a = jz1;
        this.b = aqe;
        this.c = fVar;
    }

    public void a() {
        this.b.getClass();
        da1 da1 = new da1(null, "com.spotify.service.connectui", "spotify:connect-access-button", null, 0, null, "connect-access-button-nudge", null, (double) System.currentTimeMillis());
        this.a.a(da1);
        Logger.b(da1.a(), new Object[0]);
    }

    public void b() {
        this.b.getClass();
        da1 da1 = new da1(null, "com.spotify.service.connectui", "spotify:connect-access-button", null, 0, null, "connect-access-button-visible", null, (double) System.currentTimeMillis());
        this.a.a(da1);
        Logger.b(da1.a(), new Object[0]);
    }

    public void c(String str, String str2, String str3) {
        y91 y91 = new y91("connect-access-button/tap", str, InteractionType.TAP.d(), "open-device-picker", str2, str3);
        this.a.a(y91);
        Logger.b(y91.a(), new Object[0]);
    }

    public void d(ConnectStates$State connectStates$State, String str, String str2) {
        StringBuilder V0 = je.V0("connect-device-picker/");
        int ordinal = connectStates$State.ordinal();
        V0.append(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "unknown" : "unavailable" : "available" : "connected" : "connecting");
        y91 y91 = new y91(null, V0.toString(), null, InteractionIntent.NAVIGATE.d(), str, str2);
        this.a.a(y91);
        ((fu0) this.c.a()).a(connectStates$State, str2, ViewUris.z1.toString());
        Logger.b(y91.a(), new Object[0]);
    }

    public void e(float f) {
        y91 y91 = new y91(null, "connect-volume-slider-update/" + f, null, "update-volume", PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        this.a.a(y91);
        Logger.b(y91.a(), new Object[0]);
    }

    public void f(a aVar, int i) {
        StringBuilder W0 = je.W0("devices-list/", i, "/education/");
        W0.append(((PageIdentifiers) aVar).path());
        y91 y91 = new y91(null, W0.toString(), null, InteractionIntent.NAVIGATE.d(), PageIdentifiers.CONNECT_DEVICEPICKER.path(), ViewUris.z1.toString());
        this.a.a(y91);
        Logger.b(y91.a(), new Object[0]);
    }
}
