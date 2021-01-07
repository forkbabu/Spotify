package com.spotify.music.spotlets.radio.formatlist;

import android.app.Activity;
import android.content.Context;

public class d {
    private final Context a;

    public d(Activity activity) {
        this.a = activity;
    }

    public void a(String str) {
        Context context = this.a;
        context.startService(RadioFormatListService.e(context, str));
    }
}
