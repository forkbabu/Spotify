package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: gr1  reason: default package */
public final /* synthetic */ class gr1 implements g {
    public final /* synthetic */ fs1 a;

    public /* synthetic */ gr1(fs1 fs1) {
        this.a = fs1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
