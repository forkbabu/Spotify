package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import com.spotify.superbird.pitstop.audioconnectivity.AudioConnectivityEvent;
import io.reactivex.disposables.a;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public class g {
    private final a a = new a();
    private final s<na1> b;
    private final s<HeadsetPluggedStatus> c;
    private final dpe d;
    private final cqe e;

    public g(s<na1> sVar, s<HeadsetPluggedStatus> sVar2, dpe dpe, cqe cqe) {
        h.e(sVar, "bluetoothA2dpConnectionInfos");
        h.e(sVar2, "headsetPluggedStatus");
        h.e(dpe, "pitstopLogger");
        h.e(cqe, "clock");
        this.b = sVar;
        this.c = sVar2;
        this.d = dpe;
        this.e = cqe;
    }

    public static final void a(g gVar, na1 na1) {
        String b2;
        gVar.getClass();
        sa1 b3 = na1.b();
        if (b3 != null && (b2 = b3.b()) != null) {
            gVar.d.c(new AudioConnectivityEvent(AudioConnectivityEvent.State.BLUETOOTH, b2, gVar.e.d()));
        }
    }

    public static final void b(g gVar) {
        gVar.d.c(new AudioConnectivityEvent(AudioConnectivityEvent.State.AUX, "Headphones", gVar.e.d()));
    }

    public static final void c(g gVar) {
        gVar.d.c(new AudioConnectivityEvent(AudioConnectivityEvent.State.NONE, "Speaker", gVar.e.d()));
    }

    public void d() {
        this.a.e(this.b.Q(a.a).N(new h(new AudioConnectivityLogger$startAudioConnectivityStatusObservers$2(this))).subscribe(), this.c.Q(b.a).N(new c(this)).subscribe(), s.n(this.b, this.c, d.a).Q(e.a).N(new f(this)).subscribe());
    }

    public void e() {
        this.a.f();
    }
}
