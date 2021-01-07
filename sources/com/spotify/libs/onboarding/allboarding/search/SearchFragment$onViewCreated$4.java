package com.spotify.libs.onboarding.allboarding.search;

import androidx.lifecycle.a0;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.Logging;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import com.spotify.libs.onboarding.allboarding.c;
import com.spotify.libs.onboarding.allboarding.room.j;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SearchFragment$onViewCreated$4 extends Lambda implements rmf<Integer, SearchItem, f> {
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFragment$onViewCreated$4(SearchFragment searchFragment) {
        super(2);
        this.this$0 = searchFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(Integer num, SearchItem searchItem) {
        j jVar;
        a0 d;
        int intValue = num.intValue();
        SearchItem searchItem2 = searchItem;
        h.e(searchItem2, "item");
        lp8 R4 = this.this$0.R4();
        String q = searchItem2.q();
        h.d(q, "item.uri");
        Logging l = searchItem2.l();
        h.d(l, "item.logging");
        String h = l.h();
        Logging l2 = searchItem2.l();
        h.d(l2, "item.logging");
        R4.b(intValue, 0, null, q, h, null, l2.l());
        if (searchItem2.p() == SearchItem.SearchItemType.ARTIST) {
            sw0 S4 = this.this$0.S4();
            String q2 = searchItem2.q();
            h.d(q2, "item.uri");
            S4.a(intValue, q2);
        } else if (searchItem2.p() == SearchItem.SearchItemType.DEFAULT) {
            this.this$0.S4().e(Integer.valueOf(intValue), searchItem2.q());
        }
        int ordinal = searchItem2.p().ordinal();
        if (ordinal == 1) {
            Item h2 = searchItem2.h();
            h.d(h2, "item.contentPickerItem");
            jVar = c.a(h2);
        } else if (ordinal == 2) {
            Item h3 = searchItem2.h();
            h.d(h3, "item.contentPickerItem");
            jVar = c.j(h3);
        } else {
            StringBuilder V0 = je.V0("Item type ");
            V0.append(searchItem2.p());
            V0.append(" not supported");
            throw new IllegalArgumentException(V0.toString());
        }
        j a = j.a(jVar, null, null, searchItem2.m(), null, null, null, null, null, null, null, null, null, 4091);
        androidx.navigation.h h4 = c.e(this.this$0).h();
        if (!(h4 == null || (d = h4.d()) == null)) {
            d.e("searchResult", a);
        }
        c.e(this.this$0).k();
        return f.a;
    }
}
