package com.spotify.music.features.wrapped2020.stories.container;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ShareDestinationsConfiguration$filter$1 extends Lambda implements nmf<Set<? extends a>, Set<? extends a>> {
    final /* synthetic */ b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareDestinationsConfiguration$filter$1(b bVar) {
        super(1);
        this.this$0 = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Set<? extends a> invoke(Set<? extends a> set) {
        Set<? extends a> set2 = set;
        h.e(set2, "shareDestinationSet");
        ArrayList arrayList = new ArrayList();
        for (T t : set2) {
            if (this.this$0.a.contains(t.a())) {
                arrayList.add(t);
            }
        }
        return d.Z(arrayList);
    }
}
