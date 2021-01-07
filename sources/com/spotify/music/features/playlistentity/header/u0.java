package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class u0 {
    private final Context a;

    public u0(Context context) {
        this.a = context;
    }

    public String a(String str) {
        return this.a.getString(C0707R.string.playlist_header_owner_navigate_to_profile, str.toUpperCase(Locale.getDefault()));
    }

    public String b() {
        return this.a.getString(C0707R.string.playlist_header_owner_navigate_to_collaborators);
    }

    public String c(String str, int i, boolean z) {
        MoreObjects.checkState(i > 1);
        int i2 = i - 1;
        return this.a.getResources().getQuantityString(z ? C0707R.plurals.playlist_header_subtitle_owner_collaborative : C0707R.plurals.playlist_header_owner_button_text_collaborative, i2, str, Integer.valueOf(i2));
    }

    public String d(h76 h76, boolean z) {
        j l = h76.l();
        Optional absent = Optional.absent();
        p m = l.m();
        if (m != null && m.b()) {
            absent = Optional.fromNullable(m.a());
        }
        Optional absent2 = Optional.absent();
        p i = l.i();
        if (i != null && i.b()) {
            absent2 = Optional.fromNullable(i.a());
        }
        ArrayList arrayList = new ArrayList();
        if (absent2.isPresent()) {
            arrayList.add(this.a.getString(C0707R.string.personalized_sets_subtitle_made_for, (String) absent2.get()));
        } else if (absent.isPresent()) {
            arrayList.add(this.a.getString(C0707R.string.playlist_header_subtitle_owner, (String) absent.get()));
        }
        int i2 = h76.i();
        if (i2 > 0) {
            if (!arrayList.isEmpty()) {
                arrayList.add(" • ");
            }
            if (z) {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.playlist_header_subtitle_likes, i2, d0.e(i2, Locale.getDefault())));
            } else {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.header_playlist_followers_count, i2, Integer.valueOf(i2)));
            }
        }
        if (nud.m(this.a)) {
            Collections.reverse(arrayList);
        }
        return Joiner.on("").join(arrayList);
    }
}
