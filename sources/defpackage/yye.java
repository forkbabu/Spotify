package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import defpackage.uue;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: yye  reason: default package */
public final class yye {
    private static final ImmutableSet<String> a = ImmutableSet.of("spotify:voice-experiments:guessing-dialog", "spotify:voice-experiments:favorites-dialog", "spotify:voice-experiments:generic-dialog", "spotify:voice-experiments:introducer", "spotify:voice:umm-dialog");
    public static final /* synthetic */ int b = 0;

    static e c(d dVar, hze hze, uue.e eVar) {
        if (a.contains(eVar.b())) {
            return new i(dVar.a(c.c()).E(lxe.a)).B().d(hze.c(eVar.b(), eVar.a()));
        }
        return hze.b(eVar.b());
    }

    /* access modifiers changed from: private */
    public static s<vue> h(a aVar, f fVar, d dVar, fze fze, String str, String str2, t0f t0f) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return dVar.a(c.e()).p(new fxe(t0f, str2)).t(new hwe(aVar)).N();
        }
        ((kw8) fze).getClass();
        l0 z = l0.z(str);
        if (x.i(z) || x.e(z.q())) {
            return ((kw8) fze).b(str).p(new rwe(t0f, str2)).q(new swe(t0f, str2, str)).B().d(aVar).N();
        }
        return fVar.a(PlayCommand.create(Context.fromUri(str), PlayOrigin.create("voice"))).p(new mwe(t0f, str2)).E(new txe(new pwe(t0f, str2, str))).t(new axe(aVar)).N();
    }

    private static a i(t92 t92) {
        return a.u(new cxe(t92)).o(200, TimeUnit.MILLISECONDS).B();
    }
}
