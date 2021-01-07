package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: jac  reason: default package */
public final /* synthetic */ class jac implements n {
    public final /* synthetic */ String a;

    public /* synthetic */ jac(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.equals(((PlayerState) obj).contextUri());
    }
}
