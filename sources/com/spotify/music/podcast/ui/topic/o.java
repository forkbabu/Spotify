package com.spotify.music.podcast.ui.topic;

import android.view.ViewGroup;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface o {

    public static abstract class a {

        /* renamed from: com.spotify.music.podcast.ui.topic.o$a$a  reason: collision with other inner class name */
        public static final class C0331a extends a {
            private final String a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0331a(String str) {
                super(null);
                h.e(str, "uri");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    public interface b {
        o a(ViewGroup viewGroup);
    }

    public static final class c {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            h.e(str, "uri");
            h.e(str2, "text");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }
}
