package com.spotify.music.features.ads.screensaver;

import com.spotify.music.features.ads.model.AdSettingsModel;
import io.reactivex.functions.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class o implements l {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = n0.y;
        List<AdSettingsModel.AdSettings> list = ((AdSettingsModel) obj).settings;
        if (list == null || list.isEmpty() || list.get(0).display_time_interval == null) {
            return Long.valueOf(n0.x);
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis((long) list.get(0).display_time_interval.intValue()));
    }
}
