package defpackage;

/* renamed from: wie  reason: default package */
public abstract class wie {

    /* renamed from: wie$a */
    public static final class a extends wie {
        a() {
        }

        @Override // defpackage.wie
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti03.apply(this);
        }

        @Override // defpackage.wie
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03, si0<d> si04) {
            si03.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Female{}";
        }
    }

    /* renamed from: wie$b */
    public static final class b extends wie {
        b() {
        }

        @Override // defpackage.wie
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti02.apply(this);
        }

        @Override // defpackage.wie
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03, si0<d> si04) {
            si02.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Male{}";
        }
    }

    /* renamed from: wie$c */
    public static final class c extends wie {
        c() {
        }

        @Override // defpackage.wie
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti0.apply(this);
        }

        @Override // defpackage.wie
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03, si0<d> si04) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "None{}";
        }
    }

    /* renamed from: wie$d */
    public static final class d extends wie {
        d() {
        }

        @Override // defpackage.wie
        public final <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti04.apply(this);
        }

        @Override // defpackage.wie
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03, si0<d> si04) {
            si04.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NoneBinary{}";
        }
    }

    wie() {
    }

    public static wie a() {
        return new a();
    }

    public static wie b() {
        return new b();
    }

    public static wie e() {
        return new c();
    }

    public static wie f() {
        return new d();
    }

    public abstract <R_> R_ c(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04);

    public abstract void d(si0<c> si0, si0<b> si02, si0<a> si03, si0<d> si04);
}
