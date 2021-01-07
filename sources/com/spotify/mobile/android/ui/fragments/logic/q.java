package com.spotify.mobile.android.ui.fragments.logic;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class q {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("spblackbolt.s3.amazonaws.com", "d24rpqtr39o6l1.cloudfront.net")));
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("www.spotify.com", "www.google-analytics.com", "auth.api.sonyentertainmentnetwork.com", "account.sonyentertainmentnetwork.com", "link.playstationmusic.com", "auth.api.sp-int.sonyentertainmentnetwork.com", "account.sp-int.sonyentertainmentnetwork.com", "link.sp-int.playstationmusic.com", "auth.api.e1-np.sonyentertainmentnetwork.com", "account.e1-np.sonyentertainmentnetwork.com", "link.e1-np.playstationmusic.com", "auth.api.q1-np.sonyentertainmentnetwork.com", "account.q1-np.sonyentertainmentnetwork.com", "link.q1-np.playstationmusic.com")));

    public static boolean a(Uri uri) {
        if (!(a.contains(uri.getHost()) || b.contains(uri.getHost())) || !uri.getScheme().equals(Constants.SCHEME)) {
            return false;
        }
        return true;
    }
}
