package com.spotify.music.features.yourlibraryx.lifecycle;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.c;
import com.spotify.music.features.yourlibraryx.domain.e;
import com.spotify.music.features.yourlibraryx.domain.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXViewModel$createController$1 extends FunctionReferenceImpl implements rmf<f, YourLibraryXEvent, e0<f, c>> {
    public static final YourLibraryXViewModel$createController$1 a = new YourLibraryXViewModel$createController$1();

    YourLibraryXViewModel$createController$1() {
        super(2, e.class, "update", "update(Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXModel;Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<f, c> invoke(f fVar, YourLibraryXEvent yourLibraryXEvent) {
        f fVar2 = fVar;
        YourLibraryXEvent yourLibraryXEvent2 = yourLibraryXEvent;
        h.e(fVar2, "p1");
        h.e(yourLibraryXEvent2, "p2");
        return e.k(fVar2, yourLibraryXEvent2);
    }
}
