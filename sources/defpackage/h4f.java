package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: h4f  reason: default package */
public final /* synthetic */ class h4f implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ a8f b;

    public /* synthetic */ h4f(f fVar, a8f a8f) {
        this.a = fVar;
        this.b = a8f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        a8f a8f = this.b;
        p2f.y yVar = (p2f.y) obj;
        Context fromUri = Context.fromUri(yVar.a());
        return fVar.a(PlayCommand.builder(fromUri, PlayOrigin.create("voice")).options(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build()).build()).p(new u6f(a8f, yVar)).E(new k4f(new n3f(a8f, yVar))).P();
    }
}
