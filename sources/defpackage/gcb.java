package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.DeviceIdentifier;
import com.spotify.mobile.android.util.v;

/* access modifiers changed from: package-private */
/* renamed from: gcb  reason: default package */
public class gcb {
    private final v a;
    private final gl0<u> b;
    private final fcb c;

    gcb(fcb fcb, v vVar, gl0<u> gl0) {
        this.c = fcb;
        this.a = vVar;
        this.b = gl0;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        String c2 = this.a.c();
        String b2 = this.a.b();
        String a2 = this.c.a();
        gl0<u> gl0 = this.b;
        DeviceIdentifier.b n = DeviceIdentifier.n();
        n.m(b2);
        n.n(c2);
        n.p("");
        n.o(a2);
        gl0.c(n.build());
    }
}
