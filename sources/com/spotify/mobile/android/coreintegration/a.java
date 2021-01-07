package com.spotify.mobile.android.coreintegration;

import com.google.common.base.Function;
import com.spotify.mobile.android.service.session.SessionState;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
