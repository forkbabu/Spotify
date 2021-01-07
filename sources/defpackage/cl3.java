package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import io.reactivex.a;
import io.reactivex.e;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* renamed from: cl3  reason: default package */
public class cl3 implements SlotApi {
    private final ol3 a;

    public cl3(ol3 ol3) {
        this.a = ol3;
    }

    @Override // com.spotify.music.features.ads.api.SlotApi
    public a a(String str, SlotApi.Intent intent) {
        return b(str, intent, null);
    }

    @Override // com.spotify.music.features.ads.api.SlotApi
    public a b(String str, SlotApi.Intent intent, Map<String, String> map) {
        Map map2;
        String lowerCase = intent.name().toLowerCase(Locale.ENGLISH);
        if (map == null) {
            map2 = Collections.emptyMap();
        } else {
            map2 = Collections.singletonMap("targeting", map);
        }
        return a.n(new mk3(this, str, lowerCase, map2));
    }

    public /* synthetic */ e c(String str, String str2, Map map) {
        return this.a.c(str, str2, map);
    }
}
