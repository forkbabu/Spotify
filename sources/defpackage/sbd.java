package defpackage;

/* renamed from: sbd  reason: default package */
public abstract class sbd {

    /* renamed from: sbd$a */
    public static final class a extends sbd {
        a() {
        }

        @Override // defpackage.sbd
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((nbd) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HostEducationShown{}";
        }
    }

    /* renamed from: sbd$b */
    public static final class b extends sbd {
        b() {
        }

        @Override // defpackage.sbd
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((hbd) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ParticipantEducationShown{}";
        }
    }

    /* renamed from: sbd$c */
    public static final class c extends sbd {
        private final com.spotify.music.sociallistening.models.b a;

        c(com.spotify.music.sociallistening.models.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        @Override // defpackage.sbd
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((lbd) ti0).apply(this);
        }

        public final com.spotify.music.sociallistening.models.b e() {
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
            StringBuilder V0 = je.V0("SocialListeningStateReceived{socialListeningState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    sbd() {
    }

    public static sbd a() {
        return new a();
    }

    public static sbd c() {
        return new b();
    }

    public static sbd d(com.spotify.music.sociallistening.models.b bVar) {
        return new c(bVar);
    }

    public abstract <R_> R_ b(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03);
}
