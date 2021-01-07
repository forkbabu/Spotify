package com.spotify.music.features.languagepicker.model;

import io.reactivex.a;
import io.reactivex.z;
import java.util.List;

public interface f {
    @jrf("language-onboarding/v1/user/languages")
    a a(@uqf List<String> list);

    @zqf("language-onboarding/v1/user/languages")
    z<List<String>> b();

    @zqf("language-onboarding/v1/languages")
    z<List<AvailableLanguage>> c();
}
