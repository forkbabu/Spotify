package com.spotify.music.features.languagepicker.model;

import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class c implements io.reactivex.functions.c {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        List<AvailableLanguage> list = (List) obj;
        List list2 = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        for (AvailableLanguage availableLanguage : list) {
            arrayList.add(new d(availableLanguage.name(), availableLanguage.imageUri(), availableLanguage.bcp47(), list2.contains(availableLanguage.bcp47())));
        }
        return arrayList;
    }
}
