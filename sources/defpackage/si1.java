package defpackage;

import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.i;
import com.spotify.remoteconfig.x4;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: si1  reason: default package */
public class si1 implements qh1 {
    private final o a;
    private final aaa b;
    private final x4 c;

    public si1(aaa aaa, o oVar, x4 x4Var) {
        this.b = aaa;
        this.a = oVar;
        this.c = x4Var;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        z9a b2 = this.b.b();
        boolean z = true;
        b2.b().c(false, !browserParams.n(), false);
        String str = map.get("type");
        if (str == null) {
            return z.q(new IllegalStateException());
        }
        if (!str.equals("premium") || !browserParams.l() || !this.c.a()) {
            z = false;
        }
        return b2.a().B0().A(new kg1(this, z));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public /* synthetic */ List c(boolean z, i iVar) {
        b[] bVarArr = (b[]) iVar.getItems().toArray(new b[0]);
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (b bVar : bVarArr) {
            arrayList.add(this.a.c(bVar, z, PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }
}
