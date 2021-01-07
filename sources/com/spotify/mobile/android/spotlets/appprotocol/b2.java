package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class b2 implements l {
    public final /* synthetic */ AppProtocol.ChildrenPageRequest a;
    public final /* synthetic */ int b;

    public /* synthetic */ b2(AppProtocol.ChildrenPageRequest childrenPageRequest, int i) {
        this.a = childrenPageRequest;
        this.b = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return e4.e((List) obj, this.a.offset, this.b);
    }
}
