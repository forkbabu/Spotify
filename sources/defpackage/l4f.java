package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: l4f  reason: default package */
public final /* synthetic */ class l4f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ l4f(d dVar, q7f q7f) {
        this.a = dVar;
        this.b = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.s sVar = (p2f.s) obj;
        return this.a.setRepeatMode(RepeatMode.TRACK).E(e5f.a).t(new e6f(this.b));
    }
}
