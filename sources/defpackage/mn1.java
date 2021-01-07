package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.feature.speakerdeeplink.q;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.playback.api.e;
import com.spotify.music.playback.api.f;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: mn1  reason: default package */
public class mn1 implements d {
    private final q a;
    private final ConnectManager b;
    private final AudioManager c;
    private final zr0 f;
    private final y n;
    private final s<Boolean> o;
    private final oc1 p;
    private final s<HeadsetPluggedStatus> q;
    private final e r;
    private final f s;
    private final com.spotify.rxjava2.q t = new com.spotify.rxjava2.q();
    private boolean u;

    public mn1(Context context, q qVar, ConnectManager connectManager, zr0 zr0, y yVar, s<Boolean> sVar, oc1 oc1, s<HeadsetPluggedStatus> sVar2, e eVar, f fVar) {
        this.a = qVar;
        this.b = connectManager;
        this.c = (AudioManager) context.getSystemService("audio");
        this.f = zr0;
        this.n = yVar;
        this.o = sVar;
        this.p = oc1;
        this.q = sVar2;
        this.r = eVar;
        this.s = fVar;
    }

    private void c() {
        if (!this.r.a() || !this.p.a(this.b.o()) || !this.b.q()) {
            this.f.d();
        }
    }

    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            boolean z = this.c.isWiredHeadsetOn() || this.c.isBluetoothA2dpOn();
            this.u = z;
            Logger.l("mWasForegroundedWithHeadsetPlugged = %s", String.valueOf(z));
            if (this.u && this.s.b() && !this.r.a() && this.a.b()) {
                Logger.l("foregroundStateListener.switchToLocal", new Object[0]);
                c();
                return;
            }
            return;
        }
        this.u = false;
    }

    public void b(HeadsetPluggedStatus headsetPluggedStatus) {
        int ordinal = headsetPluggedStatus.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (this.s.b() && this.r.a()) {
                z = true;
            }
            if (z) {
                c();
            }
        } else if (ordinal == 1) {
            this.u = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.t.b(this.o.o0(this.n).subscribe(new qm1(this)), this.q.o0(this.n).subscribe(new pm1(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.t.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "LocalDeviceSwitcherPlugin";
    }
}
