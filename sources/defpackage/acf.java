package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: acf  reason: default package */
public final /* synthetic */ class acf implements l {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ d b;

    public /* synthetic */ acf(PlayerState playerState, d dVar) {
        this.a = playerState;
        this.b = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.j jVar = (kef.j) obj;
        z<zwd> a2 = this.b.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.valueOf(!this.a.restrictions().disallowSkippingPrevReasons().isEmpty())).build()).build()));
        a2.getClass();
        return new i(a2).N();
    }
}
