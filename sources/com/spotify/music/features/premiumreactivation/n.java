package com.spotify.music.features.premiumreactivation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public class n {
    private final SpSharedPreferences<Object> a;

    public n(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public void a() {
        SpSharedPreferences.a<Object> b = this.a.b();
        b.h(NotificationDay.ONE_DAY.g());
        b.h(NotificationDay.THREE_DAYS.g());
        b.h(NotificationDay.FIVE_DAYS.g());
        b.i();
    }

    public void b(NotificationDay notificationDay) {
        SpSharedPreferences.a<Object> b = this.a.b();
        b.a(notificationDay.g(), true);
        b.i();
    }

    public boolean c(NotificationDay notificationDay) {
        return this.a.d(notificationDay.g(), false);
    }
}
