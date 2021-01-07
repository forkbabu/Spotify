package defpackage;

import com.spotify.mobile.android.service.media.t1;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: uha  reason: default package */
public final /* synthetic */ class uha implements g {
    public final /* synthetic */ t1 a;

    public /* synthetic */ uha(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((PlayerState) obj);
    }
}
