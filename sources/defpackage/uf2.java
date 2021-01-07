package defpackage;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Impression;
import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Interaction;

/* renamed from: uf2  reason: default package */
public class uf2 implements a {
    private final nkd a;

    public uf2(nkd nkd) {
        this.a = nkd;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b = cf2.b(InstrumentationAppProtocol$Impression.class, AppProtocolBase.Empty.class);
        b.d("com.spotify.superbird.instrumentation.impression");
        b.c(0);
        b.e(new qf2(this));
        qg0.accept(b.a());
        cf2 b2 = cf2.b(InstrumentationAppProtocol$Interaction.class, AppProtocolBase.Empty.class);
        b2.d("com.spotify.superbird.instrumentation.interaction");
        b2.c(0);
        b2.e(new rf2(this));
        qg0.accept(b2.a());
    }

    public /* synthetic */ void b(InstrumentationAppProtocol$Impression instrumentationAppProtocol$Impression) {
        this.a.a(instrumentationAppProtocol$Impression.impression());
    }

    public /* synthetic */ void c(InstrumentationAppProtocol$Interaction instrumentationAppProtocol$Interaction) {
        this.a.b(instrumentationAppProtocol$Interaction.interaction());
    }
}
