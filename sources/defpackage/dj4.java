package defpackage;

import android.content.res.Resources;
import android.text.format.DateUtils;
import com.spotify.mobile.android.util.h0;
import com.spotify.music.C0707R;

/* renamed from: dj4  reason: default package */
public class dj4 extends h0 {
    public dj4(Resources resources) {
        super(resources);
    }

    public String d(int i) {
        return b(C0707R.plurals.charts_daily_plays, i, Integer.valueOf(i));
    }

    public String e(int i) {
        return b(C0707R.plurals.charts_header_new_entry_count, i, Integer.valueOf(i));
    }

    public String f(long j) {
        return c(C0707R.string.charts_meta_last_updated, DateUtils.getRelativeTimeSpanString(j));
    }
}
