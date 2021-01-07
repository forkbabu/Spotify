package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: uw7  reason: default package */
public final /* synthetic */ class uw7 implements l {
    public static final /* synthetic */ uw7 a = new uw7();

    private /* synthetic */ uw7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).contextUri();
    }
}
