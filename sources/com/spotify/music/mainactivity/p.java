package com.spotify.music.mainactivity;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.e;
import com.spotify.mobius.rx2.i;
import com.spotify.music.a;
import com.spotify.music.mainactivity.eventsources.MainActivityEventSources;
import com.spotify.music.r;
import com.spotify.music.v;
import com.spotify.music.w;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class p {
    private final g<c> a;
    private final g<SessionState> b;

    public p(g<c> gVar, g<SessionState> gVar2) {
        h.e(gVar, "flags");
        h.e(gVar2, "sessionState");
        this.a = gVar;
        this.b = gVar2;
    }

    public final MobiusLoop.h<wfb, ufb, tfb> a(a aVar, w wVar, com.spotify.android.flags.g gVar, v vVar, r rVar, com.spotify.music.h hVar) {
        h.e(aVar, "startLoggedInSessionDelegate");
        h.e(wVar, "uiVisibleDelegate");
        h.e(gVar, "handleFlagsChangedDelegate");
        h.e(vVar, "handleSessionStateChangedDelegate");
        h.e(rVar, "uiHiddenDelegate");
        h.e(hVar, "goToLoginDelegate");
        MobiusLoop.f f = i.c(n.a, cgb.a(aVar, wVar, gVar, vVar, rVar, hVar)).e(new o(new MainActivityMobiusLoopFactory$createFactory$2(vfb.a))).h(MainActivityEventSources.a.a(this.a, this.b)).d(i.b).b(i.c).f(new e("MainActivityLoop"));
        h.d(f, "RxMobius.loop(\n         …          )\n            )");
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a(this.a, pVar.a) && h.a(this.b, pVar.b);
    }

    public int hashCode() {
        g<c> gVar = this.a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        g<SessionState> gVar2 = this.b;
        if (gVar2 != null) {
            i = gVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MainActivityMobiusLoopFactory(flags=");
        V0.append(this.a);
        V0.append(", sessionState=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
