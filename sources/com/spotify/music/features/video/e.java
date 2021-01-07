package com.spotify.music.features.video;

import io.reactivex.functions.n;
import java.util.Map;

public final /* synthetic */ class e implements n {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((Map) obj).isEmpty();
    }
}
