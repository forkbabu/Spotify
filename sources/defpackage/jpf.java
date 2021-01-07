package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
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

/* renamed from: jpf  reason: default package */
public class jpf extends ipf implements f {
    private static final jpf b = new jpf(new v[0]);
    private final v[] a;

    /* renamed from: jpf$a */
    private static class a implements Iterator<v> {
        private final v[] a;
        private int b = 0;

        public a(v[] vVarArr) {
            this.a = vVarArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != this.a.length;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public v next() {
            int i = this.b;
            v[] vVarArr = this.a;
            if (i < vVarArr.length) {
                this.b = i + 1;
                return vVarArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public jpf(v[] vVarArr) {
        this.a = vVarArr;
    }

    private static void n0(StringBuilder sb, v vVar) {
        if (vVar.f()) {
            sb.append(vVar.z());
        } else {
            sb.append(vVar.toString());
        }
    }

    public static f o0() {
        return b;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.ARRAY;
    }

    @Override // defpackage.ipf
    public f Z() {
        return this;
    }

    @Override // defpackage.ipf
    public g a0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public h d0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public org.msgpack.value.a e() {
        return this;
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
        if (vVar instanceof jpf) {
            return Arrays.equals(this.a, ((jpf) vVar).a);
        }
        if (!vVar.R()) {
            return false;
        }
        org.msgpack.value.a e = vVar.e();
        if (this.a.length != e.size()) {
            return false;
        }
        Iterator<v> it = e.iterator();
        for (int i = 0; i < this.a.length; i++) {
            if (!it.hasNext() || !this.a[i].equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ipf
    public npf g0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public j h0() {
        throw new MessageTypeCastException();
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            v[] vVarArr = this.a;
            if (i2 >= vVarArr.length) {
                return i;
            }
            i = (i * 31) + vVarArr[i2].hashCode();
            i2++;
        }
    }

    @Override // defpackage.ipf
    public k i0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.a, java.lang.Iterable
    public Iterator<v> iterator() {
        return new a(this.a);
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

    @Override // org.msgpack.value.a
    public int size() {
        return this.a.length;
    }

    @Override // java.lang.Object
    public String toString() {
        if (this.a.length == 0) {
            return "[]";
        }
        StringBuilder V0 = je.V0("[");
        n0(V0, this.a[0]);
        for (int i = 1; i < this.a.length; i++) {
            V0.append(",");
            n0(V0, this.a[i]);
        }
        V0.append("]");
        return V0.toString();
    }

    @Override // org.msgpack.value.v
    public String z() {
        if (this.a.length == 0) {
            return "[]";
        }
        StringBuilder V0 = je.V0("[");
        V0.append(this.a[0].z());
        for (int i = 1; i < this.a.length; i++) {
            V0.append(",");
            V0.append(this.a[i].z());
        }
        V0.append("]");
        return V0.toString();
    }
}
