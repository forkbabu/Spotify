package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: uye  reason: default package */
public final /* synthetic */ class uye implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ t0f b;

    public /* synthetic */ uye(f fVar, t0f t0f) {
        this.a = fVar;
        this.b = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        t0f t0f = this.b;
        uue.v vVar = (uue.v) obj;
        Context fromUri = Context.fromUri(vVar.a());
        return new i(fVar.a(PlayCommand.builder(fromUri, PlayOrigin.create("voice")).options(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build()).build()).p(new oxe(t0f, vVar)).E(new txe(new ove(t0f, vVar)))).N();
    }
}
