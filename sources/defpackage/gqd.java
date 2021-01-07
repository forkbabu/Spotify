package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: gqd  reason: default package */
public final class gqd {
    public static Drawable A(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIcon.SLEEPTIMER_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size)));
    }

    public static Drawable B(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.SLEEPTIMER_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size));
    }

    private static Drawable a(Context context, Drawable drawable) {
        Drawable d = a.d(context, C0707R.drawable.selected_icon_indicator_dot);
        d.getClass();
        Drawable l = androidx.core.graphics.drawable.a.l(d);
        androidx.core.graphics.drawable.a.i(l, a.c(context, C0707R.color.btn_now_playing_green));
        int intrinsicWidth = (drawable.getIntrinsicWidth() - l.getIntrinsicWidth()) / 2;
        int g = nud.g(6.0f, context.getResources()) + drawable.getIntrinsicHeight();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, l});
        layerDrawable.setLayerInset(1, intrinsicWidth, g, intrinsicWidth, 0);
        return layerDrawable;
    }

    private static Drawable b(Context context, SpotifyIcon spotifyIcon, int i) {
        return e(context, spotifyIcon, i, a.c(context, C0707R.color.btn_now_playing_green));
    }

    private static Drawable c(Context context, SpotifyIcon spotifyIcon, int i) {
        return e(context, spotifyIcon, i, a.c(context, C0707R.color.btn_now_playing_white));
    }

    private static Drawable d(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        ColorStateList c = a.c(context, C0707R.color.btn_now_playing_white);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.s(c);
        return spotifyIconDrawable;
    }

    private static Drawable e(Context context, SpotifyIcon spotifyIcon, int i, ColorStateList colorStateList) {
        context.getClass();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIcon, (float) i);
        spotifyIconDrawable.s(colorStateList);
        return spotifyIconDrawable;
    }

    public static c f(Context context, int i, int i2, float f) {
        context.getClass();
        return h(context, i, i2, SpotifyIcon.PAUSE_32, C0707R.color.btn_now_playing_black, f);
    }

    public static c g(Context context, int i, int i2, float f) {
        context.getClass();
        return h(context, i, i2, SpotifyIcon.PLAY_32, C0707R.color.btn_now_playing_black, f);
    }

    private static c h(Context context, int i, int i2, SpotifyIcon spotifyIcon, int i3, float f) {
        context.getClass();
        ColorStateList c = a.c(context, i3);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIcon, (float) nud.g((float) i, context.getResources()));
        spotifyIconDrawable.s(c);
        ColorStateList c2 = a.c(context, i3);
        c cVar = new c(spotifyIconDrawable, f);
        cVar.f((float) nud.g((float) i2, context.getResources()));
        cVar.e(c2);
        cVar.b(a.b(context, C0707R.color.pasteTransparent));
        return cVar;
    }

    public static Drawable i(Context context) {
        context.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.npb_side_action_button_drawable_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.HEART_ACTIVE;
        ColorStateList c = a.c(context, C0707R.color.btn_now_playing_green);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) dimensionPixelSize);
        spotifyIconDrawable.s(c);
        Drawable d = d(context, SpotifyIconV2.HEART, dimensionPixelSize);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, d);
        return stateListDrawable;
    }

    public static Drawable j(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.SKIP_FORWARD_32, nud.g(24.0f, context.getResources()));
    }

    public static Drawable k(Context context) {
        context.getClass();
        return e(context, SpotifyIcon.SKIP_FORWARD_32, nud.g(24.0f, context.getResources()), a.c(context, C0707R.color.btn_now_playing_gray_disabled));
    }

    public static c l(Context context, int i, int i2, float f) {
        context.getClass();
        return h(context, i, i2, SpotifyIcon.PAUSE_32, C0707R.color.btn_now_playing_white, f);
    }

    public static Drawable m(Context context) {
        context.getClass();
        return h(context, 60, 1, SpotifyIcon.PAUSE_32, C0707R.color.btn_now_playing_white, 0.6f);
    }

    public static Drawable n(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.PAUSE_32, context.getResources().getDimensionPixelSize(C0707R.dimen.npb_side_action_button_drawable_size));
    }

    public static c o(Context context, int i, int i2, float f) {
        context.getClass();
        return h(context, i, i2, SpotifyIcon.PLAY_32, C0707R.color.btn_now_playing_white, f);
    }

    public static Drawable p(Context context) {
        context.getClass();
        return h(context, 60, 1, SpotifyIcon.PLAY_32, C0707R.color.btn_now_playing_white, 0.6f);
    }

    public static Drawable q(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.PLAY_32, context.getResources().getDimensionPixelSize(C0707R.dimen.npb_side_action_button_drawable_size));
    }

    public static Drawable r(Context context) {
        context.getClass();
        return d(context, SpotifyIconV2.SKIPBACK15, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size));
    }

    public static Drawable s(Context context) {
        context.getClass();
        return d(context, SpotifyIconV2.SKIPFORWARD15, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size));
    }

    public static Drawable t(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.SKIP_BACK_32, nud.g(24.0f, context.getResources()));
    }

    public static Drawable u(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.QUEUE_24, nud.g(24.0f, context.getResources()));
    }

    public static Drawable v(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIcon.REPEAT_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size)));
    }

    public static Drawable w(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.REPEAT_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size));
    }

    public static Drawable x(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIcon.REPEATONCE_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size)));
    }

    public static Drawable y(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIcon.SHUFFLE_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size)));
    }

    public static Drawable z(Context context) {
        context.getClass();
        return c(context, SpotifyIcon.SHUFFLE_32, context.getResources().getDimensionPixelSize(C0707R.dimen.player_side_action_button_drawable_size));
    }
}
