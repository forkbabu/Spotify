package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

/* renamed from: yq9  reason: default package */
public class yq9 extends StateListDrawable {
    private static final int[] a = {C0707R.attr.state_player_playing};
    private static final int[] b = {C0707R.attr.state_player_pausing};

    public yq9(Context context) {
        int b2 = a.b(context, R.color.white);
        int b3 = a.b(context, R.color.white_20);
        float g = (float) nud.g((float) 16, context.getResources());
        float g2 = (float) nud.g((float) 32, context.getResources());
        addState(a, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PLAY, g, g2, b3, b2));
        addState(b, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PAUSE, g, g2, b3, b2));
    }
}
