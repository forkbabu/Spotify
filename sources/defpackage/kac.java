package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: kac  reason: default package */
public final /* synthetic */ class kac implements l {
    public static final /* synthetic */ kac a = new kac();

    private /* synthetic */ kac() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
