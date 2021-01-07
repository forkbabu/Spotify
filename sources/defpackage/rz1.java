package defpackage;

import androidx.fragment.app.o;

/* renamed from: rz1  reason: default package */
public final class rz1 implements fjf<oz1> {
    private final wlf<qz1> a;
    private final wlf<o> b;

    public rz1(wlf<qz1> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oz1(this.a.get(), this.b.get());
    }
}
