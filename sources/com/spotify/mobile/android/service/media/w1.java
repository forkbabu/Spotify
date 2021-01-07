package com.spotify.mobile.android.service.media;

import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.z;
import java.util.List;

public interface w1 {
    z<List<MediaBrowserItem>> a(BrowserParams browserParams, Bundle bundle, long j, long j2);
}
