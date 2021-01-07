package defpackage;

import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.t;
import io.reactivex.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ph1  reason: default package */
/* compiled from: MediaBrowserLoader */
public final /* synthetic */ class ph1 {
    /* JADX WARN: Incorrect args count in method signature: (Lcom/spotify/mobile/android/service/media/browser/BrowserParams;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lio/reactivex/z<Ljava/util/List<Lcom/spotify/mobile/android/service/media/browser/loaders/browse/MediaBrowserItem;>;>; */
    public static z a(qh1 _this, BrowserParams browserParams, Map map) {
        return _this.b(browserParams);
    }

    public static Map<String, String> b(t tVar, SimpleDateFormat simpleDateFormat, aqe aqe, String str) {
        HashMap hashMap = new HashMap(10);
        hashMap.put("limit", "50");
        hashMap.put("page", "50");
        hashMap.put("per_page", "50");
        hashMap.put("locale", SpotifyLocale.c());
        hashMap.put("platform", "android");
        hashMap.put("version", tVar.c());
        aqe.getClass();
        hashMap.put("dt", simpleDateFormat.format(new Date(System.currentTimeMillis())));
        hashMap.put("suppress404", "1");
        hashMap.put("suppress_response_codes", "1");
        hashMap.put("region", str);
        return hashMap;
    }
}
