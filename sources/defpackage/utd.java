package defpackage;

import com.spotify.pageloader.l0;

/* renamed from: utd  reason: default package */
public abstract class utd<T> {

    /* renamed from: utd$a */
    public static final class a extends utd<Object> {
        a() {
        }

        @Override // defpackage.utd
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c<Object>, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((ptd) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NetworkBecameAvailable{}";
        }
    }

    /* renamed from: utd$b */
    public static final class b extends utd<Object> {
        b() {
        }

        @Override // defpackage.utd
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c<Object>, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((ktd) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartLoading{}";
        }
    }

    /* renamed from: utd$c */
    public static final class c<T> extends utd<T> {
        private final l0<T> a;

        c(l0<T> l0Var) {
            l0Var.getClass();
            this.a = l0Var;
        }

        @Override // defpackage.utd
        public final <R_> R_ a(ti0<b, R_> ti0, ti0<c<T>, R_> ti02, ti0<a, R_> ti03) {
            return (R_) ((jtd) ti02).apply(this);
        }

        public final l0<T> b() {
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
            StringBuilder V0 = je.V0("StateChanged{newState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    utd() {
    }

    public abstract <R_> R_ a(ti0<b, R_> ti0, ti0<c<T>, R_> ti02, ti0<a, R_> ti03);
}
