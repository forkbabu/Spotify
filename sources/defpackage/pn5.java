package defpackage;

import com.google.common.base.Optional;
import defpackage.rn5;
import java.util.List;

/* renamed from: pn5  reason: default package */
final class pn5 extends rn5 {
    private final Optional<ane> a;
    private final String b;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final boolean f;

    pn5(Optional optional, String str, List list, List list2, List list3, boolean z, a aVar) {
        this.a = optional;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = z;
    }

    @Override // defpackage.rn5
    public List<String> b() {
        return this.e;
    }

    @Override // defpackage.rn5
    public List<String> c() {
        return this.c;
    }

    @Override // defpackage.rn5
    public Optional<ane> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rn5)) {
            return false;
        }
        rn5 rn5 = (rn5) obj;
        if (!this.a.equals(rn5.e()) || ((str = this.b) != null ? !str.equals(rn5.f()) : rn5.f() != null) || !this.c.equals(rn5.c()) || !this.d.equals(rn5.h()) || !this.e.equals(rn5.b()) || this.f != rn5.i()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rn5
    public String f() {
        return this.b;
    }

    @Override // defpackage.rn5
    public rn5.a g() {
        return new b(this, null);
    }

    @Override // defpackage.rn5
    public List<String> h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    @Override // defpackage.rn5
    public boolean i() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("QueryMapBuilder{sortOrder=");
        V0.append(this.a);
        V0.append(", textFilter=");
        V0.append(this.b);
        V0.append(", filters=");
        V0.append(this.c);
        V0.append(", trackFilters=");
        V0.append(this.d);
        V0.append(", excludedPaths=");
        V0.append(this.e);
        V0.append(", waitForScanner=");
        return je.P0(V0, this.f, "}");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pn5$b */
    public static final class b implements rn5.a {
        private Optional<ane> a = Optional.absent();
        private String b;
        private List<String> c;
        private List<String> d;
        private List<String> e;
        private Boolean f;

        b() {
        }

        @Override // defpackage.rn5.a
        public rn5.a a(Optional<ane> optional) {
            this.a = optional;
            return this;
        }

        @Override // defpackage.rn5.a
        public rn5.a b(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.rn5.a
        public rn5 build() {
            String str = this.c == null ? " filters" : "";
            if (this.d == null) {
                str = je.x0(str, " trackFilters");
            }
            if (this.e == null) {
                str = je.x0(str, " excludedPaths");
            }
            if (this.f == null) {
                str = je.x0(str, " waitForScanner");
            }
            if (str.isEmpty()) {
                return new pn5(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.rn5.a
        public rn5.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.rn5.a
        public rn5.a d(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null trackFilters");
        }

        @Override // defpackage.rn5.a
        public rn5.a e(List<String> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null filters");
        }

        @Override // defpackage.rn5.a
        public rn5.a f(List<String> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null excludedPaths");
        }

        b(rn5 rn5, a aVar) {
            this.a = rn5.e();
            this.b = rn5.f();
            this.c = rn5.c();
            this.d = rn5.h();
            this.e = rn5.b();
            this.f = Boolean.valueOf(rn5.i());
        }
    }
}
