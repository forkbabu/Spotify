package com.spotify.libs.connect.volume;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.volume.c;
import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.rxjava2.q;
import defpackage.ru0;
import io.reactivex.disposables.b;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;

public final class d implements c, ru0.a {
    private final q a = new q();
    private final PublishSubject<c.a> b;
    private Float c;
    private final f d;
    private final h e;
    private final gv0 f;
    private final l g;
    private final g h;
    private final ConnectVolumeControlInstrumentation i;
    private final y j;

    static final class a<T> implements io.reactivex.functions.g<c.a> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.a aVar) {
            c.a aVar2 = aVar;
            this.a.f.b();
            q qVar = this.a.a;
            if (aVar2 instanceof c.a.C0163a) {
                qVar.a(d.i(this.a, (c.a.C0163a) aVar2));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public d(f fVar, h hVar, gv0 gv0, l lVar, g gVar, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation, y yVar) {
        kotlin.jvm.internal.h.e(fVar, "connectVolumeService");
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(gv0, "volumeInterceptor");
        kotlin.jvm.internal.h.e(lVar, "playbackVolumeProvider");
        kotlin.jvm.internal.h.e(gVar, "volumeInstrumentation");
        kotlin.jvm.internal.h.e(connectVolumeControlInstrumentation, "connectVolumeControlInstrumentation");
        kotlin.jvm.internal.h.e(yVar, "computationScheduler");
        this.d = fVar;
        this.e = hVar;
        this.f = gv0;
        this.g = lVar;
        this.h = gVar;
        this.i = connectVolumeControlInstrumentation;
        this.j = yVar;
        PublishSubject<c.a> h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create()");
        this.b = h1;
    }

    public static final String a(d dVar) {
        GaiaDevice b2 = dVar.e.b();
        if (b2 != null) {
            return b2.getLoggingIdentifier();
        }
        return null;
    }

    public static final b i(d dVar, c.a.C0163a aVar) {
        b subscribe = dVar.d.a(anf.b(aVar.b() * ((float) AudioDriver.SPOTIFY_MAX_VOLUME))).p(new b(0, dVar, aVar)).subscribe(new b(1, dVar, aVar));
        kotlin.jvm.internal.h.d(subscribe, "connectVolumeService\n   …          }\n            }");
        return subscribe;
    }

    @Override // com.spotify.libs.connect.volume.c
    public void b(float f2, cmf<f> cmf) {
        this.b.onNext(new c.a.C0163a(f2, cmf));
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.a.a(this.b.Q0(200, TimeUnit.MILLISECONDS, this.j).subscribe(new a(this)));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.a.c();
    }
}
