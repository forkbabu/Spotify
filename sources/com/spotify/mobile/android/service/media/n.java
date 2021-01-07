package com.spotify.mobile.android.service.media;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class n implements l {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        boolean z = false;
        if (list.size() == 1 && ((Boolean) list.get(0)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
