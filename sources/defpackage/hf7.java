package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: hf7  reason: default package */
public final /* synthetic */ class hf7 implements l {
    public static final /* synthetic */ hf7 a = new hf7();

    private /* synthetic */ hf7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return new jf7(playerState.contextUri(), playerState.track().transform(if7.a).or((Optional<V>) ""));
    }
}
