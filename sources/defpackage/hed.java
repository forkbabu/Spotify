package defpackage;

import com.google.common.base.Optional;

/* renamed from: hed  reason: default package */
public abstract class hed {

    /* renamed from: hed$a */
    public static final class a extends hed {
        private final Optional<String> a;
        private final String b;

        a(Optional<String> optional, String str) {
            optional.getClass();
            this.a = optional;
            str.getClass();
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final Optional<String> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ExtractScannableBgColor{imageUri=");
            V0.append(this.a);
            V0.append(", displayName=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: hed$b */
    public static final class b extends hed {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateBack{}";
        }
    }

    /* renamed from: hed$c */
    public static final class c extends hed {
        private final String a;

        c(String str) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("NavigateToUser{username="), this.a, '}');
        }
    }

    /* renamed from: hed$d */
    public static final class d extends hed {
        private final String a;

        d(String str) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("NotifySessionShared{joinToken="), this.a, '}');
        }
    }

    /* renamed from: hed$e */
    public static final class e extends hed {
        private final String a;
        private final String b;

        e(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("OpenShareFlow{joinUri=");
            V0.append(this.a);
            V0.append(", joinToken=");
            return je.H0(V0, this.b, '}');
        }
    }

    hed() {
    }
}
