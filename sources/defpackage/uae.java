package defpackage;

/* renamed from: uae  reason: default package */
public abstract class uae {

    /* renamed from: uae$a */
    public static final class a extends uae {
        private final wae a;

        a(wae wae) {
            wae.getClass();
            this.a = wae;
        }

        @Override // defpackage.uae
        public final void b(si0<b> si0, si0<d> si02, si0<a> si03, si0<c> si04) {
            si03.accept(this);
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

        public final wae f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Invalid{reason=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: uae$b */
    public static final class b extends uae {
        b() {
        }

        @Override // defpackage.uae
        public final void b(si0<b> si0, si0<d> si02, si0<a> si03, si0<c> si04) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unverified{}";
        }
    }

    /* renamed from: uae$c */
    public static final class c extends uae {
        c() {
        }

        @Override // defpackage.uae
        public final void b(si0<b> si0, si0<d> si02, si0<a> si03, si0<c> si04) {
            si04.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Valid{}";
        }
    }

    /* renamed from: uae$d */
    public static final class d extends uae {
        d() {
        }

        @Override // defpackage.uae
        public final void b(si0<b> si0, si0<d> si02, si0<a> si03, si0<c> si04) {
            si02.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Verifying{}";
        }
    }

    uae() {
    }

    public static uae a(wae wae) {
        return new a(wae);
    }

    public static uae c() {
        return new b();
    }

    public static uae d() {
        return new c();
    }

    public static uae e() {
        return new d();
    }

    public abstract void b(si0<b> si0, si0<d> si02, si0<a> si03, si0<c> si04);
}
