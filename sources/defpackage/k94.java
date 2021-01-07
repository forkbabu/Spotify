package defpackage;

import defpackage.m94;

/* access modifiers changed from: package-private */
/* renamed from: k94  reason: default package */
public final class k94 extends m94 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final l94 f;
    private final l94 g;
    private final l94 h;

    /* access modifiers changed from: package-private */
    /* renamed from: k94$b */
    public static final class b implements m94.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Integer e;
        private l94 f;
        private l94 g;
        private l94 h;

        b() {
        }

        public m94.a a(String str) {
            this.a = str;
            return this;
        }

        public m94.a b(l94 l94) {
            this.f = l94;
            return this;
        }

        public m94 c() {
            String str = this.e == null ? " extractedColor" : "";
            if (this.f == null) {
                str = je.x0(str, " backgroundImage");
            }
            if (this.g == null) {
                str = je.x0(str, " mainImage");
            }
            if (this.h == null) {
                str = je.x0(str, " logoImage");
            }
            if (str.isEmpty()) {
                return new k94(this.a, this.b, this.c, this.d, this.e.intValue(), this.f, this.g, this.h, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public m94.a d(String str) {
            this.d = str;
            return this;
        }

        public m94.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public m94.a f(l94 l94) {
            this.h = l94;
            return this;
        }

        public m94.a g(l94 l94) {
            this.g = l94;
            return this;
        }

        public m94.a h(String str) {
            this.c = str;
            return this;
        }

        public m94.a i(String str) {
            this.b = str;
            return this;
        }

        b(m94 m94, a aVar) {
            this.a = m94.a();
            this.b = m94.i();
            this.c = m94.h();
            this.d = m94.d();
            this.e = Integer.valueOf(m94.e());
            this.f = m94.b();
            this.g = m94.g();
            this.h = m94.f();
        }
    }

    k94(String str, String str2, String str3, String str4, int i, l94 l94, l94 l942, l94 l943, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = l94;
        this.g = l942;
        this.h = l943;
    }

    @Override // defpackage.m94
    public String a() {
        return this.a;
    }

    @Override // defpackage.m94
    public l94 b() {
        return this.f;
    }

    @Override // defpackage.m94
    public String d() {
        return this.d;
    }

    @Override // defpackage.m94
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m94)) {
            return false;
        }
        m94 m94 = (m94) obj;
        String str = this.a;
        if (str != null ? str.equals(m94.a()) : m94.a() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(m94.i()) : m94.i() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(m94.h()) : m94.h() == null) {
                    String str4 = this.d;
                    if (str4 != null ? str4.equals(m94.d()) : m94.d() == null) {
                        if (this.e == m94.e() && this.f.equals(m94.b()) && this.g.equals(m94.g()) && this.h.equals(m94.f())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.m94
    public l94 f() {
        return this.h;
    }

    @Override // defpackage.m94
    public l94 g() {
        return this.g;
    }

    @Override // defpackage.m94
    public String h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((((hashCode3 ^ i) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.m94
    public String i() {
        return this.b;
    }

    @Override // defpackage.m94
    public m94.a j() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowsePromoViewModel{accessoryText=");
        V0.append(this.a);
        V0.append(", titleText=");
        V0.append(this.b);
        V0.append(", subtitleText=");
        V0.append(this.c);
        V0.append(", descriptionText=");
        V0.append(this.d);
        V0.append(", extractedColor=");
        V0.append(this.e);
        V0.append(", backgroundImage=");
        V0.append(this.f);
        V0.append(", mainImage=");
        V0.append(this.g);
        V0.append(", logoImage=");
        V0.append(this.h);
        V0.append("}");
        return V0.toString();
    }
}
