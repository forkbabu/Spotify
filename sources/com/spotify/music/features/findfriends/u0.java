package com.spotify.music.features.findfriends;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.facebook.FacebookPlaceholderActivity;

public class u0 {
    private final Context a;

    public u0(Context context) {
        this.a = context;
    }

    public void a() {
        this.a.startActivity(new Intent(this.a, FacebookPlaceholderActivity.class));
    }
}
