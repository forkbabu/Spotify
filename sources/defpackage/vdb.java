package defpackage;

import androidx.fragment.app.o;

/* renamed from: vdb  reason: default package */
public final class vdb implements fjf<udb> {
    private final wlf<o> a;

    public vdb(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new udb(this.a.get());
    }
}
