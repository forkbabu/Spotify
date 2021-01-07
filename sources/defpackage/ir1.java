package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: ir1  reason: default package */
public final /* synthetic */ class ir1 implements g {
    public final /* synthetic */ gs1 a;

    public /* synthetic */ ir1(gs1 gs1) {
        this.a = gs1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
