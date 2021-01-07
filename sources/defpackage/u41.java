package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: u41  reason: default package */
public final /* synthetic */ class u41 implements n {
    public static final /* synthetic */ u41 a = new u41();

    private /* synthetic */ u41() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj) != PlayerState.EMPTY;
    }
}
