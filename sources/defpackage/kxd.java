package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: kxd  reason: default package */
public final class kxd {
    public static final String a(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$artistNames");
        ImmutableMap<String, String> metadata = contextTrack.metadata();
        h.d(metadata, "metadata()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            String key = entry.getKey();
            h.d(key, "key");
            if (e.x(key, "artist_name", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        h.e(linkedHashMap, "$this$toSortedMap");
        Collection values = new TreeMap(linkedHashMap).values();
        h.d(values, "metadata()\n        .filt…rtedMap()\n        .values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            String str = (String) obj;
            h.d(str, "it");
            if (!e.n(str)) {
                arrayList.add(obj);
            }
        }
        return d.p(arrayList, null, null, null, 0, null, null, 63, null);
    }

    public static final String b(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$contextUri");
        return o(contextTrack, "context_uri");
    }

    public static final String c(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$coverArtUri");
        return o(contextTrack, "image_url");
    }

    public static final String d(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$coverArtUriLarge");
        String o = o(contextTrack, "image_large_url");
        return o != null ? o : c(contextTrack);
    }

    public static final String e(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$coverArtUriSmall");
        String o = o(contextTrack, "image_small_url");
        return o != null ? o : c(contextTrack);
    }

    public static final boolean f(ContextTrack contextTrack) {
        String str = (String) je.e0(contextTrack, "$this$isAd", "is_advertisement");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static final boolean g(ContextTrack contextTrack) {
        String str = (String) je.e0(contextTrack, "$this$isExplicit", "is_explicit");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static final boolean h(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$isInterruptionFromAds");
        String uri = contextTrack.uri();
        h.d(uri, "uri()");
        if (!e.x(uri, InterruptionUtil.INTERRUPTION_PREFIX, false, 2, null)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) je.e0(contextTrack, "$this$hasAdId", "ad_id");
        if (!(charSequence == null || e.n(charSequence))) {
            return true;
        }
        return false;
    }

    public static final boolean i(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$isPodcast");
        String uri = contextTrack.uri();
        h.d(uri, "uri()");
        return e.x(uri, "spotify:episode:", false, 2, null) && !m(contextTrack);
    }

    public static final boolean j(ContextTrack contextTrack) {
        String str = (String) je.e0(contextTrack, "$this$isPodcastAd", "is_podcast_advertisement");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static final boolean k(ContextTrack contextTrack) {
        String str = (String) je.e0(contextTrack, "$this$isQueued", "is_queued");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static final boolean l(ContextTrack contextTrack) {
        return e.f("video", (String) je.e0(contextTrack, "$this$isUsingVideoTrackPlayer", "track_player"), true);
    }

    public static final boolean m(ContextTrack contextTrack) {
        return e.f("video", (String) je.e0(contextTrack, "$this$isVideo", "media.type"), true);
    }

    public static final String n(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$iteration");
        return o(contextTrack, "iteration");
    }

    private static final String o(ContextTrack contextTrack, String str) {
        String str2 = contextTrack.metadata().get(str);
        if (str2 == null) {
            return null;
        }
        if (e.n(str2)) {
            str2 = null;
        }
        return str2;
    }

    public static final String p(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$subtitle");
        return o(contextTrack, ContextTrack.Metadata.KEY_SUBTITLE);
    }

    public static final String q(ContextTrack contextTrack) {
        h.e(contextTrack, "$this$title");
        return o(contextTrack, "title");
    }
}
