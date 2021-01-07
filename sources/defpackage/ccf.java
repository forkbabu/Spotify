package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.kef;
import io.reactivex.functions.l;

/* renamed from: ccf  reason: default package */
public final /* synthetic */ class ccf implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ ccf(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.l lVar = (kef.l) obj;
        return this.a.setRepeatMode(RepeatMode.TRACK).E(jaf.a).t(pcf.a);
    }
}
