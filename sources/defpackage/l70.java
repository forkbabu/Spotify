package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.d;
import com.spotify.android.glue.patterns.header.transformations.f;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.layouts.PasteFrameLayout;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: l70  reason: default package */
public final class l70 {
    public static void a(Button button, String str, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable;
        Context context = button.getContext();
        Resources resources = context.getResources();
        if (spotifyIconV2 != null) {
            spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) resources.getDimensionPixelSize(C0707R.dimen.actionbar_play_button_icon_size));
            spotifyIconDrawable.s(button.getTextColors());
        } else {
            spotifyIconDrawable = null;
        }
        button.setPadding(resources.getDimensionPixelSize(C0707R.dimen.actionbar_play_button_left_padding), 0, resources.getDimensionPixelSize(C0707R.dimen.actionbar_play_button_right_padding), 0);
        button.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setCompoundDrawablePadding(resources.getDimensionPixelOffset(C0707R.dimen.actionbar_play_button_icon_padding));
        button.setText(str.toUpperCase(Locale.getDefault()));
    }

    public static Drawable b(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, (float) nud.g(12.0f, context.getResources()));
        spotifyIconDrawable.r(a.b(context, C0707R.color.cat_accessory_green));
        return spotifyIconDrawable;
    }

    public static c c(Context context, ViewGroup viewGroup) {
        return new e((GlueToolbarLayout) LayoutInflater.from(context).inflate(C0707R.layout.glue_toolbar, viewGroup, false));
    }

    public static TransformationSet d(View view) {
        d<f> d = new f(0.0f, 1.0f).c().d(1.0f, 0.0f);
        d.e(ta0.a);
        return d.f(com.spotify.android.glue.patterns.header.transformations.a.b(view, View.ALPHA)).d(1.0f, 0.8f).f(com.spotify.android.glue.patterns.header.transformations.a.a(view, Arrays.asList(View.SCALE_X, View.SCALE_Y))).c().b();
    }

    public static Drawable e(Context context, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) nud.g((float) i, context.getResources()));
        spotifyIconDrawable.r(a.b(context, C0707R.color.cat_accessory_default));
        return spotifyIconDrawable;
    }

    public static Drawable f(Context context) {
        return g(context, (float) nud.g(12.0f, context.getResources()));
    }

    public static Drawable g(Context context, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHUFFLE, f);
        spotifyIconDrawable.r(-16777216);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a.d(context, C0707R.drawable.bg_glue_shuffle_badge), spotifyIconDrawable});
        int g = nud.g(2.0f, context.getResources());
        layerDrawable.setLayerInset(1, g, 0, g, 0);
        return layerDrawable;
    }

    public static Button h(Context context, String str, SpotifyIconV2 spotifyIconV2, View.OnClickListener onClickListener) {
        Button button = (Button) com.spotify.android.paste.app.c.b(context, Button.class, null, C0707R.attr.pasteButtonStylePrimarySmall);
        a(button, str, spotifyIconV2);
        button.setOnClickListener(onClickListener);
        return button;
    }

    public static Drawable i(Context context, SpotifyIconV2 spotifyIconV2) {
        return j(context, spotifyIconV2, a.b(context, R.color.gray_50));
    }

    public static Drawable j(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_icon_size));
        spotifyIconDrawable.r(i);
        return spotifyIconDrawable;
    }

    public static u k(Context context) {
        if (context instanceof com.spotify.android.glue.components.toolbar.d) {
            return ((com.spotify.android.glue.components.toolbar.d) context).R();
        }
        throw new IllegalArgumentException("Context should implement GlueToolbarContainer");
    }

    public static View l(Context context, ViewGroup viewGroup, int i) {
        PasteFrameLayout pasteFrameLayout = new PasteFrameLayout(context, null);
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        inflate.setDuplicateParentStateEnabled(true);
        inflate.setId(C0707R.id.row_view);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            pasteFrameLayout.setLayoutParams(layoutParams);
            inflate.setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
        }
        pasteFrameLayout.addView(inflate);
        return pasteFrameLayout;
    }

    public static <V extends g90> boolean m(View view, Class<V> cls) {
        view.getClass();
        return cls.isInstance(view.getTag(C0707R.id.glue_viewholder_tag));
    }

    public static CharSequence n(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@  ");
        spannableStringBuilder.append(charSequence);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new vvd(drawable), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static <V extends g90> V o(View view, Class<V> cls) {
        view.getClass();
        V cast = cls.cast(view.getTag(C0707R.id.glue_viewholder_tag));
        if (cast != null) {
            return cast;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    public static <V extends g90> V p(View view, Class<V> cls) {
        if (view == null) {
            return null;
        }
        V cast = cls.cast(view.getTag(C0707R.id.glue_viewholder_tag));
        if (cast != null) {
            return cast;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }
}
