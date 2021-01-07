package com.spotify.eventsender;

import android.content.Context;
import android.provider.Settings;

public class t {
    private final Context a;
    private String b;

    t(Context context) {
        this.a = context;
    }

    public synchronized String a() {
        if (this.b == null) {
            this.b = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        }
        return this.b;
    }
}
