package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;
import org.msgpack.value.b;
import org.msgpack.value.g;
import org.msgpack.value.v;

/* renamed from: lpf  reason: default package */
public class lpf extends hpf implements g {
    public lpf(byte[] bArr) {
        super(bArr);
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.BINARY;
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public b Q() {
        return this;
    }

    @Override // defpackage.hpf, defpackage.ipf
    public g a0() {
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
        if (!vVar.d()) {
            return false;
        }
        if (vVar instanceof lpf) {
            return Arrays.equals(this.a, ((lpf) vVar).a);
        }
        return Arrays.equals(this.a, vVar.Q().i());
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
