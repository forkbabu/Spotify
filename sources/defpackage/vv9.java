package defpackage;

import com.google.protobuf.u;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: vv9  reason: default package */
public final class vv9 implements fjf<uv9> {
    private final wlf<gl0<u>> a;
    private final wlf<cqe> b;
    private final wlf<s<Boolean>> c;
    private final wlf<y> d;

    public vv9(wlf<gl0<u>> wlf, wlf<cqe> wlf2, wlf<s<Boolean>> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uv9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
