package com.spotify.http;

import com.spotify.cosmos.android.FireAndForgetResolver;
import java.util.List;

public class k implements i {
    private final FireAndForgetResolver a;
    private final o b;

    k(FireAndForgetResolver fireAndForgetResolver, o oVar) {
        this.a = fireAndForgetResolver;
        this.b = oVar;
    }

    @Override // com.spotify.http.i
    public void a(List<RequestInfo> list) {
        this.a.detached(this.b.a(list).N());
    }
}
