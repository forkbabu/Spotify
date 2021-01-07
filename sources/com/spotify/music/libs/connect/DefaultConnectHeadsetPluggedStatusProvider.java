package com.spotify.music.libs.connect;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class DefaultConnectHeadsetPluggedStatusProvider implements com.spotify.libs.connect.nudge.a, ru0.a {
    private final io.reactivex.subjects.a<Boolean> a;
    private final p b = new p();
    private final s<LocalSpeakerStatus> c;

    static final class a<T, R> implements l<LocalSpeakerStatus, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(LocalSpeakerStatus localSpeakerStatus) {
            LocalSpeakerStatus localSpeakerStatus2 = localSpeakerStatus;
            h.e(localSpeakerStatus2, "it");
            return Boolean.valueOf(localSpeakerStatus2 == LocalSpeakerStatus.CONNECTED);
        }
    }

    public DefaultConnectHeadsetPluggedStatusProvider(s<LocalSpeakerStatus> sVar) {
        h.e(sVar, "headsetPluggedObserver");
        this.c = sVar;
        io.reactivex.subjects.a<Boolean> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.nudge.a
    public s<Boolean> a() {
        return this.a;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.j0(a.a).G0((R) Boolean.FALSE).subscribe(new q(new DefaultConnectHeadsetPluggedStatusProvider$onStart$2(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
