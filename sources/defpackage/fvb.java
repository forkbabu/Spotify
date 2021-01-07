package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.playpause.TransparentPlayPauseDrawable;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fvb  reason: default package */
public final class fvb {
    public static boolean A(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        if (PlayerTrackUtil.isAd(playerTrack) || PlayerTrackUtil.isInterruptionFromAds(playerTrack) || InterruptionUtil.isInterruptionUri(playerTrack.uri())) {
            return true;
        }
        return false;
    }

    private static ColorStateList a(Context context) {
        return new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{16842919}}, new int[]{a.b(context, C0707R.color.glue_button_primary_white_background_default), a.b(context, C0707R.color.glue_button_primary_white_background_disabled), a.b(context, C0707R.color.glue_button_primary_white_background_pressed)});
    }

    public static Drawable b(Context context) {
        return c(context, R.color.white_10);
    }

    public static Drawable c(Context context, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a.b(context, i)));
        return stateListDrawable;
    }

    public static Drawable d(Context context) {
        return s(context, SpotifyIconV2.BLUETOOTH, context.getResources().getDimensionPixelSize(C0707R.dimen.std_14dp), R.color.white);
    }

    public static Drawable e(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BAN_ACTIVE;
        float f = (float) dimensionPixelSize;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, spotifyIconV2, f);
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.BAN;
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, spotifyIconV22, f);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, spotifyIconV22, f);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context, spotifyIconV22, f);
        spotifyIconDrawable.r(a.b(context, R.color.red));
        spotifyIconDrawable2.r(a.b(context, R.color.red_light));
        spotifyIconDrawable3.r(a.b(context, R.color.white));
        spotifyIconDrawable4.r(a.b(context, R.color.white_70));
        spotifyIconDrawable5.r(a.b(context, R.color.white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable5);
        stateListDrawable.addState(new int[0], spotifyIconDrawable4);
        return x(context, stateListDrawable, C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable f(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHEVRON_DOWN_24, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size));
        spotifyIconDrawable.r(a.b(context, C0707R.color.btn_now_playing_white));
        return x(context, spotifyIconDrawable, C0707R.dimen.driving_top_bar_icons_padding_percent);
    }

    public static Drawable g(Context context) {
        return s(context, SpotifyIconV2.DEVICE_CAR, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), R.color.white);
    }

    public static Drawable h(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.HEART_ACTIVE;
        SpotifyIconDrawable s = s(context, spotifyIconV2, dimensionPixelSize, R.color.green);
        SpotifyIconDrawable s2 = s(context, spotifyIconV2, dimensionPixelSize, R.color.green_light);
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.HEART;
        SpotifyIconDrawable s3 = s(context, spotifyIconV22, dimensionPixelSize, R.color.white);
        SpotifyIconDrawable s4 = s(context, spotifyIconV22, dimensionPixelSize, R.color.white_70);
        SpotifyIconDrawable s5 = s(context, spotifyIconV22, dimensionPixelSize, R.color.white_50);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, s);
        stateListDrawable.addState(new int[]{16843518, 16842919, 16842910}, s2);
        stateListDrawable.addState(new int[]{16843518}, s);
        stateListDrawable.addState(new int[]{16842919, 16842910}, s4);
        stateListDrawable.addState(new int[]{-16842910}, s5);
        stateListDrawable.addState(new int[0], s3);
        return x(context, stateListDrawable, C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable i(Context context) {
        return x(context, t(context, SpotifyIconV2.SKIP_FORWARD, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), a(context)), C0707R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable j(Context context) {
        return x(context, t(context, SpotifyIconV2.SKIP_FORWARD, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), a(context)), C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable k(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        int i = R.color.white;
        TransparentPlayPauseDrawable.InnerShape innerShape = TransparentPlayPauseDrawable.InnerShape.PAUSE;
        TransparentPlayPauseDrawable transparentPlayPauseDrawable = new TransparentPlayPauseDrawable(context, i, innerShape, dimensionPixelSize);
        int i2 = R.color.white_70;
        TransparentPlayPauseDrawable transparentPlayPauseDrawable2 = new TransparentPlayPauseDrawable(context, i2, innerShape, dimensionPixelSize);
        TransparentPlayPauseDrawable.InnerShape innerShape2 = TransparentPlayPauseDrawable.InnerShape.PLAY;
        TransparentPlayPauseDrawable transparentPlayPauseDrawable3 = new TransparentPlayPauseDrawable(context, i, innerShape2, dimensionPixelSize);
        TransparentPlayPauseDrawable transparentPlayPauseDrawable4 = new TransparentPlayPauseDrawable(context, i2, innerShape2, dimensionPixelSize);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842919, 16842910}, transparentPlayPauseDrawable2);
        stateListDrawable.addState(new int[]{16843518, 16842910}, transparentPlayPauseDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, transparentPlayPauseDrawable4);
        stateListDrawable.addState(new int[]{16842910}, transparentPlayPauseDrawable3);
        stateListDrawable.addState(new int[]{16843518}, transparentPlayPauseDrawable);
        stateListDrawable.addState(new int[0], transparentPlayPauseDrawable3);
        return x(context, stateListDrawable, C0707R.dimen.driving_play_pause_icon_padding_percent);
    }

    public static Drawable l(Context context) {
        return x(context, t(context, SpotifyIconV2.SKIP_BACK, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), a(context)), C0707R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable m(Context context) {
        return x(context, t(context, SpotifyIconV2.SKIP_BACK, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), a(context)), C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable n(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DEVICE_CAR;
        SpotifyIconDrawable s = s(context, spotifyIconV2, dimensionPixelSize, R.color.white);
        int i = R.color.white_40;
        SpotifyIconDrawable s2 = s(context, spotifyIconV2, dimensionPixelSize, i);
        SpotifyIconDrawable s3 = s(context, spotifyIconV2, dimensionPixelSize, i);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, s3);
        stateListDrawable.addState(new int[]{16842919}, s2);
        stateListDrawable.addState(new int[0], s);
        return x(context, stateListDrawable, C0707R.dimen.driving_top_bar_icons_padding_percent);
    }

    public static Drawable o(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SHUFFLE;
        SpotifyIconDrawable s = s(context, spotifyIconV2, dimensionPixelSize, R.color.green);
        SpotifyIconDrawable s2 = s(context, spotifyIconV2, dimensionPixelSize, R.color.green_light);
        SpotifyIconDrawable s3 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white);
        SpotifyIconDrawable s4 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_70);
        SpotifyIconDrawable s5 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, s);
        stateListDrawable.addState(new int[]{16843518, 16842919, 16842910}, s2);
        stateListDrawable.addState(new int[]{16843518}, s);
        stateListDrawable.addState(new int[]{16842919, 16842910}, s4);
        stateListDrawable.addState(new int[]{-16842910}, s5);
        stateListDrawable.addState(new int[0], s3);
        return x(context, stateListDrawable, C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable p(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SKIPBACK15;
        SpotifyIconDrawable s = s(context, spotifyIconV2, dimensionPixelSize, R.color.green);
        SpotifyIconDrawable s2 = s(context, spotifyIconV2, dimensionPixelSize, R.color.green_light);
        SpotifyIconDrawable s3 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white);
        SpotifyIconDrawable s4 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_70);
        SpotifyIconDrawable s5 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912, 16842919, 16842910}, s2);
        stateListDrawable.addState(new int[]{16842912, 16842910}, s);
        stateListDrawable.addState(new int[]{16842919, 16842910}, s4);
        stateListDrawable.addState(new int[]{16842910}, s3);
        stateListDrawable.addState(new int[]{16842912}, s);
        stateListDrawable.addState(new int[0], s5);
        return x(context, stateListDrawable, C0707R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable q(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SKIPFORWARD15;
        SpotifyIconDrawable s = s(context, spotifyIconV2, dimensionPixelSize, R.color.green);
        SpotifyIconDrawable s2 = s(context, spotifyIconV2, dimensionPixelSize, R.color.green_light);
        SpotifyIconDrawable s3 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white);
        SpotifyIconDrawable s4 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_70);
        SpotifyIconDrawable s5 = s(context, spotifyIconV2, dimensionPixelSize, R.color.white_10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912, 16842919, 16842910}, s2);
        stateListDrawable.addState(new int[]{16842912, 16842910}, s);
        stateListDrawable.addState(new int[]{16842919, 16842910}, s4);
        stateListDrawable.addState(new int[]{16842910}, s3);
        stateListDrawable.addState(new int[]{16842912}, s);
        stateListDrawable.addState(new int[0], s5);
        return x(context, stateListDrawable, C0707R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable r(Context context) {
        return s(context, SpotifyIconV2.QUEUE, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_up_next_icon), R.color.green_light);
    }

    private static SpotifyIconDrawable s(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.r(a.b(context, i2));
        return spotifyIconDrawable;
    }

    private static SpotifyIconDrawable t(Context context, SpotifyIconV2 spotifyIconV2, int i, ColorStateList colorStateList) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.s(colorStateList);
        return spotifyIconDrawable;
    }

    public static Drawable u(Context context, int i, int i2, int i3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, z(context, false, i2));
        stateListDrawable.addState(new int[]{-16842910, 16842919}, z(context, false, i2));
        stateListDrawable.addState(new int[]{16843518, 16842910}, z(context, true, i));
        stateListDrawable.addState(new int[]{16842910, 16842919}, z(context, true, R.color.gray_50));
        return x(context, stateListDrawable, i3);
    }

    public static Drawable v(Context context) {
        return s(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp), R.color.white);
    }

    public static Drawable w(Context context) {
        return s(context, SpotifyIconV2.SHUFFLE, context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp), R.color.white);
    }

    private static Drawable x(Context context, Drawable drawable, int i) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return drawable;
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return new e(drawable, typedValue.getFloat(), 0);
    }

    public static Drawable y(Context context) {
        return x(context, s(context, SpotifyIconV2.X, context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size), R.color.white), C0707R.dimen.driving_secondary_button_icons_padding_percent);
    }

    private static Drawable z(Context context, boolean z, int i) {
        gvb gvb = new gvb(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size)));
        gvb.c((float) nud.g(12.0f, context.getResources()));
        gvb.a(a.b(context, i));
        gvb.b(a.b(context, i));
        if (!z) {
            gvb.d((float) nud.g(3.0f, context.getResources()));
        }
        return gvb;
    }
}
