package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: vwe  reason: default package */
public final /* synthetic */ class vwe implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ vwe(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.r rVar = (uue.r) obj;
        return new i(this.a.setRepeatMode(RepeatMode.TRACK).E(ive.a)).N();
    }
}
