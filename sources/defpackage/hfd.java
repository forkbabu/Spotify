package defpackage;

import android.os.Build;
import com.google.common.base.Joiner;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.util.t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hfd  reason: default package */
public final class hfd {
    private static final ThreadLocal<SimpleDateFormat> a = new a();

    /* renamed from: hfd$a */
    static class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    }

    private static boolean a(Map<String, String> map, String str) {
        try {
            return com.spotify.mobile.android.converter.a.a(map.get(str));
        } catch (ConvertProductValueException unused) {
            return false;
        }
    }

    public static Map<String, String> b(Map<String, String> map, int i, t tVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("card-columns", String.valueOf(i));
        linkedHashMap.put("locale", SpotifyLocale.c());
        boolean z = true;
        linkedHashMap.put("mft", String.valueOf(!uxc.e(map)));
        linkedHashMap.put("client-version", tVar.c());
        boolean a2 = a(map, "video-device-blacklisted");
        if (!a2 || Build.VERSION.SDK_INT < 18) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (a2) {
            arrayList.add("video");
        }
        if (z) {
            arrayList.add("video-drm");
        }
        linkedHashMap.put("capabilities", Joiner.on(',').join(arrayList));
        linkedHashMap.put("date-time", a.get().format(new Date()));
        linkedHashMap.put("shows", String.valueOf(a(map, "shows-collection")));
        linkedHashMap.put("video-shows", String.valueOf(a(map, "shows-collection-jam")));
        return linkedHashMap;
    }

    public static List<String> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(String.format("%s:%s", "podcast", String.valueOf(a(map, "shows-collection"))));
        arrayList.add(String.format("%s:%s", "video", String.valueOf(a(map, "shows-collection-jam"))));
        if (!a(map, "nft-disabled")) {
            arrayList.add("application:nft");
        }
        return arrayList;
    }
}
