package com.spotify.music.features.nowplayingbar.domain;

public abstract class d {

    public static final class a extends d {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends d {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "connectState");
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConnectStateChanged(connectState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends d {
        private final com.spotify.instrumentation.navigation.logger.c a;

        public c(com.spotify.instrumentation.navigation.logger.c cVar) {
            super(null);
            this.a = cVar;
        }

        public final com.spotify.instrumentation.navigation.logger.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.instrumentation.navigation.logger.c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContentClicked(interactionId=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.music.features.nowplayingbar.domain.d$d  reason: collision with other inner class name */
    public static final class C0237d extends d {
        private final ContentType a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0237d(ContentType contentType) {
            super(null);
            kotlin.jvm.internal.h.e(contentType, "contentType");
            this.a = contentType;
        }

        public final ContentType a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0237d) && kotlin.jvm.internal.h.a(this.a, ((C0237d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ContentType contentType = this.a;
            if (contentType != null) {
                return contentType.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContentTypeChanged(contentType=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class e extends d {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends d {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends d {
        private final com.spotify.instrumentation.navigation.logger.c a;

        public g(com.spotify.instrumentation.navigation.logger.c cVar) {
            super(null);
            this.a = cVar;
        }

        public final com.spotify.instrumentation.navigation.logger.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.instrumentation.navigation.logger.c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NowPlayingBarClicked(interactionId=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class h extends d {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    public static final class i extends d {
        private final h a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(null);
            kotlin.jvm.internal.h.e(hVar, "playerInfo");
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar != null) {
                return hVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayerInfoChanged(playerInfo=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class j extends d {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    public static final class k extends d {
        private final com.spotify.music.sociallistening.models.b a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(com.spotify.music.sociallistening.models.b bVar) {
            super(null);
            kotlin.jvm.internal.h.e(bVar, "socialListeningState");
            this.a = bVar;
        }

        public final com.spotify.music.sociallistening.models.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && kotlin.jvm.internal.h.a(this.a, ((k) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.music.sociallistening.models.b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SocialListeningStateChanged(socialListeningState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private d() {
    }

    public d(kotlin.jvm.internal.f fVar) {
    }
}
