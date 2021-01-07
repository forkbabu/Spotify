package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ f(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.fromNullable(((Map) obj).get(this.a));
    }
}
