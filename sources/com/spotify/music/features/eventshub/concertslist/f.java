package com.spotify.music.features.eventshub.concertslist;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.eventshub.concertentity.j;
import com.spotify.music.features.eventshub.eventshub.h;
import com.spotify.music.features.eventshub.model.Concert;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.music.navigation.t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class f {
    private final h a;
    private final t b;
    private final EventResult c;
    private final d15 d;
    private final Calendar e;
    private final cqe f;
    private List<ConcertResult> g = new ArrayList();

    public f(h hVar, t tVar, EventResult eventResult, d15 d15, Calendar calendar, cqe cqe) {
        this.a = hVar;
        this.b = tVar;
        this.c = eventResult;
        this.d = d15;
        this.e = calendar;
        this.f = cqe;
    }

    public void a(b bVar, int i) {
        ConcertResult concertResult = this.g.get(i);
        Concert concert = concertResult.getConcert();
        if (concert.isFestival()) {
            bVar.c(concert.getTitle());
        } else {
            bVar.c(this.d.a(concert));
        }
        String d2 = j.d(concert.getVenue(), concert.getLocation(), concertResult.isVirtual());
        Locale locale = new Locale(SpotifyLocale.e());
        String dateString = concert.getDateString();
        if (dateString != null) {
            d2 = j.b(d2, j.a(dateString, "yyyy-MM-dd'T'HH:mm:ss", new Locale(SpotifyLocale.e()), this.e), this.e, locale);
        }
        bVar.b(d2);
        Locale locale2 = new Locale(SpotifyLocale.e());
        bVar.a(this.f, j.a(concert.getDateString(), "yyyy-MM-dd'T'HH:mm:ss", new Locale(SpotifyLocale.e()), this.e), locale2);
    }

    public ConcertResult b(int i) {
        return this.g.get(i);
    }

    public int c() {
        return this.g.size();
    }

    public void d(long j) {
        ConcertResult concertResult = this.g.get((int) j);
        Concert concert = concertResult.getConcert();
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(concertResult.getConcert().getId());
        String sb = V0.toString();
        if (concertResult.getDiscovery() != null && concertResult.getDiscovery().booleanValue()) {
            this.a.d(Long.valueOf(j), concertResult.getSourceType(), concert.getId());
        } else {
            this.a.c(Long.valueOf(j), concertResult.getSourceType(), concert.getId());
        }
        this.b.d(sb);
    }

    public void e(h hVar) {
        EventResult eventResult = this.c;
        if (eventResult != EventResult.EMPTY) {
            ((ConcertsListFragment) hVar).h0.Y(eventResult.getConcertResults());
        }
    }

    public void f(List<ConcertResult> list) {
        this.g = list;
    }
}
