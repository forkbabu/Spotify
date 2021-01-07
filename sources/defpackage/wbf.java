package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.kef;
import io.reactivex.functions.l;

/* renamed from: wbf  reason: default package */
public final /* synthetic */ class wbf implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ wbf(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.setRepeatMode(((kef.k) obj).t() ? RepeatMode.CONTEXT : RepeatMode.NONE).E(jaf.a).t(pcf.a);
    }
}
