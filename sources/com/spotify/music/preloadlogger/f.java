package com.spotify.music.preloadlogger;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.rx.x;
import com.spotify.mobile.android.service.session.e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class f {
    private final cqe a;
    private final x b;
    private final yyd c;

    f(cqe cqe, x xVar, yyd yyd) {
        this.a = cqe;
        this.b = xVar;
        this.c = yyd;
    }

    private void a(e eVar, String str, String str2) {
        str.getClass();
        MoreObjects.checkArgument(str.length() > 0, "referralCode must be set");
        if (str2 != null && !str2.isEmpty()) {
            this.b.a("created_by_partner", str2);
            this.b.a("mobile-product-test", str2);
        }
        this.b.a("referral", str);
        x xVar = this.b;
        Calendar e = this.a.e();
        e.setTimeInMillis(eVar.call().or((Optional<Long>) 0L).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        xVar.a("referral-timestamp", simpleDateFormat.format(e.getTime()) + " UTC");
    }

    public void b(e eVar) {
        if (this.c.c()) {
            String b2 = this.c.b();
            b2.getClass();
            MoreObjects.checkArgument(b2.length() > 0, "referralCode must be set");
            a(eVar, b2, null);
        }
    }

    public void c(e eVar) {
        if (this.c.c()) {
            a(eVar, this.c.b(), this.c.a());
        }
    }
}
