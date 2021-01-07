package defpackage;

import com.google.common.base.Optional;

/* renamed from: nn0  reason: default package */
public final class nn0 implements fjf<kn0> {
    private final wlf<String> a;
    private final wlf<String> b;
    private final wlf<Optional<String>> c;
    private final wlf<Optional<String>> d;

    public nn0(wlf<String> wlf, wlf<String> wlf2, wlf<Optional<String>> wlf3, wlf<Optional<String>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kn0(this.a, this.b, this.c, this.d);
    }
}
