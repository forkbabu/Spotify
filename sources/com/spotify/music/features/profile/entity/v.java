package com.spotify.music.features.profile.entity;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import androidx.core.app.b;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.music.navigation.t;

public class v {
    private final Activity a;
    private final t b;

    public v(Activity activity, t tVar) {
        this.a = activity;
        this.b = tVar;
    }

    public void a(String str, String str2, String str3, boolean z, int i) {
        b b2 = b.b(this.a, (ImageView) this.a.findViewById(C0707R.id.profile_image), "profile_image");
        Activity activity = this.a;
        int i2 = EditProfileActivity.L;
        Intent intent = new Intent(activity, EditProfileActivity.class);
        intent.putExtra("user-name", str);
        intent.putExtra("display-name", str2);
        intent.putExtra("image-url", str3);
        intent.putExtra("has-spotify-image", z);
        intent.putExtra("color", i);
        activity.startActivity(intent, b2.c());
    }

    public void b(String str) {
        this.b.d(l0.J(str).B() + ":followers");
    }

    public void c(String str) {
        this.b.d(l0.J(str).B() + ":following");
    }

    public void d(String str) {
        this.b.d(l0.J(str).B() + ":playlists");
    }

    public void e(String str) {
        this.b.d(l0.J(str).B() + ":artists");
    }
}
