package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: i2c  reason: default package */
public final class i2c implements fjf<h2c> {
    private final wlf<ImmutableList<Integer>> a;

    public i2c(wlf<ImmutableList<Integer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h2c(this.a.get());
    }
}
