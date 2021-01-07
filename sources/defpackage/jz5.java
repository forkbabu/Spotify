package defpackage;

import android.app.PendingIntent;
import android.text.SpannableString;
import com.spotify.android.flags.c;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.qy5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: jz5  reason: default package */
public final class jz5 implements uy5 {
    private final qy5 a;
    private final bz5 b;
    private final wx5 c;
    private final fm9 d;

    public jz5(bz5 bz5, wx5 wx5, qy5.a aVar, fm9 fm9) {
        h.e(bz5, "defaultGenerator");
        h.e(wx5, "collectionIntents");
        h.e(aVar, "playerIntentsFactory");
        h.e(fm9, "featureUtils");
        this.b = bz5;
        this.c = wx5;
        this.d = fm9;
        this.a = aVar.a("freetier");
    }

    @Override // defpackage.uy5
    public SpannableString a(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.a(playerState);
    }

    @Override // defpackage.uy5
    public SpannableString b(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.b(playerState);
    }

    @Override // defpackage.uy5
    public boolean c(PlayerState playerState, c cVar) {
        h.e(playerState, "state");
        return this.d.a(cVar);
    }

    @Override // defpackage.uy5
    public SpannableString d(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.d(playerState);
    }

    @Override // defpackage.uy5
    public List<cy5> e(PlayerState playerState) {
        PendingIntent pendingIntent;
        int i;
        int i2;
        int i3;
        PendingIntent pendingIntent2;
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        ArrayList arrayList = new ArrayList();
        if (Boolean.parseBoolean(contextTrack.metadata().get("collection.can_add"))) {
            ContextTrack contextTrack2 = playerState.track().get();
            if (Boolean.parseBoolean(contextTrack2.metadata().get("collection.in_collection"))) {
                i3 = C0707R.drawable.icn_notification_liked;
                i2 = C0707R.string.player_content_description_unlike;
                pendingIntent2 = this.c.b(contextTrack2.uri(), playerState.contextUri());
                h.d(pendingIntent2, "collectionIntents.remove…ri(), state.contextUri())");
            } else {
                i3 = C0707R.drawable.icn_notification_like;
                i2 = C0707R.string.player_content_description_like;
                pendingIntent2 = this.c.a(contextTrack2.uri(), playerState.contextUri());
                h.d(pendingIntent2, "collectionIntents.addToC…ri(), state.contextUri())");
            }
            cy5 a2 = cy5.a(dy5.a(i3, i2), pendingIntent2, false);
            h.d(a2, "NotificationAction.creat…, intent, false\n        )");
            arrayList.add(a2);
        }
        cy5 c2 = oz5.c(playerState, this.a, true);
        h.d(c2, "previous(state, playerIntents, true)");
        arrayList.add(c2);
        cy5 b2 = oz5.b(playerState, this.a, true);
        h.d(b2, "playPause(state, playerIntents, true)");
        arrayList.add(b2);
        cy5 a3 = oz5.a(playerState, this.a, true);
        h.d(a3, "next(state, playerIntents, true)");
        arrayList.add(a3);
        if (Boolean.parseBoolean(contextTrack.metadata().get("collection.can_ban"))) {
            ContextTrack contextTrack3 = playerState.track().get();
            if (Boolean.parseBoolean(contextTrack3.metadata().get("collection.is_banned"))) {
                i = C0707R.string.player_content_description_unhide;
                pendingIntent = this.c.d(contextTrack3.uri(), playerState.contextUri());
                h.d(pendingIntent, "collectionIntents.unBanF…ri(), state.contextUri())");
            } else {
                i = C0707R.string.player_content_description_hide;
                pendingIntent = this.c.c(contextTrack3.uri(), playerState.contextUri());
                h.d(pendingIntent, "collectionIntents.banFro…ri(), state.contextUri())");
            }
            cy5 a4 = cy5.a(dy5.a(C0707R.drawable.icn_notification_block, i), pendingIntent, false);
            h.d(a4, "NotificationAction.creat…, intent, false\n        )");
            arrayList.add(a4);
        }
        return d.Q(arrayList);
    }
}
