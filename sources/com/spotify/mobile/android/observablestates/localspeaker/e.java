package com.spotify.mobile.android.observablestates.localspeaker;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.s;
import io.reactivex.y;

public class e {
    private final s<LocalSpeakerStatus> a;

    public e(s<na1> sVar, s<HeadsetPluggedStatus> sVar2, y yVar) {
        this.a = s.n(sVar.j0(d.a), sVar2.j0(c.a).G0((R) Boolean.FALSE), b.a).D0(a.a).E().I0(yVar).v0(1).h1();
    }

    public s<LocalSpeakerStatus> a() {
        return this.a;
    }
}
