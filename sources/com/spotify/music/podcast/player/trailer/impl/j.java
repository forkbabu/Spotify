package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class j {

    public static final class a extends j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "reason");
        }
    }

    public static final class b extends j {
        private final String a;
        private final Context b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Context context) {
            super(null);
            h.e(str, "trailerUri");
            h.e(context, "playerContext");
            this.a = str;
            this.b = context;
        }

        public final Context a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    public static final class c extends j {
        private final ContextTrack a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ContextTrack contextTrack) {
            super(null);
            h.e(contextTrack, "trailerTrack");
            this.a = contextTrack;
        }

        public final ContextTrack a() {
            return this.a;
        }
    }

    public static final class d extends j {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            h.e(str, "trailerUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    public static final class e extends j {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            h.e(str, "trailerUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    private j() {
    }

    public j(f fVar) {
    }
}
