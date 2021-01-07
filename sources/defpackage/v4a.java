package defpackage;

/* renamed from: v4a  reason: default package */
public abstract class v4a {

    /* renamed from: v4a$a */
    public static final class a extends v4a {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.v4a
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((s4a) ti0).apply(this);
        }

        public final String d() {
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
            return je.H0(je.V0("SourceAdded{id="), this.a, '}');
        }
    }

    /* renamed from: v4a$b */
    public static final class b extends v4a {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.v4a
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((r4a) ti02).apply(this);
        }

        public final String d() {
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
            return je.H0(je.V0("SourceRemoved{id="), this.a, '}');
        }
    }

    v4a() {
    }

    public static v4a b(String str) {
        return new a(str);
    }

    public static v4a c(String str) {
        return new b(str);
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<b, R_> ti02);
}
