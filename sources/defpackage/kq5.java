package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: kq5  reason: default package */
public final /* synthetic */ class kq5 implements n {
    public static final /* synthetic */ kq5 a = new kq5();

    private /* synthetic */ kq5() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
