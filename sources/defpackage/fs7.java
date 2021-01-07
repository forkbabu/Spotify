package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: fs7  reason: default package */
public abstract class fs7 {

    /* renamed from: fs7$a */
    public static final class a extends fs7 {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final int e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, boolean z, int i) {
            super(null);
            je.x(str, "username", str2, "displayName", str3, "imageUrl");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = i;
        }

        public final int b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return ((i2 + i3) * 31) + this.e;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NavigateToEditProfile(username=");
            V0.append(this.a);
            V0.append(", displayName=");
            V0.append(this.b);
            V0.append(", imageUrl=");
            V0.append(this.c);
            V0.append(", hasSpotifyImage=");
            V0.append(this.d);
            V0.append(", color=");
            return je.B0(V0, this.e, ")");
        }
    }

    /* renamed from: fs7$b */
    public static final class b extends fs7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
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
            return je.I0(je.V0("NavigateToFollowers(username="), this.a, ")");
        }
    }

    /* renamed from: fs7$c */
    public static final class c extends fs7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String b() {
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
            return je.I0(je.V0("NavigateToFollowing(username="), this.a, ")");
        }
    }

    /* renamed from: fs7$d */
    public static final class d extends fs7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
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
            return je.I0(je.V0("NavigateToPublicPlaylists(username="), this.a, ")");
        }
    }

    /* renamed from: fs7$e */
    public static final class e extends fs7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
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
            return je.I0(je.V0("NavigateToRecentlyPlayedArtists(username="), this.a, ")");
        }
    }

    /* renamed from: fs7$f */
    public static final class f extends fs7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            h.e(str, "uri");
            this.a = str;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
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
            return je.I0(je.V0("NavigateToUri(uri="), this.a, ")");
        }
    }

    /* renamed from: fs7$g */
    public static final class g extends fs7 {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z) {
            super(null);
            h.e(str, "userUri");
            this.a = str;
            this.b = z;
        }

        public final boolean b() {
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
            return h.a(this.a, gVar.a) && this.b == gVar.b;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
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
            StringBuilder V0 = je.V0("SetFollowState(userUri=");
            V0.append(this.a);
            V0.append(", follow=");
            return je.P0(V0, this.b, ")");
        }
    }

    public fs7(kotlin.jvm.internal.f fVar) {
    }

    public static final fs7 a(String str, String str2, String str3, boolean z, int i) {
        h.e(str, "username");
        h.e(str2, "displayName");
        h.e(str3, "imageUrl");
        return new a(str, str2, str3, z, i);
    }
}
