package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.music.features.nowplayingbar.domain.a;
import com.spotify.music.features.nowplayingbar.domain.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarEventSourceKt$connectStateEventSource$1 extends FunctionReferenceImpl implements nmf<a, d.b> {
    public static final NowPlayingBarEventSourceKt$connectStateEventSource$1 a = new NowPlayingBarEventSourceKt$connectStateEventSource$1();

    NowPlayingBarEventSourceKt$connectStateEventSource$1() {
        super(1, d.b.class, "<init>", "<init>(Lcom/spotify/music/features/nowplayingbar/domain/ConnectState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d.b invoke(a aVar) {
        a aVar2 = aVar;
        h.e(aVar2, "p1");
        return new d.b(aVar2);
    }
}
