package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: ln9  reason: default package */
public final /* synthetic */ class ln9 implements l {
    public static final /* synthetic */ ln9 a = new ln9();

    private /* synthetic */ ln9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).contextUri();
    }
}
