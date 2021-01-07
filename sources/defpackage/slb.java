package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: slb  reason: default package */
public final class slb implements wlb {
    private final AndroidMusicLibsNowplayingScrollProperties a;

    public slb(AndroidMusicLibsNowplayingScrollProperties androidMusicLibsNowplayingScrollProperties) {
        h.e(androidMusicLibsNowplayingScrollProperties, "properties");
        this.a = androidMusicLibsNowplayingScrollProperties;
    }

    @Override // defpackage.wlb
    public List<NowPlayingWidget.Type> a() {
        AndroidMusicLibsNowplayingScrollProperties.DebugDataSource a2 = this.a.a();
        if (a2 != null) {
            switch (a2.ordinal()) {
                case 1:
                    return d.t(NowPlayingWidget.Type.BEHIND_THE_LYRICS);
                case 2:
                    return d.t(NowPlayingWidget.Type.EXAMPLE);
                case 3:
                    return d.u(NowPlayingWidget.Type.BEHIND_THE_LYRICS, NowPlayingWidget.Type.EXAMPLE);
                case 4:
                    return d.u(NowPlayingWidget.Type.LYRICS, NowPlayingWidget.Type.BEHIND_THE_LYRICS);
                case 5:
                    return d.t(NowPlayingWidget.Type.UP_NEXT);
                case 6:
                    return d.t(NowPlayingWidget.Type.PODCAST_MORE_FOR_YOU);
            }
        }
        return EmptyList.a;
    }
}
