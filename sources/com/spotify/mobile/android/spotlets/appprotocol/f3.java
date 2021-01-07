package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Function;
import java.util.Map;

public final /* synthetic */ class f3 implements Function {
    public static final /* synthetic */ f3 a = new f3();

    private /* synthetic */ f3() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }
}
