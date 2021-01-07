package com.spotify.music.features.playlistentity.trackcloud;

import android.content.Context;
import com.google.common.base.Joiner;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Collections;

public class q {
    private final boolean a;
    private final Context b;

    public q(Context context, boolean z) {
        this.a = z;
        this.b = context;
    }

    public String a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            arrayList.add(this.b.getResources().getQuantityString(C0707R.plurals.playlist_trackcloud_includes_label_songs, i, Integer.valueOf(i)));
        }
        if (i2 > 0) {
            if (!arrayList.isEmpty()) {
                arrayList.add(" • ");
            }
            arrayList.add(this.b.getResources().getQuantityString(C0707R.plurals.playlist_trackcloud_includes_label_episodes, i2, Integer.valueOf(i2)));
        }
        if (this.a) {
            Collections.reverse(arrayList);
        }
        return Joiner.on("").join(arrayList);
    }
}
