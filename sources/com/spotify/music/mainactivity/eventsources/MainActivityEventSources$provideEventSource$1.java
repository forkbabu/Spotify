package com.spotify.music.mainactivity.eventsources;

import com.spotify.mobius.q;
import io.reactivex.disposables.b;
import io.reactivex.g;

/* access modifiers changed from: package-private */
public final class MainActivityEventSources$provideEventSource$1<E> implements q<ufb> {
    final /* synthetic */ g a;
    final /* synthetic */ g b;

    static final class a implements w92 {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.w92
        public final void dispose() {
            this.a.dispose();
        }
    }

    MainActivityEventSources$provideEventSource$1(g gVar, g gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.spotify.music.mainactivity.eventsources.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.mobius.q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.w92 a(defpackage.da2<defpackage.ufb> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "eventConsumer"
            kotlin.jvm.internal.h.e(r4, r0)
            io.reactivex.g r0 = r3.a
            io.reactivex.g r0 = r0.s()
            com.spotify.music.mainactivity.eventsources.a r1 = com.spotify.music.mainactivity.eventsources.a.a
            io.reactivex.g r0 = r0.O(r1)
            java.lang.String r1 = "flags.distinctUntilChang…ent.FlagsChanged(flags) }"
            kotlin.jvm.internal.h.d(r0, r1)
            io.reactivex.g r1 = r3.b
            io.reactivex.g r1 = r1.s()
            com.spotify.music.mainactivity.eventsources.c r2 = com.spotify.music.mainactivity.eventsources.c.a
            io.reactivex.g r1 = r1.O(r2)
            java.lang.String r2 = "sessionStateObservable\n …ssionState)\n            }"
            kotlin.jvm.internal.h.d(r1, r2)
            io.reactivex.g r0 = io.reactivex.g.P(r0, r1)
            com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$disposable$1 r1 = new com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$disposable$1
            r1.<init>(r4)
            com.spotify.music.mainactivity.eventsources.b r4 = new com.spotify.music.mainactivity.eventsources.b
            r4.<init>(r1)
            com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$disposable$2 r1 = com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$disposable$2.a
            if (r1 == 0) goto L_0x003f
            com.spotify.music.mainactivity.eventsources.b r2 = new com.spotify.music.mainactivity.eventsources.b
            r2.<init>(r1)
            r1 = r2
        L_0x003f:
            io.reactivex.functions.g r1 = (io.reactivex.functions.g) r1
            io.reactivex.disposables.b r4 = r0.subscribe(r4, r1)
            com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$a r0 = new com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1$a
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.mainactivity.eventsources.MainActivityEventSources$provideEventSource$1.a(da2):w92");
    }
}
