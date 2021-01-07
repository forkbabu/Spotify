package com.spotify.music.features.yourlibraryx.event;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXEventSources$eventSource$1 extends FunctionReferenceImpl implements nmf<Boolean, YourLibraryXEvent.o> {
    public static final YourLibraryXEventSources$eventSource$1 a = new YourLibraryXEventSources$eventSource$1();

    YourLibraryXEventSources$eventSource$1() {
        super(1, YourLibraryXEvent.o.class, "<init>", "<init>(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public YourLibraryXEvent.o invoke(Boolean bool) {
        return new YourLibraryXEvent.o(bool.booleanValue());
    }
}
