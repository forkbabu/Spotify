package defpackage;

import com.spotify.libs.search.history.SearchHistory;
import com.spotify.libs.search.offline.model.OfflineResults;

/* renamed from: dza  reason: default package */
public abstract class dza {

    /* renamed from: dza$a */
    public static final class a extends dza {
        private final SearchHistory a;

        a(SearchHistory searchHistory) {
            searchHistory.getClass();
            this.a = searchHistory;
        }

        @Override // defpackage.dza
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return ti03.apply(this);
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

        public final SearchHistory f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("History{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: dza$b */
    public static final class b extends dza {
        b() {
        }

        @Override // defpackage.dza
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "None{}";
        }
    }

    /* renamed from: dza$c */
    public static final class c extends dza {
        private final OfflineResults a;

        c(OfflineResults offlineResults) {
            offlineResults.getClass();
            this.a = offlineResults;
        }

        @Override // defpackage.dza
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return ti04.apply(this);
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

        public final OfflineResults f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Offline{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: dza$d */
    public static final class d extends dza {
        private final cza a;

        d(cza cza) {
            cza.getClass();
            this.a = cza;
        }

        @Override // defpackage.dza
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return ti02.apply(this);
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

        public final cza f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Online{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    dza() {
    }

    public static dza a(SearchHistory searchHistory) {
        return new a(searchHistory);
    }

    public static dza c() {
        return new b();
    }

    public static dza d(OfflineResults offlineResults) {
        return new c(offlineResults);
    }

    public static dza e(cza cza) {
        return new d(cza);
    }

    public abstract <R_> R_ b(ti0<b, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04);
}
