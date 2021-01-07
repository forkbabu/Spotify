package defpackage;

/* renamed from: a7a  reason: default package */
public abstract class a7a {

    /* renamed from: a7a$a */
    public static final class a extends a7a {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((u6a) ti02).a;
        }

        public String toString() {
            return "ActivateCarMode{}";
        }
    }

    /* renamed from: a7a$b */
    public static final class b extends a7a {
        private final boolean a;

        b(boolean z) {
            this.a = z;
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

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((w6a) ti05).apply(this);
        }

        public final boolean j() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("AutoActivationEnabledSettingChanged{autoActivationSettingEnabled="), this.a, '}');
        }
    }

    /* renamed from: a7a$c */
    public static final class c extends a7a {
        private final y6a a;

        c(y6a y6a) {
            y6a.getClass();
            this.a = y6a;
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

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((s6a) ti04).apply(this);
        }

        public final y6a j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AvailabilitySettingChanged{availabilitySetting=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: a7a$d */
    public static final class d extends a7a {
        private final boolean a;

        d(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((v6a) ti0).apply(this);
        }

        public final boolean j() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("CarDetectionStateChanged{isCarDetected="), this.a, '}');
        }
    }

    /* renamed from: a7a$e */
    public static final class e extends a7a {
        private final d7a a;

        e(d7a d7a) {
            d7a.getClass();
            this.a = d7a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((q6a) ti06).a;
        }

        public final d7a j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CarModeStateDebugSettingsValueChanged{carModeState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: a7a$f */
    public static final class f extends a7a {
        private final boolean a;

        f(boolean z) {
            this.a = z;
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

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((p6a) ti08).apply(this);
        }

        public final boolean j() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("CarThingConnectionChanged{isConnected="), this.a, '}');
        }
    }

    /* renamed from: a7a$g */
    public static final class g extends a7a {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((t6a) ti03).apply(this);
        }

        public String toString() {
            return "DeactivateCarMode{}";
        }
    }

    /* renamed from: a7a$h */
    public static final class h extends a7a {
        private final boolean a;

        h(boolean z) {
            this.a = z;
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

        @Override // defpackage.a7a
        public final <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08) {
            return (R_) ((r6a) ti07).apply(this);
        }

        public final boolean j() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("ManualOptInAvailabilityChanged{optInAvailable="), this.a, '}');
        }
    }

    a7a() {
    }

    public static a7a a() {
        return new a();
    }

    public static a7a b(boolean z) {
        return new b(z);
    }

    public static a7a c(y6a y6a) {
        return new c(y6a);
    }

    public static a7a d(boolean z) {
        return new d(z);
    }

    public static a7a e(d7a d7a) {
        return new e(d7a);
    }

    public static a7a f(boolean z) {
        return new f(z);
    }

    public static a7a g() {
        return new g();
    }

    public static a7a h(boolean z) {
        return new h(z);
    }

    public abstract <R_> R_ i(ti0<d, R_> ti0, ti0<a, R_> ti02, ti0<g, R_> ti03, ti0<c, R_> ti04, ti0<b, R_> ti05, ti0<e, R_> ti06, ti0<h, R_> ti07, ti0<f, R_> ti08);
}
