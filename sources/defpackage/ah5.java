package defpackage;

import io.reactivex.y;

/* renamed from: ah5  reason: default package */
public final class ah5 implements fjf<y> {
    private final wlf<y> a;

    public ah5(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y yVar = this.a.get();
        if (yVar != null) {
            return yVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
