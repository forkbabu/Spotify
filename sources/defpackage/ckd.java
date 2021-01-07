package defpackage;

import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

/* renamed from: ckd  reason: default package */
public final class ckd implements fjf<bkd> {
    private final wlf<s<List<b>>> a;
    private final wlf<y> b;

    public ckd(wlf<s<List<b>>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static bkd a(s<List<b>> sVar, y yVar) {
        return new bkd(sVar, yVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bkd(this.a.get(), this.b.get());
    }
}
