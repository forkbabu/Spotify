package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.share.sharedata.ShareCapability;
import defpackage.r8e;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: v8e  reason: default package */
public abstract class v8e {
    private static Drawable a(Context context, int i, Optional<Integer> optional) {
        int b = b(context, optional);
        Drawable d = a.d(context, i);
        if (!(d instanceof BitmapDrawable)) {
            return d;
        }
        return new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) d).getBitmap(), b, b, true));
    }

    private static int b(Context context, Optional<Integer> optional) {
        if (!optional.isPresent() || optional.get().intValue() <= 0) {
            return context.getResources().getDimensionPixelSize(C0707R.dimen.share_icon_size);
        }
        return optional.get().intValue();
    }

    static Map.Entry<Integer, o8e> c(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_copy_link), ((r8e.b) q8e.e(C0707R.id.share_app_copy_link, C0707R.string.share_contextmenu_copy_link, C0707R.string.share_copy_link_log_id_gabito, new SpotifyIconDrawable(context, SpotifyIconV2.COPY, (float) b(context, optional)), ShareCapability.LINK)).build());
    }

    static Map.Entry<Integer, o8e> d(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_download), ((r8e.b) q8e.e(C0707R.id.share_app_download, C0707R.string.share_app_download, C0707R.string.share_download_log_id, new SpotifyIconDrawable(context, SpotifyIconV2.MAKE_AVAILABLE_OFFLINE, (float) b(context, optional)), ShareCapability.IMAGE)).build());
    }

    static Map.Entry<Integer, o8e> e(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_feed), ((r8e.b) q8e.e(C0707R.id.share_app_facebook_feed, C0707R.string.share_app_facebook_feed, C0707R.string.share_facebook_feed_log_id, a(context, C0707R.drawable.share_icn_facebook_newsfeed, optional), ShareCapability.LINK)).build());
    }

    static Map.Entry<Integer, o8e> f(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_messenger), ((r8e.b) q8e.e(C0707R.id.share_app_facebook_messenger, C0707R.string.share_app_facebook_messenger, C0707R.string.share_facebook_messenger_log_id_gabito, a(context, C0707R.drawable.share_icn_messenger, optional), ShareCapability.MESSAGE, ShareCapability.LINK)).build());
    }

    static Map.Entry<Integer, o8e> g(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_facebook_stories), ((r8e.b) q8e.e(C0707R.id.share_app_facebook_stories, C0707R.string.share_app_facebook_stories, C0707R.string.share_facebook_stories_log_id, a(context, C0707R.drawable.share_icn_facebook_stories, optional), ShareCapability.VIDEO_STORY, ShareCapability.IMAGE_STORY, ShareCapability.GRADIENT_STORY)).build());
    }

    static Map.Entry<Integer, o8e> h(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_instagram_stories), ((r8e.b) q8e.e(C0707R.id.share_app_instagram_stories, C0707R.string.share_app_instagram_stories, C0707R.string.share_instagram_log_id, a(context, C0707R.drawable.share_app_instagram, optional), ShareCapability.VIDEO_STORY, ShareCapability.IMAGE_STORY, ShareCapability.GRADIENT_STORY)).build());
    }

    static Map.Entry<Integer, o8e> i(Context context, Optional<Integer> optional) {
        Integer valueOf = Integer.valueOf((int) C0707R.id.share_app_line);
        r8e.b bVar = (r8e.b) q8e.e(C0707R.id.share_app_line, C0707R.string.share_app_line, C0707R.string.share_line_log_id, a(context, C0707R.drawable.share_icn_line, optional), ShareCapability.MESSAGE, ShareCapability.LINK);
        bVar.e(Optional.of(context.getString(C0707R.string.share_line_package)));
        return new AbstractMap.SimpleImmutableEntry(valueOf, bVar.build());
    }

    static Map.Entry<Integer, o8e> j(Context context, Optional<Integer> optional) {
        Integer valueOf = Integer.valueOf((int) C0707R.id.share_app_line_lite);
        r8e.b bVar = (r8e.b) q8e.e(C0707R.id.share_app_line_lite, C0707R.string.share_app_line_lite, C0707R.string.share_line_lite_log_id, a(context, C0707R.drawable.share_icn_line, optional), ShareCapability.MESSAGE, ShareCapability.LINK);
        bVar.e(Optional.of(context.getString(C0707R.string.share_line_lite_package)));
        return new AbstractMap.SimpleImmutableEntry(valueOf, bVar.build());
    }

    static Map.Entry<Integer, o8e> k(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_more), ((r8e.b) q8e.e(C0707R.id.share_app_more, C0707R.string.share_contextmenu_more, C0707R.string.share_native_share_menu_log_id, new SpotifyIconDrawable(context, SpotifyIconV2.MORE, (float) b(context, optional)), ShareCapability.MESSAGE, ShareCapability.LINK)).build());
    }

    static Map.Entry<Integer, o8e> l(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_generic_sms), ((r8e.b) q8e.e(C0707R.id.share_app_generic_sms, C0707R.string.share_app_generic_sms, C0707R.string.share_sms_log_id, new SpotifyIconDrawable(context, SpotifyIconV2.SMS, (float) b(context, optional)), ShareCapability.MESSAGE, ShareCapability.LINK)).build());
    }

    static Map.Entry<Integer, o8e> m(Context context, Optional<Integer> optional) {
        return new AbstractMap.SimpleImmutableEntry(Integer.valueOf((int) C0707R.id.share_app_snapchat_stories), ((r8e.b) q8e.e(C0707R.id.share_app_snapchat_stories, C0707R.string.share_app_snapchat, C0707R.string.share_snapchat_log_id, a(context, C0707R.drawable.share_icn_snapchat, optional), ShareCapability.IMAGE_STORY, ShareCapability.GRADIENT_STORY)).build());
    }

    static Map.Entry<Integer, o8e> n(Context context, Optional<Integer> optional) {
        Integer valueOf = Integer.valueOf((int) C0707R.id.share_app_twitter);
        r8e.b bVar = (r8e.b) q8e.e(C0707R.id.share_app_twitter, C0707R.string.share_app_twitter, C0707R.string.share_twitter_log_id, a(context, C0707R.drawable.share_icn_twitter, optional), ShareCapability.MESSAGE, ShareCapability.IMAGE, ShareCapability.LINK);
        bVar.e(Optional.of(context.getString(C0707R.string.share_twitter_package)));
        return new AbstractMap.SimpleImmutableEntry(valueOf, bVar.build());
    }

    static Map.Entry<Integer, o8e> o(Context context, Optional<Integer> optional) {
        Integer valueOf = Integer.valueOf((int) C0707R.id.share_app_whats_app);
        r8e.b bVar = (r8e.b) q8e.e(C0707R.id.share_app_whats_app, C0707R.string.share_app_whats_app, C0707R.string.share_whatsapp_log_id_gabito, a(context, C0707R.drawable.share_icn_whatsapp, optional), ShareCapability.MESSAGE, ShareCapability.LINK);
        bVar.e(Optional.of(context.getString(C0707R.string.share_whatsapp_package)));
        return new AbstractMap.SimpleImmutableEntry(valueOf, bVar.build());
    }
}
