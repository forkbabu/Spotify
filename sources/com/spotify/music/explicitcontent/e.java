package com.spotify.music.explicitcontent;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return Boolean.valueOf(optional.isPresent() && "1".equals(optional.get()));
    }
}
