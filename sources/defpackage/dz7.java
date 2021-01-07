package defpackage;

import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: dz7  reason: default package */
public final /* synthetic */ class dz7 implements l {
    public static final /* synthetic */ dz7 a = new dz7();

    private /* synthetic */ dz7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z;
        PlayerState playerState = (PlayerState) obj;
        if (playerState != null && playerState.track().isPresent()) {
            ContextTrack contextTrack = playerState.track().get();
            if (kxd.f(contextTrack) || kxd.h(contextTrack)) {
                z = true;
                return h.a(z);
            }
        }
        z = false;
        return h.a(z);
    }
}
