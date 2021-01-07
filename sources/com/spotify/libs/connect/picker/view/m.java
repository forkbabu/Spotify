package com.spotify.libs.connect.picker.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

public class m {
    private static final Map<String, Drawable> d = new HashMap(8);
    private final Context a;
    private final int b;
    private int c;

    public m(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        this.c = i2;
    }

    public static void a() {
        d.clear();
    }

    private static Drawable b(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        String str = spotifyIconV2.name() + '_' + i + '_' + i2;
        Map<String, Drawable> map = d;
        Drawable drawable = map.get(str);
        if (drawable != null) {
            return drawable;
        }
        ColorStateList c2 = a.c(context, i2);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(32.0f, context.getResources()));
        spotifyIconDrawable.s(c2);
        spotifyIconDrawable.w((float) i);
        map.put(str, spotifyIconDrawable);
        return spotifyIconDrawable;
    }

    public Drawable c() {
        return b(this.a, SpotifyIconV2.CHROMECAST_CONNECTED, this.b, this.c);
    }

    public Drawable d(View view) {
        Drawable b2 = b(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_ONE, this.b, this.c);
        Drawable b3 = b(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_TWO, this.b, this.c);
        Drawable b4 = b(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_THREE, this.b, this.c);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(b2, 500);
        animationDrawable.addFrame(b3, 500);
        animationDrawable.addFrame(b4, 500);
        animationDrawable.addFrame(b3, 500);
        animationDrawable.setOneShot(false);
        view.getViewTreeObserver().addOnPreDrawListener(new l(new a(animationDrawable), view));
        int i = this.b;
        animationDrawable.setBounds(i, i, i, i);
        Drawable b5 = b(this.a, SpotifyIconV2.CHROMECAST_DISCONNECTED, this.b, this.c);
        b5.setAlpha(128);
        return new LayerDrawable(new Drawable[]{animationDrawable, b5});
    }

    public Drawable e() {
        return b(this.a, SpotifyIconV2.CHROMECAST_DISCONNECTED, this.b, this.c);
    }

    public Drawable f() {
        return b(this.a, SpotifyIconV2.SPOTIFY_CONNECT, this.b, this.c);
    }

    public Drawable g() {
        return b(this.a, SpotifyIconV2.DEVICE_OTHER, this.b, this.c);
    }

    public void h(int i) {
        this.c = i;
    }
}
