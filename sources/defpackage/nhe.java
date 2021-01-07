package defpackage;

/* renamed from: nhe  reason: default package */
public abstract class nhe {

    /* renamed from: nhe$a */
    public static final class a extends nhe {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("ForwardNameSuggestion{name="), this.a, '}');
        }
    }

    /* renamed from: nhe$b */
    public static final class b extends nhe {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToNext{}";
        }
    }

    /* renamed from: nhe$c */
    public static final class c extends nhe {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OpenEmailHintPicker{}";
        }
    }

    /* renamed from: nhe$d */
    public static final class d extends nhe {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OpenKeyboard{}";
        }
    }

    /* renamed from: nhe$e */
    public static final class e extends nhe {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("PrefillEmail{email="), this.a, '}');
        }
    }

    /* renamed from: nhe$f */
    public static final class f extends nhe {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ShowLoginSuggestion{email="), this.a, '}');
        }
    }

    /* renamed from: nhe$g */
    public static final class g extends nhe {
        private final String a;
        private final boolean b;

        g(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (gVar.b != this.b || !gVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("VerifyEmail{email=");
            V0.append(this.a);
            V0.append(", navigateToNextWhenValidated=");
            return je.O0(V0, this.b, '}');
        }
    }

    nhe() {
    }
}
