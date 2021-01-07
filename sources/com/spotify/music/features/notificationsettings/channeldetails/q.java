package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import java.util.List;
import kotlin.Pair;

public final class q {
    private final wlf<ChannelDetailsInjector> a;
    private final wlf<ChannelDetailsAdapter> b;

    public q(wlf<ChannelDetailsInjector> wlf, wlf<ChannelDetailsAdapter> wlf2) {
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

    public p b(Pair<? extends List<a>, ? extends Channel> pair) {
        ChannelDetailsInjector channelDetailsInjector = this.a.get();
        a(channelDetailsInjector, 1);
        ChannelDetailsAdapter channelDetailsAdapter = this.b.get();
        a(channelDetailsAdapter, 2);
        a(pair, 3);
        return new p(channelDetailsInjector, channelDetailsAdapter, pair);
    }
}
