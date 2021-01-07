package com.spotify.music.libs.mediabrowserservice;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediasession.i0;
import io.reactivex.functions.g;
import java.util.List;
import java.util.Set;

public interface n2 {
    boolean a();

    void b(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar);

    String c();

    Set<Long> d();

    void destroy();

    a2 e();

    void f(String str, Bundle bundle, g<List<MediaBrowserCompat.MediaItem>> gVar);

    i0 g();

    boolean h();

    String i();

    v1 j();
}
