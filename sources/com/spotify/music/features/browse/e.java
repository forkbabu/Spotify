package com.spotify.music.features.browse;

import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.carepackage.CarePackageFragmentModule$SharePreviewModule;
import java.util.List;
import kotlin.collections.d;

public final class e {
    public static int a(b91 b91) {
        return ((Integer) x.n(b91.custom().intValue("next_page_offset"), 0)).intValue();
    }

    public static boolean b(b91 b91) {
        return b91.custom().intValue("next_page_offset") != null;
    }

    public static b c(Bundle bundle, c cVar, fm9 fm9) {
        return new a(bundle.getString("view_uri", ""), fm9.a(cVar));
    }

    public static List<String> d(CarePackageFragmentModule$SharePreviewModule carePackageFragmentModule$SharePreviewModule) {
        carePackageFragmentModule$SharePreviewModule.getClass();
        return d.u(String.valueOf((int) C0707R.id.share_app_instagram_stories), String.valueOf((int) C0707R.id.share_app_facebook_stories), String.valueOf((int) C0707R.id.share_app_snapchat_stories), String.valueOf((int) C0707R.id.share_app_twitter), String.valueOf((int) C0707R.id.share_app_download), String.valueOf((int) C0707R.id.share_app_more));
    }
}
