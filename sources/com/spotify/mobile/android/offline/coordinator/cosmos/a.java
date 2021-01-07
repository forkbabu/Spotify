package com.spotify.mobile.android.offline.coordinator.cosmos;

import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == null) {
                Episode.a a2 = Episode.a();
                a2.f((String) entry.getKey());
                a2.F(Episode.MediaType.UNKNOWN);
                entry.setValue(a2.build());
            }
        }
        return map;
    }
}
