package com.spotify.music.share.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.sa;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class d {
    private final Map<Integer, Drawable> a(Map<Integer, Drawable> map, Context context, int i, int i2) {
        Drawable d = a.d(context, i2);
        if (d != null) {
            map.put(Integer.valueOf(i), d);
        }
        return map;
    }

    public final Map<Integer, Drawable> b(Context context, sa saVar) {
        h.e(context, "context");
        h.e(saVar, "properties");
        boolean i = saVar.i();
        int i2 = i ? C0707R.drawable.share_icn_copylink_update : C0707R.drawable.share_icn_copylink;
        int i3 = i ? C0707R.drawable.share_icn_sms_update : C0707R.drawable.share_icn_sms;
        int i4 = i ? C0707R.drawable.share_icn_more_update : C0707R.drawable.share_icn_more;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, context, C0707R.id.share_app_instagram_stories, C0707R.drawable.share_app_instagram_circle);
        a(linkedHashMap, context, C0707R.id.share_app_facebook_feed, C0707R.drawable.share_icn_facebook);
        a(linkedHashMap, context, C0707R.id.share_app_copy_link, i2);
        a(linkedHashMap, context, C0707R.id.share_app_generic_sms, i3);
        a(linkedHashMap, context, C0707R.id.share_app_more, i4);
        return linkedHashMap;
    }
}
