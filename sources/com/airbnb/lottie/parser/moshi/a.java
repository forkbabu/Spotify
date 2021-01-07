package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import okio.ByteString;
import okio.e;
import okio.g;

/* access modifiers changed from: package-private */
public final class a extends JsonReader {
    private static final ByteString u = ByteString.m("'\\");
    private static final ByteString v = ByteString.m("\"\\");
    private static final ByteString w = ByteString.m("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString x = ByteString.m("\n\r");
    private static final ByteString y = ByteString.m("*/");
    private final g o;
    private final e p;
    private int q = 0;
    private long r;
    private int s;
    private String t;

    a(g gVar) {
        if (gVar != null) {
            this.o = gVar;
            this.p = gVar.L();
            v(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void F() {
        D("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01aa, code lost:
        if (J(r2) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ad, code lost:
        if (r1 != 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01af, code lost:
        if (r6 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b5, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b7, code lost:
        if (r9 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bd, code lost:
        if (r7 != 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bf, code lost:
        if (r9 != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c1, code lost:
        if (r9 == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c4, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c5, code lost:
        r17.r = r7;
        r17.p.skip((long) r5);
        r15 = 16;
        r17.q = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d2, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d3, code lost:
        if (r1 == r2) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d6, code lost:
        if (r1 == 4) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d9, code lost:
        if (r1 != 7) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01db, code lost:
        r17.s = r5;
        r15 = 17;
        r17.q = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0131, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int G() {
        /*
        // Method dump skipped, instructions count: 713
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.G():int");
    }

    private int I(String str, JsonReader.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.q = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean J(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        F();
        throw null;
    }

    private int M(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.o.n((long) i2)) {
                byte g = this.p.g((long) i);
                if (g == 10 || g == 32 || g == 13 || g == 9) {
                    i = i2;
                } else {
                    this.p.skip((long) (i2 - 1));
                    if (g == 47) {
                        if (!this.o.n(2)) {
                            return g;
                        }
                        F();
                        throw null;
                    } else if (g != 35) {
                        return g;
                    } else {
                        F();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    private String O(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long R = this.o.R(byteString);
            if (R == -1) {
                D("Unterminated string");
                throw null;
            } else if (this.p.g(R) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.p.v(R));
                this.p.readByte();
                sb.append(U());
            } else if (sb == null) {
                String v2 = this.p.v(R);
                this.p.readByte();
                return v2;
            } else {
                sb.append(this.p.v(R));
                this.p.readByte();
                return sb.toString();
            }
        }
    }

    private String Q() {
        long R = this.o.R(w);
        return R != -1 ? this.p.v(R) : this.p.s();
    }

    private char U() {
        int i;
        int i2;
        if (this.o.n(1)) {
            byte readByte = this.p.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                StringBuilder V0 = je.V0("Invalid escape sequence: \\");
                V0.append((char) readByte);
                D(V0.toString());
                throw null;
            } else if (this.o.n(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte g = this.p.g((long) i3);
                    char c2 = (char) (c << 4);
                    if (g < 48 || g > 57) {
                        if (g >= 97 && g <= 102) {
                            i2 = g - 97;
                        } else if (g < 65 || g > 70) {
                            StringBuilder V02 = je.V0("\\u");
                            V02.append(this.p.v(4));
                            D(V02.toString());
                            throw null;
                        } else {
                            i2 = g - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = g - 48;
                    }
                    c = (char) (i + c2);
                }
                this.p.skip(4);
                return c;
            } else {
                StringBuilder V03 = je.V0("Unterminated escape sequence at path ");
                V03.append(o());
                throw new EOFException(V03.toString());
            }
        } else {
            D("Unterminated escape sequence");
            throw null;
        }
    }

    private void W(ByteString byteString) {
        while (true) {
            long R = this.o.R(byteString);
            if (R == -1) {
                D("Unterminated string");
                throw null;
            } else if (this.p.g(R) == 92) {
                this.p.skip(R + 1);
                U();
            } else {
                this.p.skip(R + 1);
                return;
            }
        }
    }

    private void b0() {
        long R = this.o.R(w);
        e eVar = this.p;
        if (R == -1) {
            R = eVar.size();
        }
        eVar.skip(R);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void B() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 14) {
            b0();
        } else if (i == 13) {
            W(v);
        } else if (i == 12) {
            W(u);
        } else if (i != 15) {
            StringBuilder V0 = je.V0("Expected a name but was ");
            V0.append(s());
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
        this.q = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void C() {
        int i = 0;
        do {
            int i2 = this.q;
            if (i2 == 0) {
                i2 = G();
            }
            if (i2 == 3) {
                v(1);
            } else if (i2 == 1) {
                v(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.a--;
                    } else {
                        StringBuilder V0 = je.V0("Expected a value but was ");
                        V0.append(s());
                        V0.append(" at path ");
                        V0.append(o());
                        throw new JsonDataException(V0.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.a--;
                    } else {
                        StringBuilder V02 = je.V0("Expected a value but was ");
                        V02.append(s());
                        V02.append(" at path ");
                        V02.append(o());
                        throw new JsonDataException(V02.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    b0();
                } else if (i2 == 9 || i2 == 13) {
                    W(v);
                } else if (i2 == 8 || i2 == 12) {
                    W(u);
                } else if (i2 == 17) {
                    this.p.skip((long) this.s);
                } else if (i2 == 18) {
                    StringBuilder V03 = je.V0("Expected a value but was ");
                    V03.append(s());
                    V03.append(" at path ");
                    V03.append(o());
                    throw new JsonDataException(V03.toString());
                }
                this.q = 0;
            }
            i++;
            this.q = 0;
        } while (i != 0);
        int[] iArr = this.f;
        int i3 = this.a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[i3 - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 3) {
            v(1);
            this.f[this.a - 1] = 0;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected BEGIN_ARRAY but was ");
        V0.append(s());
        V0.append(" at path ");
        V0.append(o());
        throw new JsonDataException(V0.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q = 0;
        this.b[0] = 8;
        this.a = 1;
        this.p.b();
        this.o.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 1) {
            v(3);
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected BEGIN_OBJECT but was ");
        V0.append(s());
        V0.append(" at path ");
        V0.append(o());
        throw new JsonDataException(V0.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void f() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 4) {
            int i2 = this.a - 1;
            this.a = i2;
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected END_ARRAY but was ");
        V0.append(s());
        V0.append(" at path ");
        V0.append(o());
        throw new JsonDataException(V0.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void g() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 2) {
            int i2 = this.a - 1;
            this.a = i2;
            this.c[i2] = null;
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.q = 0;
            return;
        }
        StringBuilder V0 = je.V0("Expected END_OBJECT but was ");
        V0.append(s());
        V0.append(" at path ");
        V0.append(o());
        throw new JsonDataException(V0.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean h() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean i() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 5) {
            this.q = 0;
            int[] iArr = this.f;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.q = 0;
            int[] iArr2 = this.f;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder V0 = je.V0("Expected a boolean but was ");
            V0.append(s());
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double l() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 16) {
            this.q = 0;
            int[] iArr = this.f;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.r;
        }
        if (i == 17) {
            this.t = this.p.v((long) this.s);
        } else if (i == 9) {
            this.t = O(v);
        } else if (i == 8) {
            this.t = O(u);
        } else if (i == 10) {
            this.t = Q();
        } else if (i != 11) {
            StringBuilder V0 = je.V0("Expected a double but was ");
            V0.append(s());
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
        this.q = 11;
        try {
            double parseDouble = Double.parseDouble(this.t);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + o());
            }
            this.t = null;
            this.q = 0;
            int[] iArr2 = this.f;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder V02 = je.V0("Expected a double but was ");
            V02.append(this.t);
            V02.append(" at path ");
            V02.append(o());
            throw new JsonDataException(V02.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int m() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 16) {
            long j = this.r;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.q = 0;
                int[] iArr = this.f;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder V0 = je.V0("Expected an int but was ");
            V0.append(this.r);
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
        if (i == 17) {
            this.t = this.p.v((long) this.s);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = O(v);
            } else {
                str = O(u);
            }
            this.t = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.q = 0;
                int[] iArr2 = this.f;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder V02 = je.V0("Expected an int but was ");
            V02.append(s());
            V02.append(" at path ");
            V02.append(o());
            throw new JsonDataException(V02.toString());
        }
        this.q = 11;
        try {
            double parseDouble = Double.parseDouble(this.t);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.t = null;
                this.q = 0;
                int[] iArr3 = this.f;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder V03 = je.V0("Expected an int but was ");
            V03.append(this.t);
            V03.append(" at path ");
            V03.append(o());
            throw new JsonDataException(V03.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder V04 = je.V0("Expected an int but was ");
            V04.append(this.t);
            V04.append(" at path ");
            V04.append(o());
            throw new JsonDataException(V04.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String p() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 14) {
            str = Q();
        } else if (i == 13) {
            str = O(v);
        } else if (i == 12) {
            str = O(u);
        } else if (i == 15) {
            str = this.t;
        } else {
            StringBuilder V0 = je.V0("Expected a name but was ");
            V0.append(s());
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
        this.q = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String q() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i == 10) {
            str = Q();
        } else if (i == 9) {
            str = O(v);
        } else if (i == 8) {
            str = O(u);
        } else if (i == 11) {
            str = this.t;
            this.t = null;
        } else if (i == 16) {
            str = Long.toString(this.r);
        } else if (i == 17) {
            str = this.p.v((long) this.s);
        } else {
            StringBuilder V0 = je.V0("Expected a string but was ");
            V0.append(s());
            V0.append(" at path ");
            V0.append(o());
            throw new JsonDataException(V0.toString());
        }
        this.q = 0;
        int[] iArr = this.f;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token s() {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("JsonReader(");
        V0.append(this.o);
        V0.append(")");
        return V0.toString();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int w(JsonReader.a aVar) {
        int i = this.q;
        if (i == 0) {
            i = G();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return I(this.t, aVar);
        }
        int n2 = this.o.n2(aVar.b);
        if (n2 != -1) {
            this.q = 0;
            this.c[this.a - 1] = aVar.a[n2];
            return n2;
        }
        String str = this.c[this.a - 1];
        String p2 = p();
        int I = I(p2, aVar);
        if (I == -1) {
            this.q = 15;
            this.t = p2;
            this.c[this.a - 1] = str;
        }
        return I;
    }
}
