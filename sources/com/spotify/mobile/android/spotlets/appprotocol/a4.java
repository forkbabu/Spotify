package com.spotify.mobile.android.spotlets.appprotocol;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import java.util.List;

public final class a4 {
    public static String a(String str) {
        if (!(l0.z(str).q() == LinkType.PROFILE_PLAYLIST)) {
            return str;
        }
        Assertion.v("Unsupported playlist URI. [https://spoti.fi/2NwLTih]");
        l0 z = l0.z(str);
        StringBuilder V0 = je.V0("spotify:");
        List<String> pathSegments = z.a.getPathSegments();
        for (int i = 0; i < pathSegments.size(); i++) {
            if (V0.charAt(V0.length() - 1) != ':') {
                V0.append(':');
            }
            if (i == 0) {
                V0.append("playlist:");
            } else {
                V0.append(Uri.encode(pathSegments.get(i)));
            }
        }
        return l0.z(V0.toString()).H(1, 2);
    }
}
