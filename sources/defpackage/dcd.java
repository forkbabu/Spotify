package defpackage;

import com.spotify.music.container.app.foregroundstate.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: dcd  reason: default package */
public final /* synthetic */ class dcd implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ t7d b;

    public /* synthetic */ dcd(d dVar, t7d t7d) {
        this.a = dVar;
        this.b = t7d;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new kcd(this.a, this.b), false, Integer.MAX_VALUE);
    }
}
