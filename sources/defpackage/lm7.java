package defpackage;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;

/* renamed from: lm7  reason: default package */
public abstract class lm7 {

    /* renamed from: lm7$a */
    public static final class a extends lm7 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: lm7$b */
    public static final class b extends lm7 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: lm7$c */
    public static final class c extends lm7 {
        private final EditProfilePermissionsManager.PermissionStatus a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(EditProfilePermissionsManager.PermissionStatus permissionStatus) {
            super(null);
            kotlin.jvm.internal.h.e(permissionStatus, "permissionStatus");
            this.a = permissionStatus;
        }

        public final EditProfilePermissionsManager.PermissionStatus a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            EditProfilePermissionsManager.PermissionStatus permissionStatus = this.a;
            if (permissionStatus != null) {
                return permissionStatus.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CameraPermissionChecked(permissionStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lm7$d */
    public static final class d extends lm7 {
        private final boolean a;

        public d(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
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
            return je.P0(je.V0("CameraPermissionRequestResult(allowed="), this.a, ")");
        }
    }

    /* renamed from: lm7$e */
    public static final class e extends lm7 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: lm7$f */
    public static final class f extends lm7 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: lm7$g */
    public static final class g extends lm7 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: lm7$h */
    public static final class h extends lm7 {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: lm7$i */
    public static final class i extends lm7 {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    /* renamed from: lm7$j */
    public static final class j extends lm7 {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: lm7$k */
    public static final class k extends lm7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "displayName");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && kotlin.jvm.internal.h.a(this.a, ((k) obj).a);
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
            return je.I0(je.V0("DisplayNameChanged(displayName="), this.a, ")");
        }
    }

    /* renamed from: lm7$l */
    public static final class l extends lm7 {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: lm7$m */
    public static final class m extends lm7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "imageUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof m) && kotlin.jvm.internal.h.a(this.a, ((m) obj).a);
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
            return je.I0(je.V0("ImageChanged(imageUri="), this.a, ")");
        }
    }

    /* renamed from: lm7$n */
    public static final class n extends lm7 {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    /* renamed from: lm7$o */
    public static final class o extends lm7 {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    /* renamed from: lm7$p */
    public static final class p extends lm7 {
        public static final p a = new p();

        private p() {
            super(null);
        }
    }

    /* renamed from: lm7$q */
    public static final class q extends lm7 {
        private final EditProfilePermissionsManager.PermissionStatus a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(EditProfilePermissionsManager.PermissionStatus permissionStatus) {
            super(null);
            kotlin.jvm.internal.h.e(permissionStatus, "permissionStatus");
            this.a = permissionStatus;
        }

        public final EditProfilePermissionsManager.PermissionStatus a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof q) && kotlin.jvm.internal.h.a(this.a, ((q) obj).a);
            }
            return true;
        }

        public int hashCode() {
            EditProfilePermissionsManager.PermissionStatus permissionStatus = this.a;
            if (permissionStatus != null) {
                return permissionStatus.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ReadExternalStoragePermissionChecked(permissionStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lm7$r */
    public static final class r extends lm7 {
        private final boolean a;

        public r(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof r) && this.a == ((r) obj).a;
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
            return je.P0(je.V0("ReadExternalStoragePermissionRequestResult(allowed="), this.a, ")");
        }
    }

    /* renamed from: lm7$s */
    public static final class s extends lm7 {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    /* renamed from: lm7$t */
    public static final class t extends lm7 {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    /* renamed from: lm7$u */
    public static final class u extends lm7 {
        public static final u a = new u();

        private u() {
            super(null);
        }
    }

    /* renamed from: lm7$v */
    public static final class v extends lm7 {
        private final com.spotify.music.features.profile.saveprofile.domain.r a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(com.spotify.music.features.profile.saveprofile.domain.r rVar) {
            super(null);
            kotlin.jvm.internal.h.e(rVar, "saveProfileStatus");
            this.a = rVar;
        }

        public final com.spotify.music.features.profile.saveprofile.domain.r a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof v) && kotlin.jvm.internal.h.a(this.a, ((v) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.music.features.profile.saveprofile.domain.r rVar = this.a;
            if (rVar != null) {
                return rVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveProfileStatus(saveProfileStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lm7$w */
    public static final class w extends lm7 {
        public static final w a = new w();

        private w() {
            super(null);
        }
    }

    private lm7() {
    }

    public lm7(kotlin.jvm.internal.f fVar) {
    }
}
