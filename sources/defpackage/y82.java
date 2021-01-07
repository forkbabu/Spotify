package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.appprotocol.api.session.a;
import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.functions.l;
import java.util.Iterator;
import java.util.List;

/* renamed from: y82  reason: default package */
public final /* synthetic */ class y82 implements l {
    public static final /* synthetic */ y82 a = new y82();

    private /* synthetic */ y82() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            b bVar = (b) it.next();
            Logger.b("WazeInterAppConnectedState: sessionInfo.sessionId=%s", Integer.valueOf(bVar.b()));
            a a2 = bVar.a();
            if (a2 != null && 1 == a2.d() && a2.e() && "b3b13bd9904a4d6da4116e9c0d17be6d".equals(a2.b().info.id)) {
                z = true;
                break;
            }
        }
        Logger.b("WazeInterAppConnectedState: foundWaze=%b", Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }
}
