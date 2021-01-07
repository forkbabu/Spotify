package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ValueType;
import org.msgpack.value.f;
import org.msgpack.value.g;
import org.msgpack.value.h;
import org.msgpack.value.i;
import org.msgpack.value.j;
import org.msgpack.value.k;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.q;
import org.msgpack.value.s;
import org.msgpack.value.v;

/* renamed from: kpf  reason: default package */
public class kpf extends ipf implements j {
    private static final BigInteger b = BigInteger.valueOf(-2147483648L);
    private static final BigInteger c = BigInteger.valueOf(2147483647L);
    private static final BigInteger f = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger n = BigInteger.valueOf(Long.MAX_VALUE);
    private final BigInteger a;

    static {
        BigInteger.valueOf(-128);
        BigInteger.valueOf(127);
        BigInteger.valueOf(-32768);
        BigInteger.valueOf(32767);
    }

    public kpf(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // org.msgpack.value.s
    public long A() {
        return this.a.longValue();
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.INTEGER;
    }

    @Override // org.msgpack.value.s
    public float H() {
        return this.a.floatValue();
    }

    @Override // org.msgpack.value.s
    public double I() {
        return this.a.doubleValue();
    }

    @Override // org.msgpack.value.s
    public BigInteger J() {
        return this.a;
    }

    @Override // org.msgpack.value.s
    public int T() {
        return this.a.intValue();
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public s Y() {
        return this;
    }

    @Override // defpackage.ipf
    public f Z() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public g a0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public h d0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public i e0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v, java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!vVar.M()) {
            return false;
        }
        return this.a.equals(vVar.k().J());
    }

    @Override // defpackage.ipf
    public npf g0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public j h0() {
        return this;
    }

    public int hashCode() {
        long j;
        if (b.compareTo(this.a) <= 0 && this.a.compareTo(c) <= 0) {
            j = this.a.longValue();
        } else if (f.compareTo(this.a) > 0 || this.a.compareTo(n) > 0) {
            return this.a.hashCode();
        } else {
            long longValue = this.a.longValue();
            j = longValue ^ (longValue >>> 32);
        }
        return (int) j;
    }

    @Override // defpackage.ipf
    public k i0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.q
    public boolean j() {
        return this.a.compareTo(f) >= 0 && this.a.compareTo(n) <= 0;
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public q k() {
        return this;
    }

    @Override // defpackage.ipf
    public m k0() {
        return this;
    }

    @Override // org.msgpack.value.q
    public boolean l() {
        return this.a.compareTo(b) >= 0 && this.a.compareTo(c) <= 0;
    }

    @Override // defpackage.ipf
    public n l0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public o m0() {
        throw new MessageTypeCastException();
    }

    public String toString() {
        return z();
    }

    @Override // org.msgpack.value.v
    public String z() {
        return this.a.toString();
    }
}
