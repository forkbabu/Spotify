package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: hoc  reason: default package */
public final class hoc implements fjf<goc> {
    private final wlf<ImmutableList<Integer>> a;

    public hoc(wlf<ImmutableList<Integer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new goc(this.a.get());
    }
}
