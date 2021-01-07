package com.spotify.music.features.yourlibraryx.event;

import com.spotify.mobius.extras.QueueingEventSubject;
import com.spotify.mobius.q;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import kotlin.jvm.internal.h;

public final class b implements da2<YourLibraryXEvent>, q<YourLibraryXEvent> {
    private final QueueingEventSubject<YourLibraryXEvent> a = new QueueingEventSubject<>(100);

    @Override // com.spotify.mobius.q
    public w92 a(da2<YourLibraryXEvent> da2) {
        h.e(da2, "eventConsumer");
        w92 a2 = this.a.a(da2);
        h.d(a2, "subject.subscribe(eventConsumer)");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.da2
    public void accept(YourLibraryXEvent yourLibraryXEvent) {
        YourLibraryXEvent yourLibraryXEvent2 = yourLibraryXEvent;
        h.e(yourLibraryXEvent2, "event");
        this.a.accept(yourLibraryXEvent2);
    }

    public void b(YourLibraryXEvent yourLibraryXEvent) {
        h.e(yourLibraryXEvent, "event");
        this.a.accept(yourLibraryXEvent);
    }
}
