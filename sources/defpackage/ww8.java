package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: ww8  reason: default package */
public final /* synthetic */ class ww8 implements l {
    public static final /* synthetic */ ww8 a = new ww8();

    private /* synthetic */ ww8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!((PlayerState) obj).restrictions().disallowTogglingShuffleReasons().isEmpty());
    }
}
