package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: cf0  reason: default package */
public class cf0 {
    private final DateFormat a = DateFormat.getDateInstance(2);
    private final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    private final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    private final cqe d;

    public cf0(cqe cqe) {
        this.d = cqe;
    }

    public String a(Resources resources, ff0 ff0) {
        switch ((int) ef0.a(this.d.d() - ff0.e().getTime()).b()) {
            case 0:
                return resources.getString(C0707R.string.android_auto_podcast_episode_publication_today);
            case 1:
                return resources.getString(C0707R.string.android_auto_podcast_episode_publication_yesterday);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return this.c.format(Long.valueOf(ff0.e().getTime()));
            default:
                Calendar calendar = (Calendar) this.d.e().clone();
                calendar.setTime(ff0.e());
                boolean z = true;
                if (this.d.e().get(1) != calendar.get(1)) {
                    z = false;
                }
                if (z) {
                    return this.b.format(Long.valueOf(ff0.e().getTime()));
                }
                return this.a.format(Long.valueOf(ff0.e().getTime()));
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00a0: APUT  (r1v4 java.lang.Object[]), (0 ??[int, short, byte, char]), (r2v15 java.lang.String) */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0135: APUT  
      (r1v2 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.String : 0x0131: INVOKE  (r2v3 java.lang.String) = 
      (r16v0 android.content.res.Resources)
      (wrap: int : ?: SGET   com.spotify.music.R.string.android_auto_podcast_episode_time_left int)
      (r4v2 java.lang.Object[])
     type: VIRTUAL call: android.content.res.Resources.getString(int, java.lang.Object[]):java.lang.String)
     */
    public String b(Resources resources, ff0 ff0) {
        char c2;
        String str;
        String str2;
        boolean c3 = ff0.c();
        boolean b2 = ff0.b();
        int d2 = ff0.d();
        int f = ff0.f();
        if (c3 || f == 0) {
            c2 = 2;
        } else {
            c2 = (f < 0 || (!b2 && d2 - f <= 0)) ? (char) 0 : 1;
        }
        if (c2 == 1) {
            Object[] objArr = new Object[2];
            ef0 a2 = ef0.a(((long) ff0.f()) * 1000);
            if (a2.c() > 0) {
                str = resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_hours, (int) a2.c(), Long.valueOf(a2.c())) + ' ' + resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_min, (int) a2.d(), Long.valueOf(a2.d()));
            } else {
                str = resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_min, (int) a2.d(), Long.valueOf(a2.d()));
            }
            objArr[0] = resources.getString(C0707R.string.android_auto_podcast_episode_time_left, str);
            objArr[1] = a(resources, ff0);
            return resources.getString(C0707R.string.subtitle_general_structure, objArr);
        } else if (c2 == 2) {
            return resources.getString(C0707R.string.subtitle_general_structure, resources.getString(C0707R.string.android_auto_podcast_episode_played), a(resources, ff0));
        } else {
            Object[] objArr2 = new Object[2];
            ef0 a3 = ef0.a(((long) ff0.d()) * 1000);
            if (a3.c() > 0) {
                str2 = resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_hours, (int) a3.c(), Long.valueOf(a3.c())) + ' ' + resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.d(), Long.valueOf(a3.d()));
            } else {
                str2 = resources.getQuantityString(C0707R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.d(), Long.valueOf(a3.d()));
            }
            objArr2[0] = str2;
            objArr2[1] = a(resources, ff0);
            return resources.getString(C0707R.string.subtitle_general_structure, objArr2);
        }
    }
}
