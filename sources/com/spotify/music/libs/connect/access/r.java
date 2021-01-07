package com.spotify.music.libs.connect.access;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class r {
    private final int a;
    private final Drawable b;
    private final SpotifyIconDrawable c;
    private final SpotifyIconDrawable d;
    private final a e;
    private final a f;

    public static class a {
        private final Drawable a;
        private final AnimationDrawable b;

        a(Drawable drawable, AnimationDrawable animationDrawable) {
            this.b = animationDrawable;
            this.a = drawable;
        }

        public AnimationDrawable a() {
            return this.b;
        }

        public Drawable b() {
            return this.a;
        }
    }

    public r(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.connect_access_button_icon_size);
        this.a = dimensionPixelSize;
        Drawable mutate = androidx.core.content.a.d(context, C0707R.drawable.ic_connect_connecting_3).mutate();
        int i = R.color.white;
        androidx.core.graphics.drawable.a.h(mutate, androidx.core.content.a.b(context, i));
        this.b = mutate;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DEVICE_OTHER;
        int i2 = R.color.black;
        this.c = a(context, spotifyIconV2, i2);
        this.d = a(context, SpotifyIconV2.CHROMECAST_CONNECTED, i);
        SpotifyIconDrawable a2 = a(context, SpotifyIconV2.CHROMECAST_DISCONNECTED, i2);
        a2.setAlpha(77);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        SpotifyIconDrawable a3 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_ONE, i2);
        SpotifyIconDrawable a4 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_TWO, i2);
        SpotifyIconDrawable a5 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_THREE, i2);
        animationDrawable.addFrame(a3, 333);
        animationDrawable.addFrame(a4, 333);
        animationDrawable.addFrame(a5, 333);
        animationDrawable.addFrame(a4, 333);
        animationDrawable.setOneShot(false);
        animationDrawable.setBounds(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.e = new a(new LayerDrawable(new Drawable[]{animationDrawable, a2}), animationDrawable);
        Drawable d2 = androidx.core.content.a.d(context, C0707R.drawable.ic_connect_connecting_3);
        if (d2 != null) {
            d2.mutate().setAlpha(77);
        }
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        Drawable d3 = androidx.core.content.a.d(context, C0707R.drawable.ic_connect_connecting_1);
        Drawable d4 = androidx.core.content.a.d(context, C0707R.drawable.ic_connect_connecting_2);
        Drawable d5 = androidx.core.content.a.d(context, C0707R.drawable.ic_connect_connecting_3);
        if (!(d3 == null || d4 == null || d5 == null)) {
            animationDrawable2.addFrame(d3, 333);
            animationDrawable2.addFrame(d4, 333);
            animationDrawable2.addFrame(d5, 333);
            animationDrawable2.addFrame(d4, 333);
        }
        animationDrawable2.setOneShot(false);
        animationDrawable2.setBounds(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f = new a(new LayerDrawable(new Drawable[]{animationDrawable2, d2}), animationDrawable2);
    }

    private SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) this.a);
        spotifyIconDrawable.r(androidx.core.content.a.b(context, i));
        spotifyIconDrawable.w((float) this.a);
        return spotifyIconDrawable;
    }

    public SpotifyIconDrawable b() {
        return this.d;
    }

    public a c() {
        return this.e;
    }

    public a d() {
        return this.f;
    }

    public Drawable e() {
        return this.b;
    }

    public SpotifyIconDrawable f() {
        return this.c;
    }
}
