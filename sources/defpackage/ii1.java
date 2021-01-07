package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.ads.model.Ad;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: ii1  reason: default package */
public class ii1 {
    private static final Pattern d = Pattern.compile("\\[(\\d+)\\]");
    private static final Pattern e = Pattern.compile(":");
    private final cqe a;
    private final t b;
    private final SimpleDateFormat c;

    public ii1(cqe cqe, t tVar) {
        this.a = cqe;
        this.b = tVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        this.c = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public hi1 a(BrowserParams browserParams, String str) {
        hi1 hi1 = new hi1();
        hi1.c("page", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        hi1.c("per_page", "50");
        hi1.c("platform", "android");
        hi1.c("version", this.b.c());
        hi1.c("dt", this.c.format(new Date(this.a.d())));
        hi1.c("suppress404", "1");
        hi1.c("suppress_response_codes", "1");
        String str2 = "category:" + browserParams.j();
        if (!MoreObjects.isNullOrEmpty(browserParams.j())) {
            hi1.c("signal", str2);
        }
        if (!MoreObjects.isNullOrEmpty(browserParams.e())) {
            StringBuilder V0 = je.V0("client-id:");
            V0.append(browserParams.e());
            hi1.c("signal", V0.toString());
        }
        if (!MoreObjects.isNullOrEmpty(browserParams.f())) {
            hi1.c("locale", browserParams.f());
        } else {
            hi1.c("locale", SpotifyLocale.c());
        }
        hi1.c("region", str);
        return hi1;
    }

    public String b(BrowserParams browserParams) {
        String h = browserParams.h();
        Assertion.k(h.contains("spotify:space_item:"), "The identifier [%s] should be a spaces identifier", h);
        String str = e.split(h)[2];
        return str.endsWith("]") ? d.split(str)[0] : str;
    }
}
