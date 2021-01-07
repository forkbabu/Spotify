package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: nm1  reason: default package */
public final /* synthetic */ class nm1 implements g {
    public final /* synthetic */ ln1 a;

    public /* synthetic */ nm1(ln1 ln1) {
        this.a = ln1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((PlayerState) obj);
    }
}
