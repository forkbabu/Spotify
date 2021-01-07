package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ValueType;
import org.msgpack.value.e;
import org.msgpack.value.f;
import org.msgpack.value.g;
import org.msgpack.value.h;
import org.msgpack.value.i;
import org.msgpack.value.j;
import org.msgpack.value.k;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.v;

/* renamed from: npf  reason: default package */
public class npf extends ipf implements e, m {
    private final double a;

    public npf(double d) {
        this.a = d;
    }

    @Override // org.msgpack.value.s
    public long A() {
        return (long) this.a;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.FLOAT;
    }

    @Override // org.msgpack.value.s
    public float H() {
        return (float) this.a;
    }

    @Override // org.msgpack.value.s
    public double I() {
        return this.a;
    }

    @Override // org.msgpack.value.s
    public BigInteger J() {
        return new BigDecimal(this.a).toBigInteger();
    }

    @Override // org.msgpack.value.s
    public int T() {
        return (int) this.a;
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
        if (vVar.x() && this.a == vVar.O().I()) {
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
        throw new MessageTypeCastException();
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // defpackage.ipf
    public k i0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public m k0() {
        throw new MessageTypeCastException();
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
        return Double.toString(this.a);
    }

    @Override // org.msgpack.value.v
    public String z() {
        return (Double.isNaN(this.a) || Double.isInfinite(this.a)) ? "null" : Double.toString(this.a);
    }
}
