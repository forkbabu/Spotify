package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import io.netty.channel.k;
import io.netty.channel.m;
import io.reactivex.h;
import java.io.IOException;

/* renamed from: ase  reason: default package */
class ase extends m {
    private final h<?> b;
    private boolean c;

    ase(h<?> hVar) {
        this.b = hVar;
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void G(k kVar) {
        Logger.b("channel inactive ", new Object[0]);
        kVar.m0();
        if (!this.b.isCancelled()) {
            this.b.f(new VoiceSessionException(ErrorDomain.CONNECTION, i.g, new IOException("Connection already closed")));
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void M(k kVar) {
        kVar.P();
        this.b.e(new nre(kVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x011d A[RETURN] */
    @Override // io.netty.channel.m, io.netty.channel.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(io.netty.channel.k r10, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ase.S(io.netty.channel.k, java.lang.Object):void");
    }

    @Override // io.netty.channel.m, io.netty.channel.j, io.netty.channel.i, io.netty.channel.l
    public void d(k kVar, Throwable th) {
        Logger.d("exception caught: %s", th.getMessage());
        if (!this.b.isCancelled()) {
            this.b.onError(new VoiceSessionException(ErrorDomain.CONNECTION, i.g, th));
        }
    }
}
