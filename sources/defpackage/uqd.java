package defpackage;

/* renamed from: uqd  reason: default package */
public abstract class uqd {

    /* renamed from: uqd$a */
    public static final class a extends uqd {
        a() {
        }

        @Override // defpackage.uqd
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return (R_) ((rqd) ti02).a.b(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Completed{}";
        }
    }

    /* renamed from: uqd$b */
    public static final class b extends uqd {
        private final Integer a;

        b(Integer num) {
            num.getClass();
            this.a = num;
        }

        @Override // defpackage.uqd
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return (R_) ((qqd) ti0).apply(this);
        }

        public final Integer d() {
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
            StringBuilder V0 = je.V0("ScrubbedTo{positionMs=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    uqd() {
    }

    public static uqd a() {
        return new a();
    }

    public static uqd c(Integer num) {
        return new b(num);
    }

    public abstract <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02);
}
