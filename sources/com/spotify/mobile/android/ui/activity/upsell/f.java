package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return "premium".equals(((SessionState) obj).productType());
    }
}
