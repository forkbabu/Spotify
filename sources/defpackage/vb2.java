package defpackage;

/* renamed from: vb2  reason: default package */
public abstract class vb2 {

    /* renamed from: vb2$a */
    public static final class a extends vb2 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AdBookMarkEventReceived{}";
        }
    }

    /* renamed from: vb2$b */
    public static final class b extends vb2 {
        private final long a;

        b(long j) {
            this.a = j;
        }

        public final long d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("AdBookmarked{timestamp="), this.a, '}');
        }
    }

    /* renamed from: vb2$c */
    public static final class c extends vb2 {
        private final long a;

        c(long j) {
            this.a = j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("AdUnBookmarked{timestamp="), this.a, '}');
        }
    }

    /* renamed from: vb2$d */
    public static final class d extends vb2 {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public int hashCode() {
            return je.r0(0, 0);
        }

        public String toString() {
            return "BookmarkPageViewed{timestamp=0}";
        }
    }

    vb2() {
    }

    public static vb2 a() {
        return new a();
    }

    public static vb2 b(long j) {
        return new b(j);
    }

    public static vb2 c(long j) {
        return new c(j);
    }
}
