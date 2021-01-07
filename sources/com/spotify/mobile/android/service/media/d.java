package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        Logger.l("Successfully loaded %s items", Integer.valueOf(list.size()));
        return list.size() > 350 ? list.subList(0, 350) : list;
    }
}
