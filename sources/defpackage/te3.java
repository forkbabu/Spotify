package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: te3  reason: default package */
public final /* synthetic */ class te3 implements l {
    public static final /* synthetic */ te3 a = new te3();

    private /* synthetic */ te3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
