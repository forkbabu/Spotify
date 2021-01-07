package defpackage;

import io.reactivex.y;

/* renamed from: osd  reason: default package */
public final class osd implements fjf<dsd> {
    private final wlf<zrd> a;
    private final wlf<y> b;

    public osd(wlf<zrd> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dsd(this.a.get(), this.b.get());
    }
}
