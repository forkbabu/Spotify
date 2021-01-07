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

/* access modifiers changed from: package-private */
/* renamed from: lb6  reason: default package */
public class lb6 {
    private final Context a;

    public lb6(Context context) {
        this.a = context;
    }

    public String a(h76 h76, boolean z) {
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
            arrayList.add(this.a.getString(C0707R.string.refresh_header_subtitle_owner, (String) absent.get()));
        }
        int i2 = h76.i();
        if (i2 > 0) {
            if (!arrayList.isEmpty()) {
                arrayList.add(" • ");
            }
            if (z) {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.refresh_header_likes_count, i2, d0.e(i2, Locale.getDefault())));
            } else {
                arrayList.add(this.a.getResources().getQuantityString(C0707R.plurals.refresh_header_followers_count, i2, Integer.valueOf(i2)));
            }
        }
        if (nud.m(this.a)) {
            Collections.reverse(arrayList);
        }
        return Joiner.on("").join(arrayList);
    }
}
