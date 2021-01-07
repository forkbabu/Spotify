package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: hia  reason: default package */
public final /* synthetic */ class hia implements l {
    public final /* synthetic */ pia a;

    public /* synthetic */ hia(pia pia) {
        this.a = pia;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((PlayerState) obj);
    }
}
