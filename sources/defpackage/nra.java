package defpackage;

import defpackage.ura;

/* access modifiers changed from: package-private */
/* renamed from: nra  reason: default package */
public final class nra extends ura {
    private final int b;

    /* access modifiers changed from: package-private */
    /* renamed from: nra$b */
    public static final class b extends ura.a {
        private Integer a;

        b() {
        }

        @Override // defpackage.ura.a
        public ura a() {
            String str = this.a == null ? " maxTitleLines" : "";
            if (str.isEmpty()) {
                return new nra(this.a.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ura.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    nra(int i, a aVar) {
        this.b = i;
    }

    @Override // defpackage.ura
    public int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ura) || this.b != ((ura) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("RowConfig{maxTitleLines="), this.b, "}");
    }
}
