package defpackage;

import defpackage.nyd;

/* renamed from: fyd  reason: default package */
final class fyd extends nyd {
    private final int a;

    /* access modifiers changed from: package-private */
    /* renamed from: fyd$b */
    public static final class b implements nyd.a {
        private Integer a;

        b() {
        }

        @Override // defpackage.nyd.a
        public nyd.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.nyd.a
        public nyd build() {
            String str = this.a == null ? " numFollowers" : "";
            if (str.isEmpty()) {
                return new fyd(this.a.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    fyd(int i, a aVar) {
        this.a = i;
    }

    @Override // defpackage.nyd
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nyd) || this.a != ((nyd) obj).b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("OnlineData{numFollowers="), this.a, "}");
    }
}
