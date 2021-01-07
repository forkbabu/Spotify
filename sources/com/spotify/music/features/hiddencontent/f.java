package com.spotify.music.features.hiddencontent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;

public class f {
    public Drawable a(Context context, boolean z, boolean z2) {
        if (z) {
            return z42.f(context, SpotifyIconV2.HEART_ACTIVE, nud.i(context, C0707R.attr.pasteColorAccessoryGreen));
        }
        if (z2) {
            return z42.f(context, SpotifyIconV2.BAN_ACTIVE, nud.i(context, C0707R.attr.pasteColorAccessoryRed));
        }
        return z42.e(context, SpotifyIconV2.MORE_ANDROID);
    }
}
