package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.t;
import okio.ByteString;
import okio.e;
import okio.f;

public final class x extends c0 {
    public static final w e = w.c("multipart/mixed");
    public static final w f = w.c("multipart/form-data");
    private static final byte[] g = {58, 32};
    private static final byte[] h = {13, 10};
    private static final byte[] i = {45, 45};
    private final ByteString a;
    private final w b;
    private final List<b> c;
    private long d = -1;

    public static final class a {
        private final ByteString a;
        private w b = x.e;
        private final List<b> c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.a = ByteString.m(uuid);
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public x b() {
            if (!this.c.isEmpty()) {
                return new x(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public a c(w wVar) {
            if (wVar == null) {
                throw new NullPointerException("type == null");
            } else if (wVar.e().equals("multipart")) {
                this.b = wVar;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + wVar);
            }
        }
    }

    public static final class b {
        final t a;
        final c0 b;

        private b(t tVar, c0 c0Var) {
            this.a = tVar;
            this.b = c0Var;
        }

        public static b a(t tVar, c0 c0Var) {
            if (c0Var == null) {
                throw new NullPointerException("body == null");
            } else if (tVar != null && tVar.c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (tVar == null || tVar.c("Content-Length") == null) {
                return new b(tVar, c0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static b b(String str, String str2, c0 c0Var) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                x.g(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    x.g(sb, str2);
                }
                t.a aVar = new t.a();
                String sb2 = sb.toString();
                t.a("Content-Disposition");
                aVar.a.add("Content-Disposition");
                aVar.a.add(sb2.trim());
                return a(new t(aVar), c0Var);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        w.c("multipart/alternative");
        w.c("multipart/digest");
        w.c("multipart/parallel");
    }

    x(ByteString byteString, w wVar, List<b> list) {
        this.a = byteString;
        this.b = w.c(wVar + "; boundary=" + byteString.C());
        this.c = rnf.q(list);
    }

    static StringBuilder g(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: okio.e */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: okio.e */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: okio.e */
    /* JADX WARN: Multi-variable type inference failed */
    private long h(f fVar, boolean z) {
        e eVar;
        if (z) {
            fVar = new e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        int size = this.c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            t tVar = bVar.a;
            c0 c0Var = bVar.b;
            fVar.write(i);
            fVar.Y1(this.a);
            fVar.write(h);
            if (tVar != null) {
                int g2 = tVar.g();
                for (int i3 = 0; i3 < g2; i3++) {
                    fVar.e0(tVar.d(i3)).write(g).e0(tVar.i(i3)).write(h);
                }
            }
            w b2 = c0Var.b();
            if (b2 != null) {
                fVar.e0("Content-Type: ").e0(b2.toString()).write(h);
            }
            long a2 = c0Var.a();
            if (a2 != -1) {
                fVar.e0("Content-Length: ").N0(a2).write(h);
            } else if (z) {
                eVar.b();
                return -1;
            }
            byte[] bArr = h;
            fVar.write(bArr);
            if (z) {
                j += a2;
            } else {
                c0Var.f(fVar);
            }
            fVar.write(bArr);
        }
        byte[] bArr2 = i;
        fVar.write(bArr2);
        fVar.Y1(this.a);
        fVar.write(bArr2);
        fVar.write(h);
        if (!z) {
            return j;
        }
        long size2 = j + eVar.size();
        eVar.b();
        return size2;
    }

    @Override // okhttp3.c0
    public long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long h2 = h(null, true);
        this.d = h2;
        return h2;
    }

    @Override // okhttp3.c0
    public w b() {
        return this.b;
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        h(fVar, false);
    }
}
