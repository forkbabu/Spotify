package io.netty.channel;

import com.comscore.util.log.LogLevel;
import io.netty.buffer.k;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class y implements e {
    private static final m0 k = f0.b;
    private static final AtomicIntegerFieldUpdater<y> l;
    private static final AtomicReferenceFieldUpdater<y, x0> m;
    protected final d a;
    private volatile k b = k.a;
    private volatile p0 c;
    private volatile m0 d = k;
    private volatile int e = LogLevel.NONE;
    private volatile int f = 16;
    private volatile int g = 1;
    private volatile boolean h = true;
    private volatile x0 i = x0.c;
    private volatile boolean j = true;

    static {
        AtomicIntegerFieldUpdater<y> M = PlatformDependent.M(y.class, "autoRead");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(y.class, "g");
        }
        l = M;
        AtomicReferenceFieldUpdater<y, x0> O = PlatformDependent.O(y.class, "writeBufferWaterMark");
        if (O == null) {
            O = AtomicReferenceFieldUpdater.newUpdater(y.class, x0.class, "i");
        }
        m = O;
    }

    public y(d dVar) {
        c cVar = new c();
        ikf ikf = (ikf) dVar;
        cVar.b(ikf.metadata().a());
        this.c = cVar;
        this.a = ikf;
    }

    @Override // io.netty.channel.e
    public <T> boolean a(p<T> pVar, T t) {
        x(pVar, t);
        if (pVar == p.r) {
            p(t.intValue());
            return true;
        } else if (pVar == p.s) {
            q(t.intValue());
            return true;
        } else if (pVar == p.t) {
            w(t.intValue());
            return true;
        } else if (pVar == p.o) {
            m(t);
            return true;
        } else if (pVar == p.p) {
            s(t);
            return true;
        } else if (pVar == p.y) {
            o(t.booleanValue());
            return true;
        } else if (pVar == p.z) {
            n(t.booleanValue());
            return true;
        } else if (pVar == p.u) {
            t(t.intValue());
            return true;
        } else if (pVar == p.v) {
            u(t.intValue());
            return true;
        } else if (pVar == p.w) {
            v(t);
            return true;
        } else if (pVar == p.q) {
            r(t);
            return true;
        } else if (pVar != p.H) {
            return false;
        } else {
            this.j = t.booleanValue();
            return true;
        }
    }

    @Override // io.netty.channel.e
    public <T> T b(p<T> pVar) {
        if (pVar == null) {
            throw new NullPointerException("option");
        } else if (pVar == p.r) {
            return (T) Integer.valueOf(this.e);
        } else {
            if (pVar == p.s) {
                try {
                    return (T) Integer.valueOf(((l0) this.c).c());
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
                }
            } else if (pVar == p.t) {
                return (T) Integer.valueOf(this.f);
            } else {
                if (pVar == p.o) {
                    return (T) this.b;
                }
                if (pVar == p.p) {
                    return (T) this.c;
                }
                if (pVar == p.y) {
                    return (T) Boolean.valueOf(l());
                }
                if (pVar == p.z) {
                    return (T) Boolean.valueOf(this.h);
                }
                if (pVar == p.u) {
                    return (T) Integer.valueOf(this.i.a());
                }
                if (pVar == p.v) {
                    return (T) Integer.valueOf(this.i.b());
                }
                if (pVar == p.w) {
                    return (T) this.i;
                }
                if (pVar == p.q) {
                    return (T) this.d;
                }
                if (pVar == p.H) {
                    return (T) Boolean.valueOf(this.j);
                }
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public k d() {
        return this.b;
    }

    public int e() {
        return this.e;
    }

    public m0 f() {
        return this.d;
    }

    public <T extends p0> T g() {
        return (T) this.c;
    }

    public int h() {
        return this.i.a();
    }

    public int i() {
        return this.i.b();
    }

    public int j() {
        return this.f;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.g == 1;
    }

    public e m(k kVar) {
        if (kVar != null) {
            this.b = kVar;
            return this;
        }
        throw new NullPointerException("allocator");
    }

    public e n(boolean z) {
        this.h = z;
        return this;
    }

    public e o(boolean z) {
        boolean z2 = true;
        if (l.getAndSet(this, z ? 1 : 0) != 1) {
            z2 = false;
        }
        if (z && !z2) {
            this.a.read();
        } else if (!z && z2) {
            c();
        }
        return this;
    }

    public e p(int i2) {
        if (i2 >= 0) {
            this.e = i2;
            return this;
        }
        throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d (expected: >= 0)", Integer.valueOf(i2)));
    }

    @Deprecated
    public e q(int i2) {
        try {
            ((l0) this.c).b(i2);
            return this;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
        }
    }

    public e r(m0 m0Var) {
        if (m0Var != null) {
            this.d = m0Var;
            return this;
        }
        throw new NullPointerException("estimator");
    }

    public e s(p0 p0Var) {
        if (p0Var != null) {
            this.c = p0Var;
            return this;
        }
        throw new NullPointerException("allocator");
    }

    public e t(int i2) {
        x0 x0Var;
        if (i2 >= 0) {
            do {
                x0Var = this.i;
                if (i2 < x0Var.b()) {
                    StringBuilder V0 = je.V0("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (");
                    V0.append(x0Var.b());
                    V0.append("): ");
                    V0.append(i2);
                    throw new IllegalArgumentException(V0.toString());
                }
            } while (!m.compareAndSet(this, x0Var, new x0(x0Var.b(), i2, false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
    }

    public e u(int i2) {
        x0 x0Var;
        if (i2 >= 0) {
            do {
                x0Var = this.i;
                if (i2 > x0Var.a()) {
                    StringBuilder V0 = je.V0("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (");
                    V0.append(x0Var.a());
                    V0.append("): ");
                    V0.append(i2);
                    throw new IllegalArgumentException(V0.toString());
                }
            } while (!m.compareAndSet(this, x0Var, new x0(i2, x0Var.a(), false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
    }

    public e v(x0 x0Var) {
        if (x0Var != null) {
            this.i = x0Var;
            return this;
        }
        throw new NullPointerException("writeBufferWaterMark");
    }

    public e w(int i2) {
        if (i2 > 0) {
            this.f = i2;
            return this;
        }
        throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
    }

    /* access modifiers changed from: protected */
    public <T> void x(p<T> pVar, T t) {
        if (pVar == null) {
            throw new NullPointerException("option");
        } else if (t == null) {
            throw new NullPointerException("value");
        }
    }
}
