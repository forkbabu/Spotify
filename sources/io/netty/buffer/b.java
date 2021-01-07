package io.netty.buffer;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.r;
import io.netty.util.p;

public abstract class b implements k {
    private final boolean b;
    private final j c;

    protected b(boolean z) {
        this.b = z && PlatformDependent.z();
        this.c = new r(this);
    }

    protected static j p(j jVar) {
        j jVar2;
        p i;
        int ordinal = ResourceLeakDetector.f().ordinal();
        if (ordinal == 1) {
            p i2 = a.q.i(jVar);
            if (i2 == null) {
                return jVar;
            }
            jVar2 = new g0(jVar, i2);
        } else if ((ordinal != 2 && ordinal != 3) || (i = a.q.i(jVar)) == null) {
            return jVar;
        } else {
            jVar2 = new h(jVar, i);
        }
        return jVar2;
    }

    protected static p q(p pVar) {
        p pVar2;
        p i;
        int ordinal = ResourceLeakDetector.f().ordinal();
        if (ordinal == 1) {
            p i2 = a.q.i(pVar);
            if (i2 == null) {
                return pVar;
            }
            pVar2 = new h0(pVar, i2);
        } else if ((ordinal != 2 && ordinal != 3) || (i = a.q.i(pVar)) == null) {
            return pVar;
        } else {
            pVar2 = new i(pVar, i);
        }
        return pVar2;
    }

    private static void r(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(je.q0("initialCapacity: ", i, " (expectd: 0+)"));
        } else if (i > i2) {
            throw new IllegalArgumentException(String.format("initialCapacity: %d (expected: not greater than maxCapacity(%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public p a(int i) {
        return q(new p(this, true, i));
    }

    public p b(int i) {
        return q(new p(this, false, i));
    }

    @Override // io.netty.buffer.k
    public j c() {
        if (this.b) {
            return l(256, Integer.MAX_VALUE);
        }
        return m(256, Integer.MAX_VALUE);
    }

    @Override // io.netty.buffer.k
    public j d(int i) {
        return m(i, Integer.MAX_VALUE);
    }

    @Override // io.netty.buffer.k
    public int e(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(je.q0("minNewCapacity: ", i, " (expectd: 0+)"));
        } else if (i > i2) {
            throw new IllegalArgumentException(String.format("minNewCapacity: %d (expected: not greater than maxCapacity(%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (i == 4194304) {
            return 4194304;
        } else {
            if (i > 4194304) {
                int i3 = (i / 4194304) * 4194304;
                return i3 > i2 - 4194304 ? i2 : i3 + 4194304;
            }
            int i4 = 64;
            while (i4 < i) {
                i4 <<= 1;
            }
            return Math.min(i4, i2);
        }
    }

    @Override // io.netty.buffer.k
    public j f(int i) {
        if (PlatformDependent.z()) {
            return l(i, Integer.MAX_VALUE);
        }
        return m(i, Integer.MAX_VALUE);
    }

    @Override // io.netty.buffer.k
    public j h(int i) {
        return l(i, Integer.MAX_VALUE);
    }

    @Override // io.netty.buffer.k
    public j i(int i, int i2) {
        if (this.b) {
            return l(i, i2);
        }
        return m(i, i2);
    }

    @Override // io.netty.buffer.k
    public j j(int i) {
        if (this.b) {
            return l(i, Integer.MAX_VALUE);
        }
        return m(i, Integer.MAX_VALUE);
    }

    @Override // io.netty.buffer.k
    public p k(int i) {
        if (this.b) {
            return a(i);
        }
        return b(i);
    }

    public j l(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this.c;
        }
        r(i, i2);
        return n(i, i2);
    }

    public j m(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this.c;
        }
        r(i, i2);
        return o(i, i2);
    }

    /* access modifiers changed from: protected */
    public abstract j n(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract j o(int i, int i2);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.f(this));
        sb.append("(directByDefault: ");
        return je.O0(sb, this.b, ')');
    }
}
