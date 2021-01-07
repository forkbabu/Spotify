package com.spotify.music.features.yourlibraryx.event;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.g;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXEventSources$eventSource$4 extends FunctionReferenceImpl implements nmf<g, YourLibraryXEvent.r> {
    public static final YourLibraryXEventSources$eventSource$4 a = new YourLibraryXEventSources$eventSource$4();

    YourLibraryXEventSources$eventSource$4() {
        super(1, YourLibraryXEvent.r.class, "<init>", "<init>(Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXProfileData;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public YourLibraryXEvent.r invoke(g gVar) {
        g gVar2 = gVar;
        h.e(gVar2, "p1");
        return new YourLibraryXEvent.r(gVar2);
    }
}
