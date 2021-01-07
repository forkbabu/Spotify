package com.spotify.music.features.yourlibrary.container.utils;

import com.google.common.base.Optional;
import io.reactivex.functions.c;

public final /* synthetic */ class e implements c {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Optional optional = (Optional) obj;
        return optional.isPresent() ? optional : (Optional) obj2;
    }
}
