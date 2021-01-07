package com.spotify.eventsender;

import com.google.common.base.Function;
import java.util.List;

public final /* synthetic */ class h implements Function {
    public final /* synthetic */ List a;

    public /* synthetic */ h(List list) {
        this.a = list;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((c0) this.a.get(((Integer) obj).intValue())).c());
    }
}
