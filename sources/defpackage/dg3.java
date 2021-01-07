package defpackage;

import com.spotify.eventsender.coretransmitter.CoreEventsTransmitter;
import com.spotify.eventsender.j0;

/* renamed from: dg3  reason: default package */
public final class dg3 implements fjf<cg3> {
    private final wlf<j0> a;
    private final wlf<CoreEventsTransmitter> b;

    public dg3(wlf<j0> wlf, wlf<CoreEventsTransmitter> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cg3(this.a.get(), this.b.get());
    }
}
