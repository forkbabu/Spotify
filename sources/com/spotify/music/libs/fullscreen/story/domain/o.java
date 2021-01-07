package com.spotify.music.libs.fullscreen.story.domain;

import com.spotify.mobile.android.video.exception.BetamaxException;
import kotlin.jvm.internal.h;

public abstract class o {

    public static final class a extends o {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends o {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends o {
        private final BetamaxException a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BetamaxException betamaxException) {
            super(null);
            h.e(betamaxException, "exception");
            this.a = betamaxException;
        }

        public final BetamaxException a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            BetamaxException betamaxException = this.a;
            if (betamaxException != null) {
                return betamaxException.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(exception=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends o {
        private final long a;
        private final long b;

        public d(long j, long j2) {
            super(null);
            this.a = j;
            this.b = j2;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
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
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (defpackage.e.a(this.a) * 31) + defpackage.e.a(this.b);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaybackPositionChanged(playbackPositionMs=");
            V0.append(this.a);
            V0.append(", playbackDurationMs=");
            return je.E0(V0, this.b, ")");
        }
    }

    public static final class e extends o {
        private final BetamaxException a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BetamaxException betamaxException) {
            super(null);
            h.e(betamaxException, "exception");
            this.a = betamaxException;
        }

        public final BetamaxException a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            BetamaxException betamaxException = this.a;
            if (betamaxException != null) {
                return betamaxException.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("RecoverableError(exception=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class f extends o {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends o {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    private o() {
    }

    public o(kotlin.jvm.internal.f fVar) {
    }
}
