package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: y35  reason: default package */
final class y35<T> implements n<Optional<ContextTrack>> {
    public static final y35 a = new y35();

    y35() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Optional<ContextTrack> optional) {
        Optional<ContextTrack> optional2 = optional;
        h.e(optional2, "contextTrack");
        return optional2.isPresent();
    }
}
