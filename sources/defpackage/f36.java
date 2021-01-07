package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: f36  reason: default package */
public final class f36 implements fjf<ImmutableList<gu6>> {
    private final wlf<m36> a;

    public f36(wlf<m36> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of(this.a.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
