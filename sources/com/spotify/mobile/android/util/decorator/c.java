package com.spotify.mobile.android.util.decorator;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;

public abstract class c<T> {
    private final w<Response, Map<String, T>> a;
    private final Policy b = null;
    private boolean c;

    protected c(y yVar, y yVar2) {
        this.a = new a(this, yVar, yVar2);
    }

    /* access modifiers changed from: protected */
    public abstract z<Response> a(UpdateModel updateModel);

    /* access modifiers changed from: protected */
    public abstract s<Response> b(UpdateModel updateModel);

    /* access modifiers changed from: protected */
    public abstract Map<String, T> c(byte[] bArr);

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.c;
    }

    public z<Map<String, T>> e(String str, String... strArr) {
        strArr.getClass();
        return a(new UpdateModel(strArr, this.b, str)).P().q(this.a).T();
    }

    public s<Map<String, T>> f(String... strArr) {
        return b(new UpdateModel(strArr, this.b, null)).q(this.a);
    }

    public void g(boolean z) {
        this.c = z;
    }
}
