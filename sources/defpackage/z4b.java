package defpackage;

import io.reactivex.g;

/* renamed from: z4b  reason: default package */
public final class z4b implements fjf<y4b> {
    private final wlf<u7b> a;
    private final wlf<a5b> b;
    private final wlf<o1e<b91>> c;
    private final wlf<g<b91>> d;

    public z4b(wlf<u7b> wlf, wlf<a5b> wlf2, wlf<o1e<b91>> wlf3, wlf<g<b91>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y4b(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
