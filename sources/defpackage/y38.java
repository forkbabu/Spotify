package defpackage;

/* renamed from: y38  reason: default package */
public abstract class y38 {

    /* renamed from: y38$a */
    public static final class a extends y38 {
        a() {
        }

        @Override // defpackage.y38
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((s38) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ConnectionRegained{}";
        }
    }

    /* renamed from: y38$b */
    public static final class b extends y38 {
        private final b91 a;

        b(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.y38
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((t38) ti02).apply(this);
        }

        public final b91 e() {
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
            StringBuilder V0 = je.V0("HubsFetchError{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: y38$c */
    public static final class c extends y38 {
        private final b91 a;

        c(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.y38
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((u38) ti0).apply(this);
        }

        public final b91 e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HubsFetchSuccess{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    y38() {
    }

    public static y38 a() {
        return new a();
    }

    public static y38 b(b91 b91) {
        return new b(b91);
    }

    public static y38 c(b91 b91) {
        return new c(b91);
    }

    public abstract <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);
}
