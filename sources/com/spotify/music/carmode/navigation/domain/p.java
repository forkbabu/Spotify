package com.spotify.music.carmode.navigation.domain;

import com.google.common.base.Optional;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;

public abstract class p {

    public static final class a extends p {
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

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti08.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean o() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("AdIsPlayingStateChanged{isPlaying="), this.a, '}');
        }
    }

    public static final class b extends p {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti0.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HomePressed{}";
        }
    }

    public static final class c extends p {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti012.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HomeTooltipDismissed{}";
        }
    }

    public static final class d extends p {
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

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti09.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean o() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("IsReturningHomeUser{isReturning="), this.a, '}');
        }
    }

    public static final class e extends p {
        private final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof e) && ((e) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti010.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean o() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("IsReturningVoiceUser{isReturning="), this.a, '}');
        }
    }

    public static final class f extends p {
        private final Optional<NavigationItem.NavigationGroup> a;
        private final ifd b;
        private final Optional<x> c;

        f(Optional<NavigationItem.NavigationGroup> optional, ifd ifd, Optional<x> optional2) {
            optional.getClass();
            this.a = optional;
            ifd.getClass();
            this.b = ifd;
            optional2.getClass();
            this.c = optional2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!fVar.a.equals(this.a) || !fVar.b.equals(this.b) || !fVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti06.apply(this);
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public final ifd o() {
            return this.b;
        }

        public final Optional<NavigationItem.NavigationGroup> p() {
            return this.a;
        }

        public final Optional<x> q() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigationChanged{navigationGroup=");
            V0.append(this.a);
            V0.append(", featureIdentifier=");
            V0.append(this.b);
            V0.append(", rootFeature=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class g extends p {
        private final boolean a;

        g(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof g) && ((g) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti07.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean o() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("NetworkStateChanged{isOnline="), this.a, '}');
        }
    }

    public static final class h extends p {
        h() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti04.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RegularSearchPressed{}";
        }
    }

    public static final class i extends p {
        private final CarModeNavigationModel.SearchType a;

        i(CarModeNavigationModel.SearchType searchType) {
            searchType.getClass();
            this.a = searchType;
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

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti013.apply(this);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final CarModeNavigationModel.SearchType o() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SearchTypeChanged{searchType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class j extends p {
        private final boolean a;

        j(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof j) && ((j) obj).a == this.a) {
                return true;
            }
            return false;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti03.apply(this);
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean o() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("VoiceSearchListeningStateChanged{isListening="), this.a, '}');
        }
    }

    public static final class k extends p {
        k() {
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti02.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VoiceSearchPressed{}";
        }
    }

    public static final class l extends p {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti011.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VoiceTooltipDismissed{}";
        }
    }

    public static final class m extends p {
        m() {
        }

        public boolean equals(Object obj) {
            return obj instanceof m;
        }

        @Override // com.spotify.music.carmode.navigation.domain.p
        public final <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013) {
            return ti05.apply(this);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "YourLibraryPressed{}";
        }
    }

    p() {
    }

    public static p a(boolean z) {
        return new a(z);
    }

    public static p b() {
        return new b();
    }

    public static p c() {
        return new c();
    }

    public static p d(boolean z) {
        return new d(z);
    }

    public static p e(boolean z) {
        return new e(z);
    }

    public static p g(Optional<NavigationItem.NavigationGroup> optional, ifd ifd, Optional<x> optional2) {
        return new f(optional, ifd, optional2);
    }

    public static p h(boolean z) {
        return new g(z);
    }

    public static p i() {
        return new h();
    }

    public static p j(CarModeNavigationModel.SearchType searchType) {
        return new i(searchType);
    }

    public static p k(boolean z) {
        return new j(z);
    }

    public static p l() {
        return new k();
    }

    public static p m() {
        return new l();
    }

    public static p n() {
        return new m();
    }

    public abstract <R_> R_ f(ti0<b, R_> ti0, ti0<k, R_> ti02, ti0<j, R_> ti03, ti0<h, R_> ti04, ti0<m, R_> ti05, ti0<f, R_> ti06, ti0<g, R_> ti07, ti0<a, R_> ti08, ti0<d, R_> ti09, ti0<e, R_> ti010, ti0<l, R_> ti011, ti0<c, R_> ti012, ti0<i, R_> ti013);
}
