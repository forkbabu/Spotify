package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.BackgroundRestricted;

/* access modifiers changed from: package-private */
/* renamed from: v70  reason: default package */
public class v70 {
    private final gl0<u> a;

    public v70(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a() {
        BackgroundRestricted.b i = BackgroundRestricted.i();
        i.m("Android background restriction enabled");
        this.a.c(i.build());
    }
}
