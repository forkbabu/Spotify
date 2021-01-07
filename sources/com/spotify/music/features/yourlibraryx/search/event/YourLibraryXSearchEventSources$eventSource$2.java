package com.spotify.music.features.yourlibraryx.search.event;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXSearchEventSources$eventSource$2 extends FunctionReferenceImpl implements nmf<String, YourLibraryXEvent.q> {
    public static final YourLibraryXSearchEventSources$eventSource$2 a = new YourLibraryXSearchEventSources$eventSource$2();

    YourLibraryXSearchEventSources$eventSource$2() {
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
