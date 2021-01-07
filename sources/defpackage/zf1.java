package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import io.reactivex.functions.l;
import java.util.ArrayList;

/* renamed from: zf1  reason: default package */
public final /* synthetic */ class zf1 implements l {
    public final /* synthetic */ BrowserParams a;

    public /* synthetic */ zf1(BrowserParams browserParams) {
        this.a = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        BrowserParams browserParams = this.a;
        u3 u3Var = (u3) obj;
        F<b> f = u3Var.a;
        f.getClass();
        ArrayList arrayList = new ArrayList(10);
        for (b bVar : f) {
            if (browserParams.h().endsWith(bVar.getKey())) {
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    if (cVar.a() != null) {
                        arrayList.addAll(cVar.a());
                    }
                } else if (bVar instanceof a) {
                    a aVar = (a) bVar;
                    if (aVar.a() != null) {
                        arrayList.add(aVar.a());
                    }
                }
            }
        }
        return new u3(arrayList, u3Var.b);
    }
}
