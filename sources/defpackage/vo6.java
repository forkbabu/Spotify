package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: vo6  reason: default package */
final class vo6<F, T> implements Function<ContextTrack, String> {
    public static final vo6 a = new vo6();

    vo6() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Function
    public String apply(ContextTrack contextTrack) {
        ContextTrack contextTrack2 = contextTrack;
        h.c(contextTrack2);
        return contextTrack2.uid();
    }
}
