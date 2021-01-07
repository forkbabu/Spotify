package defpackage;

import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: gs7  reason: default package */
public abstract class gs7 {

    /* renamed from: gs7$a */
    public static final class a extends gs7 {
        private final ProfileListItem a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProfileListItem profileListItem) {
            super(null);
            kotlin.jvm.internal.h.e(profileListItem, "profileListItem");
            this.a = profileListItem;
        }

        public final ProfileListItem a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ProfileListItem profileListItem = this.a;
            if (profileListItem != null) {
                return profileListItem.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ArtistItemClicked(profileListItem=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: gs7$b */
    public static final class b extends gs7 {
        private final boolean a;

        public b(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
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
            return je.P0(je.V0("CanDownloadPlaylistsChanged(canDownloadPlaylists="), this.a, ")");
        }
    }

    /* renamed from: gs7$c */
    public static final class c extends gs7 {
        private final np7 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(np7 np7) {
            super(null);
            kotlin.jvm.internal.h.e(np7, "data");
            this.a = np7;
        }

        public final np7 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            np7 np7 = this.a;
            if (np7 != null) {
                return np7.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DataChanged(data=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: gs7$d */
    public static final class d extends gs7 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: gs7$e */
    public static final class e extends gs7 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: gs7$f */
    public static final class f extends gs7 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: gs7$g */
    public static final class g extends gs7 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: gs7$h */
    public static final class h extends gs7 {
        private final ProfileListItem a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ProfileListItem profileListItem) {
            super(null);
            kotlin.jvm.internal.h.e(profileListItem, "profileListItem");
            this.a = profileListItem;
        }

        public final ProfileListItem a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ProfileListItem profileListItem = this.a;
            if (profileListItem != null) {
                return profileListItem.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaylistItemClicked(profileListItem=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: gs7$i */
    public static final class i extends gs7 {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    /* renamed from: gs7$j */
    public static final class j extends gs7 {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: gs7$k */
    public static final class k extends gs7 {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    /* renamed from: gs7$l */
    public static final class l extends gs7 {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    private gs7() {
    }

    public gs7(kotlin.jvm.internal.f fVar) {
    }
}
