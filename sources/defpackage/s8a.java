package defpackage;

import defpackage.y8a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: s8a  reason: default package */
public final class s8a extends y8a.a {
    private final List<String> a;
    private final String b;
    private final String c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: s8a$b */
    public static final class b implements y8a.a.AbstractC0703a {
        private List<String> a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        public y8a.a a() {
            String str = this.a == null ? " uris" : "";
            if (this.b == null) {
                str = je.x0(str, " contextUri");
            }
            if (this.c == null) {
                str = je.x0(str, " viewUri");
            }
            if (this.d == null) {
                str = je.x0(str, " wasRemoved");
            }
            if (str.isEmpty()) {
                return new s8a(this.a, this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public y8a.a.AbstractC0703a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public y8a.a.AbstractC0703a c(List<String> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null uris");
        }

        public y8a.a.AbstractC0703a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public y8a.a.AbstractC0703a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    s8a(List list, String str, String str2, boolean z, a aVar) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // defpackage.y8a.a
    public String b() {
        return this.b;
    }

    @Override // defpackage.y8a.a
    public List<String> c() {
        return this.a;
    }

    @Override // defpackage.y8a.a
    public String d() {
        return this.c;
    }

    @Override // defpackage.y8a.a
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y8a.a)) {
            return false;
        }
        y8a.a aVar = (y8a.a) obj;
        if (!this.a.equals(aVar.c()) || !this.b.equals(aVar.b()) || !this.c.equals(aVar.d()) || this.d != aVar.e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("LikedData{uris=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", viewUri=");
        V0.append(this.c);
        V0.append(", wasRemoved=");
        return je.P0(V0, this.d, "}");
    }
}
