package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* renamed from: agd  reason: default package */
public final class agd {
    private static final Pattern a = Pattern.compile("radio:", 16);
    public static final /* synthetic */ int b = 0;

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).replaceAll("");
    }

    public static String b(String str) {
        if (str != null) {
            if (str.startsWith("spotify:station:")) {
                if (str.contains("cluster:")) {
                    return str;
                }
                StringBuilder V0 = je.V0("spotify:");
                V0.append(str.substring(16));
                return V0.toString();
            } else if (str.startsWith("spotify:radio:")) {
                StringBuilder V02 = je.V0("spotify:");
                V02.append(str.substring(14));
                return V02.toString();
            } else if (str.startsWith("spotify:")) {
                return str;
            }
        }
        return null;
    }

    @Deprecated
    public static String c(String str) {
        if (str == null || !str.startsWith("spotify:")) {
            return null;
        }
        if (str.startsWith("spotify:station:") || str.startsWith("spotify:dailymix:")) {
            return str;
        }
        StringBuilder V0 = je.V0("spotify:station:");
        V0.append(str.substring(8));
        return V0.toString();
    }

    public static String d(String str) {
        if (str != null) {
            if (str.startsWith("spotify:station:")) {
                StringBuilder V0 = je.V0("spotify:");
                V0.append(str.substring(16));
                return V0.toString();
            } else if (str.startsWith("spotify:dailymix")) {
                return str;
            }
        }
        return null;
    }

    public static String e(Context context, l0 l0Var) {
        LinkType q = l0Var.q();
        Resources resources = context.getResources();
        int ordinal = q.ordinal();
        if (ordinal == 6) {
            return resources.getString(C0707R.string.radio_section_your_stations_album_subtitle);
        }
        if (ordinal == 14) {
            return resources.getString(C0707R.string.radio_section_your_stations_artist_subtitle);
        }
        if (ordinal == 34) {
            return resources.getString(C0707R.string.radio_section_your_stations_genre_subtitle);
        }
        if (ordinal == 185 || ordinal == 210) {
            return resources.getString(C0707R.string.radio_section_your_stations_playlist_subtitle);
        }
        if (ordinal != 273) {
            return " ";
        }
        return resources.getString(C0707R.string.radio_section_your_stations_song_subtitle);
    }

    public static String[] f(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i].substring(14);
        }
        return strArr2;
    }

    public static int g(l0 l0Var) {
        int ordinal = l0Var.q().ordinal();
        if (ordinal == 6) {
            return C0707R.string.context_menu_go_to_album_radio;
        }
        if (ordinal == 14) {
            return C0707R.string.context_menu_go_to_artist_radio;
        }
        if (ordinal == 34) {
            return C0707R.string.context_menu_go_to_genre_radio;
        }
        if (ordinal == 185 || ordinal == 210) {
            return C0707R.string.context_menu_go_to_playlist_radio;
        }
        return ordinal != 273 ? C0707R.string.context_menu_go_to_radio : C0707R.string.context_menu_go_to_song_radio;
    }

    public static boolean h(String str) {
        return str != null && str.startsWith("spotify:radio:");
    }

    public static boolean i(String str) {
        return str != null && str.startsWith("spotify:station:");
    }

    public static String j(String str, PlayerTrack[] playerTrackArr) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return str;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PlayerTrack playerTrack : playerTrackArr) {
            linkedHashSet.add(playerTrack.uri().substring(14));
        }
        Iterator it = linkedHashSet.iterator();
        while (linkedHashSet.size() > 40 && it.hasNext()) {
            it.next();
            it.remove();
        }
        String substring = str.substring(0, indexOf);
        String queryParameter = Uri.parse(str).getQueryParameter("salt");
        String join = TextUtils.join(",", linkedHashSet);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(queryParameter)) {
            arrayList.add("salt=" + queryParameter);
        }
        if (!TextUtils.isEmpty(join)) {
            arrayList.add("prev_tracks=" + join);
        }
        StringBuilder sb = new StringBuilder(substring);
        if (arrayList.size() > 0) {
            sb.append('?');
            sb.append(TextUtils.join("&", arrayList));
        }
        return sb.toString();
    }
}
