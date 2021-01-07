package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.TtsPlayback;
import com.spotify.messages.VoiceLatency;
import defpackage.gqe;
import defpackage.hqe;
import kotlin.jvm.internal.h;

/* renamed from: iqe  reason: default package */
public final class iqe {
    private final gl0<u> a;

    public iqe(gl0<u> gl0) {
        h.e(gl0, "eventPublisherAdapter");
        this.a = gl0;
    }

    public void a(hqe hqe) {
        String str;
        h.e(hqe, "ttsEventLog");
        gl0<u> gl0 = this.a;
        TtsPlayback.b n = TtsPlayback.n();
        h.d(n, "TtsPlayback.newBuilder()");
        n.p(hqe.b());
        h.d(n, "builder.setUtteranceId(ttsEventLog.utteranceId)");
        n.o(hqe.a());
        if (hqe instanceof hqe.a) {
            hqe.a aVar = (hqe.a) hqe;
            n.m(aVar.c().a());
            gqe c = aVar.c();
            if (c instanceof gqe.a) {
                str = "Network";
            } else {
                str = c instanceof gqe.b ? "Playback" : "Unknown";
            }
            n.n(str);
        }
        GeneratedMessageLite build = n.build();
        h.d(build, "builder.build()");
        gl0.c((TtsPlayback) build);
    }

    public void b(hqe hqe) {
        h.e(hqe, "ttsEventLog");
        Logger.g("tts playback started %s", hqe);
        gl0<u> gl0 = this.a;
        VoiceLatency.b m = VoiceLatency.m();
        m.o(hqe.b());
        m.n(hqe.a());
        gl0.c(m.build());
    }
}
