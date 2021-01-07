package defpackage;

import com.google.common.base.Optional;

/* renamed from: h6d  reason: default package */
public abstract class h6d {

    /* renamed from: h6d$a */
    public static final class a extends h6d {
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
            return "JoinSession{token=null, listen=false}";
        }
    }

    /* renamed from: h6d$b */
    public static final class b extends h6d {
        private final boolean a;

        b(boolean z) {
            this.a = z;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("LeaveSession{pauseMusic="), this.a, '}');
        }
    }

    /* renamed from: h6d$c */
    public static final class c extends h6d {
        private final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final boolean b() {
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
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ObtainSession{startSession="), this.a, '}');
        }
    }

    /* renamed from: h6d$d */
    public static final class d extends h6d {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OpenParticipants{}";
        }
    }

    /* renamed from: h6d$e */
    public static final class e extends h6d {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OpenScanner{}";
        }
    }

    /* renamed from: h6d$f */
    public static final class f extends h6d {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowConfirmEndDialog{}";
        }
    }

    /* renamed from: h6d$g */
    public static final class g extends h6d {
        private final Optional<String> a;

        g(Optional<String> optional) {
            optional.getClass();
            this.a = optional;
        }

        public final Optional<String> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowConfirmLeaveDialog{hostDisplayName=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: h6d$h */
    public static final class h extends h6d {
        private final boolean a;

        h(boolean z) {
            this.a = z;
        }

        public final boolean b() {
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
            return je.O0(je.V0("ShowEndFailedDialog{isOffline="), this.a, '}');
        }
    }

    /* renamed from: h6d$i */
    public static final class i extends h6d {
        private final boolean a;

        i(boolean z) {
            this.a = z;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && ((i) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ShowJoinFailedDialog{isOffline="), this.a, '}');
        }
    }

    /* renamed from: h6d$j */
    public static final class j extends h6d {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowJoinFailedSessionFullDialog{}";
        }
    }

    /* renamed from: h6d$k */
    public static final class k extends h6d {
        private final boolean a;

        k(boolean z) {
            this.a = z;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof k) && ((k) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ShowLeaveFailedDialog{isOffline="), this.a, '}');
        }
    }

    /* renamed from: h6d$l */
    public static final class l extends h6d {
        private final boolean a;

        l(boolean z) {
            this.a = z;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof l) && ((l) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ShowStartFailedDialog{isOffline="), this.a, '}');
        }
    }

    h6d() {
    }

    public static h6d a(boolean z) {
        return new c(z);
    }
}
