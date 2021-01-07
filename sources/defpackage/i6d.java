package defpackage;

/* renamed from: i6d  reason: default package */
public abstract class i6d {

    /* renamed from: i6d$a */
    public static final class a extends i6d {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti09.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean p() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("EndSessionButtonClicked{confirmed="), this.a, '}');
        }
    }

    /* renamed from: i6d$b */
    public static final class b extends i6d {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti03.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FacePileClicked{}";
        }
    }

    /* renamed from: i6d$c */
    public static final class c extends i6d {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti012.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FailedToEndSession{}";
        }
    }

    /* renamed from: i6d$d */
    public static final class d extends i6d {
    }

    /* renamed from: i6d$e */
    public static final class e extends i6d {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti013.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FailedToJoinSession{}";
        }
    }

    /* renamed from: i6d$f */
    public static final class f extends i6d {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti015.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FailedToLeaveSession{}";
        }
    }

    /* renamed from: i6d$g */
    public static final class g extends i6d {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti011.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FailedToStartSession{}";
        }
    }

    /* renamed from: i6d$h */
    public static final class h extends i6d {
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

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti08.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean p() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("LeaveSessionButtonClicked{confirmed="), this.a, '}');
        }
    }

    /* renamed from: i6d$i */
    public static final class i extends i6d {
        private final boolean a;

        i(boolean z) {
            this.a = z;
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

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti02.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean p() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("OnlineStateChanged{isOnline="), this.a, '}');
        }
    }

    /* renamed from: i6d$j */
    public static final class j extends i6d {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti06.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ScanButtonClicked{}";
        }
    }

    /* renamed from: i6d$k */
    public static final class k extends i6d {
        k() {
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti05.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SeeListenersButtonClicked{}";
        }
    }

    /* renamed from: i6d$l */
    public static final class l extends i6d {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti010.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SessionStarted{}";
        }
    }

    /* renamed from: i6d$m */
    public static final class m extends i6d {
        private final com.spotify.music.sociallistening.models.b a;

        m(com.spotify.music.sociallistening.models.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return ((m) obj).a.equals(this.a);
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti0.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final com.spotify.music.sociallistening.models.b p() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SocialListeningStateReceived{socialListeningState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: i6d$n */
    public static final class n extends i6d {
        n() {
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti04.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StartSessionButtonClicked{}";
        }
    }

    /* renamed from: i6d$o */
    public static final class o extends i6d {
        o() {
        }

        public boolean equals(Object obj) {
            return obj instanceof o;
        }

        @Override // defpackage.i6d
        public final <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015) {
            return ti07.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TryAgainButtonClicked{}";
        }
    }

    i6d() {
    }

    public static i6d a(boolean z) {
        return new a(z);
    }

    public static i6d b() {
        return new b();
    }

    public static i6d c() {
        return new c();
    }

    public static i6d d() {
        return new e();
    }

    public static i6d e() {
        return new f();
    }

    public static i6d f() {
        return new g();
    }

    public static i6d g(boolean z) {
        return new h(z);
    }

    public static i6d i(boolean z) {
        return new i(z);
    }

    public static i6d j() {
        return new j();
    }

    public static i6d k() {
        return new k();
    }

    public static i6d l() {
        return new l();
    }

    public static i6d m(com.spotify.music.sociallistening.models.b bVar) {
        return new m(bVar);
    }

    public static i6d n() {
        return new n();
    }

    public static i6d o() {
        return new o();
    }

    public abstract <R_> R_ h(ti0<m, R_> ti0, ti0<i, R_> ti02, ti0<b, R_> ti03, ti0<n, R_> ti04, ti0<k, R_> ti05, ti0<j, R_> ti06, ti0<o, R_> ti07, ti0<h, R_> ti08, ti0<a, R_> ti09, ti0<l, R_> ti010, ti0<g, R_> ti011, ti0<c, R_> ti012, ti0<e, R_> ti013, ti0<d, R_> ti014, ti0<f, R_> ti015);
}
