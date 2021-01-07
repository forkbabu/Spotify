package com.spotify.libs.connect.volume;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.rxjava2.q;
import defpackage.ru0;
import io.reactivex.functions.g;
import io.reactivex.s;

public final class PlaybackVolumeProviderImpl implements l, ru0.a {
    private final io.reactivex.subjects.a<Float> a;
    private final q b = new q();
    private final k c;
    private final gv0 d;
    private final h e;
    private final ConnectVolumeControlInstrumentation f;
    private final boolean g;

    /* compiled from: java-style lambda group */
    static final class a<T> implements g<Float> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: io.reactivex.subjects.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public final void accept(Float f) {
            int i = this.a;
            if (i == 0) {
                Float f2 = f;
                ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation = ((PlaybackVolumeProviderImpl) this.b).f;
                ConnectVolumeControlInstrumentation.RemoteVolumeReceived remoteVolumeReceived = ConnectVolumeControlInstrumentation.RemoteVolumeReceived.a;
                kotlin.jvm.internal.h.d(f2, "it");
                connectVolumeControlInstrumentation.d(remoteVolumeReceived, f2.floatValue(), (Float) ((PlaybackVolumeProviderImpl) this.b).a.j1());
            } else if (i == 1) {
                Float f3 = f;
                ((PlaybackVolumeProviderImpl) this.b).a.onNext(f3);
                Logger.b("Playback volume update %f", f3);
            } else {
                throw null;
            }
        }
    }

    public PlaybackVolumeProviderImpl(k kVar, gv0 gv0, h hVar, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation, boolean z) {
        kotlin.jvm.internal.h.e(kVar, "volumeEndpoint");
        kotlin.jvm.internal.h.e(gv0, "localVolumeInterceptor");
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(connectVolumeControlInstrumentation, "connectVolumeControlInstrumentation");
        this.c = kVar;
        this.d = gv0;
        this.e = hVar;
        this.f = connectVolumeControlInstrumentation;
        this.g = z;
        io.reactivex.subjects.a<Float> h1 = io.reactivex.subjects.a.h1();
        kotlin.jvm.internal.h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    public static final boolean c(PlaybackVolumeProviderImpl playbackVolumeProviderImpl, float f2) {
        playbackVolumeProviderImpl.getClass();
        boolean z = f2 != -1.0f && !playbackVolumeProviderImpl.d.a();
        if (!z) {
            Logger.b("Playback volume ignored %f, user interacted: %b", Float.valueOf(f2), Boolean.valueOf(playbackVolumeProviderImpl.d.a()));
        }
        return z;
    }

    public static final float f(PlaybackVolumeProviderImpl playbackVolumeProviderImpl, VolumeState volumeState) {
        playbackVolumeProviderImpl.getClass();
        float volume = volumeState.getVolume();
        GaiaDevice b2 = playbackVolumeProviderImpl.e.b();
        if (!(b2 == null || (b2.isSelf() && !playbackVolumeProviderImpl.g))) {
            return volume;
        }
        Logger.b("Playback volume overwritten from %f to %f", Float.valueOf(volume), Float.valueOf(-1.0f));
        return -1.0f;
    }

    @Override // com.spotify.libs.connect.volume.l
    public s<Float> a() {
        return this.a;
    }

    @Override // com.spotify.libs.connect.volume.l
    public float b() {
        Float j1 = this.a.j1();
        if (j1 != null) {
            return j1.floatValue();
        }
        return -1.0f;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.a(this.c.a().j0(new m(new PlaybackVolumeProviderImpl$onStart$1(this))).Q(new n(new PlaybackVolumeProviderImpl$onStart$2(this))).N(new a(0, this)).subscribe(new a(1, this)));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.c();
    }
}
