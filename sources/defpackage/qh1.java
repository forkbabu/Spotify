package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: qh1  reason: default package */
public interface qh1 {
    z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map);

    z<List<MediaBrowserItem>> b(BrowserParams browserParams);
}
