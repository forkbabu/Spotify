package com.spotify.mobile.android.observablestates.docking;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import com.spotify.music.libs.carmodeengine.util.j0;
import io.reactivex.s;
import io.reactivex.y;

public class h {
    private final s<DockingStatus> a;

    public h(y yVar, j0 j0Var, e eVar, s<LocalSpeakerStatus> sVar, boolean z) {
        s<R> j0 = sVar.G0(LocalSpeakerStatus.NOT_CONNECTED).j0(c.a);
        eVar.getClass();
        this.a = s.l(j0Var.a(), s.y(new a(eVar)), j0, s.i0(Boolean.valueOf(z)), d.a).D0(b.a).o0(yVar).E().v0(1).h1();
    }

    public s<DockingStatus> a() {
        return this.a;
    }
}
