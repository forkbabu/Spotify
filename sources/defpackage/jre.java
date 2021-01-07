package defpackage;

import com.spotify.base.java.logging.Logger;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;

/* renamed from: jre  reason: default package */
public final /* synthetic */ class jre implements s {
    public static final /* synthetic */ jre c = new jre();

    private /* synthetic */ jre() {
    }

    @Override // io.netty.util.concurrent.s
    public final void a(r rVar) {
        if (rVar.x()) {
            Logger.b("Channel successfully closed by SpeechChannelWriter", new Object[0]);
        } else {
            Logger.d("Failed to close future: %s", rVar.r().getMessage());
        }
    }
}
