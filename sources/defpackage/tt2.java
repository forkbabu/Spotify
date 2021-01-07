package defpackage;

import androidx.fragment.app.c;
import androidx.fragment.app.o;

/* renamed from: tt2  reason: default package */
public final class tt2 implements fjf<o> {
    private final wlf<c> a;

    public tt2(wlf<c> wlf) {
        this.a = wlf;
    }

    public static o a(c cVar) {
        o v0 = cVar.v0();
        yif.g(v0, "Cannot return null from a non-@Nullable @Provides method");
        return v0;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
