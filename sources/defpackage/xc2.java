package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: xc2  reason: default package */
public final /* synthetic */ class xc2 implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ lxd b;
    public final /* synthetic */ d c;

    public /* synthetic */ xc2(f fVar, lxd lxd, d dVar) {
        this.a = fVar;
        this.b = lxd;
        this.c = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        lxd lxd = this.b;
        d dVar = this.c;
        r.e eVar = (r.e) obj;
        s<Object> sVar = o.a;
        if (!l0.x(eVar.a())) {
            return sVar;
        }
        Context fromUri = Context.fromUri(eVar.a());
        lxd.getClass();
        h.e(fromUri, "context");
        PlayCommand build = lxd.a(fromUri).build();
        h.d(build, "builder(context).build()");
        return new i(fVar.a(build).s(new kc2(dVar))).g(sVar);
    }
}
