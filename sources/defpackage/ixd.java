package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;
import java.util.List;

/* renamed from: ixd  reason: default package */
public final class ixd {
    public static PlayOrigin a(com.spotify.player.model.PlayOrigin playOrigin) {
        return new PlayOrigin(playOrigin.featureIdentifier(), playOrigin.featureVersion(), playOrigin.viewUri(), playOrigin.externalReferrer(), playOrigin.referrerIdentifier(), playOrigin.deviceIdentifier(), playOrigin.featureClasses());
    }

    public static PlayerTrack b(ContextTrack contextTrack) {
        return new PlayerTrack(contextTrack.uri(), contextTrack.uid(), null, null, MoreObjects.emptyToNull(contextTrack.provider()), contextTrack.metadata());
    }

    public static PlayerTrack[] c(List<ContextTrack> list) {
        return (PlayerTrack[]) FluentIterable.from(list).transform(gxd.a).toList().toArray(new PlayerTrack[0]);
    }
}
