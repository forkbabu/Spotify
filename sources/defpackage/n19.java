package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: n19  reason: default package */
public abstract class n19 {

    /* renamed from: n19$a */
    public static final class a extends n19 {
        private final YourLibraryPageId a;
        private final boolean b;
        private final boolean c;

        a(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.c;
        }

        public final YourLibraryPageId b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a == this.a && aVar.b == this.b && aVar.c == this.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.valueOf(this.b).hashCode();
            return je.n(this.c, (hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FocusPage{pageId=");
            V0.append(this.a);
            V0.append(", smooth=");
            V0.append(this.b);
            V0.append(", isInitialFocus=");
            return je.O0(V0, this.c, '}');
        }
    }

    /* renamed from: n19$b */
    public static final class b extends n19 {
        private final String a;
        private final String b;

        b(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
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
            StringBuilder V0 = je.V0("LogPageFocused{pageIdentifier=");
            V0.append(this.a);
            V0.append(", pageUri=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: n19$c */
    public static final class c extends n19 {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NavigateToSettings{}";
        }
    }

    /* renamed from: n19$d */
    public static final class d extends n19 {
        private final YourLibraryPageId a;
        private final boolean b;

        d(YourLibraryPageId yourLibraryPageId, boolean z) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final YourLibraryPageId b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.a == this.a && dVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifyPageFocusChanged{pageId=");
            V0.append(this.a);
            V0.append(", isFocused=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: n19$e */
    public static final class e extends n19 {
        private final com.spotify.music.yourlibrary.interfaces.i a;

        e(com.spotify.music.yourlibrary.interfaces.i iVar) {
            iVar.getClass();
            this.a = iVar;
        }

        public final com.spotify.music.yourlibrary.interfaces.i a() {
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
            StringBuilder V0 = je.V0("NotifyYourLibraryStateChanged{newYourLibraryState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: n19$f */
    public static final class f extends n19 {
        private final YourLibraryPageId a;

        f(YourLibraryPageId yourLibraryPageId) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
        }

        public final YourLibraryPageId a() {
            return this.a;
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
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ScrollPageToTop{pageId=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: n19$g */
    public static final class g extends n19 {
        private final boolean a;

        g(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("SetPageSwipeLock{swipeLocked="), this.a, '}');
        }
    }

    /* renamed from: n19$h */
    public static final class h extends n19 {
        private final boolean a;

        h(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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

        public String toString() {
            return je.O0(je.V0("SetTabsCollapseLock{isLocked="), this.a, '}');
        }
    }

    /* renamed from: n19$i */
    public static final class i extends n19 {
        private final YourLibraryTabsCollapseState a;
        private final boolean b;

        i(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            yourLibraryTabsCollapseState.getClass();
            this.a = yourLibraryTabsCollapseState;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final YourLibraryTabsCollapseState b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (iVar.a == this.a && iVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetTabsCollapseState{tabsCollapseState=");
            V0.append(this.a);
            V0.append(", animate=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: n19$j */
    public static final class j extends n19 {
        private final YourLibraryPageId a;

        j(YourLibraryPageId yourLibraryPageId) {
            yourLibraryPageId.getClass();
            this.a = yourLibraryPageId;
        }

        public final YourLibraryPageId a() {
            return this.a;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdatePageTitle{pageId=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    n19() {
    }
}
