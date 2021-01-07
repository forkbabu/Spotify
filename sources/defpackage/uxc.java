package defpackage;

import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.converter.a;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: uxc  reason: default package */
public final class uxc {
    private static final boolean a(Map<String, String> map, String str) {
        try {
            return a.a(map.get(str));
        } catch (ConvertProductValueException e) {
            Logger.e(e, "Unable to extract product state", new Object[0]);
            return false;
        }
    }

    public static final boolean b(Map<String, String> map) {
        h.e(map, "productStateMap");
        return !a(map, "nft-disabled");
    }

    public static final boolean c(Map<String, String> map) {
        h.e(map, "productStateMap");
        return a(map, "offline") && !a(map, "limited-offline");
    }

    public static final boolean d(Map<String, String> map) {
        h.e(map, "productStateMap");
        return a(map, "shows-collection");
    }

    public static final boolean e(Map<String, String> map) {
        h.e(map, "productStateMap");
        String str = map.get("streaming-rules");
        return !(str == null || Hashing.crc32().hashUnencodedChars(str).asInt() == 1929113152);
    }
}
