package defpackage;

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

/* renamed from: ea6  reason: default package */
class ea6 {
    private final Context a;

    public ea6(Context context) {
        this.a = context;
    }

    public String a(h76 h76, boolean z) {
        j l = h76.l();
        Optional absent = Optional.absent();
        p i = l.i();
        if (i != null && i.b()) {
            absent = Optional.fromNullable(i.a());
        }
        ArrayList arrayList = new ArrayList();
        if (absent.isPresent()) {
            arrayList.add(this.a.getString(C0707R.string.personalized_sets_subtitle_made_for, (String) absent.get()));
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
