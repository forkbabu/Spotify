package defpackage;

import android.content.res.Resources;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.C0707R;
import java.util.Locale;
import org.threeten.bp.Clock;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.b;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.h;

/* renamed from: vvc  reason: default package */
public class vvc {
    private static final b b;
    private final Clock a;

    static {
        Locale locale = new Locale(SpotifyLocale.c());
        b bVar = b.h;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.j("yyyy-MM-dd'T'HH:mm:ss");
        b = dateTimeFormatterBuilder.x(locale);
    }

    public vvc(Clock clock) {
        this.a = clock;
    }

    public String a(String str, Resources resources) {
        long j;
        b bVar = b;
        LocalDateTime localDateTime = LocalDateTime.a;
        yif.J(bVar, "formatter");
        h<LocalDateTime> hVar = LocalDateTime.c;
        if (((LocalDateTime) bVar.f(str, hVar)).S(LocalDateTime.W(this.a))) {
            return resources.getString(C0707R.string.podcast_poll_closed_label);
        }
        yif.J(bVar, "formatter");
        LocalDateTime W = LocalDateTime.W(this.a);
        LocalDateTime M = LocalDateTime.M((LocalDateTime) bVar.f(str, hVar));
        int abs = (int) Math.abs(M.q(W, ChronoUnit.DAYS));
        long j2 = (long) abs;
        if (j2 == Long.MIN_VALUE) {
            M = M.j0(Long.MAX_VALUE);
            j = 1;
        } else {
            j = -j2;
        }
        LocalDateTime j0 = M.j0(j);
        int abs2 = (int) Math.abs(j0.q(W, ChronoUnit.HOURS));
        if (abs != 0) {
            return resources.getString(C0707R.string.podcast_poll_time_left_label, resources.getQuantityString(C0707R.plurals.podcast_poll_days_left_label, abs, Integer.valueOf(abs)), resources.getQuantityString(C0707R.plurals.podcast_poll_hours_left_label, abs2, Integer.valueOf(abs2)));
        }
        if (abs2 != 0) {
            return resources.getQuantityString(C0707R.plurals.podcast_poll_hours_left_label, abs2, Integer.valueOf(abs2));
        }
        int abs3 = (int) Math.abs(j0.U((long) abs2).q(W, ChronoUnit.MINUTES));
        return resources.getQuantityString(C0707R.plurals.podcast_poll_minutes_left_label, abs3, Integer.valueOf(abs3));
    }
}
