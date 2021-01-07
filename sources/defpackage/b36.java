package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.zt6;

/* renamed from: b36  reason: default package */
public final class b36 implements fjf<a36> {
    private final wlf<ImmutableList<gu6>> a;
    private final wlf<zt6.b.a> b;
    private final wlf<ui6> c;

    public b36(wlf<ImmutableList<gu6>> wlf, wlf<zt6.b.a> wlf2, wlf<ui6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a36(this.a, this.b, this.c);
    }
}
