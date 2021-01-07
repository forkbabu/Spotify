package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: on6  reason: default package */
public final /* synthetic */ class on6 implements l {
    public final /* synthetic */ io6 a;

    public /* synthetic */ on6(io6 io6) {
        this.a = io6;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.f((PlayerState) obj));
    }
}
