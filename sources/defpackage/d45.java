package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import defpackage.c45;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: d45  reason: default package */
public final class d45 {
    private static final Locale a;
    private static final SimpleDateFormat b;

    static {
        Locale locale = Locale.getDefault();
        a = locale;
        b = new SimpleDateFormat("MMM d", locale);
    }

    public static final String a(c45 c45, Resources resources) {
        h.e(c45, "releaseAge");
        h.e(resources, "res");
        if (c45 instanceof c45.d) {
            String string = resources.getString(C0707R.string.follow_feed_timestamp_just_now);
            h.d(string, "res.getString(R.string.f…_feed_timestamp_just_now)");
            return string;
        } else if (c45 instanceof c45.e) {
            c45.e eVar = (c45.e) c45;
            String quantityString = resources.getQuantityString(C0707R.plurals.follow_feed_timestamp_minutes_ago, eVar.a(), Integer.valueOf(eVar.a()));
            h.d(quantityString, "res.getQuantityString(\n …Age.minutes\n            )");
            return quantityString;
        } else if (c45 instanceof c45.c) {
            c45.c cVar = (c45.c) c45;
            String quantityString2 = resources.getQuantityString(C0707R.plurals.follow_feed_timestamp_hours_ago, cVar.a(), Integer.valueOf(cVar.a()));
            h.d(quantityString2, "res.getQuantityString(\n …seAge.hours\n            )");
            return quantityString2;
        } else if (c45 instanceof c45.b) {
            c45.b bVar = (c45.b) c45;
            String quantityString3 = resources.getQuantityString(C0707R.plurals.follow_feed_timestamp_days_ago, bVar.a(), Integer.valueOf(bVar.a()));
            h.d(quantityString3, "res.getQuantityString(\n …aseAge.days\n            )");
            return quantityString3;
        } else if (c45 instanceof c45.a) {
            String format = b.format(((c45.a) c45).a().getTime());
            h.d(format, "simpleDateFormat.format(releaseAge.calendar.time)");
            return format;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
