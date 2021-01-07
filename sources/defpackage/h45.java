package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

/* renamed from: h45  reason: default package */
public final class h45 {
    private static final c a(Context context, SpotifyIconV2 spotifyIconV2) {
        ColorStateList c = a.c(context, C0707R.color.btn_play_pause);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(10.0f, context.getResources()));
        spotifyIconDrawable.s(c);
        c cVar = new c(spotifyIconDrawable, 0.5f);
        cVar.f(0.0f);
        cVar.c(a.c(context, C0707R.color.bg_primary_action_white));
        return cVar;
    }

    public static final SpotifyIconDrawable b(Context context, int i, SpotifyIconV2 spotifyIconV2) {
        h.e(context, "context");
        h.e(spotifyIconV2, "icon");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.r(context.getResources().getColor(R.color.gray_30));
        return spotifyIconDrawable;
    }

    public static final c c(Context context) {
        h.e(context, "context");
        return a(context, SpotifyIconV2.PAUSE);
    }

    public static final c d(Context context) {
        h.e(context, "context");
        return a(context, SpotifyIconV2.PLAY);
    }
}
