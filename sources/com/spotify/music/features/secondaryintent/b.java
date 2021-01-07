package com.spotify.music.features.secondaryintent;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import java.util.List;

public final class b {
    public static void a(SavedAdsFragment savedAdsFragment, mh8 mh8) {
        savedAdsFragment.i0 = mh8;
    }

    public static void b(SavedAdsFragment savedAdsFragment, t0<List<Ad>> t0Var) {
        savedAdsFragment.g0 = t0Var;
    }

    public static void c(SavedAdsFragment savedAdsFragment, PageLoaderView.a<List<Ad>> aVar) {
        savedAdsFragment.h0 = aVar;
    }
}
