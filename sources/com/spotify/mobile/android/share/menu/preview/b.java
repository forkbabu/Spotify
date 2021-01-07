package com.spotify.mobile.android.share.menu.preview;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.share.menu.preview.api.a;
import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;

public final class b {
    public static Intent a(String str, String str2) {
        String C = l0.z(str).C();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(C));
        intent.putExtra("com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME", str2);
        return intent;
    }

    public static Map<String, rmf<a, c, h>> b(Set<Pair<String, rmf<a, c, h>>> set) {
        kotlin.jvm.internal.h.e(set, "actionPairs");
        return d.S(set);
    }

    public static Set<a> c(ao1 ao1, com.spotify.mobile.android.share.menu.preview.destinations.b bVar) {
        ao1.getClass();
        kotlin.jvm.internal.h.e(bVar, "shareFlowShareDestinations");
        return bVar.e();
    }

    public static Set<Pair<String, rmf<a, c, h>>> d(ao1 ao1, com.spotify.mobile.android.share.menu.preview.destinations.b bVar) {
        ao1.getClass();
        kotlin.jvm.internal.h.e(bVar, "shareFlowShareDestinations");
        return bVar.d();
    }

    public static Set<Pair<String, com.spotify.mobile.android.share.menu.preview.api.b>> e(ao1 ao1, com.spotify.mobile.android.share.menu.preview.destinations.b bVar) {
        ao1.getClass();
        kotlin.jvm.internal.h.e(bVar, "shareFlowShareDestinations");
        return bVar.f();
    }

    public static Map<String, com.spotify.mobile.android.share.menu.preview.api.b> f(Set<Pair<String, com.spotify.mobile.android.share.menu.preview.api.b>> set) {
        kotlin.jvm.internal.h.e(set, "viewDataPairs");
        return d.S(set);
    }

    public static boolean g(Uri uri, Uri uri2, com.spotify.mobile.android.sso.util.a aVar) {
        String uri3 = uri.toString();
        Locale locale = Locale.ENGLISH;
        if (uri2.toString().toLowerCase(locale).startsWith(uri3.toLowerCase(locale))) {
            aVar.b(uri2);
            return true;
        }
        DebugFlag debugFlag = DebugFlag.ACCOUNTS_STAGING;
        if ("accounts.spotify.com".equals(uri2.getAuthority())) {
            return false;
        }
        aVar.a(uri, uri2);
        return true;
    }
}
