package com.google.gson.stream;

import com.google.gson.internal.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a implements Closeable {
    private static final char[] y = ")]}'\n".toCharArray();
    private final Reader a;
    private boolean b = false;
    private final char[] c = new char[1024];
    private int f = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    int q = 0;
    private long r;
    private int s;
    private String t;
    private int[] u;
    private int v;
    private String[] w;
    private int[] x;

    /* renamed from: com.google.gson.stream.a$a  reason: collision with other inner class name */
    class C0136a extends p {
        C0136a() {
        }

        @Override // com.google.gson.internal.p
        public void a(a aVar) {
            if (aVar instanceof i20) {
                ((i20) aVar).j0();
                return;
            }
            int i = aVar.q;
            if (i == 0) {
                i = aVar.f();
            }
            if (i == 13) {
                aVar.q = 9;
            } else if (i == 12) {
                aVar.q = 8;
            } else if (i == 14) {
                aVar.q = 10;
            } else {
                StringBuilder V0 = je.V0("Expected a name but was ");
                V0.append(aVar.J());
                V0.append(aVar.q());
                throw new IllegalStateException(V0.toString());
            }
        }
    }

    static {
        p.a = new C0136a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.u = iArr;
        this.v = 0;
        this.v = 0 + 1;
        iArr[0] = 6;
        this.w = new String[32];
        this.x = new int[32];
        if (reader != null) {
            this.a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private int C(boolean z) {
        char[] cArr = this.c;
        int i = this.f;
        int i2 = this.n;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.f = i;
                if (i(1)) {
                    i = this.f;
                    i2 = this.n;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder V0 = je.V0("End of input");
                    V0.append(q());
                    throw new EOFException(V0.toString());
                }
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.o++;
                this.p = i3;
            } else if (!(c2 == ' ' || c2 == '\r' || c2 == '\t')) {
                if (c2 == '/') {
                    this.f = i3;
                    if (i3 == i2) {
                        this.f = i3 - 1;
                        boolean i4 = i(2);
                        this.f++;
                        if (!i4) {
                            return c2;
                        }
                    }
                    d();
                    int i5 = this.f;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f = i5 + 1;
                        while (true) {
                            if (this.f + 2 > this.n && !i(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.c;
                            int i6 = this.f;
                            if (cArr2[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (this.c[this.f + i7] == "*/".charAt(i7)) {
                                    }
                                }
                                break;
                            }
                            this.o++;
                            this.p = i6 + 1;
                            this.f++;
                        }
                        if (z2) {
                            i = this.f + 2;
                            i2 = this.n;
                        } else {
                            c0("Unterminated comment");
                            throw null;
                        }
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.f = i5 + 1;
                        W();
                        i = this.f;
                        i2 = this.n;
                    }
                } else if (c2 == '#') {
                    this.f = i3;
                    d();
                    W();
                    i = this.f;
                    i2 = this.n;
                } else {
                    this.f = i3;
                    return c2;
                }
            }
            i = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r3, r3 - r3);
        r10.f = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String F(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.c
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f
            int r4 = r10.n
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.O()
            r2.append(r3)
            int r3 = r10.f
            int r4 = r10.n
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.o
            int r3 = r3 + r7
            r10.o = r3
            r10.p = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f = r3
            boolean r3 = r10.i(r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.c0(r11)
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.F(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String I() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f
            int r4 = r3 + r2
            int r5 = r6.n
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.d()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.i(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.c
            int r4 = r6.f
            r1.append(r3, r4, r2)
            int r3 = r6.f
            int r3 = r3 + r2
            r6.f = r3
            r2 = 1
            boolean r2 = r6.i(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.c
            int r3 = r6.f
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.c
            int r3 = r6.f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f
            int r2 = r2 + r0
            r6.f = r2
            return r1
            switch-data {91->0x005c, 92->0x004a, 93->0x005c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.I():java.lang.String");
    }

    private void M(int i) {
        int i2 = this.v;
        int[] iArr = this.u;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.u = Arrays.copyOf(iArr, i3);
            this.x = Arrays.copyOf(this.x, i3);
            this.w = (String[]) Arrays.copyOf(this.w, i3);
        }
        int[] iArr2 = this.u;
        int i4 = this.v;
        this.v = i4 + 1;
        iArr2[i4] = i;
    }

    private char O() {
        int i;
        int i2;
        if (this.f != this.n || i(1)) {
            char[] cArr = this.c;
            int i3 = this.f;
            int i4 = i3 + 1;
            this.f = i4;
            char c2 = cArr[i3];
            if (c2 == '\n') {
                this.o++;
                this.p = i4;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 != 'u') {
                    c0("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.n || i(4)) {
                    char c3 = 0;
                    int i5 = this.f;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c4 = this.c[i5];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i2 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder V0 = je.V0("\\u");
                                V0.append(new String(this.c, this.f, 4));
                                throw new NumberFormatException(V0.toString());
                            } else {
                                i2 = c4 - 'A';
                            }
                            i = i2 + 10;
                        } else {
                            i = c4 - '0';
                        }
                        c3 = (char) (i + c5);
                        i5++;
                    }
                    this.f += 4;
                    return c3;
                } else {
                    c0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        c0("Unterminated escape sequence");
        throw null;
    }

    private void U(char c2) {
        char[] cArr = this.c;
        do {
            int i = this.f;
            int i2 = this.n;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = cArr[i];
                if (c3 == c2) {
                    this.f = i3;
                    return;
                } else if (c3 == '\\') {
                    this.f = i3;
                    O();
                    i = this.f;
                    i2 = this.n;
                } else {
                    if (c3 == '\n') {
                        this.o++;
                        this.p = i3;
                    }
                    i = i3;
                }
            }
            this.f = i;
        } while (i(1));
        c0("Unterminated string");
        throw null;
    }

    private void W() {
        char c2;
        do {
            if (this.f < this.n || i(1)) {
                char[] cArr = this.c;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                c2 = cArr[i];
                if (c2 == '\n') {
                    this.o++;
                    this.p = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != '\r');
    }

    private IOException c0(String str) {
        StringBuilder V0 = je.V0(str);
        V0.append(q());
        throw new MalformedJsonException(V0.toString());
    }

    private void d() {
        if (!this.b) {
            c0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private boolean i(int i) {
        int i2;
        int i3;
        char[] cArr = this.c;
        int i4 = this.p;
        int i5 = this.f;
        this.p = i4 - i5;
        int i6 = this.n;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.n = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.n = 0;
        }
        this.f = 0;
        do {
            Reader reader = this.a;
            int i8 = this.n;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.n + read;
            this.n = i2;
            if (this.o == 0 && (i3 = this.p) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f++;
                this.p = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private boolean p(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public String B() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 14) {
            str = I();
        } else if (i == 12) {
            str = F('\'');
        } else if (i == 13) {
            str = F('\"');
        } else {
            StringBuilder V0 = je.V0("Expected a name but was ");
            V0.append(J());
            V0.append(q());
            throw new IllegalStateException(V0.toString());
        }
        this.q = 0;
        this.w[this.v - 1] = str;
        return str;
    }

    public void D() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 7) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder V0 = je.V0("Expected null but was ");
        V0.append(J());
        V0.append(q());
        throw new IllegalStateException(V0.toString());
    }

    public String G() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 10) {
            str = I();
        } else if (i == 8) {
            str = F('\'');
        } else if (i == 9) {
            str = F('\"');
        } else if (i == 11) {
            str = this.t;
            this.t = null;
        } else if (i == 15) {
            str = Long.toString(this.r);
        } else if (i == 16) {
            str = new String(this.c, this.f, this.s);
            this.f += this.s;
        } else {
            StringBuilder V0 = je.V0("Expected a string but was ");
            V0.append(J());
            V0.append(q());
            throw new IllegalStateException(V0.toString());
        }
        this.q = 0;
        int[] iArr = this.x;
        int i2 = this.v - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public JsonToken J() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void Q(boolean z) {
        this.b = z;
    }

    public void a() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 3) {
            M(1);
            this.x[this.v - 1] = 0;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected BEGIN_ARRAY but was ");
        V0.append(J());
        V0.append(q());
        throw new IllegalStateException(V0.toString());
    }

    public void b() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 1) {
            M(3);
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected BEGIN_OBJECT but was ");
        V0.append(J());
        V0.append(q());
        throw new IllegalStateException(V0.toString());
    }

    public void b0() {
        int i;
        int i2 = 0;
        do {
            int i3 = this.q;
            if (i3 == 0) {
                i3 = f();
            }
            if (i3 == 3) {
                M(1);
            } else if (i3 == 1) {
                M(3);
            } else {
                if (i3 == 4) {
                    this.v--;
                } else if (i3 == 2) {
                    this.v--;
                } else if (i3 == 14 || i3 == 10) {
                    while (true) {
                        i = 0;
                        while (true) {
                            int i4 = this.f + i;
                            if (i4 < this.n) {
                                char c2 = this.c[i4];
                                if (!(c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ')) {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (!(c2 == '/' || c2 == '=')) {
                                                if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f = i4;
                                if (!i(1)) {
                                }
                            }
                        }
                    }
                    d();
                    this.f += i;
                    this.q = 0;
                } else if (i3 == 8 || i3 == 12) {
                    U('\'');
                    this.q = 0;
                } else if (i3 == 9 || i3 == 13) {
                    U('\"');
                    this.q = 0;
                } else {
                    if (i3 == 16) {
                        this.f += this.s;
                    }
                    this.q = 0;
                }
                i2--;
                this.q = 0;
            }
            i2++;
            this.q = 0;
        } while (i2 != 0);
        int[] iArr = this.x;
        int i5 = this.v;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.w[i5 - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q = 0;
        this.u[0] = 8;
        this.v = 1;
        this.a.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0205, code lost:
        if (p(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0207, code lost:
        if (r13 != 2) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0209, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020f, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0211, code lost:
        if (r16 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0217, code lost:
        if (r10 != 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0219, code lost:
        if (r16 != false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021b, code lost:
        if (r16 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021e, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021f, code lost:
        r19.r = r10;
        r19.f += r9;
        r6 = 15;
        r19.q = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x022b, code lost:
        if (r13 == 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x022e, code lost:
        if (r13 == 4) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0231, code lost:
        if (r13 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0233, code lost:
        r19.s = r9;
        r6 = 16;
        r19.q = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0174 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f() {
        /*
        // Method dump skipped, instructions count: 795
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.f():int");
    }

    public void g() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 4) {
            int i2 = this.v - 1;
            this.v = i2;
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected END_ARRAY but was ");
        V0.append(J());
        V0.append(q());
        throw new IllegalStateException(V0.toString());
    }

    public void h() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 2) {
            int i2 = this.v - 1;
            this.v = i2;
            this.w[i2] = null;
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected END_OBJECT but was ");
        V0.append(J());
        V0.append(q());
        throw new IllegalStateException(V0.toString());
    }

    public boolean l() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean m() {
        return this.b;
    }

    public String o() {
        StringBuilder S0 = je.S0('$');
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.u[i2];
            if (i3 == 1 || i3 == 2) {
                S0.append('[');
                S0.append(this.x[i2]);
                S0.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                S0.append('.');
                String[] strArr = this.w;
                if (strArr[i2] != null) {
                    S0.append(strArr[i2]);
                }
            }
        }
        return S0.toString();
    }

    /* access modifiers changed from: package-private */
    public String q() {
        StringBuilder X0 = je.X0(" at line ", this.o + 1, " column ", (this.f - this.p) + 1, " path ");
        X0.append(o());
        return X0.toString();
    }

    public boolean r() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 5) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.q = 0;
            int[] iArr2 = this.x;
            int i3 = this.v - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder V0 = je.V0("Expected a boolean but was ");
            V0.append(J());
            V0.append(q());
            throw new IllegalStateException(V0.toString());
        }
    }

    public double s() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.r;
        }
        if (i == 16) {
            this.t = new String(this.c, this.f, this.s);
            this.f += this.s;
        } else if (i == 8 || i == 9) {
            this.t = F(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.t = I();
        } else if (i != 11) {
            StringBuilder V0 = je.V0("Expected a double but was ");
            V0.append(J());
            V0.append(q());
            throw new IllegalStateException(V0.toString());
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        if (this.b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.t = null;
            this.q = 0;
            int[] iArr2 = this.x;
            int i3 = this.v - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + q());
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + q();
    }

    public int v() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            long j = this.r;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.q = 0;
                int[] iArr = this.x;
                int i3 = this.v - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder V0 = je.V0("Expected an int but was ");
            V0.append(this.r);
            V0.append(q());
            throw new NumberFormatException(V0.toString());
        }
        if (i == 16) {
            this.t = new String(this.c, this.f, this.s);
            this.f += this.s;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.t = I();
            } else {
                this.t = F(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.t);
                this.q = 0;
                int[] iArr2 = this.x;
                int i4 = this.v - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder V02 = je.V0("Expected an int but was ");
            V02.append(J());
            V02.append(q());
            throw new IllegalStateException(V02.toString());
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.t = null;
            this.q = 0;
            int[] iArr3 = this.x;
            int i6 = this.v - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder V03 = je.V0("Expected an int but was ");
        V03.append(this.t);
        V03.append(q());
        throw new NumberFormatException(V03.toString());
    }

    public long w() {
        int i = this.q;
        if (i == 0) {
            i = f();
        }
        if (i == 15) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.r;
        }
        if (i == 16) {
            this.t = new String(this.c, this.f, this.s);
            this.f += this.s;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.t = I();
            } else {
                this.t = F(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.t);
                this.q = 0;
                int[] iArr2 = this.x;
                int i3 = this.v - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder V0 = je.V0("Expected a long but was ");
            V0.append(J());
            V0.append(q());
            throw new IllegalStateException(V0.toString());
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.t = null;
            this.q = 0;
            int[] iArr3 = this.x;
            int i4 = this.v - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder V02 = je.V0("Expected a long but was ");
        V02.append(this.t);
        V02.append(q());
        throw new NumberFormatException(V02.toString());
    }
}
