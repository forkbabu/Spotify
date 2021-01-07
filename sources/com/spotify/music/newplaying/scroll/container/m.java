package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class m implements l {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        return new ItemDiffResult((ImmutableList) list.get(1), (ImmutableList) list.get(0));
    }
}
