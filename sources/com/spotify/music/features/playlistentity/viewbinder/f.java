package com.spotify.music.features.playlistentity.viewbinder;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        boolean z = false;
        if (!list.isEmpty() && ((Boolean) list.get(0)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
