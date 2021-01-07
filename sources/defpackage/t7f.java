package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: t7f  reason: default package */
public final /* synthetic */ class t7f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ String b;

    public /* synthetic */ t7f(a8f a8f, String str) {
        this.a = a8f;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, (PlayerState) obj);
    }
}
