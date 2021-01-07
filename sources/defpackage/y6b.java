package defpackage;

import com.google.common.base.Optional;

/* renamed from: y6b  reason: default package */
public abstract class y6b {
    public static y6b a(int i) {
        return new u6b(i, Optional.absent());
    }

    public static y6b b(int i, int i2) {
        return new u6b(i, Optional.of(Integer.valueOf(i2)));
    }

    public abstract Optional<Integer> c();

    public abstract int d();

    public int e() {
        if (!c().isPresent()) {
            return 0;
        }
        return d() + c().get().intValue();
    }
}
