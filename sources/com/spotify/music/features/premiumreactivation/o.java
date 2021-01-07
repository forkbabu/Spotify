package com.spotify.music.features.premiumreactivation;

import com.spotify.mobile.android.rx.w;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class o {
    private final w a;
    private final cqe b;

    public o(w wVar, cqe cqe) {
        this.a = wVar;
        this.b = cqe;
    }

    private Date c(Date date) {
        Calendar e = this.b.e();
        e.setTime(date);
        e.set(11, 0);
        e.set(12, 0);
        e.set(13, 0);
        e.set(14, 0);
        return e.getTime();
    }

    public s<Integer> a() {
        return this.a.c("product-expiry").j0(k.a).j0(new f(this));
    }

    public Integer b(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).parse(str);
            Date c = c(new Date(this.b.d()));
            return Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(c(parse).getTime() - c.getTime()));
        } catch (ParseException e) {
            throw ExceptionHelper.e(e);
        }
    }
}
