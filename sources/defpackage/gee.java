package defpackage;

/* renamed from: gee  reason: default package */
public abstract class gee {

    /* renamed from: gee$a */
    public static final class a extends gee {
        private final fee a;

        a(fee fee) {
            fee.getClass();
            this.a = fee;
        }

        @Override // defpackage.gee
        public final void c(si0<a> si0, si0<b> si02) {
            ((kme) si0).accept(this);
        }

        public final fee d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Fallback{signupConfiguration=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: gee$b */
    public static final class b extends gee {
        private final fee a;

        b(fee fee) {
            fee.getClass();
            this.a = fee;
        }

        @Override // defpackage.gee
        public final void c(si0<a> si0, si0<b> si02) {
            ((lme) si02).accept(this);
        }

        public final fee d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{signupConfiguration=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    gee() {
    }

    public static gee a(fee fee) {
        return new a(fee);
    }

    public static gee b(fee fee) {
        return new b(fee);
    }

    public abstract void c(si0<a> si0, si0<b> si02);
}
