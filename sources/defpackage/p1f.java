package defpackage;

/* renamed from: p1f  reason: default package */
public abstract class p1f {

    /* renamed from: p1f$a */
    public static final class a extends p1f {
        a() {
        }

        @Override // defpackage.p1f
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
            ((i0f) si02).a.H(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Backend{}";
        }
    }

    /* renamed from: p1f$b */
    public static final class b extends p1f {
        b() {
        }

        @Override // defpackage.p1f
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unsupported{}";
        }
    }

    /* renamed from: p1f$c */
    public static final class c extends p1f {
        c() {
        }

        @Override // defpackage.p1f
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
            ((e0f) si0).a.G(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VoiceInput{}";
        }
    }

    p1f() {
    }

    public static p1f a() {
        return new a();
    }

    public static p1f c() {
        return new b();
    }

    public static p1f d() {
        return new c();
    }

    public abstract void b(si0<c> si0, si0<a> si02, si0<b> si03);
}
