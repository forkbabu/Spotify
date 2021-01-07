package defpackage;

import com.google.common.base.Optional;
import defpackage.d76;

/* access modifiers changed from: package-private */
/* renamed from: y66  reason: default package */
public final class y66 extends d76.a {
    private final Optional<Integer> a;
    private final boolean b;
    private final z66 c;

    y66(Optional optional, boolean z, z66 z66, a aVar) {
        this.a = optional;
        this.b = z;
        this.c = z66;
    }

    @Override // defpackage.d76.a
    public z66 a() {
        return this.c;
    }

    @Override // defpackage.d76.a
    public Optional<Integer> b() {
        return this.a;
    }

    @Override // defpackage.d76.a
    public boolean c() {
        return this.b;
    }

    @Override // defpackage.d76.a
    public d76.a.AbstractC0588a d() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d76.a)) {
            return false;
        }
        d76.a aVar = (d76.a) obj;
        if (!this.a.equals(aVar.b()) || this.b != aVar.c() || !this.c.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DerivedConfiguration{limitRangeTo=");
        V0.append(this.a);
        V0.append(", showUnavailableSongs=");
        V0.append(this.b);
        V0.append(", filterAndSort=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y66$b */
    public static final class b implements d76.a.AbstractC0588a {
        private Optional<Integer> a = Optional.absent();
        private Boolean b;
        private z66 c;

        b() {
        }

        public d76.a a() {
            String str = this.b == null ? " showUnavailableSongs" : "";
            if (this.c == null) {
                str = je.x0(str, " filterAndSort");
            }
            if (str.isEmpty()) {
                return new y66(this.a, this.b.booleanValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public d76.a.AbstractC0588a b(z66 z66) {
            if (z66 != null) {
                this.c = z66;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public d76.a.AbstractC0588a c(Optional<Integer> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null limitRangeTo");
        }

        public d76.a.AbstractC0588a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        b(d76.a aVar, a aVar2) {
            this.a = aVar.b();
            this.b = Boolean.valueOf(aVar.c());
            this.c = aVar.a();
        }
    }
}
