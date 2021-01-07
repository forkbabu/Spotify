package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Show;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: una  reason: default package */
public class una {
    private final Context a;
    private final Calendar b;
    private final Calendar c;

    public una(Context context, Calendar calendar, Calendar calendar2) {
        this.a = context;
        this.b = calendar;
        this.c = calendar2;
    }

    public String a(Show show) {
        int i;
        String str;
        String i2 = show.i();
        if (show.e() < 0) {
            return i2;
        }
        long e = show.e() * 1000;
        this.c.setTimeInMillis(e);
        if (this.b.get(1) == this.c.get(1)) {
            i = this.b.get(6) - this.c.get(6);
        } else {
            i = (int) ((this.b.getTimeInMillis() - this.c.getTimeInMillis()) / 86400000);
        }
        if (i == 0) {
            str = this.a.getString(C0707R.string.collection_podcast_updated_today);
        } else if (i == 1) {
            str = this.a.getString(C0707R.string.collection_podcast_updated_yesterday);
        } else if (i <= 3) {
            str = this.a.getResources().getQuantityString(C0707R.plurals.collection_podcast_updated_days_ago, i, Integer.valueOf(i));
        } else {
            Context context = this.a;
            this.c.setTimeInMillis(e);
            str = context.getString(C0707R.string.collection_podcast_updated, DateFormat.getDateInstance(2).format(this.c.getTime()));
        }
        return this.a.getString(C0707R.string.collection_podcast_subtitle, str, i2);
    }
}
