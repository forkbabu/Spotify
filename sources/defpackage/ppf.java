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

/* renamed from: ppf  reason: default package */
public class ppf extends ipf implements j {
    private final long a;

    public ppf(long j) {
        this.a = j;
    }

    @Override // org.msgpack.value.s
    public long A() {
        return this.a;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.INTEGER;
    }

    @Override // org.msgpack.value.s
    public float H() {
        return (float) this.a;
    }

    @Override // org.msgpack.value.s
    public double I() {
        return (double) this.a;
    }

    @Override // org.msgpack.value.s
    public BigInteger J() {
        return BigInteger.valueOf(this.a);
    }

    @Override // org.msgpack.value.s
    public int T() {
        return (int) this.a;
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
        q k = vVar.k();
        if (k.j() && this.a == k.A()) {
            return true;
        }
        return false;
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
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) (j ^ (j >>> 32)) : (int) j;
    }

    @Override // defpackage.ipf
    public k i0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.q
    public boolean j() {
        return true;
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
        long j = this.a;
        return -2147483648L <= j && j <= 2147483647L;
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
        return Long.toString(this.a);
    }
}
