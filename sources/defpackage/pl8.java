package defpackage;

import android.view.LayoutInflater;

/* renamed from: pl8  reason: default package */
public final class pl8 implements fjf<ol8> {
    private final wlf<LayoutInflater> a;
    private final wlf<hl8> b;
    private final wlf<vl8> c;
    private final wlf<kn8> d;

    public pl8(wlf<LayoutInflater> wlf, wlf<hl8> wlf2, wlf<vl8> wlf3, wlf<kn8> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ol8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
