package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: dr1  reason: default package */
public final /* synthetic */ class dr1 implements g {
    public final /* synthetic */ ds1 a;

    public /* synthetic */ dr1(ds1 ds1) {
        this.a = ds1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
