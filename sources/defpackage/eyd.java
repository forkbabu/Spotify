package defpackage;

import defpackage.myd;

/* renamed from: eyd  reason: default package */
final class eyd extends myd {
    private final String a;

    /* access modifiers changed from: package-private */
    /* renamed from: eyd$b */
    public static final class b implements myd.a {
        private String a;

        b() {
        }

        @Override // defpackage.myd.a
        public myd build() {
            String str = this.a == null ? " htmlDescription" : "";
            if (str.isEmpty()) {
                return new eyd(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.myd.a
        public myd.a k(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null htmlDescription");
        }
    }

    eyd(String str, a aVar) {
        this.a = str;
    }

    @Override // defpackage.myd
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myd) {
            return this.a.equals(((myd) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("HtmlDescriptionSection{htmlDescription="), this.a, "}");
    }
}
