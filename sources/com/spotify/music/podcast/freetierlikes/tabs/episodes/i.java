package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class i {

    public static final class a extends i {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            h.e(str, "message");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    public static final class b extends i {
        private final com.spotify.playlist.models.i<Episode> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.spotify.playlist.models.i<Episode> iVar) {
            super(null);
            h.e(iVar, "items");
            this.a = iVar;
        }

        public final com.spotify.playlist.models.i<Episode> a() {
            return this.a;
        }
    }

    private i() {
    }

    public i(f fVar) {
    }
}
