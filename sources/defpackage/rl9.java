package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: rl9  reason: default package */
public class rl9 {
    private final g<PlayerState> a;
    private final vxd b;

    public rl9(g<PlayerState> gVar, vxd vxd) {
        this.a = gVar;
        this.b = vxd;
    }

    public static boolean b(rl9 rl9, PlayerState playerState) {
        return !rl9.b.a(playerState.contextUri()).or((Optional<Boolean>) Boolean.FALSE).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public g<PlayerState> a() {
        return this.a.h0(1).C(hl9.a).C(new gl9(this));
    }
}
