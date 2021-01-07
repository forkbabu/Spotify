package com.spotify.pageloader;

public abstract class l0<T> {

    public static final class a<T> extends l0<T> {
        private final T a;

        a(T t) {
            t.getClass();
            this.a = t;
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<T>, R_> ti02, ti0<e, R_> ti03, ti0<a<T>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti04.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<T>> si02, si0<e> si03, si0<a<T>> si04, si0<d> si05, si0<f> si06) {
            si04.accept(this);
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

        public final T i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CustomError{data=");
            V0.append((Object) this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class b<T> extends l0<T> {
        private final T a;

        b(T t) {
            t.getClass();
            this.a = t;
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<T>, R_> ti02, ti0<e, R_> ti03, ti0<a<T>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti02.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<T>> si02, si0<e> si03, si0<a<T>> si04, si0<d> si05, si0<f> si06) {
            si02.accept(this);
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

        public final T i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{data=");
            V0.append((Object) this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends l0<Object> {
        c() {
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<Object>, R_> ti02, ti0<e, R_> ti03, ti0<a<Object>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti0.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<Object>> si02, si0<e> si03, si0<a<Object>> si04, si0<d> si05, si0<f> si06) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    public static final class d extends l0<Object> {
        private final Throwable a;
        private final NetworkErrorReason b;

        d(Throwable th, NetworkErrorReason networkErrorReason) {
            th.getClass();
            this.a = th;
            networkErrorReason.getClass();
            this.b = networkErrorReason;
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<Object>, R_> ti02, ti0<e, R_> ti03, ti0<a<Object>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti05.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<Object>> si02, si0<e> si03, si0<a<Object>> si04, si0<d> si05, si0<f> si06) {
            si05.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.b != this.b || !dVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final Throwable i() {
            return this.a;
        }

        public final NetworkErrorReason j() {
            return this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NetworkError{error=");
            V0.append(this.a);
            V0.append(", reason=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends l0<Object> {
        e() {
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<Object>, R_> ti02, ti0<e, R_> ti03, ti0<a<Object>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti03.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<Object>> si02, si0<e> si03, si0<a<Object>> si04, si0<d> si05, si0<f> si06) {
            si03.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotFound{}";
        }
    }

    public static final class f extends l0<Object> {
        private final Throwable a;

        f(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // com.spotify.pageloader.l0
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b<Object>, R_> ti02, ti0<e, R_> ti03, ti0<a<Object>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06) {
            return ti06.apply(this);
        }

        @Override // com.spotify.pageloader.l0
        public final void e(si0<c> si0, si0<b<Object>> si02, si0<e> si03, si0<a<Object>> si04, si0<d> si05, si0<f> si06) {
            si06.accept(this);
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

        public final Throwable i() {
            return this.a;
        }

        public String toString() {
            return je.K0(je.V0("SomethingWentWrong{error="), this.a, '}');
        }
    }

    l0() {
    }

    public static <T> l0<T> a(T t) {
        return new a(t);
    }

    public static <T> l0<T> b(T t) {
        return new b(t);
    }

    public static <T> l0<T> c() {
        return new c();
    }

    public static <T> l0<T> f(Throwable th, NetworkErrorReason networkErrorReason) {
        return new d(th, networkErrorReason);
    }

    public static <T> l0<T> g() {
        return new e();
    }

    public static <T> l0<T> h(Throwable th) {
        return new f(th);
    }

    public abstract <R_> R_ d(ti0<c, R_> ti0, ti0<b<T>, R_> ti02, ti0<e, R_> ti03, ti0<a<T>, R_> ti04, ti0<d, R_> ti05, ti0<f, R_> ti06);

    public abstract void e(si0<c> si0, si0<b<T>> si02, si0<e> si03, si0<a<T>> si04, si0<d> si05, si0<f> si06);
}
