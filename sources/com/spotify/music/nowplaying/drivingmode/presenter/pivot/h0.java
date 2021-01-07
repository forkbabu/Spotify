package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class h0 implements l {
    public static final /* synthetic */ h0 a = new h0();

    private /* synthetic */ h0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ImmutableList.copyOf((Collection) ((List) obj));
    }
}
