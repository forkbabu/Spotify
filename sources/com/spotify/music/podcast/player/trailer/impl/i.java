package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.model.ContextTrack;
import io.reactivex.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface i {

    public static abstract class a {

        /* renamed from: com.spotify.music.podcast.player.trailer.impl.i$a$a  reason: collision with other inner class name */
        public static final class C0329a extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0329a(String str) {
                super(null);
                h.e(str, "reason");
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    z<a> a(ContextTrack contextTrack);
}
