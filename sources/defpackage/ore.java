package defpackage;

import com.spotify.base.java.logging.Logger;
import io.netty.handler.codec.http.z;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;

/* renamed from: ore  reason: default package */
public final /* synthetic */ class ore implements s {
    public final /* synthetic */ z c;

    public /* synthetic */ ore(z zVar) {
        this.c = zVar;
    }

    @Override // io.netty.util.concurrent.s
    public final void a(r rVar) {
        z zVar = this.c;
        if (rVar == null || rVar.x()) {
            Logger.b("Channel successfully closed after handling response, response=%s", zVar);
        } else {
            Logger.d("Failed to close future: %s", rVar.r().getMessage());
        }
    }
}
