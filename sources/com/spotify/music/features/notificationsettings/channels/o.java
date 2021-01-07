package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import java.util.List;

public final class o {
    private final wlf<ChannelsInjector> a;
    private final wlf<ChannelsAdapter> b;

    public o(wlf<ChannelsInjector> wlf, wlf<ChannelsAdapter> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public n b(List<? extends Channel> list) {
        ChannelsInjector channelsInjector = this.a.get();
        a(channelsInjector, 1);
        ChannelsAdapter channelsAdapter = this.b.get();
        a(channelsAdapter, 2);
        a(list, 3);
        return new n(channelsInjector, channelsAdapter, list);
    }
}
