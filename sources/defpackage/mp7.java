package defpackage;

import com.spotify.music.features.profile.proto.ProfilemodelRequest$Profile;

/* renamed from: mp7  reason: default package */
public abstract class mp7 {

    /* renamed from: mp7$a */
    public static final class a extends mp7 {
        private final ProfilemodelRequest$Profile a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProfilemodelRequest$Profile profilemodelRequest$Profile) {
            super(null);
            kotlin.jvm.internal.h.e(profilemodelRequest$Profile, "profile");
            this.a = profilemodelRequest$Profile;
        }

        public final ProfilemodelRequest$Profile a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ProfilemodelRequest$Profile profilemodelRequest$Profile = this.a;
            if (profilemodelRequest$Profile != null) {
                return profilemodelRequest$Profile.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("BackendProfileData(profile=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: mp7$b */
    public static final class b extends mp7 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: mp7$c */
    public static final class c extends mp7 {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(str, "displayName");
            kotlin.jvm.internal.h.e(str2, "imageUrl");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.h.a(this.a, cVar.a) && kotlin.jvm.internal.h.a(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CoreProfileData(displayName=");
            V0.append(this.a);
            V0.append(", imageUrl=");
            V0.append(this.b);
            V0.append(", hasSpotifyImage=");
            return je.P0(V0, this.c, ")");
        }
    }

    /* renamed from: mp7$d */
    public static final class d extends mp7 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: mp7$e */
    public static final class e extends mp7 {
        private final ct7 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ct7 ct7) {
            super(null);
            kotlin.jvm.internal.h.e(ct7, "followState");
            this.a = ct7;
        }

        public final ct7 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ct7 ct7 = this.a;
            if (ct7 != null) {
                return ct7.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowStateReceived(followState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: mp7$f */
    public static final class f extends mp7 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: mp7$g */
    public static final class g extends mp7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "url");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
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
            return je.I0(je.V0("ReportAbuseUrl(url="), this.a, ")");
        }
    }

    /* renamed from: mp7$h */
    public static final class h extends mp7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "url");
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
            return je.I0(je.V0("ReportAbuseWebTokenUrl(url="), this.a, ")");
        }
    }

    private mp7() {
    }

    public mp7(kotlin.jvm.internal.f fVar) {
    }
}
