package com.spotify.music.follow.resolver;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        MoreObjects.checkArgument(z);
        return s.i0(list.get(0));
    }
}
