package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: hac  reason: default package */
public final /* synthetic */ class hac implements n {
    public static final /* synthetic */ hac a = new hac();

    private /* synthetic */ hac() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((PlayerState) obj).isPaused();
    }
}
