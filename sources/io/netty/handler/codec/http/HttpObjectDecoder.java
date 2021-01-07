package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.channel.k;
import io.netty.handler.codec.PrematureChannelClosureException;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.handler.codec.d;
import io.netty.util.g;
import java.util.List;

public abstract class HttpObjectDecoder extends io.netty.handler.codec.a {
    private CharSequence A;
    private CharSequence B;
    private e0 C;
    private State D = State.SKIP_CONTROL_CHARS;
    private final int r;
    private final boolean s;
    protected final boolean t;
    private final a u;
    private final b v;
    private t w;
    private long x;
    private long y = Long.MIN_VALUE;
    private volatile boolean z;

    /* access modifiers changed from: private */
    public enum State {
        SKIP_CONTROL_CHARS,
        READ_INITIAL,
        READ_HEADER,
        READ_VARIABLE_LENGTH_CONTENT,
        READ_FIXED_LENGTH_CONTENT,
        READ_CHUNK_SIZE,
        READ_CHUNKED_CONTENT,
        READ_CHUNK_DELIMITER,
        READ_CHUNK_FOOTER,
        BAD_MESSAGE,
        UPGRADED
    }

    /* access modifiers changed from: private */
    public static class a implements g {
        private final io.netty.util.internal.a a;
        private final int b;
        private int c;

        a(io.netty.util.internal.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        @Override // io.netty.util.g
        public boolean a(byte b2) {
            char c2 = (char) b2;
            if (c2 == '\r') {
                return true;
            }
            if (c2 == '\n') {
                return false;
            }
            int i = this.c + 1;
            this.c = i;
            int i2 = this.b;
            if (i <= i2) {
                this.a.a(c2);
                return true;
            }
            throw b(i2);
        }

        /* access modifiers changed from: protected */
        public TooLongFrameException b(int i) {
            return new TooLongFrameException(je.q0("HTTP header is larger than ", i, " bytes."));
        }

        public io.netty.util.internal.a c(j jVar) {
            int i = this.c;
            this.a.d();
            int Q = jVar.Q(this);
            if (Q == -1) {
                this.c = i;
                return null;
            }
            jVar.p1(Q + 1);
            return this.a;
        }

        public void d() {
            this.c = 0;
        }
    }

