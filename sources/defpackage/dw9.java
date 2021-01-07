package defpackage;

import com.google.protobuf.u;
import com.spotify.remoteconfig.fc;
import java.util.Set;

/* renamed from: dw9  reason: default package */
public final class dw9 implements fjf<cw9> {
    private final wlf<gl0<u>> a;
    private final wlf<Set<mm0>> b;
    private final wlf<fc> c;

    public dw9(wlf<gl0<u>> wlf, wlf<Set<mm0>> wlf2, wlf<fc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cw9(this.a.get(), this.b.get(), this.c.get());
    }
}
