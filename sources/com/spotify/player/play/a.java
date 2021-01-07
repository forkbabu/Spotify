package com.spotify.player.play;

import com.google.common.base.Optional;
import com.spotify.player.internal.c;
import com.spotify.player.internal.g;
import com.spotify.player.model.PlayerSession;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class a implements f {
    private final c a;
    private final g b;
    private final com.spotify.player.internal.a c;

    /* renamed from: com.spotify.player.play.a$a  reason: collision with other inner class name */
    static final class C0368a<T, R> implements l<PlayerSession, g> {
        final /* synthetic */ a a;

        C0368a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public g apply(PlayerSession playerSession) {
            PlayerSession playerSession2 = playerSession;
            h.e(playerSession2, "sessionResponse");
            return new b(playerSession2.session(), this.a.b, this.a.c);
        }
    }

    public a(c cVar, g gVar, com.spotify.player.internal.a aVar) {
        h.e(cVar, "commandResolver");
        h.e(gVar, "sessionCommandResolver");
        h.e(aVar, "loggingParamsFactory");
        this.a = cVar;
        this.b = gVar;
        this.c = aVar;
    }

    @Override // com.spotify.player.play.f
    public z<zwd> a(PlayCommand playCommand) {
        h.e(playCommand, "playCommand");
        PlayCommand.Builder builder = playCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.c;
        Optional<LoggingParams> loggingParams = playCommand.loggingParams();
        h.d(loggingParams, "playCommand.loggingParams()");
        PlayCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        c cVar = this.a;
        h.d(build, "updatedCommand");
        return cVar.b("play", build);
    }

    @Override // com.spotify.player.play.f
    public z<g> b(PreparePlayCommand preparePlayCommand) {
        h.e(preparePlayCommand, "preparePlayCommand");
        z<R> A = this.b.a(preparePlayCommand).A(new C0368a(this));
        h.d(A, "sessionCommandResolver.c…y\n            )\n        }");
        return A;
    }
}
