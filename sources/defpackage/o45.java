package defpackage;

import defpackage.p45;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: o45  reason: default package */
public final class o45 extends p45 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final Map<String, String> e;

    /* renamed from: o45$b */
    static final class b implements p45.a {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private Map<String, String> e;

        b() {
        }

        public p45.a a(Map<String, String> map) {
            if (map != null) {
                this.e = map;
                return this;
            }
            throw new NullPointerException("Null additionalMetadata");
        }

        public p45 b() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " name");
            }
            if (this.c == null) {
                str = je.x0(str, " index");
            }
            if (this.e == null) {
                str = je.x0(str, " additionalMetadata");
            }
            if (str.isEmpty()) {
                return new o45(this.a, this.b, this.c.intValue(), this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public p45.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public p45.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public p45.a e(String str) {
            this.d = str;
            return this;
        }

        public p45.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    o45(String str, String str2, int i, String str3, Map map, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = map;
    }

    @Override // defpackage.p45
    public Map<String, String> a() {
        return this.e;
    }

    @Override // defpackage.p45
    public int b() {
        return this.c;
    }

    @Override // defpackage.p45
    public String c() {
        return this.b;
    }

    @Override // defpackage.p45
    public String d() {
        return this.d;
    }

    @Override // defpackage.p45
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p45)) {
            return false;
        }
        p45 p45 = (p45) obj;
        if (!this.a.equals(p45.e()) || !this.b.equals(p45.c()) || this.c != p45.b() || ((str = this.d) != null ? !str.equals(p45.d()) : p45.d() != null) || !this.e.equals(p45.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuItem{uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", index=");
        V0.append(this.c);
        V0.append(", rowId=");
        V0.append(this.d);
        V0.append(", additionalMetadata=");
        return je.M0(V0, this.e, "}");
    }
}
