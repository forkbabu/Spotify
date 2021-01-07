package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
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
import org.msgpack.value.r;
import org.msgpack.value.v;

/* renamed from: qpf  reason: default package */
public class qpf extends ipf implements k {
    private static final qpf b = new qpf(new v[0]);
    private final v[] a;

    /* renamed from: qpf$a */
    private static class a extends AbstractSet<Map.Entry<v, v>> {
        private final v[] a;

        a(v[] vVarArr) {
            this.a = vVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<v, v>> iterator() {
            return new b(this.a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a.length / 2;
        }
    }

    /* renamed from: qpf$b */
    private static class b implements Iterator<Map.Entry<v, v>> {
        private final v[] a;
        private int b = 0;

        b(v[] vVarArr) {
            this.a = vVarArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Map.Entry<v, v> next() {
            int i = this.b;
            v[] vVarArr = this.a;
            if (i < vVarArr.length) {
                AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(vVarArr[i], vVarArr[i + 1]);
                this.b += 2;
                return simpleImmutableEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: qpf$c */
    private static class c extends AbstractMap<v, v> {
        private final v[] a;

        public c(v[] vVarArr) {
            this.a = vVarArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<v, v>> entrySet() {
            return new a(this.a);
        }
    }

    public qpf(v[] vVarArr) {
        this.a = vVarArr;
    }

    private static void n0(StringBuilder sb, v vVar) {
        if (vVar.f()) {
            sb.append(vVar.z());
        } else {
            hpf.n0(sb, vVar.toString());
        }
    }

    private static void o0(StringBuilder sb, v vVar) {
        if (vVar.f()) {
            sb.append(vVar.z());
        } else {
            sb.append(vVar.toString());
        }
    }

    public static k p0() {
        return b;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return ValueType.MAP;
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
        if (!vVar.N()) {
            return false;
        }
        return new c(this.a).equals(vVar.h().t());
    }

    @Override // defpackage.ipf
    public npf g0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public r h() {
        return this;
    }

    @Override // defpackage.ipf
    public j h0() {
        throw new MessageTypeCastException();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            v[] vVarArr = this.a;
            if (i >= vVarArr.length) {
                return i2;
            }
            i2 += vVarArr[i].hashCode() ^ this.a[i + 1].hashCode();
            i += 2;
        }
    }

    @Override // defpackage.ipf
    public k i0() {
        return this;
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

    @Override // org.msgpack.value.r
    public Map<v, v> t() {
        return new c(this.a);
    }

    public String toString() {
        if (this.a.length == 0) {
            return "{}";
        }
        StringBuilder V0 = je.V0("{");
        o0(V0, this.a[0]);
        V0.append(":");
        o0(V0, this.a[1]);
        for (int i = 2; i < this.a.length; i += 2) {
            V0.append(",");
            o0(V0, this.a[i]);
            V0.append(":");
            o0(V0, this.a[i + 1]);
        }
        V0.append("}");
        return V0.toString();
    }

    @Override // org.msgpack.value.v
    public String z() {
        if (this.a.length == 0) {
            return "{}";
        }
        StringBuilder V0 = je.V0("{");
        n0(V0, this.a[0]);
        V0.append(":");
        V0.append(this.a[1].z());
        for (int i = 2; i < this.a.length; i += 2) {
            V0.append(",");
            n0(V0, this.a[i]);
            V0.append(":");
            V0.append(this.a[i + 1].z());
        }
        V0.append("}");
        return V0.toString();
    }
}
