package defpackage;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import com.spotify.podcastinteractivity.qna.model.proto.UserStatus;

/* renamed from: xtc  reason: default package */
public abstract class xtc {

    /* renamed from: xtc$a */
    public static final class a extends xtc {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: xtc$b */
    public static final class b extends xtc {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: xtc$c */
    public static final class c extends xtc {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: xtc$d */
    public static final class d extends xtc {
        private final auc a;

        public d() {
            this(null, 1);
        }

        public d(auc auc) {
            super(null);
            this.a = auc;
        }

        public final auc a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            auc auc = this.a;
            if (auc != null) {
                return auc.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PodcastQnAChanged(podcastQnAState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(auc auc, int i) {
            this(null);
            int i2 = i & 1;
        }
    }

    /* renamed from: xtc$e */
    public static final class e extends xtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "draft");
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
            return je.I0(je.V0("PodcastQnADraftChanged(draft="), this.a, ")");
        }
    }

    /* renamed from: xtc$f */
    public static final class f extends xtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
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
            return je.I0(je.V0("PodcastQnARequested(episodeUri="), this.a, ")");
        }
    }

    /* renamed from: xtc$g */
    public static final class g extends xtc {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "textToSend");
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
            return je.I0(je.V0("ReplyQnA(textToSend="), this.a, ")");
        }
    }

    /* renamed from: xtc$h */
    public static final class h extends xtc {
        private final auc a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(auc auc) {
            super(null);
            kotlin.jvm.internal.h.e(auc, "podcastQnAState");
            this.a = auc;
        }

        public final auc a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            auc auc = this.a;
            if (auc != null) {
                return auc.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ReplySentSuccessfully(podcastQnAState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: xtc$i */
    public static final class i extends xtc {
        private final IdentityV3$UserProfile a;

        public i() {
            super(null);
            this.a = null;
        }

        public final IdentityV3$UserProfile a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            IdentityV3$UserProfile identityV3$UserProfile = this.a;
            if (identityV3$UserProfile != null) {
                return identityV3$UserProfile.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserProfileChanged(userProfile=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public i(IdentityV3$UserProfile identityV3$UserProfile) {
            super(null);
            this.a = identityV3$UserProfile;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(IdentityV3$UserProfile identityV3$UserProfile, int i) {
            super(null);
            int i2 = i & 1;
            this.a = null;
        }
    }

    /* renamed from: xtc$j */
    public static final class j extends xtc {
        private final UserStatus a;

        public j() {
            super(null);
            this.a = null;
        }

        public final UserStatus a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
            }
            return true;
        }

        public int hashCode() {
            UserStatus userStatus = this.a;
            if (userStatus != null) {
                return userStatus.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserStatusChanged(userStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public j(UserStatus userStatus) {
            super(null);
            this.a = userStatus;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(UserStatus userStatus, int i) {
            super(null);
            int i2 = i & 1;
            this.a = null;
        }
    }

    private xtc() {
    }

    public xtc(kotlin.jvm.internal.f fVar) {
    }
}
