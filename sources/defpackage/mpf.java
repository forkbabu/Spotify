package defpackage;

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
import org.msgpack.value.v;

/* renamed from: mpf  reason: default package */
public class mpf extends ipf implements h {
    public static final h b = new mpf(true);
    public static final h c = new mpf(false);
    private final boolean a;

    private mpf(boolean z) {
        this.a = z;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.BOOLEAN;
    }

    @Override // org.msgpack.value.c
    public boolean K() {
        return this.a;
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
        if (vVar.S() && this.a == vVar.X().K()) {
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
        return this.a ? 1231 : 1237;
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
        return z();
    }

    @Override // org.msgpack.value.v
    public String z() {
        return Boolean.toString(this.a);
    }
}
