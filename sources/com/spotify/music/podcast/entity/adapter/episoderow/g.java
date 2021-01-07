package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.podcast.entity.adapter.episoderow.f;
import com.spotify.music.podcast.episode.util.j;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class g implements f {
    private final Locale a = new Locale(SpotifyLocale.c());
    private final j b;

    public g(j jVar) {
        h.e(jVar, "subtitleBuilder");
        this.b = jVar;
    }

    @Override // com.spotify.music.podcast.entity.adapter.episoderow.f
    public CharSequence a(f.a aVar) {
        h.e(aVar, "inputModel");
        j.b g = this.b.g(aVar.d(), aVar.c(), aVar.a(), Integer.valueOf(aVar.b()), aVar.f());
        g.b(aVar.e());
        g.c(true);
        g.d(false);
        g.e("d MMM", "d MMM yy");
        String build = g.build();
        h.d(build, "subtitleBuilder.withEpis…   )\n            .build()");
        String lowerCase = build.toLowerCase(this.a);
        h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        List w = e.w(lowerCase, new String[]{"•"}, false, 0, 6, null);
        if (w.size() < 2) {
            return lowerCase;
        }
        StringBuilder sb = new StringBuilder();
        String b2 = d0.b((String) w.get(0), this.a);
        h.d(b2, "MoreStringUtils.capitalizeWords(this, locale)");
        sb.append(e.C(b2).toString());
        sb.append(" •");
        sb.append(e.t((String) w.get(1), "played", "Played", false, 4, null));
        return sb.toString();
    }
}
