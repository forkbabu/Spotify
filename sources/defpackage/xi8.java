package defpackage;

/* renamed from: xi8  reason: default package */
public abstract class xi8 {

    /* renamed from: xi8$a */
    public static final class a extends xi8 {
        private final long a;

        a(long j) {
            this.a = j;
        }

        @Override // defpackage.xi8
        public final <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((ui8) ti02).apply(this);
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

        public final long g() {
            return this.a;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("AdBookmarked{timestamp="), this.a, '}');
        }
    }

    /* renamed from: xi8$b */
    public static final class b extends xi8 {
        private final boolean a;
        private final long b;

        b(boolean z, long j) {
            this.a = z;
            this.b = j;
        }

        @Override // defpackage.xi8
        public final <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((si8) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a == this.a && bVar.b == this.b) {
                return true;
            }
            return false;
        }

        public final long g() {
            return this.b;
        }

        public final boolean h() {
            return this.a;
        }

        public int hashCode() {
            return je.r0(this.b, (Boolean.valueOf(this.a).hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AppForegroundUpdateWithTime{isAppInForeground=");
            V0.append(this.a);
            V0.append(", currentTime=");
            return je.D0(V0, this.b, '}');
        }
    }

    /* renamed from: xi8$c */
    public static final class c extends xi8 {
        private final long a;

        c(long j) {
            this.a = j;
        }

        @Override // defpackage.xi8
        public final <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((ri8) ti03).apply(this);
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
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("BookmarkHubViewed{timestamp="), this.a, '}');
        }
    }

    /* renamed from: xi8$d */
    public static final class d extends xi8 {
        d() {
        }

        @Override // defpackage.xi8
        public final <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((qi8) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DismissReminder{}";
        }
    }

    /* renamed from: xi8$e */
    public static final class e extends xi8 {
        e() {
        }

        @Override // defpackage.xi8
        public final <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((ti8) ti05).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToBookmarkHub{}";
        }
    }

    xi8() {
    }

    public static xi8 a(long j) {
        return new a(j);
    }

    public static xi8 b(boolean z, long j) {
        return new b(z, j);
    }

    public static xi8 c(long j) {
        return new c(j);
    }

    public static xi8 d() {
        return new d();
    }

    public static xi8 f() {
        return new e();
    }

    public abstract <R_> R_ e(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03, ti0<d, R_> ti04, ti0<e, R_> ti05);
}
