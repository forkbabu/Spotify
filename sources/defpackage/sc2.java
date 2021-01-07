package defpackage;

import com.spotify.music.ads.voice.domain.r;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: sc2  reason: default package */
public final /* synthetic */ class sc2 implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ sc2(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        r.n nVar = (r.n) obj;
        return s.i0(com.spotify.music.ads.voice.domain.s.o(nVar.b())).C(nVar.a(), TimeUnit.MILLISECONDS, this.a);
    }
}
