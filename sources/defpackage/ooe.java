package defpackage;

import com.spotify.superbird.ota.model.g;
import java.util.List;

/* renamed from: ooe  reason: default package */
public abstract class ooe {

    /* renamed from: ooe$a */
    public static final class a extends ooe {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final long e;

        a(String str, String str2, String str3, String str4, long j) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
            str4.getClass();
            this.d = str4;
            this.e = j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.e != this.e || !aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !aVar.c.equals(this.c) || !aVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ooe
        public final <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ((koe) ti02).apply(this);
        }

        public final String g() {
            return this.d;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            return je.r0(this.e, je.Y0(this.d, je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31), 31));
        }

        public final String i() {
            return this.a;
        }

        public final long j() {
            return this.e;
        }

        public final String k() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadCompleted{serial=");
            V0.append(this.a);
            V0.append(", packageName=");
            V0.append(this.b);
            V0.append(", version=");
            V0.append(this.c);
            V0.append(", hash=");
            V0.append(this.d);
            V0.append(", size=");
            return je.D0(V0, this.e, '}');
        }
    }

    /* renamed from: ooe$b */
    public static final class b extends ooe {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final long e;

        b(String str, String str2, String str3, String str4, long j) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
            str4.getClass();
            this.d = str4;
            this.e = j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.e != this.e || !bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !bVar.c.equals(this.c) || !bVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ooe
        public final <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ((ioe) ti03).apply(this);
        }

        public final String g() {
            return this.d;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            return je.r0(this.e, je.Y0(this.d, je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31), 31));
        }

        public final String i() {
            return this.a;
        }

        public final long j() {
            return this.e;
        }

        public final String k() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadFailed{serial=");
            V0.append(this.a);
            V0.append(", packageName=");
            V0.append(this.b);
            V0.append(", version=");
            V0.append(this.c);
            V0.append(", hash=");
            V0.append(this.d);
            V0.append(", size=");
            return je.D0(V0, this.e, '}');
        }
    }

    /* renamed from: ooe$c */
    public static final class c extends ooe {
        private final String a;
        private final g b;

        c(String str, g gVar) {
            str.getClass();
            this.a = str;
            gVar.getClass();
            this.b = gVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ooe
        public final <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ((loe) ti05).apply(this);
        }

        public final g g() {
            return this.b;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadRequested{serial=");
            V0.append(this.a);
            V0.append(", item=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ooe$d */
    public static final class d extends ooe {
        private final String a;
        private final String b;
        private final String c;
        private final long d;

        d(String str, String str2, String str3, long j) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
            this.d = j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.d != this.d || !dVar.a.equals(this.a) || !dVar.b.equals(this.b) || !dVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ooe
        public final <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ((hoe) ti04).apply(this);
        }

        public int hashCode() {
            return je.r0(this.d, je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadStarted{packageName=");
            V0.append(this.a);
            V0.append(", version=");
            V0.append(this.b);
            V0.append(", hash=");
            V0.append(this.c);
            V0.append(", size=");
            return je.D0(V0, this.d, '}');
        }
    }

    /* renamed from: ooe$e */
    public static final class e extends ooe {
        private final String a;
        private final List<g> b;

        e(String str, List<g> list) {
            str.getClass();
            this.a = str;
            list.getClass();
            this.b = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ooe
        public final <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ((goe) ti0).apply(this);
        }

        public final String g() {
            return this.a;
        }

        public final List<g> h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadUpdatesRequested{serial=");
            V0.append(this.a);
            V0.append(", updatableItems=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ooe$f */
    public static final class f extends ooe {
    }

    ooe() {
    }

    public static ooe a(String str, String str2, String str3, String str4, long j) {
        return new a(str, str2, str3, str4, j);
    }

    public static ooe b(String str, String str2, String str3, String str4, long j) {
        return new b(str, str2, str3, str4, j);
    }

    public static ooe c(String str, g gVar) {
        return new c(str, gVar);
    }

    public static ooe d(String str, String str2, String str3, long j) {
        return new d(str, str2, str3, j);
    }

    public static ooe e(String str, List<g> list) {
        return new e(str, list);
    }

    public abstract <R_> R_ f(ti0<e, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03, ti0<d, R_> ti04, ti0<c, R_> ti05, ti0<f, R_> ti06);
}
