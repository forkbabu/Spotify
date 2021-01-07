package defpackage;

import defpackage.kn7;

/* renamed from: jn7  reason: default package */
final class jn7 extends kn7 {
    private final String a;
    private final boolean b;
    private final int c;

    /* access modifiers changed from: package-private */
    /* renamed from: jn7$b */
    public static final class b extends kn7.a {
        private String a;
        private Boolean b;
        private Integer c;

        b() {
        }

        @Override // defpackage.kn7.a
        public kn7 a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " enabled");
            }
            if (this.c == null) {
                str = je.x0(str, " itemId");
            }
            if (str.isEmpty()) {
                return new jn7(this.a, this.b.booleanValue(), this.c.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.kn7.a
        public kn7.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.kn7.a
        public kn7.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.kn7.a
        public kn7.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    jn7(String str, boolean z, int i, a aVar) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.kn7
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.kn7
    public int c() {
        return this.c;
    }

    @Override // defpackage.kn7
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn7)) {
            return false;
        }
        kn7 kn7 = (kn7) obj;
        if (this.a.equals(kn7.d()) && this.b == kn7.b() && this.c == kn7.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ChangePhotoDialogItem{title=");
        V0.append(this.a);
        V0.append(", enabled=");
        V0.append(this.b);
        V0.append(", itemId=");
        return je.B0(V0, this.c, "}");
    }
}
