package retrofit2;

import java.util.regex.Pattern;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.r;
import okhttp3.t;
import okhttp3.u;
import okhttp3.w;
import okhttp3.x;
import okio.e;
import okio.f;

/* access modifiers changed from: package-private */
public final class t {
    private static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final u b;
    private String c;
    private u.a d;
    private final a0.a e = new a0.a();
    private final t.a f;
    private w g;
    private final boolean h;
    private x.a i;
    private r.a j;
    private c0 k;

    /* access modifiers changed from: private */
    public static class a extends c0 {
        private final c0 a;
        private final w b;

        a(c0 c0Var, w wVar) {
            this.a = c0Var;
            this.b = wVar;
        }

        @Override // okhttp3.c0
        public long a() {
            return this.a.a();
        }

        @Override // okhttp3.c0
        public w b() {
            return this.b;
        }

        @Override // okhttp3.c0
        public void f(f fVar) {
            this.a.f(fVar);
        }
    }

    t(String str, u uVar, String str2, okhttp3.t tVar, w wVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uVar;
        this.c = str2;
        this.g = wVar;
        this.h = z;
        if (tVar != null) {
            this.f = tVar.e();
        } else {
            this.f = new t.a();
        }
        if (z2) {
            this.j = new r.a();
        } else if (z3) {
            x.a aVar = new x.a();
            this.i = aVar;
            aVar.c(x.f);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = w.c(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(je.x0("Malformed content type: ", str2), e2);
            }
        } else {
            this.f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(okhttp3.t tVar) {
        this.f.b(tVar);
    }

    /* access modifiers changed from: package-private */
    public void d(okhttp3.t tVar, c0 c0Var) {
        x.a aVar = this.i;
        aVar.getClass();
        aVar.a(x.b.a(tVar, c0Var));
    }

    /* access modifiers changed from: package-private */
    public void e(x.b bVar) {
        this.i.a(bVar);
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z) {
        String str3;
        if (this.c != null) {
            int length = str2.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str3 = str2;
                    break;
                }
                int codePointAt = str2.codePointAt(i2);
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    break;
                }
                i2 += Character.charCount(codePointAt);
            }
            e eVar = new e();
            eVar.c0(str2, 0, i2);
            e eVar2 = null;
            while (i2 < length) {
                int codePointAt2 = str2.codePointAt(i2);
                if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                    if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                        if (eVar2 == null) {
                            eVar2 = new e();
                        }
                        eVar2.f0(codePointAt2);
                        while (!eVar2.l1()) {
                            int readByte = eVar2.readByte() & 255;
                            eVar.J(37);
                            char[] cArr = l;
                            eVar.J(cArr[(readByte >> 4) & 15]);
                            eVar.J(cArr[readByte & 15]);
                        }
                    } else {
                        eVar.f0(codePointAt2);
                    }
                }
                i2 += Character.charCount(codePointAt2);
            }
            str3 = eVar.s();
            String str4 = this.c;
            String replace = str4.replace("{" + str + "}", str3);
            if (!m.matcher(replace).matches()) {
                this.c = replace;
                return;
            }
            throw new IllegalArgumentException(je.x0("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void g(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            u.a o = this.b.o(str3);
            this.d = o;
            if (o != null) {
                this.c = null;
            } else {
                StringBuilder V0 = je.V0("Malformed URL. Base: ");
                V0.append(this.b);
                V0.append(", Relative: ");
                V0.append(this.c);
                throw new IllegalArgumentException(V0.toString());
            }
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void h(Class<T> cls, T t) {
        this.e.i(cls, t);
    }

    /* access modifiers changed from: package-private */
    public a0.a i() {
        u uVar;
        u.a aVar = this.d;
        if (aVar != null) {
            uVar = aVar.c();
        } else {
            u.a o = this.b.o(this.c);
            uVar = o != null ? o.c() : null;
            if (uVar == null) {
                StringBuilder V0 = je.V0("Malformed URL. Base: ");
                V0.append(this.b);
                V0.append(", Relative: ");
                V0.append(this.c);
                throw new IllegalArgumentException(V0.toString());
            }
        }
        a aVar2 = this.k;
        if (aVar2 == null) {
            r.a aVar3 = this.j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                x.a aVar4 = this.i;
                if (aVar4 != null) {
                    aVar2 = aVar4.b();
                } else if (this.h) {
                    aVar2 = c0.e(null, new byte[0]);
                }
            }
        }
        w wVar = this.g;
        if (wVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, wVar);
            } else {
                this.f.a("Content-Type", wVar.toString());
            }
        }
        a0.a aVar5 = this.e;
        aVar5.k(uVar);
        aVar5.f(this.f.e());
        aVar5.g(this.a, aVar2);
        return aVar5;
    }

    /* access modifiers changed from: package-private */
    public void j(c0 c0Var) {
        this.k = c0Var;
    }

    /* access modifiers changed from: package-private */
    public void k(Object obj) {
        this.c = obj.toString();
    }
}
