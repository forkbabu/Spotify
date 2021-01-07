package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import io.netty.channel.g;
import io.netty.channel.h;

/* renamed from: kre  reason: default package */
public final /* synthetic */ class kre implements h {
    public final /* synthetic */ io.reactivex.h c;

    public /* synthetic */ kre(io.reactivex.h hVar) {
        this.c = hVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
    @Override // io.netty.util.concurrent.s
    public final void a(g gVar) {
        io.reactivex.h hVar = this.c;
        g gVar2 = gVar;
        if (gVar2.x()) {
            Logger.b("Successfully sent player state, now onto audio!", new Object[0]);
            hVar.onNext(gVar2.h());
            return;
        }
        Logger.d("Error sending data %s", gVar2.r());
        hVar.onError(new VoiceSessionException(ErrorDomain.CONNECTION, i.f, gVar2.r()));
    }
}
