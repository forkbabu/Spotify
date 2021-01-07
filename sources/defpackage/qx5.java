package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: qx5  reason: default package */
public final /* synthetic */ class qx5 implements l {
    public final /* synthetic */ ny5 a;
    public final /* synthetic */ int b;

    public /* synthetic */ qx5(ny5 ny5, int i) {
        this.a = ny5;
        this.b = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (PlayerState) obj);
    }
}
