package com.spotify.http;

import io.reactivex.functions.n;
import java.util.List;

public final /* synthetic */ class a implements n {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((List) obj).isEmpty();
    }
}
