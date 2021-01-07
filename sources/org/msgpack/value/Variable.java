package org.msgpack.value;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;

public class Variable implements v {
    private static final BigInteger x = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger y = BigInteger.valueOf(Long.MAX_VALUE);
    private final l a;
    private final g b = new g(null);
    private final j c = new j(null);
    private final i f = new i(null);
    private final f n = new f(this, null);
    private final m o = new m(null);
    private final e p = new e(null);
    private final k q = new k(null);
    private final h r = new h(null);
    private Type s = Type.NULL;
    private long t;
    private double u;
    private Object v;
    private d w;

    /* JADX WARN: Init of enum c can be incorrect */
    /* JADX WARN: Init of enum f can be incorrect */
    public enum Type {
        NULL(ValueType.NIL),
        BOOLEAN(ValueType.BOOLEAN),
        LONG(r4),
        BIG_INTEGER(r4),
        DOUBLE(ValueType.FLOAT),
        BYTE_ARRAY(ValueType.BINARY),
        RAW_STRING(ValueType.STRING),
        LIST(ValueType.ARRAY),
        MAP(ValueType.MAP),
        EXTENSION(ValueType.EXTENSION);
        
        private final ValueType valueType;

        static {
            ValueType valueType2 = ValueType.INTEGER;
        }

        private Type(ValueType valueType2) {
            this.valueType = valueType2;
        }

        public ValueType d() {
            return this.valueType;
        }
    }

