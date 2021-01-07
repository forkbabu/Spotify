package com.spotify.music.explicitcontent;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return Boolean.valueOf(optional.isPresent() && "1".equals(optional.get()));
    }
}
