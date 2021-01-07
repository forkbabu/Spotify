package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.a;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

/* renamed from: oi0  reason: default package */
public final class oi0 {
    public static final oi0 a = new oi0();

    private oi0() {
    }

    public static final Drawable a(Context context) {
        h.e(context, "context");
        return a.f(context, C0707R.drawable.ic_pin_empty_24, Integer.valueOf(R.color.gray_50));
    }

    public static final Drawable b(Context context) {
        h.e(context, "context");
        return a.f(context, C0707R.drawable.ic_pin_filled_24, Integer.valueOf(R.color.gray_50));
    }

    public static final Drawable c(Context context) {
        h.e(context, "context");
        return new LayerDrawable(new Drawable[]{GlueGradients.a(context, GlueGradients.Style.AQUATIC, false), new e(new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) nud.g(24.0f, context.getResources())), 0.375f, 0)});
    }

    public static final Drawable d(Context context) {
        h.e(context, "context");
        return a.f(context, C0707R.drawable.ic_pin_empty_24, null);
    }

    public static final Drawable e(Context context) {
        h.e(context, "context");
        return a.f(context, C0707R.drawable.ic_pin_filled_24, null);
    }

    private final Drawable f(Context context, int i, Integer num) {
        j8 a2 = j8.a(context.getResources(), i, context.getTheme());
        h.c(a2);
        a2.mutate();
        h.d(a2, "VectorDrawableCompat.cre…context.theme)!!.mutate()");
        if (num == null) {
            return a2;
        }
        Drawable l = a.l(a2);
        a.i(l, androidx.core.content.a.c(context, num.intValue()));
        h.d(l, "wrapped");
        return l;
    }

    public static final Drawable g(Context context) {
        h.e(context, "context");
        return new d(BitmapFactory.decodeResource(context.getResources(), C0707R.drawable.your_episodes_cover), (float) nud.g(4.0f, context.getResources()));
    }
}
