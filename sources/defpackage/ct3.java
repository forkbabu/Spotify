package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: ct3  reason: default package */
public final /* synthetic */ class ct3 implements n {
    public static final /* synthetic */ ct3 a = new ct3();

    private /* synthetic */ ct3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.duration().isPresent() && playerState.positionAsOfTimestamp().isPresent();
    }
}
