package defpackage;

import androidx.fragment.app.c;

/* renamed from: ia7  reason: default package */
public final class ia7 implements fjf<ha7> {
    private final wlf<b42> a;
    private final wlf<c> b;

    public ia7(wlf<b42> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ha7(this.a.get(), this.b.get());
    }
}
