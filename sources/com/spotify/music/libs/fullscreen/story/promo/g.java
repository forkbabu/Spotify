package com.spotify.music.libs.fullscreen.story.promo;

import kotlin.jvm.internal.h;

public final class g implements f {
    private final a71 a;
    private final a71 b;

    public g(a71 a71, a71 a712) {
        h.e(a71, "navigationCommandHandler");
        h.e(a712, "storyClickCommandHandler");
        this.a = a71;
        this.b = a712;
    }

    @Override // com.spotify.music.libs.fullscreen.story.promo.f
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("click");
        if (o81 != null) {
            n61 b2 = n61.b("click", s81);
            if (!(!h.a(o81.name(), "navigate"))) {
                this.a.b(o81, b2);
            }
        }
    }

    @Override // com.spotify.music.libs.fullscreen.story.promo.f
    public void b(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("storyClick");
        if (o81 != null) {
            n61 b2 = n61.b("storyClick", s81);
            if (!(!h.a(o81.name(), "storyClick"))) {
                this.b.b(o81, b2);
            }
        }
    }
}
