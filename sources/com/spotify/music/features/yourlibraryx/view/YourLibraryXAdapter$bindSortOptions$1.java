package com.spotify.music.features.yourlibraryx.view;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import io.reactivex.subjects.c;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXAdapter$bindSortOptions$1 extends FunctionReferenceImpl implements nmf<YourLibraryXEvent, f> {
    YourLibraryXAdapter$bindSortOptions$1(c cVar) {
        super(1, cVar, c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(YourLibraryXEvent yourLibraryXEvent) {
        YourLibraryXEvent yourLibraryXEvent2 = yourLibraryXEvent;
        h.e(yourLibraryXEvent2, "p1");
        ((c) this.receiver).onNext(yourLibraryXEvent2);
        return f.a;
    }
}
