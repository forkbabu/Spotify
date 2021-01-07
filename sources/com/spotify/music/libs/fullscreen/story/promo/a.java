package com.spotify.music.libs.fullscreen.story.promo;

import androidx.lifecycle.n;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.u;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import kotlin.Pair;

public final class a implements fjf<FullscreenStoryEncorePromoCardComponent> {
    private final wlf<ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, com.spotify.music.libs.fullscreen.story.promo.encore.a>> a;
    private final wlf<f> b;
    private final wlf<sg0<s81, Pair<b.a, String>>> c;
    private final wlf<Boolean> d;
    private final wlf<l0> e;
    private final wlf<s> f;
    private final wlf<u> g;
    private final wlf<n> h;
    private final wlf<q72> i;

    public a(wlf<ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, com.spotify.music.libs.fullscreen.story.promo.encore.a>> wlf, wlf<f> wlf2, wlf<sg0<s81, Pair<b.a, String>>> wlf3, wlf<Boolean> wlf4, wlf<l0> wlf5, wlf<s> wlf6, wlf<u> wlf7, wlf<n> wlf8, wlf<q72> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static a a(wlf<ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, com.spotify.music.libs.fullscreen.story.promo.encore.a>> wlf, wlf<f> wlf2, wlf<sg0<s81, Pair<b.a, String>>> wlf3, wlf<Boolean> wlf4, wlf<l0> wlf5, wlf<s> wlf6, wlf<u> wlf7, wlf<n> wlf8, wlf<q72> wlf9) {
        return new a(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FullscreenStoryEncorePromoCardComponent(this.a.get(), this.b.get(), this.c.get(), this.d.get().booleanValue(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
