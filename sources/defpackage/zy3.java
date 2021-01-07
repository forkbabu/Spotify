package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.connection.l;
import com.spotify.music.features.album.offline.model.OfflineState;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: zy3  reason: default package */
public class zy3 implements w<b91, b91> {
    private final String a;
    private final com.spotify.mobile.android.rx.w b;
    private final l c;
    private final vwc d;
    private final ly3 e;

    public zy3(String str, com.spotify.mobile.android.rx.w wVar, l lVar, vwc vwc, ly3 ly3) {
        this.a = str;
        this.b = wVar;
        this.c = lVar;
        this.d = vwc;
        this.e = ly3;
    }

    public static boolean a(String str) {
        return str.equals("glue2:trackRow") || str.equals("glue:entityRow") || str.equals("row:trackWithDownloadProgress") || str.equals("consumerMobile:albumTrackRow");
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        vwc vwc = this.d;
        com.spotify.mobile.android.rx.w wVar = this.b;
        vwc.getClass();
        wVar.getClass();
        return wVar.a("offline").j0(new qwc("1")).W(new sx3(this, sVar), false, Integer.MAX_VALUE);
    }

    public v b(s sVar, Boolean bool) {
        if (!bool.booleanValue()) {
            return sVar;
        }
        s<OfflineState> E = this.e.b(l0.z(this.a).i()).E();
        return s.m(sVar, s.n(sVar, E, lx3.a).W(new vx3(this), false, Integer.MAX_VALUE).E(), this.c.a().j0(xx3.a), tx3.a).E();
    }

    public /* synthetic */ v c(u3 u3Var) {
        return this.e.c(u3Var.a).j0(new wx3(u3Var));
    }
}
