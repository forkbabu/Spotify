package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: ar1  reason: default package */
public final /* synthetic */ class ar1 implements g {
    public final /* synthetic */ bs1 a;

    public /* synthetic */ ar1(bs1 bs1) {
        this.a = bs1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        bs1.k(this.a, (PlayerState) obj);
    }
}
