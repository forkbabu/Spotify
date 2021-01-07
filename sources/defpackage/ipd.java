package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.mpd;

/* renamed from: ipd  reason: default package */
final class ipd extends mpd {
    private final boolean a;
    private final String b;
    private final boolean c;
    private final String d;
    private final ImmutableList<mpd.b> e;

    /* access modifiers changed from: package-private */
    /* renamed from: ipd$b */
    public static final class b extends mpd.a {
        private Boolean a;
        private String b;
        private Boolean c;
        private String d;
        private ImmutableList<mpd.b> e;

        b() {
        }

        @Override // defpackage.mpd.a
        public mpd a() {
            String str = this.a == null ? " canSort" : "";
            if (this.b == null) {
                str = je.x0(str, " showSortTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " canTextFilter");
            }
            if (this.d == null) {
                str = je.x0(str, " showTextFilterTitle");
            }
            if (this.e == null) {
                str = je.x0(str, " filterToggles");
            }
            if (str.isEmpty()) {
                return new ipd(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mpd.a
        public mpd.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mpd.a
        public mpd.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.mpd.a
        public mpd.a d(ImmutableList<mpd.b> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterToggles");
        }

        @Override // defpackage.mpd.a
        public mpd.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null showSortTitle");
        }

        @Override // defpackage.mpd.a
        public mpd.a f(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null showTextFilterTitle");
        }

        b(mpd mpd, a aVar) {
            this.a = Boolean.valueOf(mpd.a());
            this.b = mpd.e();
            this.c = Boolean.valueOf(mpd.b());
            this.d = mpd.f();
            this.e = mpd.d();
        }
    }

    ipd(boolean z, String str, boolean z2, String str2, ImmutableList immutableList, a aVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
        this.e = immutableList;
    }

    @Override // defpackage.mpd
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.mpd
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.mpd
    public ImmutableList<mpd.b> d() {
        return this.e;
    }

    @Override // defpackage.mpd
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpd)) {
            return false;
        }
        mpd mpd = (mpd) obj;
        if (this.a != mpd.a() || !this.b.equals(mpd.e()) || this.c != mpd.b() || !this.d.equals(mpd.f()) || !this.e.equals(mpd.d())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mpd
    public String f() {
        return this.d;
    }

    @Override // defpackage.mpd
    public mpd.a g() {
        return new b(this, null);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryPageOptionsMenuConfiguration{canSort=");
        V0.append(this.a);
        V0.append(", showSortTitle=");
        V0.append(this.b);
        V0.append(", canTextFilter=");
        V0.append(this.c);
        V0.append(", showTextFilterTitle=");
        V0.append(this.d);
        V0.append(", filterToggles=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
