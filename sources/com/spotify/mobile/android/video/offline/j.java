package com.spotify.mobile.android.video.offline;

import com.google.common.base.Predicate;
import java.util.List;

public final /* synthetic */ class j implements Predicate {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return !((List) obj).isEmpty();
    }
}
