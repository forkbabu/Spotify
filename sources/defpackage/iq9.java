package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

/* renamed from: iq9  reason: default package */
public class iq9 extends StateListDrawable {
    private static final int[] b = {C0707R.attr.state_player_playing};
    private static final int[] c = {C0707R.attr.state_player_pausing};
    private final int a;

    public iq9(Context context, int i) {
        this.a = i;
        int b2 = a.b(context, R.color.black);
        float g = (float) nud.g((float) 20, context.getResources());
        float g2 = (float) nud.g((float) 40, context.getResources());
        addState(b, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PLAY, g, g2, i, b2));
        addState(c, new com.spotify.paste.spotifyicon.a(context, SpotifyIconV2.PAUSE, g, g2, i, b2));
    }
}
