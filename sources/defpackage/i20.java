package defpackage;

import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: i20  reason: default package */
public final class i20 extends com.google.gson.stream.a {
    private static final Reader D = new a();
    private static final Object E = new Object();
    private int A = 0;
    private String[] B = new String[32];
    private int[] C = new int[32];
    private Object[] z = new Object[32];

    /* renamed from: i20$a */
    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public i20(p pVar) {
        super(D);
        k0(pVar);
    }

    private void d0(JsonToken jsonToken) {
        if (J() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + J() + q());
        }
    }

    private Object f0() {
        return this.z[this.A - 1];
    }

    private Object h0() {
        Object[] objArr = this.z;
        int i = this.A - 1;
        this.A = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void k0(Object obj) {
        int i = this.A;
        Object[] objArr = this.z;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.z = Arrays.copyOf(objArr, i2);
            this.C = Arrays.copyOf(this.C, i2);
            this.B = (String[]) Arrays.copyOf(this.B, i2);
        }
        Object[] objArr2 = this.z;
        int i3 = this.A;
        this.A = i3 + 1;
        objArr2[i3] = obj;
    }

    private String q() {
        StringBuilder V0 = je.V0(" at path ");
        V0.append(o());
        return V0.toString();
    }

    @Override // com.google.gson.stream.a
    public String B() {
        d0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) f0()).next();
        String str = (String) entry.getKey();
        this.B[this.A - 1] = str;
        k0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.a
    public void D() {
        d0(JsonToken.NULL);
        h0();
        int i = this.A;
        if (i > 0) {
            int[] iArr = this.C;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public String G() {
        JsonToken J = J();
        JsonToken jsonToken = JsonToken.STRING;
        if (J == jsonToken || J == JsonToken.NUMBER) {
            String e = ((t) h0()).e();
            int i = this.A;
            if (i > 0) {
                int[] iArr = this.C;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + J + q());
    }

    @Override // com.google.gson.stream.a
    public JsonToken J() {
        if (this.A == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object f0 = f0();
        if (f0 instanceof Iterator) {
            boolean z2 = this.z[this.A - 2] instanceof r;
            Iterator it = (Iterator) f0;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z2) {
                return JsonToken.NAME;
            }
            k0(it.next());
            return J();
        } else if (f0 instanceof r) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (f0 instanceof m) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (f0 instanceof t) {
                t tVar = (t) f0;
                if (tVar.t()) {
                    return JsonToken.STRING;
                }
                if (tVar.l()) {
                    return JsonToken.BOOLEAN;
                }
                if (tVar.o()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (f0 instanceof q) {
                return JsonToken.NULL;
            } else {
                if (f0 == E) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.a
    public void a() {
        d0(JsonToken.BEGIN_ARRAY);
        k0(((m) f0()).iterator());
        this.C[this.A - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public void b() {
        d0(JsonToken.BEGIN_OBJECT);
        k0(((r) f0()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.a
    public void b0() {
        if (J() == JsonToken.NAME) {
            B();
            this.B[this.A - 2] = "null";
        } else {
            h0();
            int i = this.A;
            if (i > 0) {
                this.B[i - 1] = "null";
            }
        }
        int i2 = this.A;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.z = new Object[]{E};
        this.A = 1;
    }

    @Override // com.google.gson.stream.a
    public void g() {
        d0(JsonToken.END_ARRAY);
        h0();
        h0();
        int i = this.A;
        if (i > 0) {
            int[] iArr = this.C;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void h() {
        d0(JsonToken.END_OBJECT);
        h0();
        h0();
        int i = this.A;
        if (i > 0) {
            int[] iArr = this.C;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void j0() {
        d0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) f0()).next();
        k0(entry.getValue());
        k0(new t((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.a
    public boolean l() {
        JsonToken J = J();
        return (J == JsonToken.END_OBJECT || J == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.a
    public String o() {
        StringBuilder S0 = je.S0('$');
        int i = 0;
        while (i < this.A) {
            Object[] objArr = this.z;
            if (objArr[i] instanceof m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    S0.append('[');
                    S0.append(this.C[i]);
                    S0.append(']');
                }
            } else if (objArr[i] instanceof r) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    S0.append('.');
                    String[] strArr = this.B;
                    if (strArr[i] != null) {
                        S0.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return S0.toString();
    }

    @Override // com.google.gson.stream.a
    public boolean r() {
        d0(JsonToken.BOOLEAN);
        boolean f = ((t) h0()).f();
        int i = this.A;
        if (i > 0) {
            int[] iArr = this.C;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    @Override // com.google.gson.stream.a
    public double s() {
        JsonToken J = J();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (J == jsonToken || J == JsonToken.STRING) {
            double h = ((t) f0()).h();
            if (m() || (!Double.isNaN(h) && !Double.isInfinite(h))) {
                h0();
                int i = this.A;
                if (i > 0) {
                    int[] iArr = this.C;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return h;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + h);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + J + q());
    }

    @Override // com.google.gson.stream.a, java.lang.Object
    public String toString() {
        return i20.class.getSimpleName();
    }

    @Override // com.google.gson.stream.a
    public int v() {
        JsonToken J = J();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (J == jsonToken || J == JsonToken.STRING) {
            int i = ((t) f0()).i();
            h0();
            int i2 = this.A;
            if (i2 > 0) {
                int[] iArr = this.C;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return i;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + J + q());
    }

    @Override // com.google.gson.stream.a
    public long w() {
        JsonToken J = J();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (J == jsonToken || J == JsonToken.STRING) {
            long j = ((t) f0()).j();
            h0();
            int i = this.A;
            if (i > 0) {
                int[] iArr = this.C;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + J + q());
    }
}
