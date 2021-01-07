package com.spotify.music.marketingformats.playbutton;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class a extends StateListDrawable {
    private static final int[] a = {C0707R.attr.state_playback_action_play};
    private static final int[] b = {C0707R.attr.state_playback_action_pause};

    public a(Context context, int i) {
        h.e(context, "context");
        Resources resources = context.getResources();
        float g = (float) nud.g(24.0f, resources);
        float g2 = (float) nud.g(56.0f, resources);
        int b2 = androidx.core.content.a.b(context, R.color.white);
        addState(a, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PLAY, g, g2, i, b2));
        addState(b, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PAUSE, g, g2, i, b2));
    }
}
