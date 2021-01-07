package com.spotify.music.features.ads.api;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSettingsModel;
import io.reactivex.s;

public interface e {
    s<Response> a(String str, boolean z);

    s<AdSettingsModel> b(String str);

    s<Response> c(String str, String str2, boolean z);

    s<Response> d(String str, String str2, String str3);
}
