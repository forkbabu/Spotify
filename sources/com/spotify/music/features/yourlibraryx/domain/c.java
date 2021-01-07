package com.spotify.music.features.yourlibraryx.domain;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import java.util.List;
import java.util.Set;

public abstract class c {

    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("DeleteRecentSearch(uri="), this.a, ")");
        }
    }

    /* renamed from: com.spotify.music.features.yourlibraryx.domain.c$c  reason: collision with other inner class name */
    public static final class C0270c extends c {
        public static final C0270c a = new C0270c();

        private C0270c() {
            super(null);
        }
    }

    public static final class d extends c {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "entityUri");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.h.a(this.a, dVar.a) && kotlin.jvm.internal.h.a(this.b, dVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigateToEntity(entityUri=");
            V0.append(this.a);
            V0.append(", interactionId=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class e extends c {
        private final String a;

        public e(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("NavigateToSearch(interactionId="), this.a, ")");
        }
    }

    public static final class f extends c {
        private final String a;

        public f(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("NavigateToSettings(interactionId="), this.a, ")");
        }
    }

    public static final class g extends c {
        private final String a;
        private final String b;
        private final YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase entityCase) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            kotlin.jvm.internal.h.e(str2, "title");
            kotlin.jvm.internal.h.e(entityCase, "entityCase");
            this.a = str;
            this.b = str2;
            this.c = entityCase;
        }

        public final YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.h.a(this.a, gVar.a) && kotlin.jvm.internal.h.a(this.b, gVar.b) && kotlin.jvm.internal.h.a(this.c, gVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase entityCase = this.c;
            if (entityCase != null) {
                i = entityCase.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OpenContextMenu(uri=");
            V0.append(this.a);
            V0.append(", title=");
            V0.append(this.b);
            V0.append(", entityCase=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class h extends c {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("PinItem(uri="), this.a, ")");
        }
    }

    public static final class i extends c {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("SaveRecentSearch(uri="), this.a, ")");
        }
    }

    public static final class j extends c {
        private final YourLibraryXSortOption a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(YourLibraryXSortOption yourLibraryXSortOption) {
            super(null);
            kotlin.jvm.internal.h.e(yourLibraryXSortOption, "sortOption");
            this.a = yourLibraryXSortOption;
        }

        public final YourLibraryXSortOption a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
            }
            return true;
        }

        public int hashCode() {
            YourLibraryXSortOption yourLibraryXSortOption = this.a;
            if (yourLibraryXSortOption != null) {
                return yourLibraryXSortOption.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveSortOption(sortOption=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class k extends c {
        private final YourLibraryXViewMode a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(YourLibraryXViewMode yourLibraryXViewMode) {
            super(null);
            kotlin.jvm.internal.h.e(yourLibraryXViewMode, "viewDensity");
            this.a = yourLibraryXViewMode;
        }

        public final YourLibraryXViewMode a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && kotlin.jvm.internal.h.a(this.a, ((k) obj).a);
            }
            return true;
        }

        public int hashCode() {
            YourLibraryXViewMode yourLibraryXViewMode = this.a;
            if (yourLibraryXViewMode != null) {
                return yourLibraryXViewMode.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveViewDensity(viewDensity=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class l extends c {
        private final j a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(j jVar) {
            super(null);
            kotlin.jvm.internal.h.e(jVar, "pickerData");
            this.a = jVar;
        }

        public final j a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof l) && kotlin.jvm.internal.h.a(this.a, ((l) obj).a);
            }
            return true;
        }

        public int hashCode() {
            j jVar = this.a;
            if (jVar != null) {
                return jVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowSortOptionPicker(pickerData=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class m extends c {
        private final k a;
        private final a b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(k kVar, a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(kVar, "data");
            kotlin.jvm.internal.h.e(aVar, "context");
            this.a = kVar;
            this.b = aVar;
        }

        public final a a() {
            return this.b;
        }

        public final k b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.h.a(this.a, mVar.a) && kotlin.jvm.internal.h.a(this.b, mVar.b);
        }

        public int hashCode() {
            k kVar = this.a;
            int i = 0;
            int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
            a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SubscribeToContent(data=");
            V0.append(this.a);
            V0.append(", context=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class n extends c {
        private final Set<String> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Set<String> set) {
            super(null);
            kotlin.jvm.internal.h.e(set, "uris");
            this.a = set;
        }

        public final Set<String> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Set<String> set = this.a;
            if (set != null) {
                return set.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SynchronizePlaylists(uris=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class o extends c {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof o) && kotlin.jvm.internal.h.a(this.a, ((o) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("UnpinItem(uri="), this.a, ")");
        }
    }

    public static final class p extends c {
        private final List<b> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(List<? extends b> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "contentFilters");
            this.a = list;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof p) && kotlin.jvm.internal.h.a(this.a, ((p) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<b> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("UpdateContentFilters(contentFilters="), this.a, ")");
        }
    }

    public static final class q extends c {
        private final l a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(l lVar) {
            super(null);
            kotlin.jvm.internal.h.e(lVar, "effect");
            this.a = lVar;
        }

        public final l a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof q) && kotlin.jvm.internal.h.a(this.a, ((q) obj).a);
            }
            return true;
        }

        public int hashCode() {
            l lVar = this.a;
            if (lVar != null) {
                return lVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ViewEffect(effect=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public c(kotlin.jvm.internal.f fVar) {
    }
}
