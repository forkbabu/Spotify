package com.spotify.music.homething.addnewdevice.scandevices.service;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = HomethingActivationService.E;
        ArrayList arrayList = new ArrayList();
        for (us9 us9 : (List) obj) {
            arrayList.add(us9.d());
        }
        return arrayList;
    }
}
