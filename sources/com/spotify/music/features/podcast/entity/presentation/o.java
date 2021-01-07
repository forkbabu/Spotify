package com.spotify.music.features.podcast.entity.presentation;

public class o implements yhc {
    private final t8a a;
    private final v57 b;

    public o(t8a t8a, v57 v57) {
        this.a = t8a;
        this.b = v57;
    }

    @Override // defpackage.yhc
    public void a(String str, boolean z) {
        if (z) {
            this.a.f(str, true);
            this.b.b();
            return;
        }
        this.a.a(str, str, true);
        this.b.a();
    }
}
