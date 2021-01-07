package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import java.util.Calendar;

public class d implements c {
    private final cqe a;
    private final Calendar b;
    private final Calendar c;
    private final Calendar d;

    public d(cqe cqe) {
        this.a = cqe;
        this.b = cqe.e();
        Calendar e = cqe.e();
        this.c = e;
        e.setTimeInMillis(e.getTimeInMillis() - 86400000);
        Calendar e2 = cqe.e();
        this.d = e2;
        e2.set(10, 0);
        e2.set(12, 0);
        e2.set(13, 0);
        e2.set(14, 0);
        e2.add(6, -7);
    }

    private static boolean d(Calendar calendar, Calendar calendar2) {
        if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.c
    public boolean a(long j) {
        Calendar e = this.a.e();
        e.setTimeInMillis(j);
        return e.after(this.d);
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.c
    public boolean b(long j) {
        Calendar e = this.a.e();
        e.setTimeInMillis(j);
        return d(this.b, e);
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.c
    public boolean c(long j) {
        Calendar e = this.a.e();
        e.setTimeInMillis(j);
        return d(this.c, e);
    }
}
