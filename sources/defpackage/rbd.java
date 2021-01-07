package defpackage;

/* renamed from: rbd  reason: default package */
public abstract class rbd {

    /* renamed from: rbd$a */
    public static final class a extends rbd {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "NotifyFirstParticipantJoinedYou{participantName=null}";
        }
    }

    /* renamed from: rbd$b */
    public static final class b extends rbd {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("NotifyHostEnded{hostName="), this.a, '}');
        }
    }

    /* renamed from: rbd$c */
    public static final class c extends rbd {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("NotifyParticipantJoined{participantName="), this.a, '}');
        }
    }

    /* renamed from: rbd$d */
    public static final class d extends rbd {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("NotifyParticipantLeft{participantName="), this.a, '}');
        }
    }

    /* renamed from: rbd$e */
    public static final class e extends rbd {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotifySessionDeletedConsumed{}";
        }
    }

    /* renamed from: rbd$f */
    public static final class f extends rbd {
        private final boolean a;

        f(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof f) && ((f) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("NotifyYouEnded{shortDelay="), this.a, '}');
        }
    }

    /* renamed from: rbd$g */
    public static final class g extends rbd {
        private final String a;
        private final int b;

        g(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (gVar.b != this.b || !gVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifyYouJoined{hostName=");
            V0.append(this.a);
            V0.append(", participantCount=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: rbd$h */
    public static final class h extends rbd {
        private final boolean a;

        h(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && ((h) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("NotifyYouLeft{shortDelay="), this.a, '}');
        }
    }

    /* renamed from: rbd$i */
    public static final class i extends rbd {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PersistHostEducationShown{}";
        }
    }

    /* renamed from: rbd$j */
    public static final class j extends rbd {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PersistParticipantEducationShown{}";
        }
    }

    /* renamed from: rbd$k */
    public static final class k extends rbd {
        private final String a;

        k(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            return ((k) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ShowHostEducation{participantName="), this.a, '}');
        }
    }

    /* renamed from: rbd$l */
    public static final class l extends rbd {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "ShowParticipantEducation{hostName=null}";
        }
    }

    rbd() {
    }
}
