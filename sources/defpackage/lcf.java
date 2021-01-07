package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import defpackage.kef;
import io.reactivex.functions.l;

/* renamed from: lcf  reason: default package */
public final /* synthetic */ class lcf implements l {
    public final /* synthetic */ j a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ f c;

    public /* synthetic */ lcf(j jVar, zr0 zr0, f fVar) {
        this.a = jVar;
        this.b = zr0;
        this.c = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return vdf.c(this.a, this.b).h(this.c.a(PlayCommand.create(Context.fromUri(((kef.g) obj).t()), PlayOrigin.create("car-thing-voice")))).t(zbf.a).N();
    }
}
