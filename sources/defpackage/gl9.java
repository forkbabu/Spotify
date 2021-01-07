package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: gl9  reason: default package */
public final /* synthetic */ class gl9 implements n {
    public final /* synthetic */ rl9 a;

    public /* synthetic */ gl9(rl9 rl9) {
        this.a = rl9;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return rl9.b(this.a, (PlayerState) obj);
    }
}
