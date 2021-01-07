package defpackage;

import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Impression;
import io.reactivex.functions.a;

/* renamed from: sf2  reason: default package */
public final /* synthetic */ class sf2 implements a {
    public final /* synthetic */ uf2 a;
    public final /* synthetic */ InstrumentationAppProtocol$Impression b;

    public /* synthetic */ sf2(uf2 uf2, InstrumentationAppProtocol$Impression instrumentationAppProtocol$Impression) {
        this.a = uf2;
        this.b = instrumentationAppProtocol$Impression;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b);
    }
}
