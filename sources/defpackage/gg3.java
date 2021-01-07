package defpackage;

import com.spotify.eventsender.coretransmitter.CoreEventsTransmitter;

/* renamed from: gg3  reason: default package */
public final class gg3 implements fjf<CoreEventsTransmitter> {
    private final wlf<hl0> a;

    public gg3(wlf<hl0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CoreEventsTransmitter(this.a.get());
    }
}
