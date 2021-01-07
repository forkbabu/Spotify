package defpackage;

import defpackage.zie;

/* access modifiers changed from: package-private */
/* renamed from: tie  reason: default package */
public abstract class tie extends zie {
    private final wie b;
    private final boolean c;
    private final boolean f;

    /* access modifiers changed from: package-private */
    /* renamed from: tie$b */
    public static class b implements zie.a {
        private wie a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public zie a() {
            String str = this.a == null ? " gender" : "";
            if (this.b == null) {
                str = je.x0(str, " noneBinaryGenderEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " fetchingConfigurationInForeground");
            }
            if (str.isEmpty()) {
                return new vie(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public zie.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public zie.a c(wie wie) {
            if (wie != null) {
                this.a = wie;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        public zie.a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        b(zie zie, a aVar) {
            this.a = zie.b();
            this.b = Boolean.valueOf(zie.c());
            this.c = Boolean.valueOf(zie.a());
        }
    }

    tie(wie wie, boolean z, boolean z2) {
        if (wie != null) {
            this.b = wie;
            this.c = z;
            this.f = z2;
            return;
        }
        throw new NullPointerException("Null gender");
    }

    @Override // defpackage.zie
    public boolean a() {
        return this.f;
    }

    @Override // defpackage.zie
    public wie b() {
        return this.b;
    }

    @Override // defpackage.zie
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.zie
    public zie.a e() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zie = (zie) obj;
        if (this.b.equals(zie.b()) && this.c == zie.c() && this.f == zie.a()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("GenderModel{gender=");
        V0.append(this.b);
        V0.append(", noneBinaryGenderEnabled=");
        V0.append(this.c);
        V0.append(", fetchingConfigurationInForeground=");
        return je.P0(V0, this.f, "}");
    }
}
