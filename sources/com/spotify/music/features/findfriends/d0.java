package com.spotify.music.features.findfriends;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class d0 implements l {
    public final /* synthetic */ List a;

    public /* synthetic */ d0(List list) {
        this.a = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ImmutableList.copyOf(Collections2.filter((Iterable) this.a, (Predicate) new y((String) obj)));
    }
}