    private abstract class b extends d implements s {
        b(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.s
        public long A() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.v).longValue();
            }
            return Variable.this.t;
        }

        @Override // org.msgpack.value.s
        public float H() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.v).floatValue();
            }
            if (Variable.this.s == Type.DOUBLE) {
                return (float) Variable.this.u;
            }
            return (float) Variable.this.t;
        }

        @Override // org.msgpack.value.s
        public double I() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.v).doubleValue();
            }
            if (Variable.this.s == Type.DOUBLE) {
                return Variable.this.u;
            }
            return (double) Variable.this.t;
        }

        @Override // org.msgpack.value.s
        public BigInteger J() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return (BigInteger) Variable.this.v;
            }
            if (Variable.this.s == Type.DOUBLE) {
                return new BigDecimal(Variable.this.u).toBigInteger();
            }
            return BigInteger.valueOf(Variable.this.t);
        }

        @Override // org.msgpack.value.s
        public int T() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.v).intValue();
            }
            return (int) Variable.this.t;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public s Y() {
            return this;
        }
    }

    private abstract class c extends d implements t {
        c(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.t
        public byte[] i() {
            return (byte[]) Variable.this.v;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.t
        public String toString() {
            try {
                return org.msgpack.core.b.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap((byte[]) Variable.this.v)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public t u() {
            return this;
        }
    }

    /* access modifiers changed from: private */
    public abstract class d implements v {
        d(a aVar) {
        }

        @Override // org.msgpack.value.v
        public boolean L() {
            return E().i();
        }

        @Override // org.msgpack.value.v
        public boolean M() {
            return E().l();
        }

        @Override // org.msgpack.value.v
        public boolean N() {
            return E().m();
        }

        @Override // org.msgpack.value.v
        public e O() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public d P() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public b Q() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public boolean R() {
            return E().d();
        }

        @Override // org.msgpack.value.v
        public boolean S() {
            return E().h();
        }

        @Override // org.msgpack.value.v
        public u V() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public c X() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public s Y() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public boolean d() {
            return E().g();
        }

        @Override // org.msgpack.value.v
        public a e() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v, java.lang.Object
        public boolean equals(Object obj) {
            return Variable.this.y().equals(obj);
        }

        @Override // org.msgpack.value.v
        public boolean f() {
            return E().q();
        }

        @Override // org.msgpack.value.v
        public r h() {
            throw new MessageTypeCastException();
        }

        public int hashCode() {
            return Variable.this.hashCode();
        }

        @Override // org.msgpack.value.v
        public q k() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public boolean n() {
            return E().n();
        }

        @Override // org.msgpack.value.v
        public boolean o() {
            return E().r();
        }

        @Override // org.msgpack.value.t
        public String toString() {
            return Variable.this.toString();
        }

        @Override // org.msgpack.value.v
        public t u() {
            throw new MessageTypeCastException();
        }

        @Override // org.msgpack.value.v
        public boolean x() {
            return E().k();
        }

        @Override // org.msgpack.value.v
        public String z() {
            return Variable.this.z();
        }
    }

    private class e extends d implements a {
        e(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.ARRAY;
        }

        public List<v> Z() {
            return (List) Variable.this.v;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public a e() {
            return this;
        }

        @Override // org.msgpack.value.a, java.lang.Iterable
        public Iterator<v> iterator() {
            return Z().iterator();
        }

        @Override // org.msgpack.value.a
        public int size() {
            return Z().size();
        }

        @Override // org.msgpack.value.v
        public p y() {
            List<v> Z = Z();
            if (Z.isEmpty()) {
                return jpf.o0();
            }
            return new jpf((v[]) Z.toArray(new v[Z.size()]));
        }
    }

    private class f extends c implements b {
        f(Variable variable, a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.BINARY;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public b Q() {
            return this;
        }

        @Override // org.msgpack.value.v
        public p y() {
            return new lpf(i());
        }
    }

    private class g extends d implements c {
        g(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.BOOLEAN;
        }

        @Override // org.msgpack.value.c
        public boolean K() {
            return Variable.this.t == 1;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public c X() {
            return this;
        }

        @Override // org.msgpack.value.v
        public p y() {
            return (Variable.this.t > 1 ? 1 : (Variable.this.t == 1 ? 0 : -1)) == 0 ? mpf.b : mpf.c;
        }
    }

    private class h extends d implements d {
        h(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.EXTENSION;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public d P() {
            return this;
        }

        @Override // org.msgpack.value.d
        public byte[] c() {
            return ((i) Variable.this.v).c();
        }

        @Override // org.msgpack.value.d
        public byte getType() {
            return ((i) Variable.this.v).getType();
        }

        @Override // org.msgpack.value.v
        public p y() {
            return (i) Variable.this.v;
        }
    }

    private class i extends b implements e {
        i(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.FLOAT;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public e O() {
            return this;
        }

        @Override // org.msgpack.value.v
        public p y() {
            return new npf(Variable.this.u);
        }
    }

    private class j extends b implements q {
        j(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.INTEGER;
        }

        @Override // org.msgpack.value.q
        public boolean j() {
            return Variable.this.s != Type.BIG_INTEGER;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public q k() {
            return this;
        }

        @Override // org.msgpack.value.q
        public boolean l() {
            if (Variable.this.s != Type.BIG_INTEGER && -2147483648L <= Variable.this.t && Variable.this.t <= 2147483647L) {
                return true;
            }
            return false;
        }

        @Override // org.msgpack.value.v
        public p y() {
            if (Variable.this.s == Type.BIG_INTEGER) {
                return new kpf((BigInteger) Variable.this.v);
            }
            return new ppf(Variable.this.t);
        }
    }

    private class k extends d implements r {
        k(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.MAP;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public r h() {
            return this;
        }

        @Override // org.msgpack.value.r
        public Map<v, v> t() {
            return (Map) Variable.this.v;
        }

        @Override // org.msgpack.value.v
        public p y() {
            Map map = (Map) Variable.this.v;
            v[] vVarArr = new v[(map.size() * 2)];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                vVarArr[i] = (v) entry.getKey();
                int i2 = i + 1;
                vVarArr[i2] = (v) entry.getValue();
                i = i2 + 1;
            }
            return yif.y(vVarArr);
        }
    }

    private class l extends d implements v {
        l(Variable variable, a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.NIL;
        }

        @Override // org.msgpack.value.v
        public p y() {
            return rpf.n0();
        }
    }

    private class m extends c implements u {
        m(a aVar) {
            super(null);
        }

        @Override // org.msgpack.value.v
        public ValueType E() {
            return ValueType.STRING;
        }

        @Override // org.msgpack.value.Variable.d, org.msgpack.value.v
        public u V() {
            return this;
        }

        @Override // org.msgpack.value.v
        public p y() {
            return new spf((byte[]) Variable.this.v);
        }
    }

    public Variable() {
        l lVar = new l(this, null);
        this.a = lVar;
        this.w = lVar;
    }

    public Variable B(BigInteger bigInteger) {
        if (bigInteger.compareTo(x) < 0 || bigInteger.compareTo(y) > 0) {
            this.s = Type.BIG_INTEGER;
            this.w = this.c;
            this.v = bigInteger;
        } else {
            this.s = Type.LONG;
            this.w = this.c;
            this.t = bigInteger.longValue();
        }
        return this;
    }

    public Variable C(Map<v, v> map) {
        this.s = Type.MAP;
        this.w = this.q;
        this.v = map;
        return this;
    }

    public Variable D() {
        this.s = Type.NULL;
        this.w = this.a;
        return this;
    }

    @Override // org.msgpack.value.v
    public ValueType E() {
        return this.s.d();
    }

    public Variable F(byte[] bArr) {
        this.s = Type.RAW_STRING;
        this.w = this.o;
        this.v = bArr;
        return this;
    }

    @Override // org.msgpack.value.v
    public boolean L() {
        return E().i();
    }

    @Override // org.msgpack.value.v
    public boolean M() {
        return E().l();
    }

    @Override // org.msgpack.value.v
    public boolean N() {
        return E().m();
    }

    @Override // org.msgpack.value.v
    public e O() {
        if (x()) {
            return (e) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public d P() {
        if (L()) {
            return (d) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public b Q() {
        if (d()) {
            return (b) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public boolean R() {
        return E().d();
    }

    @Override // org.msgpack.value.v
    public boolean S() {
        return E().h();
    }

    @Override // org.msgpack.value.v
    public u V() {
        if (E().r()) {
            return (u) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public c X() {
        if (E().h()) {
            return (c) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public s Y() {
        if (E().p()) {
            return (s) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public boolean d() {
        return E().g();
    }

    @Override // org.msgpack.value.v
    public a e() {
        if (E().d()) {
            return (a) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v, java.lang.Object
    public boolean equals(Object obj) {
        return y().equals(obj);
    }

    @Override // org.msgpack.value.v
    public boolean f() {
        return E().q();
    }

    @Override // org.msgpack.value.v
    public r h() {
        if (E().m()) {
            return (r) this.w;
        }
        throw new MessageTypeCastException();
    }

    public int hashCode() {
        return y().hashCode();
    }

    @Override // org.msgpack.value.v
    public q k() {
        if (M()) {
            return (q) this.w;
        }
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.v
    public boolean n() {
        return E().n();
    }

    @Override // org.msgpack.value.v
    public boolean o() {
        return E().r();
    }

    public Variable p(List<v> list) {
        this.s = Type.LIST;
        this.w = this.p;
        this.v = list;
        return this;
    }

    public Variable q(byte[] bArr) {
        this.s = Type.BYTE_ARRAY;
        this.w = this.n;
        this.v = bArr;
        return this;
    }

    public Variable r(boolean z) {
        this.s = Type.BOOLEAN;
        this.w = this.b;
        this.t = z ? 1 : 0;
        return this;
    }

    public Variable s(byte b2, byte[] bArr) {
        this.s = Type.EXTENSION;
        this.w = this.r;
        this.v = new opf(b2, bArr);
        return this;
    }

    public String toString() {
        return y().toString();
    }

    @Override // org.msgpack.value.v
    public t u() {
        if (f()) {
            return (t) this.w;
        }
        throw new MessageTypeCastException();
    }

    public Variable v(double d2) {
        this.s = Type.DOUBLE;
        this.w = this.f;
        this.u = d2;
        this.t = (long) d2;
        return this;
    }

    public Variable w(long j2) {
        this.s = Type.LONG;
        this.w = this.c;
        this.t = j2;
        return this;
    }

    @Override // org.msgpack.value.v
    public boolean x() {
        return E().k();
    }

    @Override // org.msgpack.value.v
    public p y() {
        return this.w.y();
    }

    @Override // org.msgpack.value.v
    public String z() {
        return y().z();
    }
}
