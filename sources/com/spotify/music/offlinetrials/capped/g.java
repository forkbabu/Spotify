package com.spotify.music.offlinetrials.capped;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        int i = n.k;
        boolean z = true;
        if (list.size() != 2 || ((Integer) list.get(1)).intValue() <= ((Integer) list.get(0)).intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
