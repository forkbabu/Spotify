package com.spotify.music.features.settings;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.a;
import com.spotify.android.flags.j;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;

public class v0 extends v {
    @Deprecated
    public static final AudioQualityFlag c = new AudioQualityFlag(Overridable.DEBUG);
    @Deprecated
    public static final j d = k.g("loudness-levels", Overridable.INTERNAL);
    @Deprecated
    public static final a e = k.e("licensing-scta-info", Overridable.ALWAYS);
}
