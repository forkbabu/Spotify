package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: cm2  reason: default package */
public final /* synthetic */ class cm2 implements n {
    public static final /* synthetic */ cm2 a = new cm2();

    private /* synthetic */ cm2() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = mm2.f;
        return ((PlayerState) obj).track().transform(im2.a).or((Optional<V>) ((V) ImmutableMap.of())).containsKey("canvas.id");
    }
}
