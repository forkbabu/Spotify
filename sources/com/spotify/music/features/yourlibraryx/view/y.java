package com.spotify.music.features.yourlibraryx.view;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class y {

    public static final class a extends y {
        private final YourLibraryResponseProto$YourLibraryResponseEntity a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity, boolean z) {
            super(null);
            h.e(yourLibraryResponseProto$YourLibraryResponseEntity, "entity");
            this.a = yourLibraryResponseProto$YourLibraryResponseEntity;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final YourLibraryResponseProto$YourLibraryResponseEntity b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity = this.a;
            int hashCode = (yourLibraryResponseProto$YourLibraryResponseEntity != null ? yourLibraryResponseProto$YourLibraryResponseEntity.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Entity(entity=");
            V0.append(this.a);
            V0.append(", dismissible=");
            return je.P0(V0, this.b, ")");
        }
    }

    public static final class b extends y {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends y {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "title");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
            return je.I0(je.V0("SectionHeader(title="), this.a, ")");
        }
    }

    public static final class d extends y {
        private final YourLibraryXSortOption a;
        private final YourLibraryXViewMode b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(YourLibraryXSortOption yourLibraryXSortOption, YourLibraryXViewMode yourLibraryXViewMode) {
            super(null);
            h.e(yourLibraryXSortOption, "sortOption");
            h.e(yourLibraryXViewMode, "nextViewMode");
            this.a = yourLibraryXSortOption;
            this.b = yourLibraryXViewMode;
        }

        public final YourLibraryXViewMode a() {
            return this.b;
        }

        public final YourLibraryXSortOption b() {
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
            return h.a(this.a, dVar.a) && h.a(this.b, dVar.b);
        }

        public int hashCode() {
            YourLibraryXSortOption yourLibraryXSortOption = this.a;
            int i = 0;
            int hashCode = (yourLibraryXSortOption != null ? yourLibraryXSortOption.hashCode() : 0) * 31;
            YourLibraryXViewMode yourLibraryXViewMode = this.b;
            if (yourLibraryXViewMode != null) {
                i = yourLibraryXViewMode.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SortOptions(sortOption=");
            V0.append(this.a);
            V0.append(", nextViewMode=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    private y() {
    }

    public y(f fVar) {
    }
}
