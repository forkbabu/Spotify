package defpackage;

/* renamed from: gff  reason: default package */
public abstract class gff {

    /* renamed from: gff$a */
    public static final class a extends gff {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CompleteOnboarding{}";
        }
    }

    /* renamed from: gff$b */
    public static final class b extends gff {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CompleteWakeWordOnboarding{}";
        }
    }

    /* renamed from: gff$c */
    public static final class c extends gff {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Dismiss{}";
        }
    }

    /* renamed from: gff$d */
    public static final class d extends gff {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "EnableWakeWord{}";
        }
    }

    /* renamed from: gff$e */
    public static final class e extends gff {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LaunchVoice{}";
        }
    }

    /* renamed from: gff$f */
    public static final class f extends gff {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        public final String b() {
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
            return je.H0(je.V0("OpenUrl{url="), this.a, '}');
        }
    }

    /* renamed from: gff$g */
    public static final class g extends gff {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RequestMicPermission{}";
        }
    }

    /* renamed from: gff$h */
    public static final class h extends gff {
        private final String a;

        h(String str) {
            str.getClass();
            this.a = str;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("SetLocale{localeTag="), this.a, '}');
        }
    }

    gff() {
    }

    public static gff a() {
        return new c();
    }
}
