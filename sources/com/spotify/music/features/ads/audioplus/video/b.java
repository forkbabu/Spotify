package com.spotify.music.features.ads.audioplus.video;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Integer num;
        Map map = (Map) obj;
        try {
            num = Integer.valueOf(Integer.parseInt((String) MoreObjects.firstNonNull(map.get("video-cdn-sampling"), "")));
        } catch (NumberFormatException unused) {
            num = 0;
        }
        return f.a((String) MoreObjects.firstNonNull(map.get("widevine-license-url"), ""), (String) MoreObjects.firstNonNull(map.get("video-manifest-url"), ""), num.intValue());
    }
}
