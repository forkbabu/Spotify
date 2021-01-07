package defpackage;

import com.google.android.datatransport.c;
import com.google.android.datatransport.d;
import defpackage.sg;

/* renamed from: kg  reason: default package */
final class kg extends sg {
    private final tg a;
    private final String b;
    private final c<?> c;
    private final d<?, byte[]> d;
    private final com.google.android.datatransport.b e;

    /* renamed from: kg$b */
    static final class b extends sg.a {
        private tg a;
        private String b;
        private c<?> c;
        private d<?, byte[]> d;
        private com.google.android.datatransport.b e;

        b() {
        }

        public sg a() {
            String str = this.a == null ? " transportContext" : "";
            if (this.b == null) {
                str = je.x0(str, " transportName");
            }
            if (this.c == null) {
                str = je.x0(str, " event");
            }
            if (this.d == null) {
                str = je.x0(str, " transformer");
            }
            if (this.e == null) {
                str = je.x0(str, " encoding");
            }
            if (str.isEmpty()) {
                return new kg(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        public sg.a b(com.google.android.datatransport.b bVar) {
            if (bVar != null) {
                this.e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public sg.a c(c<?> cVar) {
            if (cVar != null) {
                this.c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public sg.a d(d<?, byte[]> dVar) {
            if (dVar != null) {
                this.d = dVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public sg.a e(tg tgVar) {
            if (tgVar != null) {
                this.a = tgVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public sg.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    kg(tg tgVar, String str, c cVar, d dVar, com.google.android.datatransport.b bVar, a aVar) {
        this.a = tgVar;
        this.b = str;
        this.c = cVar;
        this.d = dVar;
        this.e = bVar;
    }

    @Override // defpackage.sg
    public com.google.android.datatransport.b a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.sg
    public c<?> b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.sg
    public d<?, byte[]> c() {
        return this.d;
    }

    @Override // defpackage.sg
    public tg d() {
        return this.a;
    }

    @Override // defpackage.sg
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        if (!this.a.equals(sgVar.d()) || !this.b.equals(sgVar.e()) || !this.c.equals(sgVar.b()) || !this.d.equals(sgVar.c()) || !this.e.equals(sgVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SendRequest{transportContext=");
        V0.append(this.a);
        V0.append(", transportName=");
        V0.append(this.b);
        V0.append(", event=");
        V0.append(this.c);
        V0.append(", transformer=");
        V0.append(this.d);
        V0.append(", encoding=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
