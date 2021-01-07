package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.json.g;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.VoiceViewResponse;
import com.spotify.voice.api.model.m;
import io.reactivex.subscribers.a;
import java.util.concurrent.TimeUnit;

/* renamed from: ewb  reason: default package */
public class ewb extends a<m> {
    private final zvb b;
    private final int c;
    private final bwb f;
    private final g n;
    private final io.reactivex.disposables.a o = new io.reactivex.disposables.a();
    private awb p;
    private String q;

    public ewb(zvb zvb, int i, bwb bwb, g gVar) {
        this.b = zvb;
        this.c = i;
        this.f = bwb;
        this.n = gVar;
    }

    @Override // defpackage.upf
    public void onComplete() {
        this.o.f();
        awb awb = this.p;
        if (awb != null && !awb.a() && this.p.c() && this.p.b()) {
            Logger.b("VoiceSessionSubscriber - Voice session success, results: %s", this.p);
            this.b.a(this.p, this.q);
            return;
        }
        Logger.b("VoiceSessionSubscriber - Voice session failure, results: %s", this.p);
        this.b.b();
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        Logger.b("VoiceSessionSubscriber - Got voice error: %s (%s)", th, th.getMessage());
        this.o.f();
        if (th instanceof VoiceSessionException) {
            VoiceSessionException voiceSessionException = (VoiceSessionException) th;
            if (ErrorDomain.OFFLINE == voiceSessionException.a() || ErrorDomain.CONNECTION == voiceSessionException.a()) {
                this.b.c();
                return;
            }
        }
        this.b.b();
    }

    @Override // defpackage.upf
    public void onNext(Object obj) {
        m mVar = (m) obj;
        mVar.getClass();
        if (mVar instanceof m.e) {
            Logger.b("VoiceSessionSubscriber - Got NLU response: %s", mVar);
            this.p = this.f.a((VoiceViewResponse) this.n.a().convertValue(((m.e) mVar).g(), VoiceViewResponse.class), this.c);
        } else if (mVar instanceof m.d) {
            io.reactivex.disposables.a aVar = this.o;
            io.reactivex.g<Float> g = ((m.d) mVar).g();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            g.getClass();
            io.reactivex.g<Float> X = g.X(50, timeUnit, io.reactivex.schedulers.a.a());
            zvb zvb = this.b;
            zvb.getClass();
            aVar.b(X.subscribe(new xvb(zvb)));
        } else if (mVar instanceof m.c) {
            this.q = ((m.c) mVar).g();
        }
    }
}
