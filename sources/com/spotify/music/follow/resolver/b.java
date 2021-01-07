package com.spotify.music.follow.resolver;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.follow.j;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.functions.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class b implements c {
    public final /* synthetic */ List a;

    public /* synthetic */ b(List list) {
        this.a = list;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        List list = this.a;
        RxFollowersCountResolver.Counts counts = (RxFollowersCountResolver.Counts) obj;
        Map map = (Map) obj2;
        boolean z = true;
        MoreObjects.checkArgument(counts.counts.length == list.size());
        if (map.size() != list.size()) {
            z = false;
        }
        MoreObjects.checkArgument(z);
        int size = map.size();
        ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            RxFollowersCountResolver.Count count = counts.counts[i];
            CollectionStateProvider.a aVar = (CollectionStateProvider.a) map.get(str);
            aVar.getClass();
            newArrayListWithCapacity.add(j.b(str, count.getFollowersCount(), count.getFollowingCount(), aVar.b(), aVar.a()));
        }
        return newArrayListWithCapacity;
    }
}
