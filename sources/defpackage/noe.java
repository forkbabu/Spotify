package defpackage;

import com.spotify.superbird.ota.model.g;
import java.util.List;

/* renamed from: noe  reason: default package */
public abstract class noe {

    /* renamed from: noe$a */
    public static final class a extends noe {
        private final String a;
        private final g b;

        a(String str, g gVar) {
            str.getClass();
            this.a = str;
            gVar.getClass();
            this.b = gVar;
        }

        public final g a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Download{serial=");
            V0.append(this.a);
            V0.append(", item=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: noe$b */
    public static final class b extends noe {
        private final String a;
        private final List<g> b;

        b(String str, List<g> list) {
            str.getClass();
            this.a = str;
            list.getClass();
            this.b = list;
        }

        public final String a() {
            return this.a;
        }

        public final List<g> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadUpdates{serial=");
            V0.append(this.a);
            V0.append(", updatableItems=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: noe$c */
    public static final class c extends noe {
        private final String a;
        private final String b;
        private final String c;
        private final long d;

        c(String str, String str2, String str3, long j) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
            this.d = j;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final long c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.d != this.d || !cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.r0(this.d, je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifyDownloadCompleted{packageName=");
            V0.append(this.a);
            V0.append(", version=");
            V0.append(this.b);
            V0.append(", hash=");
            V0.append(this.c);
            V0.append(", size=");
            return je.D0(V0, this.d, '}');
        }
    }

    /* renamed from: noe$d */
    public static final class d extends noe {
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

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final long c() {
            return this.d;
        }

        public final String d() {
            return this.b;
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

        public int hashCode() {
            return je.r0(this.d, je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifyDownloadFailed{packageName=");
            V0.append(this.a);
            V0.append(", version=");
            V0.append(this.b);
            V0.append(", hash=");
            V0.append(this.c);
            V0.append(", size=");
            return je.D0(V0, this.d, '}');
        }
    }

    /* renamed from: noe$e */
    public static final class e extends noe {
        private final String a;

        public final String a() {
            return this.a;
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

        public String toString() {
            return je.H0(je.V0("ShowError{message="), this.a, '}');
        }
    }

    noe() {
    }
}
