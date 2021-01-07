package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Iterator;

public class p implements w<b91, b91> {
    static final q81 b = z81.d("row:downloadToggle", HubsComponentCategory.ROW.name());
    private final r8c a;

    public p(r8c r8c) {
        this.a = r8c;
    }

    public b91 a(b91 b91) {
        if (!this.a.c()) {
            return b91;
        }
        ArrayList arrayList = new ArrayList(b91.body());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            s81 s81 = (s81) it.next();
            if ("nft-track-track-cloud".equals(s81.id())) {
                arrayList.add(b91.body().indexOf(s81), z81.c().s("download-toggle").n(b).e("click", z81.b().e("download")).l());
                break;
            }
        }
        return je.L(b91, arrayList);
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return sVar.j0(new f(this)).E();
    }
}
