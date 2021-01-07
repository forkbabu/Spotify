package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.playlist.models.k;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Integer.valueOf(((k) obj).getUnrangedLength());
    }
}
