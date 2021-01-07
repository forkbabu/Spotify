package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class SortCriteriaTransformer$apply$1 extends FunctionReferenceImpl implements rmf<b91, SortCriteria, b91> {
    SortCriteriaTransformer$apply$1(SortCriteriaTransformer sortCriteriaTransformer) {
        super(2, sortCriteriaTransformer, SortCriteriaTransformer.class, "sortResponse", "sortResponse(Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;Lcom/spotify/music/features/freetierartist/discographysortandfilter/sort/SortCriteria;)Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public b91 invoke(b91 b91, SortCriteria sortCriteria) {
        b91 b912 = b91;
        SortCriteria sortCriteria2 = sortCriteria;
        h.e(b912, "p1");
        h.e(sortCriteria2, "p2");
        ((SortCriteriaTransformer) this.receiver).getClass();
        List<? extends s81> body = b912.body();
        ArrayList arrayList = new ArrayList();
        for (T t : body) {
            if (je.C(t, "freetier:largerRow")) {
                arrayList.add(t);
            }
        }
        int ordinal = sortCriteria2.ordinal();
        Collection collection = arrayList;
        if (ordinal != 0) {
            if (ordinal == 1) {
                collection = d.J(arrayList, new a(0));
            } else if (ordinal == 2) {
                collection = d.J(arrayList, new a(2));
            } else if (ordinal == 3) {
                collection = d.J(arrayList, new a(1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        List<? extends s81> body2 = b912.body();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : body2) {
            if (!je.C(t2, "freetier:largerRow")) {
                arrayList2.add(t2);
            }
        }
        List<? extends s81> W = d.W(arrayList2);
        ((ArrayList) W).addAll(collection == 1 ? 1 : 0);
        return b912.toBuilder().e(W).g();
    }
}
