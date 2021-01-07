package defpackage;

import defpackage.um8;

/* access modifiers changed from: package-private */
/* renamed from: vm8  reason: default package */
public final class vm8 extends um8 {
    private final int a;

    /* access modifiers changed from: package-private */
    /* renamed from: vm8$b */
    public static final class b extends um8.a {
        private Integer a;

        b() {
        }

        @Override // defpackage.um8.a
        public um8 a() {
            String str = this.a == null ? " position" : "";
            if (str.isEmpty()) {
                return new vm8(this.a.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public um8.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    vm8(int i, a aVar) {
        this.a = i;
    }

    @Override // defpackage.um8
    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof um8) || this.a != ((um8) obj).d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("ArtistPosition{position="), this.a, "}");
    }
}
