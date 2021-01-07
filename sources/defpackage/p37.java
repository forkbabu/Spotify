package defpackage;

import com.spotify.music.features.podcast.entity.find.loaded.g;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: p37  reason: default package */
public final class p37<I, O> implements sg0<o37, s0> {
    final /* synthetic */ g.a a;

    p37(g.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public s0 apply(o37 o37) {
        o37 o372 = o37;
        g.a aVar = this.a;
        h.d(o372, "data");
        return ((com.spotify.music.features.podcast.entity.find.loaded.h) aVar).b(o372);
    }
}
