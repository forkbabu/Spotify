package com.spotify.feature.speakerdeeplink;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.d0((List) obj).Q(new o(this.a)).Q(k.a).Q(h.a);
    }
}
