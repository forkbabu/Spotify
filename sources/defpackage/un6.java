package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: un6  reason: default package */
public final /* synthetic */ class un6 implements l {
    public final /* synthetic */ io6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ un6(io6 io6, String str) {
        this.a = io6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.h(this.b, (PlayerState) obj);
    }
}
