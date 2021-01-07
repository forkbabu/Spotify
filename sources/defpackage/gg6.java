package defpackage;

import io.reactivex.y;

/* renamed from: gg6  reason: default package */
public final class gg6 implements fjf<fg6> {
    private final wlf<bg6> a;
    private final wlf<String> b;
    private final wlf<y> c;

    public gg6(wlf<bg6> wlf, wlf<String> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fg6(this.a, this.b, this.c);
    }
}
