package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Collection;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ImmutableList.copyOf((Collection) ((ArrayList) obj));
    }
}
