package com.spotify.music.libs.connect;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.libs.connect.g;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.e;
import com.spotify.music.libs.connect.access.o;
import com.spotify.music.sociallistening.models.b;
import java.util.EnumSet;

public class j implements i {
    private final e a;
    private final g b;
    private final k4d c;
    private final o d;
    private Boolean e;
    private ConnectStates$State f = ConnectStates$State.NONE;
    private Tech g;
    private EnumSet<Tech> h;
    private String i;

    public j(e eVar, g gVar, k4d k4d, o oVar) {
        this.a = eVar;
        this.b = gVar;
        eVar.b(this);
        this.c = k4d;
        this.d = oVar;
    }

    private void d() {
        Boolean bool = this.e;
        if (bool != null) {
            if (!bool.booleanValue()) {
                this.a.e();
                return;
            }
            int ordinal = this.f.ordinal();
            if (ordinal == 1) {
                this.a.c(this.g);
            } else if (ordinal == 2) {
                this.a.f(this.g, this.i);
            } else if (ordinal == 3) {
                this.a.a(this.h);
            } else if (ordinal == 4) {
                this.a.d();
            }
        }
    }

    @Override // com.spotify.libs.connect.picker.view.e.a
    public void a() {
        this.b.a(this.f);
    }

    @Override // com.spotify.music.libs.connect.i
    public void b(boolean z) {
        this.e = Boolean.valueOf(z);
        d();
    }

    @Override // com.spotify.music.libs.connect.i
    public void c(ConnectManager.ConnectState connectState, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2, EnumSet<Tech> enumSet, b bVar) {
        ConnectStates$State connectStates$State = ConnectStates$State.PLAYING_FROM;
        if (j4d.a(gaiaDevice, bVar)) {
            String b2 = this.c.b(gaiaDevice, bVar);
            Tech of = Tech.of(gaiaDevice);
            this.f = connectStates$State;
            this.g = of;
            this.i = b2;
            d();
        } else if (connectState == ConnectManager.ConnectState.CONNECTING) {
            Tech of2 = Tech.of(gaiaDevice2);
            this.f = ConnectStates$State.CONNECTING;
            this.g = of2;
            d();
        } else if (connectState != ConnectManager.ConnectState.ACTIVE && connectState != ConnectManager.ConnectState.DETECTED) {
            this.f = ConnectStates$State.NO_DEVICES;
            d();
        } else if (gaiaDevice == null || gaiaDevice.isSelf()) {
            this.f = ConnectStates$State.DEVICES_AVAILABLE;
            this.h = enumSet;
            d();
        } else {
            String name = gaiaDevice.getName();
            Tech of3 = Tech.of(gaiaDevice);
            this.f = connectStates$State;
            this.g = of3;
            this.i = name;
            d();
        }
    }
}
