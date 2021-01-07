package com.spotify.music.carmode.navigation.domain;

import com.google.common.base.Optional;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.navigation.x;

public abstract class o {

    public static final class a extends o {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CancelVoiceSearch{}";
        }
    }

    public static final class b extends o {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ClearStackAndDisplayCarModeHome{}";
        }
    }

    public static final class c extends o {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayCarModeHome{}";
        }
    }

    public static final class d extends o {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayCoreHome{}";
        }
    }

    public static final class e extends o {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayCoreSearch{}";
        }
    }

    public static final class f extends o {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayHomeTooltip{}";
        }
    }

    public static final class g extends o {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayVoiceSearch{}";
        }
    }

    public static final class h extends o {
        h() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayVoiceSearchPulsatingAnimation{}";
        }
    }

    public static final class i extends o {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayVoiceTooltip{}";
        }
    }

    public static final class j extends o {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DisplayYourLibrary{}";
        }
    }

    public static final class k extends o {
        k() {
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HideVoiceSearchPulsatingAnimation{}";
        }
    }

    public static final class l extends o {
        private final CarModeNavigationModel.NavigationTab a;
        private final CarModeNavigationModel.SearchType b;
        private final Optional<x> c;
        private final Boolean d;

        l(CarModeNavigationModel.NavigationTab navigationTab, CarModeNavigationModel.SearchType searchType, Optional<x> optional, Boolean bool) {
            navigationTab.getClass();
            this.a = navigationTab;
            searchType.getClass();
            this.b = searchType;
            optional.getClass();
            this.c = optional;
            bool.getClass();
            this.d = bool;
        }

        public final Optional<x> a() {
            return this.c;
        }

        public final Boolean b() {
            return this.d;
        }

        public final CarModeNavigationModel.SearchType c() {
            return this.b;
        }

        public final CarModeNavigationModel.NavigationTab d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (lVar.a != this.a || lVar.b != this.b || !lVar.c.equals(this.c) || !lVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifyTabTappedTwice{tabTapped=");
            V0.append(this.a);
            V0.append(", searchType=");
            V0.append(this.b);
            V0.append(", activeRootFeature=");
            V0.append(this.c);
            V0.append(", carModeHomeEnabled=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class m extends o {
        m() {
        }

        public boolean equals(Object obj) {
            return obj instanceof m;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SetHomeUsersAsReturning{}";
        }
    }

    public static final class n extends o {
        n() {
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SetVoiceUsersAsReturning{}";
        }
    }

    o() {
    }
}
