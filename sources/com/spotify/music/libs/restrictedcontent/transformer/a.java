package com.spotify.music.libs.restrictedcontent.transformer;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Assertion.i("ContentRestrictedHelperImpl onError called:", (Throwable) obj);
        return Boolean.FALSE;
    }
}
