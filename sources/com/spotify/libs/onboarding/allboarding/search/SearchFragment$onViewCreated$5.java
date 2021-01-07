package com.spotify.libs.onboarding.allboarding.search;

import com.spotify.allboarding.model.v1.proto.SearchItem;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SearchFragment$onViewCreated$5 extends Lambda implements rmf<Integer, SearchItem, f> {
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFragment$onViewCreated$5(SearchFragment searchFragment) {
        super(2);
        this.this$0 = searchFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(Integer num, SearchItem searchItem) {
        int intValue = num.intValue();
        SearchItem searchItem2 = searchItem;
        h.e(searchItem2, "item");
        this.this$0.R4().a(searchItem2.q(), intValue);
        if (searchItem2.p() == SearchItem.SearchItemType.ARTIST) {
            sw0 S4 = this.this$0.S4();
            String q = searchItem2.q();
            h.d(q, "item.uri");
            S4.b(intValue, q);
        } else if (searchItem2.p() == SearchItem.SearchItemType.DEFAULT) {
            this.this$0.S4().f(Integer.valueOf(intValue), searchItem2.q());
        }
        return f.a;
    }
}
