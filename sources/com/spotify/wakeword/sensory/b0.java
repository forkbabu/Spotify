package com.spotify.wakeword.sensory;

import android.app.Application;
import android.content.Context;
import com.google.common.base.Optional;
import com.sensory.speech.snsr.SnsrSession;
import com.sensory.speech.snsr.SnsrStream;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.WakeWordProviderError;
import com.spotify.messages.WakeWordProviderRunning;
import com.spotify.messages.WakeWordProviderStatus;
import com.spotify.wakeword.sensory.x;
import com.spotify.wakeword.sensory.y;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.y;
import java.io.IOException;
import java.util.Map;

public class b0 implements eif {
    private final fif a;
    private final y b;
    private final Context c;
    private final wlf<SnsrStream> d;
    private final v e;
    private final Optional<Integer> f;
    private final Map<AudioRecordingType, e> g;
    private final z h;

    b0(Application application, y yVar, fif fif, wlf<SnsrStream> wlf, v vVar, cif cif, Map<AudioRecordingType, e> map, z zVar) {
        this.b = yVar;
        this.c = application.getApplicationContext();
        this.a = fif;
        this.d = wlf;
        this.e = vVar;
        this.f = cif.a();
        this.g = map;
        this.h = zVar;
    }

    /* access modifiers changed from: public */
    private void b(y.b bVar) {
        bVar.b().b(new t(this, bVar), new i(this, bVar), new q(this, bVar), new f(this, bVar), new s(this, bVar));
    }

    private static void m(fif fif, String str, String str2, Throwable th) {
        Logger.b(th.toString(), new Object[0]);
        WakeWordProviderError.b n = WakeWordProviderError.n();
        n.p(str);
        n.o("Sensory");
        n.n(str2);
        n.m(th.getMessage() == null ? "UNKNOWN" : th.getMessage());
        fif.b((WakeWordProviderError) n.build());
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.lang.Boolean> */
    @Override // defpackage.eif
    public s<Boolean> a() {
        s sVar = o.a;
        e eVar = this.g.get(AudioRecordingType.MICROPHONE);
        if (eVar == null) {
            return sVar;
        }
        return new ObservableRetryPredicate(s.y(new r(this, eVar)).I0(this.b).j0(j.a), 2, Functions.b()).N(new c(this)).L(new b(this)).p0(sVar).Q(u.a).j0(k.a);
    }

    public void c(e eVar, t tVar) {
        String b2 = this.h.b();
        SnsrStream snsrStream = this.d.get();
        try {
            SnsrSession a2 = ((w) this.e).a(this.c, snsrStream);
            ((w) this.e).getClass();
            a2.setHandler("^result", new a(eVar, tVar, b2));
            if (this.f.isPresent()) {
                Logger.b("Setting OPERATING_POINT: %d", this.f.get());
                a2.setInt("operating-point", this.f.get().intValue());
            }
            tVar.onNext(new y.d(b2, a2.getString("model-name"), "6.13.1+1.ge705255"));
            try {
                tVar.onNext(new y.c(b2));
                ((w) this.e).b(a2);
                Logger.b("Sensory loop exited", new Object[0]);
            } catch (IOException e2) {
                if (e2.getMessage() == null || !e2.getMessage().contains("snsrRun(): task: Input stream for channel \"audio-pcm\": Interrupted")) {
                    Logger.c(e2, e2.getMessage(), new Object[0]);
                    tVar.onNext(new y.b(b2, new x.c(e2)));
                } else {
                    Logger.c(e2, "audio stream closed", new Object[0]);
                }
                Logger.b("Sensory loop exited", new Object[0]);
            } catch (Exception e3) {
                Logger.c(e3, e3.getMessage(), new Object[0]);
                tVar.onNext(new y.b(b2, new x.b(e3)));
                Logger.b("Sensory loop exited", new Object[0]);
            } catch (Throwable th) {
                Logger.b("Sensory loop exited", new Object[0]);
                snsrStream.release();
                a2.release();
                throw th;
            }
            snsrStream.release();
            a2.release();
        } catch (IOException e4) {
            tVar.onNext(new y.b(b2, new x.a(e4)));
        } catch (Exception e5) {
            tVar.onNext(new y.b(b2, new x.c(e5)));
        }
    }

    public /* synthetic */ void d(y.b bVar, x.a aVar) {
        m(this.a, bVar.c(), "MODEL_LOAD_FAILED", aVar.c());
    }

    public /* synthetic */ void e(y.b bVar, x.c cVar) {
        m(this.a, bVar.c(), "SESSION_INIT_FAILED", cVar.c());
    }

    public /* synthetic */ void f(y.b bVar, x.b bVar2) {
        m(this.a, bVar.c(), "SESSION_CLOSED", bVar2.c());
    }

    public /* synthetic */ void g(y.b bVar, x.d dVar) {
        m(this.a, bVar.c(), "SET_AUDIO_BUFFER_FAILED", dVar.c());
    }

    public /* synthetic */ void h(y.b bVar, x.e eVar) {
        m(this.a, bVar.c(), "UNKNOWN", eVar.c());
    }

    public /* synthetic */ void j(y.d dVar) {
        fif fif = this.a;
        WakeWordProviderStatus.b n = WakeWordProviderStatus.n();
        n.p(dVar.c());
        n.n(dVar.b());
        n.o(dVar.d());
        n.m("Sensory");
        fif.c((WakeWordProviderStatus) n.build());
    }

    public /* synthetic */ void k(y.c cVar) {
        fif fif = this.a;
        WakeWordProviderRunning.b l = WakeWordProviderRunning.l();
        l.n(cVar.b());
        l.m("Sensory");
        fif.a((WakeWordProviderRunning) l.build());
    }

    public void l(Throwable th) {
        b(new y.b("UNKNOWN", new x.e(th)));
    }
}
