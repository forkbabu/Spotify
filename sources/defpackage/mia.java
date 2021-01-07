package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: mia  reason: default package */
public final /* synthetic */ class mia implements l {
    public static final /* synthetic */ mia a = new mia();

    private /* synthetic */ mia() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (PlayerState) ((Optional) obj).get();
    }
}
