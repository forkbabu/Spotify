package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: woc  reason: default package */
public final class woc {
    public static Drawable a(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, context.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.s(a.c(context, C0707R.color.glue_button_text));
        return spotifyIconDrawable;
    }
}
