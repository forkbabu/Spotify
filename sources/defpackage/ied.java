package defpackage;

import com.spotify.music.sociallistening.models.Participant;

/* renamed from: ied  reason: default package */
public abstract class ied {

    /* renamed from: ied$a */
    public static final class a extends ied {
        private final edd a;

        a(edd edd) {
            edd.getClass();
            this.a = edd;
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((bed) ti0).apply(this);
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

        public final edd h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DataChanged{dataModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ied$b */
    public static final class b extends ied {
        b() {
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((ded) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InviteButtonClicked{}";
        }
    }

    /* renamed from: ied$c */
    public static final class c extends ied {
        private final Participant a;
        private final int b;

        c(Participant participant, int i) {
            participant.getClass();
            this.a = participant;
            this.b = i;
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((fed) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || !cVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public final Participant h() {
            return this.a;
        }

        public int hashCode() {
            return je.b(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ParticipantClicked{participant=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: ied$d */
    public static final class d extends ied {
        private final int a;

        d(int i) {
            this.a = i;
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((eed) ti06).apply(this);
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

        public final int h() {
            return this.a;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public String toString() {
            return je.A0(je.V0("ScannableBgColorExtracted{scannableBgColor="), this.a, '}');
        }
    }

    /* renamed from: ied$e */
    public static final class e extends ied {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((aed) ti05).apply(this);
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

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("SessionShared{joinToken="), this.a, '}');
        }
    }

    /* renamed from: ied$f */
    public static final class f extends ied {
        f() {
        }

        @Override // defpackage.ied
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ((zdd) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ToolbarInviteButtonClicked{}";
        }
    }

    ied() {
    }

    public static ied a(edd edd) {
        return new a(edd);
    }

    public static ied b() {
        return new b();
    }

    public static ied d(Participant participant, int i) {
        return new c(participant, i);
    }

    public static ied e(int i) {
        return new d(i);
    }

    public static ied f(String str) {
        return new e(str);
    }

    public static ied g() {
        return new f();
    }

    public abstract <R_> R_ c(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06);
}
