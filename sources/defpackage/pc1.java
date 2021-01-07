package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.AudioStream;
import defpackage.yda;
import java.util.Locale;

/* renamed from: pc1  reason: default package */
public class pc1 {
    private final jz1 a;

    public pc1(jz1 jz1) {
        this.a = jz1;
    }

    private static w91 a(String str, yda yda, String str2, byte[] bArr, String str3) {
        return new w91(str, yda.b(), yda.d(), yda.i(), bArr, str2, yda.a(), yda.c(), yda.e(), yda.f(), yda.j(), str3);
    }

    public void b(String str) {
        yda.b bVar = new yda.b("AndroidOther");
        bVar.p(str);
        bVar.l("unknown");
        bVar.s("unknown");
        yda k = bVar.k();
        this.a.a(a(null, k, AppProtocol.LogMessage.SEVERITY_ERROR, null, null));
        Logger.l("LogHelper.logErrorSession integrationType: %s name: %s", k.d(), k.f());
    }

    public void c(String str, long j, yda yda) {
        if (j != 0) {
            this.a.a(new s91(null, false, j, yda.b(), yda.b()));
        }
        this.a.a(a(str, yda, "disconnected", null, null));
        Logger.l("LogHelper.logEndSession sessionId: %s integrationType: %s name: %s", str, yda.d(), yda.f());
    }

    public void d(String str, String str2, yda yda, AudioStream audioStream) {
        this.a.a(a(str, yda, "end_stream", z42.u(str2), audioStream.name().toLowerCase(Locale.US)));
        Logger.l("LogHelper.logExternalAccessoryEndStream sessionId: %s playbackId: %s", str, str2);
    }

    public void e(String str, long j, yda yda) {
        if (j != 0) {
            this.a.a(new s91(null, true, j, yda.b(), yda.f()));
        }
        this.a.a(a(str, yda, "connected", null, null));
        Logger.l("LogHelper.logStartSession sessionId: %s integrationType: %s name: %s", str, yda.d(), yda.f());
    }
}
