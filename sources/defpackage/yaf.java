package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: yaf  reason: default package */
public final /* synthetic */ class yaf implements l {
    public final /* synthetic */ f a;

    public /* synthetic */ yaf(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        Context fromUri = Context.fromUri(((kef.t) obj).t());
        z<zwd> a2 = fVar.a(PlayCommand.builder(fromUri, PlayOrigin.create("car-thing-voice")).options(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build()).build());
        a2.getClass();
        return new i(a2).N();
    }
}
