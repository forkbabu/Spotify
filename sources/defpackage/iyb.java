package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.b;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.j1c;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: iyb  reason: default package */
public final class iyb {
    public static final j1c.b.a a(b bVar) {
        h.e(bVar, "$this$duration");
        return new j1c.b.a((int) (bVar.k() - bVar.j()));
    }

    public static final String b(b bVar) {
        h.e(bVar, "itemModel");
        String f = bVar.f();
        boolean z = false;
        if (!(f == null || f.length() == 0)) {
            return bVar.f();
        }
        String l = bVar.l();
        if (!(l == null || l.length() == 0)) {
            return bVar.l();
        }
        String c = bVar.c();
        if (c == null || c.length() == 0) {
            z = true;
        }
        return !z ? bVar.c() : "";
    }

    public static final String c(PlayerState playerState) {
        h.e(playerState, "$this$parentEpisodeUri");
        String str = f(playerState).get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
        return str != null ? str : "";
    }

    public static final String d(b bVar, Context context) {
        h.e(bVar, "itemModel");
        h.e(context, "context");
        String g = bVar.g();
        boolean z = true;
        if (!(g == null || g.length() == 0)) {
            return bVar.g();
        }
        String p = d.p(bVar.a(), null, null, null, 0, null, null, 63, null);
        if (p.length() <= 0) {
            z = false;
        }
        if (z) {
            return p;
        }
        String string = context.getString(C0707R.string.npv_track_list_item_subtitle_placeholder);
        h.d(string, "context.getString(R.stri…tem_subtitle_placeholder)");
        return string;
    }

    public static final String e(b bVar) {
        h.e(bVar, "itemModel");
        String h = bVar.h();
        boolean z = false;
        if (!(h == null || h.length() == 0)) {
            return bVar.h();
        }
        String m = bVar.m();
        if (!(m == null || m.length() == 0)) {
            return bVar.m();
        }
        String d = bVar.d();
        if (d == null || d.length() == 0) {
            z = true;
        }
        return !z ? bVar.d() : "";
    }

    public static final Map<String, String> f(PlayerState playerState) {
        ImmutableMap<String, String> metadata;
        h.e(playerState, "$this$trackMetadata");
        ContextTrack orNull = playerState.track().orNull();
        return (orNull == null || (metadata = orNull.metadata()) == null) ? EmptyMap.a : metadata;
    }

    public static final boolean g(PlayerState playerState) {
        h.e(playerState, "$this$isActuallyPlaying");
        return playerState.isPlaying() && !playerState.isPaused();
    }

    public static Boolean h(PlayerState playerState) {
        return Boolean.valueOf(playerState.track().isPresent() && Boolean.valueOf(playerState.track().get().uri().startsWith("spotify:episode")).booleanValue() && "video".equals(playerState.track().get().metadata().get("media.type")));
    }
}
