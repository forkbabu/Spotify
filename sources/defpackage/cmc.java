package defpackage;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.spotify.music.podcast.episode.util.j;
import java.text.ParseException;

/* renamed from: cmc  reason: default package */
public class cmc {
    private final j a;
    private final ISO8601DateFormat b = new ISO8601DateFormat();

    public cmc(j jVar) {
        this.a = jVar;
    }

    public String a(String str, int i) {
        if (i <= 0) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        try {
            j.b g = this.a.g("", (int) (this.b.parse(str).getTime() / 1000), i, null, false);
            g.c(true);
            return g.build();
        } catch (ParseException unused) {
            return "";
        }
    }
}
