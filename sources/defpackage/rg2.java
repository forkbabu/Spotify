package defpackage;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.pitstop.model.PitstopAppProtocol$LogMessage;
import java.util.List;

/* renamed from: rg2  reason: default package */
public class rg2 implements a {
    private final dpe a;

    public rg2(dpe dpe) {
        this.a = dpe;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b = cf2.b(PitstopAppProtocol$LogMessage.class, AppProtocolBase.Empty.class);
        b.d("com.spotify.superbird.pitstop.log");
        b.c(0);
        b.e(new pg2(this));
        qg0.accept(b.a());
    }

    public /* synthetic */ void b(List list) {
        this.a.b(list);
    }
}
