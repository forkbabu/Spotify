package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: br1  reason: default package */
public final /* synthetic */ class br1 implements g {
    public final /* synthetic */ cs1 a;

    public /* synthetic */ br1(cs1 cs1) {
        this.a = cs1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
