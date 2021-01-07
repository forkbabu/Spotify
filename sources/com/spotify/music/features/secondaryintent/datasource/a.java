package com.spotify.music.features.secondaryintent.datasource;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.ArrayList;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SavedAds savedAds = (SavedAds) obj;
        ArrayList arrayList = new ArrayList();
        if (!(savedAds == null || savedAds.getAds() == null || savedAds.getAds().isEmpty())) {
            for (Ad ad : savedAds.getAds()) {
                if (!ad.getImages().isEmpty()) {
                    arrayList.add(ad);
                }
            }
        }
        return s.i0(arrayList).A0(arrayList);
    }
}
