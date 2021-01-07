package com.spotify.music.podcast.player.trailer.impl;

import io.reactivex.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface k {

    public static abstract class a {

        /* renamed from: com.spotify.music.podcast.player.trailer.impl.k$a$a  reason: collision with other inner class name */
        public static final class C0330a extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0330a(String str) {
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

        public a(f fVar) {
        }
    }

    z<a> a(j jVar);
}
