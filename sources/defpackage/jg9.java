package defpackage;

import com.spotify.localization.SpotifyLocale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: jg9  reason: default package */
public class jg9 {
    private final DateFormat a;

    public jg9() {
        Locale locale;
        String[] split = SpotifyLocale.c().split(SpotifyLocale.Separator.UNDERSCORE.d());
        if (split.length > 1) {
            locale = new Locale(split[0], split[1]);
        } else {
            locale = new Locale(split[0]);
        }
        this.a = new SimpleDateFormat("MMM yyyy", locale);
    }

    public String a(Date date) {
        return this.a.format(date);
    }
}
