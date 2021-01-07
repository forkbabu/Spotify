package defpackage;

import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.h;

/* renamed from: vz5  reason: default package */
public final class vz5 implements xz5 {
    private final wx5 a;

    public vz5(wx5 wx5) {
        h.e(wx5, "collectionIntents");
        this.a = wx5;
    }

    @Override // defpackage.xz5
    public cy5 a(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        if (Boolean.parseBoolean(contextTrack.metadata().get("collection.is_banned"))) {
            cy5 a2 = cy5.a(dy5.a(C0707R.drawable.icn_notification_banned, C0707R.string.player_content_description_unban), this.a.d(contextTrack.uri(), playerState.contextUri()), false);
            h.d(a2, "NotificationAction.creat…      false\n            )");
            return a2;
        }
        cy5 a3 = cy5.a(dy5.a(C0707R.drawable.icn_notification_ban, C0707R.string.player_content_description_ban), this.a.c(contextTrack.uri(), playerState.contextUri()), false);
        h.d(a3, "NotificationAction.creat…      false\n            )");
        return a3;
    }

    @Override // defpackage.xz5
    public cy5 b(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        if (Boolean.parseBoolean(contextTrack.metadata().get("collection.in_collection"))) {
            cy5 a2 = cy5.a(dy5.a(C0707R.drawable.icn_notification_liked, C0707R.string.player_content_description_unlike), this.a.b(contextTrack.uri(), playerState.contextUri()), false);
            h.d(a2, "NotificationAction.creat…      false\n            )");
            return a2;
        }
        cy5 a3 = cy5.a(dy5.a(C0707R.drawable.icn_notification_like, C0707R.string.player_content_description_like), this.a.a(contextTrack.uri(), playerState.contextUri()), false);
        h.d(a3, "NotificationAction.creat…      false\n            )");
        return a3;
    }
}
