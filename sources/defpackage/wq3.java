package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: wq3  reason: default package */
public final /* synthetic */ class wq3 implements l {
    public static final /* synthetic */ wq3 a = new wq3();

    private /* synthetic */ wq3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track().get().uri();
    }
}
