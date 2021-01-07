package com.spotify.music.notification;

import io.reactivex.a;
import io.reactivex.z;
import java.util.List;

public interface c {
    @zqf("notifs-preferences/v3/preferences")
    z<List<CategorySection>> a(@nrf("locale") String str);

    @irf("notifs-preferences/v3/subscribe")
    a b(@nrf("channel") String str, @nrf("message_type") String str2);

    @irf("notifs-preferences/v3/unsubscribe")
    a c(@nrf("channel") String str, @nrf("message_type") String str2);
}
