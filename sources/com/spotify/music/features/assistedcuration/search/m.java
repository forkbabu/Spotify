package com.spotify.music.features.assistedcuration.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class m {
    private final Context a;

    public m(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    public static Intent b(Context context, String str, String str2) {
        Intent intent = new Intent(context, AssistedCurationSearchActivity.class);
        intent.setData(Uri.parse(str));
        intent.putExtra("ac_search_title", str2);
        return intent;
    }

    public void a(String str) {
        Intent b = b(this.a, str, null);
        b.setAction("add_track");
        this.a.startActivity(b);
    }

    public void c(String str, String str2) {
        this.a.startActivity(b(this.a, str, str2));
    }
}
