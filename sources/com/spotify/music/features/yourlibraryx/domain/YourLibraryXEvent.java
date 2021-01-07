package com.spotify.music.features.yourlibraryx.domain;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import java.util.List;

public abstract class YourLibraryXEvent {

    public enum PinAction {
        PIN,
        UNPIN
    }

    public static final class a extends YourLibraryXEvent {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return kotlin.jvm.internal.h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AppModeChanged(appMode=null)";
        }
    }

    public static final class a0 extends YourLibraryXEvent {
        private final jnf a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a0(jnf jnf) {
            super(null);
            kotlin.jvm.internal.h.e(jnf, "range");
            this.a = jnf;
        }

        public final jnf a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a0) && kotlin.jvm.internal.h.a(this.a, ((a0) obj).a);
            }
            return true;
        }

        public int hashCode() {
            jnf jnf = this.a;
            if (jnf != null) {
                return jnf.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("VisibleRangeChanged(range=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends YourLibraryXEvent {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends YourLibraryXEvent {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
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
            return je.I0(je.V0("ContentItemDismissClicked(uri="), this.a, ")");
        }
    }

    public static final class d extends YourLibraryXEvent {
        private final String a;
        private final String b;
        private final YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase entityCase) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.h.a(this.a, dVar.a) && kotlin.jvm.internal.h.a(this.b, dVar.b) && kotlin.jvm.internal.h.a(this.c, dVar.c);
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
            StringBuilder V0 = je.V0("ContentItemLongClicked(uri=");
            V0.append(this.a);
            V0.append(", title=");
            V0.append(this.b);
            V0.append(", entityCase=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class e extends YourLibraryXEvent {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "contentItemUri");
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.h.a(this.a, eVar.a) && kotlin.jvm.internal.h.a(this.b, eVar.b);
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
            StringBuilder V0 = je.V0("ContentItemSelected(contentItemUri=");
            V0.append(this.a);
            V0.append(", interactionId=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class f extends YourLibraryXEvent {
        private final h a;
        private final a b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(h hVar, a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(hVar, "rangeData");
            kotlin.jvm.internal.h.e(aVar, "context");
            this.a = hVar;
            this.b = aVar;
        }

        public final a a() {
            return this.b;
        }

        public final h b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.h.a(this.a, fVar.a) && kotlin.jvm.internal.h.a(this.b, fVar.b);
        }

        public int hashCode() {
            h hVar = this.a;
            int i = 0;
            int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
            a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContentUpdated(rangeData=");
            V0.append(this.a);
            V0.append(", context=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class g extends YourLibraryXEvent {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends YourLibraryXEvent {
        private final b a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(b bVar) {
            super(null);
            kotlin.jvm.internal.h.e(bVar, "filter");
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FilterDeselected(filter=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class i extends YourLibraryXEvent {
        private final b a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(b bVar) {
            super(null);
            kotlin.jvm.internal.h.e(bVar, "filter");
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FilterSelected(filter=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class j extends YourLibraryXEvent {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            ((j) obj).getClass();
            return kotlin.jvm.internal.h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "FiltersChanged(filters=null)";
        }
    }

    public static final class k extends YourLibraryXEvent {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    public static final class l extends YourLibraryXEvent {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    public static final class m extends YourLibraryXEvent {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    public static final class n extends YourLibraryXEvent {
        private final jnf a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(jnf jnf, int i) {
            super(null);
            kotlin.jvm.internal.h.e(jnf, "range");
            this.a = jnf;
            this.b = i;
        }

        public final jnf a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.h.a(this.a, nVar.a) && this.b == nVar.b;
        }

        public int hashCode() {
            jnf jnf = this.a;
            return ((jnf != null ? jnf.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoadedRangeEdgeApproached(range=");
            V0.append(this.a);
            V0.append(", distanceToEdge=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class o extends YourLibraryXEvent {
        private final boolean a;

        public o(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof o) && this.a == ((o) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("OnDemandEnabledChanged(onDemandEnabled="), this.a, ")");
        }
    }

    public static final class p extends YourLibraryXEvent {
        private final PinAction a;
        private final YourLibraryPinProto$PinResponse b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(PinAction pinAction, YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse) {
            super(null);
            kotlin.jvm.internal.h.e(pinAction, "action");
            kotlin.jvm.internal.h.e(yourLibraryPinProto$PinResponse, "response");
            this.a = pinAction;
            this.b = yourLibraryPinProto$PinResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.h.a(this.a, pVar.a) && kotlin.jvm.internal.h.a(this.b, pVar.b);
        }

        public int hashCode() {
            PinAction pinAction = this.a;
            int i = 0;
            int hashCode = (pinAction != null ? pinAction.hashCode() : 0) * 31;
            YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse = this.b;
            if (yourLibraryPinProto$PinResponse != null) {
                i = yourLibraryPinProto$PinResponse.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PinResponseReceived(action=");
            V0.append(this.a);
            V0.append(", response=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class q extends YourLibraryXEvent {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof q) && kotlin.jvm.internal.h.a(this.a, ((q) obj).a);
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
            return je.I0(je.V0("PlayerStateUpdated(uri="), this.a, ")");
        }
    }

    public static final class r extends YourLibraryXEvent {
        private final g a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(g gVar) {
            super(null);
            kotlin.jvm.internal.h.e(gVar, "profileData");
            this.a = gVar;
        }

        public final g a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof r) && kotlin.jvm.internal.h.a(this.a, ((r) obj).a);
            }
            return true;
        }

        public int hashCode() {
            g gVar = this.a;
            if (gVar != null) {
                return gVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ProfileDataUpdated(profileData=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class s extends YourLibraryXEvent {
        private final String a;

        public s(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof s) && kotlin.jvm.internal.h.a(this.a, ((s) obj).a);
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
            return je.I0(je.V0("ProfileTapped(interactionId="), this.a, ")");
        }
    }

    public static final class t extends YourLibraryXEvent {
        private final List<String> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(List<String> list) {
            super(null);
            kotlin.jvm.internal.h.e(list, "uris");
            this.a = list;
        }

        public final List<String> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof t) && kotlin.jvm.internal.h.a(this.a, ((t) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<String> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("RecentSearchesUpdated(uris="), this.a, ")");
        }
    }

    public static final class u extends YourLibraryXEvent {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "newTextFilter");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof u) && kotlin.jvm.internal.h.a(this.a, ((u) obj).a);
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
            return je.I0(je.V0("SearchFilterChanged(newTextFilter="), this.a, ")");
        }
    }

    public static final class v extends YourLibraryXEvent {
        private final String a;

        public v(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof v) && kotlin.jvm.internal.h.a(this.a, ((v) obj).a);
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
            return je.I0(je.V0("SearchTapped(interactionId="), this.a, ")");
        }
    }

    public static final class w extends YourLibraryXEvent {
        private final YourLibraryXSortOption a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(YourLibraryXSortOption yourLibraryXSortOption) {
            super(null);
            kotlin.jvm.internal.h.e(yourLibraryXSortOption, "sortOption");
            this.a = yourLibraryXSortOption;
        }

        public final YourLibraryXSortOption a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof w) && kotlin.jvm.internal.h.a(this.a, ((w) obj).a);
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
            StringBuilder V0 = je.V0("SortOptionSelected(sortOption=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class x extends YourLibraryXEvent {
        public static final x a = new x();

        private x() {
            super(null);
        }
    }

    public static final class y extends YourLibraryXEvent {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof y) && kotlin.jvm.internal.h.a(this.a, ((y) obj).a);
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
            return je.I0(je.V0("SwipeToPin(uri="), this.a, ")");
        }
    }

    public static final class z extends YourLibraryXEvent {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof z) && kotlin.jvm.internal.h.a(this.a, ((z) obj).a);
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
            return je.I0(je.V0("SwipeToUnpin(uri="), this.a, ")");
        }
    }

    private YourLibraryXEvent() {
    }

    public YourLibraryXEvent(kotlin.jvm.internal.f fVar) {
    }
}
