package com.spotify.eventsender;

import com.google.common.base.Predicate;
import java.util.List;

public final /* synthetic */ class i implements Predicate {
    public final /* synthetic */ List a;

    public /* synthetic */ i(List list) {
        this.a = list;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Integer num = (Integer) obj;
        return num.intValue() >= 0 && num.intValue() < this.a.size();
    }
}
