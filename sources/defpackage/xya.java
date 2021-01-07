package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;
import java.util.List;

/* renamed from: xya  reason: default package */
public abstract class xya {

    /* renamed from: xya$a */
    public static final class a extends xya {
        private final SearchHistoryItem a;

        a(SearchHistoryItem searchHistoryItem) {
            searchHistoryItem.getClass();
            this.a = searchHistoryItem;
        }

        public final SearchHistoryItem a() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddToHistory{item=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: xya$b */
    public static final class b extends xya {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ClearHistory{}";
        }
    }

    /* renamed from: xya$c */
    public static final class c extends xya {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadHistory{}";
        }
    }

    /* renamed from: xya$d */
    public static final class d extends xya {
        private final List<xya> a;

        d(List<xya> list) {
            list.getClass();
            this.a = list;
        }

        public final List<xya> a() {
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
            StringBuilder V0 = je.V0("MergedSearchEffect{effects=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: xya$e */
    public static final class e extends xya {
        private final String a;

        e(String str) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Navigate{uri="), this.a, '}');
        }
    }

    /* renamed from: xya$f */
    public static final class f extends xya {
        private final String a;

        f(String str) {
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
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("PerformOfflineSearch{query="), this.a, '}');
        }
    }

    /* renamed from: xya$g */
    public static final class g extends xya {
        private final String a;
        private final fza b;

        g(String str, fza fza) {
            str.getClass();
            this.a = str;
            fza.getClass();
            this.b = fza;
        }

        public final String a() {
            return this.a;
        }

        public final fza b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!gVar.a.equals(this.a) || !gVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PerformOnlineSearch{query=");
            V0.append(this.a);
            V0.append(", userSession=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: xya$h */
    public static final class h extends xya {
        private final String a;
        private final boolean b;

        h(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (hVar.b != this.b || !hVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("Play{uri=");
            V0.append(this.a);
            V0.append(", onDemand=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: xya$i */
    public static final class i extends xya {
        private final String a;

        i(String str) {
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
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("RemoveFromHistory{uri="), this.a, '}');
        }
    }

    xya() {
    }
}
