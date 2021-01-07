package com.spotify.music.lyrics.core.experience.model;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: com.spotify.music.lyrics.core.experience.model.b$b  reason: collision with other inner class name */
    public static final class C0304b extends b {
        private final LyricsWrapper a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0304b(LyricsWrapper lyricsWrapper) {
            super(null);
            h.e(lyricsWrapper, "lyricsWrapper");
            this.a = lyricsWrapper;
        }

        public final LyricsWrapper a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0304b) && h.a(this.a, ((C0304b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            LyricsWrapper lyricsWrapper = this.a;
            if (lyricsWrapper != null) {
                return lyricsWrapper.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded(lyricsWrapper=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private b() {
    }

    public b(f fVar) {
    }
}
