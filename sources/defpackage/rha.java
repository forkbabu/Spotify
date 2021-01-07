package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import com.spotify.mobile.android.service.media.t1;
import com.spotify.mobile.android.service.media.w2;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.player.model.PlayerState;
import defpackage.yda;
import io.reactivex.a;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: rha  reason: default package */
public class rha {
    private final g<PlayerState> a;
    private final pc1 b;
    private final pea c;
    private final w2 d;
    private final y e;
    private final s<HeadsetPluggedStatus> f;
    private final yda g;
    private final SensorRecorder h;
    private b i;
    private b j;
    private boolean k;
    private String l;
    private t1 m;

    rha(g<PlayerState> gVar, pc1 pc1, pea pea, SensorRecorder sensorRecorder, w2 w2Var, s<HeadsetPluggedStatus> sVar, y yVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.i = emptyDisposable;
        this.j = emptyDisposable;
        this.a = gVar;
        pc1.getClass();
        this.b = pc1;
        this.c = pea;
        w2Var.getClass();
        this.d = w2Var;
        yda.b bVar = new yda.b("aux");
        bVar.p("aux");
        bVar.l("unknown");
        bVar.s("aux");
        bVar.q("media_button");
        this.g = bVar.k();
        sensorRecorder.getClass();
        this.h = sensorRecorder;
        sVar.getClass();
        this.f = sVar;
        yVar.getClass();
        this.e = yVar;
    }

    private void g(boolean z) {
        this.h.g();
        if (!this.i.d()) {
            this.i.dispose();
        }
        if (z && this.k) {
            t1 t1Var = this.m;
            if (t1Var != null) {
                t1Var.a();
            }
            this.b.c(this.l, 0, this.g);
        }
    }

    public /* synthetic */ void a(PlayerState playerState) {
        this.m.c(playerState);
    }

    public void b(HeadsetPluggedStatus headsetPluggedStatus) {
        int ordinal = headsetPluggedStatus.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                g(true);
            }
        } else if (this.k) {
            this.h.f("aux_connected", SensorRecorder.RecordingPurpose.CLASSIFICATION, 180000);
            String a2 = this.d.a();
            this.l = a2;
            this.m = new t1(this.b, a2, this.g);
            this.b.e(this.l, 0, this.g);
            this.i = this.a.subscribe(new pha(this), oha.a);
        }
    }

    public a c(int i2) {
        this.h.f("headphone_button_pressed", SensorRecorder.RecordingPurpose.TRAINING, 10000);
        if (i2 == 1) {
            z<String> h2 = this.c.h(this.g);
            h2.getClass();
            return new i(h2);
        }
        z<String> u = this.c.u(this.g);
        u.getClass();
        return new i(u);
    }

    public a d(int i2) {
        this.h.f("headphone_button_pressed", SensorRecorder.RecordingPurpose.TRAINING, 10000);
        if (i2 == 1) {
            z<String> s = this.c.s(this.g);
            s.getClass();
            return new i(s);
        }
        z<String> f2 = this.c.f(this.g);
        f2.getClass();
        return new i(f2);
    }

    public void e() {
        if (!this.k) {
            this.k = true;
            this.j = this.f.o0(this.e).subscribe(new qha(this));
        }
    }

    public void f(boolean z) {
        if (this.k) {
            this.j.dispose();
            g(z);
            this.k = false;
        }
    }
}
