package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mo2  reason: default package */
public final class mo2 {
    private static Drawable a(Context context, Drawable drawable) {
        Drawable d = a.d(context, C0707R.drawable.car_mode_selected_icon_indicator_dot);
        int intrinsicWidth = (drawable.getIntrinsicWidth() - d.getIntrinsicWidth()) / 2;
        int g = nud.g(6.0f, context.getResources()) + drawable.getIntrinsicHeight();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, d});
        layerDrawable.setLayerInset(1, intrinsicWidth, g, intrinsicWidth, 0);
        return layerDrawable;
    }

    private static SpotifyIconDrawable b(Context context, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.car_now_playing_mode_button_icon_size));
        spotifyIconDrawable.s(a.c(context, C0707R.color.btn_car_mode_now_playing_white));
        return spotifyIconDrawable;
    }

    public static Drawable c(Context context) {
        context.getClass();
        SpotifyIconDrawable b = b(context, SpotifyIconV2.HEART_ACTIVE);
        SpotifyIconDrawable b2 = b(context, SpotifyIconV2.HEART);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, b);
        stateListDrawable.addState(StateSet.WILD_CARD, b2);
        return stateListDrawable;
    }

    public static Drawable d(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.BLOCK);
    }

    public static Drawable e(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.SKIP_FORWARD);
    }

    public static SpotifyIconDrawable f(Context context) {
        return b(context, SpotifyIconV2.PAUSE);
    }

    public static SpotifyIconDrawable g(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.PLAY);
    }

    public static Drawable h(Context context, int i) {
        context.getClass();
        Drawable b = i0.b(context, i);
        b.getClass();
        Drawable l = androidx.core.graphics.drawable.a.l(b);
        androidx.core.graphics.drawable.a.i(l, a.c(context, C0707R.color.btn_car_mode_now_playing_white));
        return l;
    }

    public static Drawable i(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.SKIP_BACK);
    }

    public static Drawable j(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIconV2.REPEAT));
    }

    public static Drawable k(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.REPEAT);
    }

    public static Drawable l(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIconV2.REPEATONCE));
    }

    public static Drawable m(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.SKIPBACK15);
    }

    public static Drawable n(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.SKIPFORWARD15);
    }

    public static Drawable o(Context context) {
        context.getClass();
        return a(context, b(context, SpotifyIconV2.SHUFFLE));
    }

    public static Drawable p(Context context) {
        context.getClass();
        return b(context, SpotifyIconV2.SHUFFLE);
    }

    public static Drawable q(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        context.getClass();
        SpotifyIconDrawable b = b(context, SpotifyIconV2.MIC);
        stateListDrawable.addState(new int[]{-16842910}, i0.b(context, C0707R.drawable.ic_voice_search_offline_32));
        stateListDrawable.addState(StateSet.WILD_CARD, b);
        return stateListDrawable;
    }
}
