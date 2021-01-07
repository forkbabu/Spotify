package com.spotify.encore.consumer.components.promo.impl.promocard.drawables;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.promo.impl.R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlayButtonDrawable extends StateListDrawable {
    public static final Companion Companion = new Companion(null);
    private static final int PLAY_BUTTON_SIZE = 40;
    private static final int PLAY_ICON_SIZE = 20;
    private static final int[] STATE_PAUSE = {R.attr.state_player_pausing};
    private static final int[] STATE_PLAY = {R.attr.state_player_playing};
    private final int circleColor;

    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final float dip(Resources resources, int i) {
            return (float) nud.g((float) i, resources);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PlayButtonDrawable(Context context, int i) {
        h.e(context, "context");
        this.circleColor = i;
        int b = a.b(context, com.spotify.encore.foundation.R.color.black);
        Companion companion = Companion;
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        float dip = companion.dip(resources, 20);
        Resources resources2 = context.getResources();
        h.d(resources2, "context.resources");
        float dip2 = companion.dip(resources2, 40);
        addState(STATE_PLAY, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PLAY, dip, dip2, i, b));
        addState(STATE_PAUSE, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PAUSE, dip, dip2, i, b));
    }

    public final int getCircleColor() {
        return this.circleColor;
    }
}
