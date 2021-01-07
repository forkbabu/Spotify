package defpackage;

/* renamed from: ddd  reason: default package */
public abstract class ddd {

    /* renamed from: ddd$a */
    public static final class a extends ddd {
        a() {
        }

        @Override // defpackage.ddd
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((zcd) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Init{}";
        }
    }

    /* renamed from: ddd$b */
    public static final class b extends ddd {
        private final com.spotify.music.sociallistening.models.b a;

        b(com.spotify.music.sociallistening.models.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        @Override // defpackage.ddd
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((add) ti02).apply(this);
        }

        public final com.spotify.music.sociallistening.models.b e() {
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
            StringBuilder V0 = je.V0("SocialListeningStateReceived{socialListeningState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ddd$c */
    public static final class c extends ddd {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.ddd
        public final <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) ((ycd) ti03).apply(this);
        }

        public final String e() {
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
            return je.H0(je.V0("UsernameReceived{username="), this.a, '}');
        }
    }

    ddd() {
    }

    public static ddd a() {
        return new a();
    }

    public static ddd c(com.spotify.music.sociallistening.models.b bVar) {
        return new b(bVar);
    }

    public static ddd d(String str) {
        return new c(str);
    }

    public abstract <R_> R_ b(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03);
}
