package defpackage;

import android.content.res.Resources;

/* renamed from: ot1  reason: default package */
public final class ot1 implements fjf<nt1> {
    private final wlf<lt1> a;
    private final wlf<Resources> b;

    public ot1(wlf<lt1> wlf, wlf<Resources> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nt1(this.a.get(), this.b.get());
    }
}
