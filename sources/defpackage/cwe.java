package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: cwe  reason: default package */
public final /* synthetic */ class cwe implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ cwe(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new i(this.a.setRepeatMode(((uue.q) obj).a() ? RepeatMode.CONTEXT : RepeatMode.NONE).E(nve.a)).N();
    }
}
