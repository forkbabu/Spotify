package com.spotify.music.features.assistedcuration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.collect.Collections2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchActivity;
import com.spotify.music.navigation.b;
import java.util.ArrayList;
import java.util.Set;

public class c implements wec {
    private final Activity a;
    private final Bundle b;
    private final b c;

    public c(Activity activity, b bVar) {
        this.a = activity;
        this.b = androidx.core.app.b.a(activity, 17432576, 17432577).c();
        this.c = bVar;
    }

    @Override // defpackage.wec
    public void a(String str) {
        this.c.a(AssistedCurationActivity.V0(this.a, str, 0, "PlaylistTrackHandler", null, null, new String[0]), this.b);
    }

    @Override // defpackage.wec
    public void b(String str, int i, String str2, SpotifyIconV2 spotifyIconV2, String str3, String... strArr) {
        this.c.a(AssistedCurationActivity.V0(this.a, str, i, str2, null, str3, strArr), this.b);
    }

    @Override // defpackage.wec
    public void c(Set<String> set, String str, int i) {
        this.a.startActivityForResult(d(set, str), i);
    }

    @Override // defpackage.wec
    public Intent d(Set<String> set, String str) {
        Activity activity = this.a;
        ArrayList<String> newArrayList = Collections2.newArrayList(set);
        int i = AssistedCurationSearchActivity.X;
        Intent intent = new Intent(activity, AssistedCurationSearchActivity.class);
        intent.putStringArrayListExtra("track_uris_to_ignore", newArrayList);
        intent.putExtra("playlist_title", str);
        return intent;
    }
}
