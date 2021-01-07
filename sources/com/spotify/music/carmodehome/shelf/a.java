package com.spotify.music.carmodehome.shelf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.gradients.GradientDrawable;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class a {
    public static final Drawable a(Context context) {
        h.e(context, "context");
        int g = nud.g(150.0f, context.getResources());
        float g2 = (float) nud.g(50.0f, context.getResources());
        GradientDrawable a = GlueGradients.a(context, GlueGradients.Style.AQUATIC, false);
        h.d(a, "GlueGradients.createLine…nts.Style.AQUATIC, false)");
        return new i(new Drawable[]{a, new e(new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, g2), g2 / ((float) g), 0)});
    }
}
