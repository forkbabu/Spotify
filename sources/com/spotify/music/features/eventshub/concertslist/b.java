package com.spotify.music.features.eventshub.concertslist;

import java.util.Date;
import java.util.Locale;

public class b {
    private final y90 a;

    public b(y90 y90) {
        this.a = y90;
    }

    public void a(cqe cqe, Date date, Locale locale) {
        s42.b(this.a.getImageView(), cqe).d(date, locale);
    }

    public void b(String str) {
        this.a.setSubtitle(str);
    }

    public void c(String str) {
        this.a.setTitle(str);
    }
}