    /* access modifiers changed from: private */
    public static final class b extends a {
        b(io.netty.util.internal.a aVar, int i) {
            super(aVar, i);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.handler.codec.http.HttpObjectDecoder.a
        public TooLongFrameException b(int i) {
            return new TooLongFrameException(je.q0("An HTTP line is larger than ", i, " bytes."));
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder.a
        public io.netty.util.internal.a c(j jVar) {
            d();
            return super.c(jVar);
        }
    }

    protected HttpObjectDecoder(int i, int i2, int i3, boolean z2, boolean z3) {
        if (i <= 0) {
            throw new IllegalArgumentException(je.p0("maxInitialLineLength must be a positive integer: ", i));
        } else if (i2 <= 0) {
            throw new IllegalArgumentException(je.p0("maxHeaderSize must be a positive integer: ", i2));
        } else if (i3 > 0) {
            io.netty.util.internal.a aVar = new io.netty.util.internal.a(128);
            this.v = new b(aVar, i);
            this.u = new a(aVar, i2);
            this.r = i3;
            this.s = z2;
            this.t = z3;
        } else {
            throw new IllegalArgumentException(je.p0("maxChunkSize must be a positive integer: ", i3));
        }
    }

    private e0 A(j jVar) {
        io.netty.util.internal.a c = this.u.c(jVar);
        if (c == null) {
            return null;
        }
        if (c.length() <= 0) {
            return e0.l;
        }
        e0 e0Var = this.C;
        if (e0Var == null) {
            e0Var = new j(j0.b, this.t);
            this.C = e0Var;
        }
        CharSequence charSequence = null;
        do {
            char charAt = c.charAt(0);
            if (charSequence == null || !(charAt == ' ' || charAt == '\t')) {
                E(c);
                CharSequence charSequence2 = this.A;
                if (!p.c.i(charSequence2) && !p.l.i(charSequence2) && !p.k.i(charSequence2)) {
                    e0Var.u().c(charSequence2, this.B);
                }
                charSequence = this.A;
                this.A = null;
                this.B = null;
            } else {
                List<String> l = e0Var.u().l(charSequence);
                if (!l.isEmpty()) {
                    int size = l.size() - 1;
                    String trim = c.toString().trim();
                    String str = l.get(size);
                    StringBuilder sb = new StringBuilder(trim.length() + str.length());
                    sb.append((CharSequence) str);
                    sb.append(trim);
                    l.set(size, sb.toString());
                }
            }
            c = this.u.c(jVar);
            if (c == null) {
                return null;
            }
        } while (c.length() > 0);
        this.C = null;
        return e0Var;
    }

    private void C() {
        z zVar;
        t tVar = this.w;
        this.w = null;
        this.A = null;
        this.B = null;
        this.y = Long.MIN_VALUE;
        this.v.d();
        this.u.d();
        this.C = null;
        if (y() || (zVar = (z) tVar) == null || zVar.b().d() != 101) {
            this.z = false;
            this.D = State.SKIP_CONTROL_CHARS;
            return;
        }
        this.D = State.UPGRADED;
    }

    private void E(io.netty.util.internal.a aVar) {
        int length = aVar.length();
        int t2 = t(aVar, 0);
        int i = t2;
        while (i < length && (r4 = aVar.charAt(i)) != ':' && !Character.isWhitespace(r4)) {
            i++;
        }
        int i2 = i;
        while (i2 < length) {
            char charAt = aVar.charAt(i2);
            i2++;
            if (charAt == ':') {
                break;
            }
        }
        this.A = aVar.e(t2, i);
        int t3 = t(aVar, i2);
        if (t3 == length) {
            this.B = "";
        } else {
            this.B = aVar.e(t3, s(aVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long n() {
        /*
            r7 = this;
            long r0 = r7.y
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0078
            io.netty.handler.codec.http.t r0 = r7.w
            r1 = -1
            int r3 = io.netty.handler.codec.http.c0.b
            io.netty.handler.codec.http.r r3 = r0.f()
            io.netty.util.c r4 = io.netty.handler.codec.http.p.c
            java.lang.String r3 = r3.j(r4)
            if (r3 == 0) goto L_0x001f
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0076 }
            goto L_0x0076
        L_0x001f:
            io.netty.handler.codec.http.r r3 = r0.f()
            boolean r4 = r0 instanceof io.netty.handler.codec.http.x
            if (r4 == 0) goto L_0x0048
            io.netty.handler.codec.http.x r0 = (io.netty.handler.codec.http.x) r0
            io.netty.handler.codec.http.u r4 = io.netty.handler.codec.http.u.c
            io.netty.handler.codec.http.u r0 = r0.method()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            io.netty.util.c r0 = io.netty.handler.codec.http.p.f
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto L_0x006d
            io.netty.util.c r0 = io.netty.handler.codec.http.p.g
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 8
            goto L_0x006e
        L_0x0048:
            boolean r4 = r0 instanceof io.netty.handler.codec.http.z
            if (r4 == 0) goto L_0x006d
            io.netty.handler.codec.http.z r0 = (io.netty.handler.codec.http.z) r0
            io.netty.handler.codec.http.b0 r0 = r0.b()
            int r0 = r0.d()
            r4 = 101(0x65, float:1.42E-43)
            if (r0 != r4) goto L_0x006d
            io.netty.util.c r0 = io.netty.handler.codec.http.p.i
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto L_0x006d
            io.netty.util.c r0 = io.netty.handler.codec.http.p.h
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 16
            goto L_0x006e
        L_0x006d:
            r0 = -1
        L_0x006e:
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0076
            r1 = r3
        L_0x0076:
            r7.y = r1
        L_0x0078:
            long r0 = r7.y
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.http.HttpObjectDecoder.n():long");
    }

    private static int s(io.netty.util.internal.a aVar) {
        int length = aVar.length();
        do {
            length--;
            if (length <= 0) {
                return 0;
            }
        } while (Character.isWhitespace(aVar.c(length)));
        return length + 1;
    }

    private static int t(io.netty.util.internal.a aVar, int i) {
        while (i < aVar.length()) {
            if (!Character.isWhitespace(aVar.c(i))) {
                return i;
            }
            i++;
        }
        return aVar.length();
    }

    private static int u(io.netty.util.internal.a aVar, int i) {
        while (i < aVar.length()) {
            if (Character.isWhitespace(aVar.c(i))) {
                return i;
            }
            i++;
        }
        return aVar.length();
    }

    private o v(j jVar, Exception exc) {
        this.D = State.BAD_MESSAGE;
        jVar.I1(jVar.m1());
        j jVar2 = new j(j0.b);
        jVar2.e(d.a(exc));
        this.w = null;
        this.C = null;
        return jVar2;
    }

    private t w(j jVar, Exception exc) {
        this.D = State.BAD_MESSAGE;
        jVar.I1(jVar.m1());
        t tVar = this.w;
        if (tVar != null) {
            tVar.e(d.a(exc));
        } else {
            t o = o();
            this.w = o;
            o.e(d.a(exc));
        }
        t tVar2 = this.w;
        this.w = null;
        return tVar2;
    }

    private State z(j jVar) {
        t tVar = this.w;
        r f = tVar.f();
        io.netty.util.internal.a c = this.u.c(jVar);
        if (c == null) {
            return null;
        }
        if (c.length() > 0) {
            do {
                char charAt = c.charAt(0);
                CharSequence charSequence = this.A;
                if (charSequence == null || !(charAt == ' ' || charAt == '\t')) {
                    if (charSequence != null) {
                        f.c(charSequence, this.B);
                    }
                    E(c);
                } else {
                    StringBuilder sb = new StringBuilder(c.length() + this.B.length() + 1);
                    sb.append(this.B);
                    sb.append(' ');
                    sb.append(c.toString().trim());
                    this.B = sb.toString();
                }
                c = this.u.c(jVar);
                if (c == null) {
                    return null;
                }
            } while (c.length() > 0);
        }
        CharSequence charSequence2 = this.A;
        if (charSequence2 != null) {
            f.c(charSequence2, this.B);
        }
        this.A = null;
        this.B = null;
        if (x(tVar)) {
            c0.b(tVar, false);
            return State.SKIP_CONTROL_CHARS;
        } else if (c0.a(tVar)) {
            return State.READ_CHUNK_SIZE;
        } else {
            if (n() >= 0) {
                return State.READ_FIXED_LENGTH_CONTENT;
            }
            return State.READ_VARIABLE_LENGTH_CONTENT;
        }
    }

    @Override // io.netty.handler.codec.a, io.netty.channel.m, io.netty.channel.l
    public void c0(k kVar, Object obj) {
        super.c0(kVar, obj);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x01a3: APUT  (r11v1 java.lang.String[]), (2 ??[int, float, short, byte, char]), (r0v9 java.lang.String) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x012f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0171 A[Catch:{ Exception -> 0x0215 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172 A[Catch:{ Exception -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b5 A[Catch:{ Exception -> 0x020c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b6 A[Catch:{ Exception -> 0x020c }] */
    @Override // io.netty.handler.codec.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(io.netty.channel.k r13, io.netty.buffer.j r14, java.util.List<java.lang.Object> r15) {
        /*
        // Method dump skipped, instructions count: 568
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.http.HttpObjectDecoder.h(io.netty.channel.k, io.netty.buffer.j, java.util.List):void");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.a
    public void i(k kVar, j jVar, List<Object> list) {
        e0 e0Var = e0.l;
        super.i(kVar, jVar, list);
        if (this.z) {
            C();
        }
        t tVar = this.w;
        if (tVar != null) {
            boolean a2 = c0.a(tVar);
            if (this.D == State.READ_VARIABLE_LENGTH_CONTENT && !jVar.K0() && !a2) {
                list.add(e0Var);
                C();
            } else if (this.D == State.READ_HEADER) {
                list.add(w(j0.b, new PrematureChannelClosureException("Connection closed before received headers")));
                C();
            } else {
                boolean z2 = true;
                if (!y() && !a2 && n() <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    list.add(e0Var);
                }
                C();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract t o();

    /* access modifiers changed from: protected */
    public abstract t q(String[] strArr);

    /* access modifiers changed from: protected */
    public boolean x(t tVar) {
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int d = zVar.b().d();
            if (d < 100 || d >= 200) {
                if (d == 204 || d == 205 || d == 304) {
                    return true;
                }
            } else if (d != 101 || zVar.f().e(p.j) || !zVar.f().f(p.m, q.e, true)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean y();
}
