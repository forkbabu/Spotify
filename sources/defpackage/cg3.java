package defpackage;

import com.spotify.eventsender.coretransmitter.CoreEventsTransmitter;
import com.spotify.eventsender.j0;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: cg3  reason: default package */
public class cg3 {
    private final j0 a;
    private final CoreEventsTransmitter b;

    public cg3(j0 j0Var, CoreEventsTransmitter coreEventsTransmitter) {
        this.a = j0Var;
        this.b = coreEventsTransmitter;
    }

    public void a() {
        this.a.e();
        try {
            this.b.registerSdk();
        } catch (UnsatisfiedLinkError e) {
            Assertion.w("Failed to register CoreEventsTransmitter", e);
        }
    }

    public void b() {
        this.a.f();
    }

    public void c() {
        this.a.d();
    }
}
