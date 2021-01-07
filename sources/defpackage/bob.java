package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;

/* renamed from: bob  reason: default package */
public abstract class bob {

    /* renamed from: bob$a */
    public static final class a extends bob {
        private final Throwable a;

        a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.bob
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        public final Throwable e() {
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

    /* renamed from: bob$b */
    public static final class b extends bob {
        private final StorylinesCardContent a;

        b(StorylinesCardContent storylinesCardContent) {
            storylinesCardContent.getClass();
            this.a = storylinesCardContent;
        }

        @Override // defpackage.bob
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        public final StorylinesCardContent e() {
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
            StringBuilder V0 = je.V0("Loaded{storylinesContent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bob$c */
    public static final class c extends bob {
        c() {
        }

        @Override // defpackage.bob
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
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

    bob() {
    }

    public static bob a(Throwable th) {
        return new a(th);
    }

    public static bob b(StorylinesCardContent storylinesCardContent) {
        return new b(storylinesCardContent);
    }

    public static bob c() {
        return new c();
    }

    public abstract <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);
}
