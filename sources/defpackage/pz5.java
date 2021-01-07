package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.c;
import com.spotify.player.model.PlayerState;
import java.util.List;

/* renamed from: pz5  reason: default package */
public class pz5 {
    private final List<uy5> a;

    pz5(xy5 xy5, tz5 tz5, jz5 jz5, fz5 fz5, bz5 bz5) {
        this.a = ImmutableList.of((bz5) xy5, (bz5) tz5, (bz5) jz5, (bz5) fz5, bz5);
    }

    public uy5 a(PlayerState playerState, c cVar) {
        for (uy5 uy5 : this.a) {
            if (uy5.c(playerState, cVar)) {
                return uy5;
            }
        }
        throw new IllegalArgumentException("Invalid player state: " + playerState);
    }
}
