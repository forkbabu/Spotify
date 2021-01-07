package defpackage;

import android.content.res.Resources;
import android.text.format.DateUtils;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;
import com.spotify.podcastinteractivity.qna.proto.Timestamp;
import kotlin.jvm.internal.h;
import org.threeten.bp.Clock;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.temporal.ChronoUnit;

/* renamed from: pvc  reason: default package */
public final class pvc {
    private final Clock a;

    public pvc(Clock clock) {
        h.e(clock, "clock");
        this.a = clock;
    }

    public final String a(Timestamp timestamp, Resources resources) {
        String str;
        String str2;
        h.e(timestamp, "timestamp");
        h.e(resources, "resources");
        LocalDateTime f0 = LocalDateTime.f0(timestamp.l(), timestamp.i(), ZoneOffset.n);
        LocalDateTime W = LocalDateTime.W(this.a);
        long abs = Math.abs(f0.q(W, ChronoUnit.DAYS));
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        long abs2 = Math.abs(f0.q(W, chronoUnit));
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        long abs3 = Math.abs(f0.q(W, chronoUnit2));
        ChronoUnit chronoUnit3 = ChronoUnit.YEARS;
        long abs4 = Math.abs(f0.q(W, chronoUnit3));
        if (abs < chronoUnit.i().l()) {
            if (abs == 0) {
                str2 = resources.getString(C0707R.string.podcast_qna_today);
            } else {
                str2 = resources.getQuantityString(C0707R.plurals.podcast_qna_days_ago, (int) abs, Long.valueOf(abs));
            }
            h.d(str2, "if (days == TODAY) {\n   …      )\n                }");
            return str2;
        } else if (abs < chronoUnit2.i().l()) {
            String quantityString = resources.getQuantityString(C0707R.plurals.podcast_qna_week_ago, (int) abs2, Long.valueOf(abs2));
            h.d(quantityString, "resources.getQuantityStr…  weeks\n                )");
            return quantityString;
        } else if (abs < chronoUnit3.i().l()) {
            String quantityString2 = resources.getQuantityString(C0707R.plurals.podcast_qna_month_ago, (int) abs3, Long.valueOf(abs3));
            h.d(quantityString2, "resources.getQuantityStr… months\n                )");
            return quantityString2;
        } else if (abs > chronoUnit3.i().l()) {
            if (abs4 == 1) {
                str = resources.getString(C0707R.string.podcast_qna_year_ago);
            } else {
                str = DateUtils.getRelativeTimeSpanString(timestamp.l() * ((long) Constants.ONE_SECOND), this.a.c(), 86400000, 524320).toString();
            }
            h.d(str, "if (years == CURRENT_YEA…tring()\n                }");
            return str;
        } else {
            throw new IllegalArgumentException("Date is not valid " + f0);
        }
    }
}
