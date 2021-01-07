package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ValueType;
import org.msgpack.value.d;
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

/* renamed from: opf  reason: default package */
public class opf extends ipf implements i {
    private final byte a;
    private final byte[] b;

    public opf(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.EXTENSION;
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public d P() {
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

    @Override // org.msgpack.value.d
    public byte[] c() {
        return this.b;
    }

    @Override // defpackage.ipf
    public h d0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public i e0() {
        return this;
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
        if (!vVar.L()) {
            return false;
        }
        d P = vVar.P();
        if (this.a != P.getType() || !Arrays.equals(this.b, P.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ipf
    public npf g0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.d
    public byte getType() {
        return this.a;
    }

    @Override // defpackage.ipf
    public j h0() {
        throw new MessageTypeCastException();
    }

    public int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
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
        StringBuilder S0 = je.S0('(');
        S0.append(Byte.toString(this.a));
        S0.append(",0x");
        for (byte b2 : this.b) {
            S0.append(Integer.toString(b2, 16));
        }
        S0.append(")");
        return S0.toString();
    }

    @Override // org.msgpack.value.v
    public String z() {
        StringBuilder S0 = je.S0('[');
        S0.append(Byte.toString(this.a));
        S0.append(",\"");
        for (byte b2 : this.b) {
            S0.append(Integer.toString(b2, 16));
        }
        S0.append("\"]");
        return S0.toString();
    }
}
