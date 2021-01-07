package defpackage;

import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Interaction;
import io.reactivex.functions.a;

/* renamed from: tf2  reason: default package */
public final /* synthetic */ class tf2 implements a {
    public final /* synthetic */ uf2 a;
    public final /* synthetic */ InstrumentationAppProtocol$Interaction b;

    public /* synthetic */ tf2(uf2 uf2, InstrumentationAppProtocol$Interaction instrumentationAppProtocol$Interaction) {
        this.a = uf2;
        this.b = instrumentationAppProtocol$Interaction;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b);
    }
}
