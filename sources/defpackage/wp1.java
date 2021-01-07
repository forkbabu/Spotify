package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: wp1  reason: default package */
public final /* synthetic */ class wp1 implements l {
    public static final /* synthetic */ wp1 a = new wp1();

    private /* synthetic */ wp1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
