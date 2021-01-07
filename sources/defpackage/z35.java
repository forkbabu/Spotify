package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: z35  reason: default package */
final class z35<T, R> implements l<Optional<ContextTrack>, ContextTrack> {
    public static final z35 a = new z35();

    z35() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ContextTrack apply(Optional<ContextTrack> optional) {
        Optional<ContextTrack> optional2 = optional;
        h.e(optional2, "it");
        return optional2.get();
    }
}
