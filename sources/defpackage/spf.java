package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;
import org.msgpack.value.o;
import org.msgpack.value.u;
import org.msgpack.value.v;

/* renamed from: spf  reason: default package */
public class spf extends hpf implements o {
    public spf(byte[] bArr) {
        super(bArr);
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.STRING;
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public u V() {
        return this;
    }

    @Override // org.msgpack.value.v, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!vVar.o()) {
            return false;
        }
        if (vVar instanceof spf) {
            return Arrays.equals(this.a, ((spf) vVar).a);
        }
        return Arrays.equals(this.a, vVar.V().i());
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.hpf, defpackage.ipf
    public o m0() {
        return this;
    }
}
