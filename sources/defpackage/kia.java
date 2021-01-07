package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: kia  reason: default package */
public final /* synthetic */ class kia implements l {
    public static final /* synthetic */ kia a = new kia();

    private /* synthetic */ kia() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.of((PlayerState) obj);
    }
}
