package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: wd2  reason: default package */
public final /* synthetic */ class wd2 implements n {
    public static final /* synthetic */ wd2 a = new wd2();

    private /* synthetic */ wd2() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
