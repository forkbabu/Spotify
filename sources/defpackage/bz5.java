package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.core.content.a;
import com.spotify.android.flags.c;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.core.navcontext.j;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.qy5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: bz5  reason: default package */
public class bz5 implements uy5 {
    private final qy5 a;
    private final wx5 b;
    private final j c;
    private final Context d;

    public bz5(wx5 wx5, qy5.a aVar, j jVar, Context context) {
        h.e(wx5, "collectionIntents");
        h.e(aVar, "playerIntentsFactory");
        h.e(jVar, "navigationContextResolver");
        h.e(context, "context");
        this.b = wx5;
        this.c = jVar;
        this.d = context;
        this.a = aVar.a("default");
    }

    @Override // defpackage.uy5
    public SpannableString a(PlayerState playerState) {
        h.e(playerState, "state");
        if (Build.VERSION.SDK_INT < 24) {
            SpannableString spannableString = new SpannableString(this.d.getString(C0707R.string.app_name));
            spannableString.setSpan(new ForegroundColorSpan(a.b(this.d, R.color.green)), 0, spannableString.length(), 33);
            return spannableString;
        }
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, "state.track().get()");
        if (kxd.k(contextTrack)) {
            return null;
        }
        Resources resources = this.d.getResources();
        h.d(resources, "context.resources");
        String c2 = this.c.a(playerState).c(resources);
        if (c2 == null) {
            return null;
        }
        if (e.n(c2)) {
            c2 = null;
        }
        if (c2 != null) {
            return new SpannableString(c2);
        }
        return null;
    }

    @Override // defpackage.uy5
    public SpannableString b(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, "state.track().get()");
        String q = kxd.q(contextTrack);
        if (q == null) {
            q = "";
        }
        SpannableString spannableString = new SpannableString(q);
        if (Build.VERSION.SDK_INT > 23) {
            spannableString.setSpan(new StyleSpan(1), 0, q.length(), 33);
        }
        return spannableString;
    }

    @Override // defpackage.uy5
    public boolean c(PlayerState playerState, c cVar) {
        h.e(playerState, "state");
        return true;
    }

    @Override // defpackage.uy5
    public SpannableString d(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        if (kxd.m(contextTrack)) {
            return new SpannableString(this.d.getString(C0707R.string.player_watch_on_spotify));
        }
        if (kxd.a(contextTrack).length() > 0) {
            return new SpannableString(kxd.a(contextTrack));
        }
        return null;
    }

    @Override // defpackage.uy5
    public List<cy5> e(PlayerState playerState) {
        PendingIntent pendingIntent;
        int i;
        int i2;
        h.e(playerState, "state");
        ArrayList arrayList = new ArrayList();
        if (Boolean.parseBoolean(playerState.track().get().metadata().get("collection.can_add"))) {
            if (Boolean.parseBoolean(playerState.track().get().metadata().get("collection.in_collection"))) {
                i2 = C0707R.drawable.icn_notification_new_positive_feedback_selected;
                i = C0707R.string.content_description_radio_thumb_down;
                pendingIntent = this.b.b(playerState.track().get().uri(), playerState.contextUri());
                h.d(pendingIntent, "collectionIntents.remove…ontextUri()\n            )");
            } else {
                i2 = C0707R.drawable.icn_notification_new_positive_feedback;
                i = C0707R.string.content_description_radio_thumb_up;
                pendingIntent = this.b.a(playerState.track().get().uri(), playerState.contextUri());
                h.d(pendingIntent, "collectionIntents.addToC…ri(), state.contextUri())");
            }
            cy5 a2 = cy5.a(dy5.a(i2, i), pendingIntent, false);
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
        return d.Q(arrayList);
    }
}
