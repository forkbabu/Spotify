package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class k0 {
    private final Context a;

    public k0(Context context) {
        this.a = context;
    }

    public String a(h76 h76, boolean z) {
        j l = h76.l();
        Optional absent = Optional.absent();
        p m = l.m();
        if (m != null) {
            absent = Optional.fromNullable(m.a());
        }
        ArrayList arrayList = new ArrayList();
        if (absent.isPresent()) {
            arrayList.add(this.a.getString(C0707R.string.by, (String) absent.get()));
        }
        int i = h76.i();
        if (i > 0) {
            if (!arrayList.isEmpty()) {
                arrayList.add(" • ");
            }
            if (z) {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.playlist_header_subtitle_likes, i, d0.e(i, Locale.getDefault())));
            } else {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.header_playlist_followers_count, i, Integer.valueOf(i)));
            }
        }
        if (nud.m(this.a)) {
            Collections.reverse(arrayList);
        }
        return Joiner.on("").join(arrayList);
    }
}
