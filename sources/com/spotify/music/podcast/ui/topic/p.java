package com.spotify.music.podcast.ui.topic;

import android.view.ViewGroup;
import com.spotify.music.podcast.ui.topic.o;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface p {

    public static abstract class a {

        /* renamed from: com.spotify.music.podcast.ui.topic.p$a$a  reason: collision with other inner class name */
        public static final class C0332a extends a {
            private final String a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0332a(String str) {
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
        p a(ViewGroup viewGroup);
    }

    public static final class c {
        private final List<o.c> a;

        public c(List<o.c> list) {
            h.e(list, "topicList");
            this.a = list;
        }

        public final List<o.c> a() {
            return this.a;
        }
    }
}
