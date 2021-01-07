package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.e;
import okio.f;
import okio.g;
import okio.q;

public abstract class JsonReader implements Closeable {
    private static final String[] n = new String[128];
    int a;
    int[] b = new int[32];
    String[] c = new String[32];
    int[] f = new int[32];

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {
        final String[] a;
        final q b;

        private a(String[] strArr, q qVar) {
            this.a = strArr;
            this.b = qVar;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                e eVar = new e();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.a(eVar, strArr[i]);
                    eVar.readByte();
                    byteStringArr[i] = eVar.q();
                }
                return new a((String[]) strArr.clone(), q.d(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            n[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonReader() {
    }

    static void a(f fVar, String str) {
        String str2;
        String[] strArr = n;
        e eVar = (e) fVar;
        eVar.J(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                eVar.c0(str, i, i2);
            }
            eVar.b0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            eVar.c0(str, i, length);
        }
        eVar.J(34);
    }

    public static JsonReader r(g gVar) {
        return new a(gVar);
    }

    public abstract void B();

    public abstract void C();

    /* access modifiers changed from: package-private */
    public final JsonEncodingException D(String str) {
        StringBuilder Z0 = je.Z0(str, " at path ");
        Z0.append(o());
        throw new JsonEncodingException(Z0.toString());
    }

    public abstract void b();

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract double l();

    public abstract int m();

    public final String o() {
        int i = this.a;
        int[] iArr = this.b;
        String[] strArr = this.c;
        int[] iArr2 = this.f;
        StringBuilder S0 = je.S0('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                S0.append('[');
                S0.append(iArr2[i2]);
                S0.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                S0.append('.');
                if (strArr[i2] != null) {
                    S0.append(strArr[i2]);
                }
            }
        }
        return S0.toString();
    }

    public abstract String p();

    public abstract String q();

    public abstract Token s();

    /* access modifiers changed from: package-private */
    public final void v(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.c;
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f;
                this.f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder V0 = je.V0("Nesting too deep at ");
                V0.append(o());
                throw new JsonDataException(V0.toString());
            }
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int w(a aVar);
}
