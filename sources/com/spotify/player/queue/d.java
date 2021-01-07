package com.spotify.player.queue;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.internal.a;
import com.spotify.player.internal.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.AddToQueueCommand;
import com.spotify.player.model.command.SetQueueCommand;
import defpackage.pxd;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.z;

public class d implements f {
    private final pxd a;
    private final c b;
    private final g<PlayerQueue> c;
    private final a d;

    public d(RxRouter rxRouter, pxd pxd, c cVar, a aVar) {
        this.a = pxd;
        this.b = cVar;
        this.d = aVar;
        this.c = rxRouter.resolve(new Request(Request.SUB, "sp://player/v2/main/queue")).j0(new b(this)).Q(a.a).j0(c.a).Y0(BackpressureStrategy.LATEST).V(1).r0();
    }

    public static Optional d(d dVar, Response response) {
        pxd.a a2 = dVar.a.a(response.getBody(), PlayerQueue.class);
        if (a2 instanceof pxd.a.b) {
            return Optional.of(((pxd.a.b) a2).a());
        }
        return Optional.absent();
    }

    @Override // com.spotify.player.queue.f
    public g<PlayerQueue> a() {
        return this.c;
    }

    @Override // com.spotify.player.queue.f
    public z<zwd> b(SetQueueCommand setQueueCommand) {
        return this.b.a("queue", setQueueCommand.toBuilder().loggingParams(this.d.c(setQueueCommand.loggingParams())).build());
    }

    @Override // com.spotify.player.queue.f
    public z<zwd> c(ContextTrack contextTrack) {
        AddToQueueCommand create = AddToQueueCommand.create(contextTrack);
        return this.b.b("add_to_queue", create.toBuilder().loggingParams(this.d.c(create.loggingParams())).build());
    }
}
