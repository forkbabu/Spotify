package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: q0f  reason: default package */
public final /* synthetic */ class q0f implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ String b;

    public /* synthetic */ q0f(t0f t0f, String str) {
        this.a = t0f;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (PlayerState) obj);
    }
}
