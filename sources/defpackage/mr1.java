package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: mr1  reason: default package */
public final /* synthetic */ class mr1 implements g {
    public final /* synthetic */ is1 a;

    public /* synthetic */ mr1(is1 is1) {
        this.a = is1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
