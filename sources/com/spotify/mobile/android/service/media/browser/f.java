package com.spotify.mobile.android.service.media.browser;

import io.reactivex.functions.h;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class f implements h {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        List list3 = (List) obj3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }
}
