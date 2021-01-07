package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.ondemand.proto.PlaylistUriResolverResponse;
import com.spotify.playlist.ondemand.proto.ResolvedPersonalizedPlaylist;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: mr6  reason: default package */
public final /* synthetic */ class mr6 implements l {
    public static final /* synthetic */ mr6 a = new mr6();

    private /* synthetic */ mr6() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<ResolvedPersonalizedPlaylist> h = ((PlaylistUriResolverResponse) obj).h();
        if (h.isEmpty()) {
            return Optional.absent();
        }
        String h2 = h.get(0).h();
        if (l0.c(h2, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
            return Optional.of(h2);
        }
        return Optional.absent();
    }
}
