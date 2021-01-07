package defpackage;

import android.text.SpannableString;
import com.spotify.android.flags.c;
import com.spotify.player.model.PlayerState;
import java.util.List;

/* renamed from: uy5  reason: default package */
public interface uy5 {

    /* renamed from: uy5$a */
    public interface a {
        boolean d(String str);
    }

    SpannableString a(PlayerState playerState);

    SpannableString b(PlayerState playerState);

    boolean c(PlayerState playerState, c cVar);

    SpannableString d(PlayerState playerState);

    List<cy5> e(PlayerState playerState);
}
