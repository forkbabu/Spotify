package com.spotify.share.util;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.w;

public class m {
    public static ShareCapability a(t tVar) {
        if (tVar instanceof q) {
            return ShareCapability.IMAGE_STORY;
        }
        if (tVar instanceof o) {
            return ShareCapability.GRADIENT_STORY;
        }
        if (tVar instanceof w) {
            return ShareCapability.VIDEO_STORY;
        }
        if (tVar instanceof p) {
            return ShareCapability.IMAGE;
        }
        if (tVar instanceof s) {
            return ShareCapability.MESSAGE;
        }
        if (tVar instanceof r) {
            return ShareCapability.LINK;
        }
        return null;
    }

    public String b(t tVar) {
        ShareCapability a = a(tVar);
        if (a != null) {
            return a.d();
        }
        Assertion.g("Can't get capability of shareData: " + tVar);
        return "";
    }
}
