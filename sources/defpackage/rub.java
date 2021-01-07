package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: rub  reason: default package */
public final /* synthetic */ class rub implements g {
    public final /* synthetic */ bvb a;

    public /* synthetic */ rub(bvb bvb) {
        this.a = bvb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        bvb.b(this.a, (PlayerState) obj);
    }
}
