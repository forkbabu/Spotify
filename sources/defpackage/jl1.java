package defpackage;

import defpackage.nl1;

/* renamed from: jl1  reason: default package */
final class jl1 extends nl1 {
    private final String a;
    private final String b;
    private final String c;
    private final Boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: jl1$b */
    public static final class b extends nl1.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // defpackage.nl1.a
        public nl1 a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " uri");
            }
            if (this.d == null) {
                str = je.x0(str, " explicit");
            }
            if (str.isEmpty()) {
                return new jl1(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.nl1.a
        public nl1.a b(Boolean bool) {
            if (bool != null) {
                this.d = bool;
                return this;
            }
            throw new NullPointerException("Null explicit");
        }

        @Override // defpackage.nl1.a
        public nl1.a c(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.nl1.a
        public nl1.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // defpackage.nl1.a
        public nl1.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    jl1(String str, String str2, String str3, Boolean bool, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1 = (nl1) obj;
        if (this.a.equals(((jl1) nl1).a)) {
            jl1 jl1 = (jl1) nl1;
            if (this.b.equals(jl1.b) && ((str = this.c) != null ? str.equals(jl1.c) : jl1.c == null) && this.d.equals(jl1.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ll1
    public Boolean explicit() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    @Override // defpackage.ll1
    public String imageUri() {
        return this.c;
    }

    @Override // defpackage.ll1
    public String name() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SimpleSearchItem{name=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", explicit=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }

    @Override // defpackage.ll1
    public String uri() {
        return this.b;
    }
}
