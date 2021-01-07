package com.spotify.music.libs.fullscreen.story.promo.encore;

import com.spotify.mobile.android.video.l0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        private final String a;
        private final String b;
        private final String c;
        private final int d;
        private final String e;
        private final String f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8) {
            super(null);
            h.e(str, "label");
            h.e(str2, "title");
            h.e(str3, "subTitle");
            h.e(str4, "itemImageUri");
            h.e(str5, "itemImagePlaceholder");
            h.e(str6, "itemImageStyle");
            h.e(str7, "storyImagePlaceholder");
            h.e(str8, "storyImageUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = str4;
            this.f = str8;
        }

        public final int a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.f;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.b;
        }
    }

    /* renamed from: com.spotify.music.libs.fullscreen.story.promo.encore.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0293b extends b {

        /* renamed from: com.spotify.music.libs.fullscreen.story.promo.encore.b$b$a */
        public static final class a extends AbstractC0293b {
            private final l0 a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var) {
                super(null);
                h.e(l0Var, "videoSurfaceManager");
                this.a = l0Var;
            }

            public final l0 a() {
                return this.a;
            }
        }

        /* renamed from: com.spotify.music.libs.fullscreen.story.promo.encore.b$b$b  reason: collision with other inner class name */
        public static final class C0294b extends AbstractC0293b {
            private final l0 a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0294b(l0 l0Var) {
                super(null);
                h.e(l0Var, "videoSurfaceManager");
                this.a = l0Var;
            }

            public final l0 a() {
                return this.a;
            }
        }

        /* renamed from: com.spotify.music.libs.fullscreen.story.promo.encore.b$b$c */
        public static final class c extends AbstractC0293b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public AbstractC0293b(f fVar) {
            super(null);
        }
    }

    private b() {
    }

    public b(f fVar) {
    }
}
