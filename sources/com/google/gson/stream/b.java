package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class b implements Closeable, Flushable {
    private static final String[] s = new String[128];
    private static final String[] t;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private String f;
    private String n;
    private boolean o;
    private boolean p;
    private String q;
    private boolean r;

    static {
        for (int i = 0; i <= 31; i++) {
            s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        v(6);
        this.n = ":";
        this.r = true;
        if (writer != null) {
            this.a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void G(String str) {
        String str2;
        String[] strArr = this.p ? t : s;
        this.a.write(34);
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
                this.a.write(str, i, i2 - i);
            }
            this.a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.a.write(str, i, length - i);
        }
        this.a.write(34);
    }

    private void U() {
        if (this.q != null) {
            int s2 = s();
            if (s2 == 5) {
                this.a.write(44);
            } else if (s2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            q();
            w(4);
            G(this.q);
            this.q = null;
        }
    }

    private void a() {
        int s2 = s();
        if (s2 == 1) {
            w(2);
            q();
        } else if (s2 == 2) {
            this.a.append(',');
            q();
        } else if (s2 != 4) {
            if (s2 != 6) {
                if (s2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.o) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            w(7);
        } else {
            this.a.append((CharSequence) this.n);
            w(5);
        }
    }

    private b f(int i, int i2, char c2) {
        int s2 = s();
        if (s2 != i2 && s2 != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.q == null) {
            this.c--;
            if (s2 == i2) {
                q();
            }
            this.a.write(c2);
            return this;
        } else {
            StringBuilder V0 = je.V0("Dangling name: ");
            V0.append(this.q);
            throw new IllegalStateException(V0.toString());
        }
    }

    private void q() {
        if (this.f != null) {
            this.a.write(10);
            int i = this.c;
            for (int i2 = 1; i2 < i; i2++) {
                this.a.write(this.f);
            }
        }
    }

    private int s() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void v(int i) {
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    private void w(int i) {
        this.b[this.c - 1] = i;
    }

    public final void B(boolean z) {
        this.p = z;
    }

    public final void C(String str) {
        if (str.length() == 0) {
            this.f = null;
            this.n = ":";
            return;
        }
        this.f = str;
        this.n = ": ";
    }

    public final void D(boolean z) {
        this.o = z;
    }

    public final void F(boolean z) {
        this.r = z;
    }

    public b I(long j) {
        U();
        a();
        this.a.write(Long.toString(j));
        return this;
    }

    public b J(Boolean bool) {
        if (bool == null) {
            return r();
        }
        U();
        a();
        this.a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b M(Number number) {
        if (number == null) {
            return r();
        }
        U();
        String obj = number.toString();
        if (this.o || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public b O(String str) {
        if (str == null) {
            return r();
        }
        U();
        a();
        G(str);
        return this;
    }

    public b Q(boolean z) {
        U();
        a();
        this.a.write(z ? "true" : "false");
        return this;
    }

    public b b() {
        U();
        a();
        v(1);
        this.a.write(91);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public b d() {
        U();
        a();
        v(3);
        this.a.write(123);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.c != 0) {
            this.a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public b g() {
        f(1, 2, ']');
        return this;
    }

    public b h() {
        f(3, 5, '}');
        return this;
    }

    public final boolean i() {
        return this.r;
    }

    public final boolean l() {
        return this.p;
    }

    public boolean m() {
        return this.o;
    }

    public b p(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.q != null) {
            throw new IllegalStateException();
        } else if (this.c != 0) {
            this.q = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public b r() {
        if (this.q != null) {
            if (this.r) {
                U();
            } else {
                this.q = null;
                return this;
            }
        }
        a();
        this.a.write("null");
        return this;
    }
}
