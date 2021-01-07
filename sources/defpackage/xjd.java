package defpackage;

import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import com.spotify.music.appprotocol.api.session.a;
import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: xjd  reason: default package */
public final /* synthetic */ class xjd implements l {
    public static final /* synthetic */ xjd a = new xjd();

    private /* synthetic */ xjd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        for (b bVar : (List) obj) {
            a a2 = bVar.a();
            if (a2 != null && 1 == a2.d() && a2.e()) {
                HelloDetailsAppProtocol$HelloDetails b = a2.b();
                if ("6783171782de443ca02df9b63520fc32".equals(b.info.id)) {
                    return new yjd(true, b.info.deviceIdentifier);
                }
            }
        }
        return new yjd(false, null);
    }
}
