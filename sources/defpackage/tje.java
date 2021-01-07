package defpackage;

/* renamed from: tje  reason: default package */
public abstract class tje {

    /* renamed from: tje$a */
    public static final class a extends tje {
        a() {
        }

        @Override // defpackage.tje
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            ((nje) ti0).apply(this);
            return "";
        }

        @Override // defpackage.tje
        public final void c(si0<a> si0, si0<b> si02) {
            ((zle) si0).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: tje$b */
    public static final class b extends tje {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.tje
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02) {
            return (R_) ((oje) ti02).apply(this);
        }

        @Override // defpackage.tje
        public final void c(si0<a> si0, si0<b> si02) {
            ((ame) si02).accept(this);
        }

        public final String e() {
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
            return je.H0(je.V0("Valid{name="), this.a, '}');
        }
    }

    tje() {
    }

    public static tje a() {
        return new a();
    }

    public static tje d(String str) {
        return new b(str);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02);

    public abstract void c(si0<a> si0, si0<b> si02);
}
