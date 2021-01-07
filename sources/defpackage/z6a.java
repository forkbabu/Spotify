package defpackage;

/* renamed from: z6a  reason: default package */
public abstract class z6a {

    /* renamed from: z6a$a */
    public static final class a extends z6a {
        private final y6a a;

        a(y6a y6a) {
            y6a.getClass();
            this.a = y6a;
        }

        public final y6a a() {
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
            StringBuilder V0 = je.V0("ChangeAvailabilitySetting{availabilitySetting=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: z6a$b */
    public static final class b extends z6a {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PublishActivateDistractionControl{}";
        }
    }

    /* renamed from: z6a$c */
    public static final class c extends z6a {
        private final d7a a;

        c(d7a d7a) {
            d7a.getClass();
            this.a = d7a;
        }

        public final d7a a() {
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
            StringBuilder V0 = je.V0("PublishCarModeState{carModeState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: z6a$d */
    public static final class d extends z6a {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PublishDeactivateDistractionControl{}";
        }
    }

    z6a() {
    }
}
