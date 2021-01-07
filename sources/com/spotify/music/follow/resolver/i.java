package com.spotify.music.follow.resolver;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.follow.o;
import com.spotify.music.follow.p;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.s;
import java.util.List;

public class i implements RxFollowersCountResolver {
    private final o a;

    public i(o oVar) {
        this.a = oVar;
    }

    @Override // com.spotify.music.follow.resolver.RxFollowersCountResolver
    public s<RxFollowersCountResolver.Count> a(String str) {
        return b(ImmutableList.of(str)).j0(e.a);
    }

    @Override // com.spotify.music.follow.resolver.RxFollowersCountResolver
    public s<RxFollowersCountResolver.Counts> b(List<String> list) {
        list.getClass();
        MoreObjects.checkArgument(!list.isEmpty());
        return this.a.a(p.create(Collections2.transform((List) list, (Function) d.a))).P().W(new c(list.size()), false, Integer.MAX_VALUE);
    }
}
