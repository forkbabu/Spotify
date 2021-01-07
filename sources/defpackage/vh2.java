package defpackage;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$CancelSession;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$StartSession;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceData;
import com.spotify.superbird.earcon.EarconType;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: vh2  reason: default package */
public class vh2 implements a, bh2 {
    private final zdf a;
    private final com.spotify.superbird.earcon.a b;
    private final y c;

    public vh2(y yVar, com.spotify.superbird.earcon.a aVar, zdf zdf) {
        this.c = yVar;
        this.b = aVar;
        this.a = zdf;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b2 = cf2.b(VoiceAppProtocol$StartSession.class, AppProtocolBase.Empty.class);
        b2.d("com.spotify.superbird.voice.start_session");
        b2.c(32);
        b2.e(new ph2(this));
        qg0.accept(b2.a());
        cf2 b3 = cf2.b(VoiceAppProtocol$CancelSession.class, AppProtocolBase.Empty.class);
        b3.d("com.spotify.superbird.voice.cancel_session");
        b3.c(32);
        b3.e(new qh2(this));
        qg0.accept(b3.a());
        cf2 b4 = cf2.b(VoiceAppProtocol$VoiceData.class, AppProtocolBase.Empty.class);
        b4.d("com.spotify.superbird.voice.data");
        b4.c(32);
        b4.e(new uh2(this));
        qg0.accept(b4.a());
    }

    @Override // defpackage.bh2
    public void b() {
        this.a.getClass();
        this.b.start();
    }

    @Override // defpackage.bh2
    public void c() {
        this.a.l();
        this.b.stop();
    }

    /* access modifiers changed from: package-private */
    public s<AppProtocolBase.Empty> d(VoiceAppProtocol$CancelSession voiceAppProtocol$CancelSession) {
        return io.reactivex.a.u(new th2(this, voiceAppProtocol$CancelSession)).G(this.c).g(s.i0(AppProtocolBase.a));
    }

    public /* synthetic */ void e(VoiceAppProtocol$CancelSession voiceAppProtocol$CancelSession) {
        zdf zdf = this.a;
        voiceAppProtocol$CancelSession.sessionId();
        zdf.d();
    }

    public /* synthetic */ void f(VoiceAppProtocol$VoiceData voiceAppProtocol$VoiceData) {
        zdf zdf = this.a;
        voiceAppProtocol$VoiceData.sessionId();
        zdf.j(voiceAppProtocol$VoiceData.voiceData());
    }

    public /* synthetic */ void g(VoiceAppProtocol$StartSession voiceAppProtocol$StartSession) {
        zdf zdf = this.a;
        String sessionId = voiceAppProtocol$StartSession.sessionId();
        voiceAppProtocol$StartSession.audioMimeType();
        zdf.k(sessionId);
    }

    /* access modifiers changed from: package-private */
    public s<AppProtocolBase.Empty> h(VoiceAppProtocol$VoiceData voiceAppProtocol$VoiceData) {
        return io.reactivex.a.u(new sh2(this, voiceAppProtocol$VoiceData)).G(this.c).g(s.i0(AppProtocolBase.a));
    }

    /* access modifiers changed from: package-private */
    public s<AppProtocolBase.Empty> i(VoiceAppProtocol$StartSession voiceAppProtocol$StartSession) {
        return io.reactivex.a.z(this.b.a(EarconType.LISTENING), io.reactivex.a.u(new rh2(this, voiceAppProtocol$StartSession)).G(this.c)).g(s.i0(AppProtocolBase.a));
    }
}
