package com.spotify.player.play;

import com.spotify.player.internal.PlayerInternalError;
import com.spotify.player.internal.a;
import com.spotify.player.internal.g;
import com.spotify.player.model.command.PlaySessionCommand;
import io.reactivex.z;

public class b implements g {
    private final String a;
    private final g b;
    private final a c;
    private boolean d;

    public b(String str, g gVar, a aVar) {
        this.a = str;
        this.b = gVar;
        this.c = aVar;
    }

    @Override // com.spotify.player.play.g
    public z<zwd> H() {
        PlaySessionCommand create = PlaySessionCommand.create();
        this.d = true;
        return this.b.b(this.a, create.toBuilder().loggingParams(this.c.c(create.loggingParams())).build());
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.d) {
            super.finalize();
            return;
        }
        throw new PlayerInternalError(new Throwable(String.format("PreparedSession '%s' has not been destroyed", this.a)));
    }
}
