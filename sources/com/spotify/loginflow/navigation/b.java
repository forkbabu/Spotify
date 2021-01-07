package com.spotify.loginflow.navigation;

import com.spotify.music.C0707R;

public final class b {
    private final a a;

    public static final class a {
        public a(int i, int i2, int i3, int i4) {
        }

        public final int a() {
            return C0707R.anim.nav_slide_in_right;
        }

        public final int b() {
            return C0707R.anim.nav_slide_out_left;
        }

        public final int c() {
            return C0707R.anim.nav_slide_in_left;
        }

        public final int d() {
            return C0707R.anim.nav_slide_out_right;
        }
    }

    public b(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }
}
