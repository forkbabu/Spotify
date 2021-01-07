package kotlin;

import kotlin.jvm.internal.h;

public final class a {
    public static <T> d<T> a(LazyThreadSafetyMode lazyThreadSafetyMode, cmf<? extends T> cmf) {
        h.e(lazyThreadSafetyMode, "mode");
        h.e(cmf, "initializer");
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal == 0) {
            return new SynchronizedLazyImpl(cmf, null, 2);
        }
        if (ordinal == 1) {
            return new SafePublicationLazyImpl(cmf);
        }
        if (ordinal == 2) {
            return new UnsafeLazyImpl(cmf);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static <T> d<T> b(cmf<? extends T> cmf) {
        h.e(cmf, "initializer");
        return new SynchronizedLazyImpl(cmf, null, 2);
    }
}
