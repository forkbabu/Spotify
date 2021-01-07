package defpackage;

import defpackage.q74;

/* access modifiers changed from: package-private */
/* renamed from: o74  reason: default package */
public final class o74 extends q74 {
    private final String a;
    private final String b;
    private final int c;
    private final p74 d;

    /* access modifiers changed from: package-private */
    /* renamed from: o74$b */
    public static final class b implements q74.a {
        private String a;
        private String b;
        private Integer c;
        private p74 d;

        b() {
        }

        public q74.a a(p74 p74) {
            this.d = p74;
            return this;
        }

        public q74 b() {
            String str = this.c == null ? " extractedColor" : "";
            if (this.d == null) {
                str = je.x0(str, " backgroundImage");
            }
            if (str.isEmpty()) {
                return new o74(this.a, this.b, this.c.intValue(), this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q74.a c(String str) {
            this.b = str;
            return this;
        }

        public q74.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public q74.a e(String str) {
            this.a = str;
            return this;
        }

        b(q74 q74, a aVar) {
            this.a = q74.d();
            this.b = q74.b();
            this.c = Integer.valueOf(q74.c());
            this.d = q74.a();
        }
    }

    o74(String str, String str2, int i, p74 p74, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = p74;
    }

    @Override // defpackage.q74
    public p74 a() {
        return this.d;
    }

    @Override // defpackage.q74
    public String b() {
        return this.b;
    }

    @Override // defpackage.q74
    public int c() {
        return this.c;
    }

    @Override // defpackage.q74
    public String d() {
        return this.a;
    }

    @Override // defpackage.q74
    public q74.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q74)) {
            return false;
        }
        q74 q74 = (q74) obj;
        String str = this.a;
        if (str != null ? str.equals(q74.d()) : q74.d() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(q74.b()) : q74.b() == null) {
                if (this.c == q74.c() && this.d.equals(q74.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("HeaderViewModel{titleText=");
        V0.append(this.a);
        V0.append(", descriptionText=");
        V0.append(this.b);
        V0.append(", extractedColor=");
        V0.append(this.c);
        V0.append(", backgroundImage=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
