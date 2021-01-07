package com.spotify.music.features.nowplayingbar.domain;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.jvm.internal.h;

public abstract class c {

    public static final class a extends c {
        private final com.spotify.player.controls.c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.spotify.player.controls.c cVar) {
            super(null);
            h.e(cVar, "command");
            this.a = cVar;
        }

        public final com.spotify.player.controls.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.player.controls.c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ControlPlayer(command=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends c {
        private final String a;
        private final Track b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Track track) {
            super(null);
            h.e(str, "contextUri");
            h.e(track, AppProtocol.TrackData.TYPE_TRACK);
            this.a = str;
            this.b = track;
        }

        public final String a() {
            return this.a;
        }

        public final Track b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Track track = this.b;
            if (track != null) {
                i = track.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HeartTrack(contextUri=");
            V0.append(this.a);
            V0.append(", track=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.music.features.nowplayingbar.domain.c$c  reason: collision with other inner class name */
    public static final class C0236c extends c {
        public static final C0236c a = new C0236c();

        private C0236c() {
            super(null);
        }
    }

    public static final class d extends c {
        private final com.spotify.instrumentation.navigation.logger.c a;

        public d(com.spotify.instrumentation.navigation.logger.c cVar) {
            super(null);
            this.a = cVar;
        }

        public final com.spotify.instrumentation.navigation.logger.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
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
            StringBuilder V0 = je.V0("OpenNowPlayingView(interactionId=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class e extends c {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends c {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public c(kotlin.jvm.internal.f fVar) {
    }
}
