package com.spotify.music.features.yourlibraryx.event;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXEventSources$eventSource$3 extends FunctionReferenceImpl implements nmf<String, YourLibraryXEvent.q> {
    public static final YourLibraryXEventSources$eventSource$3 a = new YourLibraryXEventSources$eventSource$3();

    YourLibraryXEventSources$eventSource$3() {
        super(1, YourLibraryXEvent.q.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public YourLibraryXEvent.q invoke(String str) {
        String str2 = str;
        h.e(str2, "p1");
        return new YourLibraryXEvent.q(str2);
    }
}
