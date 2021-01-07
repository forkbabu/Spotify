package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: tn6  reason: default package */
public final /* synthetic */ class tn6 implements l {
    public final /* synthetic */ io6 a;

    public /* synthetic */ tn6(io6 io6) {
        this.a = io6;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.d((PlayerState) obj));
    }
}
