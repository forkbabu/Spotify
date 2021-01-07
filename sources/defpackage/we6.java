package defpackage;

import com.spotify.music.connection.OfflineReason;

/* renamed from: we6  reason: default package */
public abstract class we6<T> {

    /* renamed from: we6$a */
    public static final class a extends we6<Object> {
        private final Throwable a;

        a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final Throwable a() {
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
            return je.K0(je.V0("Error{throwable="), this.a, '}');
        }
    }

    /* renamed from: we6$b */
    public static final class b extends we6<Object> {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: we6$c */
    public static final class c extends we6<Object> {
        private final OfflineReason a;

        c(OfflineReason offlineReason) {
            offlineReason.getClass();
            this.a = offlineReason;
        }

        public final OfflineReason a() {
            return this.a;
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
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OfflineError{offlineReason=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: we6$d */
    public static final class d<T> extends we6<T> {
        private final T a;

        d(T t) {
            t.getClass();
            this.a = t;
        }

        public final T a() {
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
            StringBuilder V0 = je.V0("Success{payload=");
            V0.append((Object) this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    we6() {
    }
}
