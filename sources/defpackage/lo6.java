package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.playlistentity.configuration.f;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.playlist.models.j;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: lo6  reason: default package */
public class lo6 {
    private final PlayOrigin a;
    private final f b;
    private final a76 c;
    private final bre d;
    private j e;
    private boolean f;
    private final AtomicReference<String> g = new AtomicReference<>("item_unknown");
    private final AtomicReference<String> h = new AtomicReference<>("unknown_interaction_id_in_PlaylistCosmosPlayer");

    public lo6(PlayOrigin playOrigin, a76 a76, f fVar, bre bre) {
        this.a = playOrigin;
        this.b = fVar;
        this.c = a76;
        this.d = bre;
    }

    private static boolean c(String str) {
        return str != null && !"item_shuffle_play".equals(str) && !"item_not_set".equals(str) && !"item_unknown".equals(str);
    }

    public a a(j jVar, boolean z) {
        this.e = jVar;
        this.f = z;
        if ("item_unknown".equals(this.g.get())) {
            return b.a;
        }
        a b2 = b(this.g.get(), this.h.get());
        this.g.set("item_unknown");
        return b2;
    }

    public a b(String str, String str2) {
        if (this.e == null) {
            this.g.set(str);
            this.h.set(str2);
            return b.a;
        }
        Boolean d2 = this.b.d();
        boolean z = (d2 != null && d2.booleanValue()) || "item_shuffle_play".equals(str);
        SkipToTrack fromUid = SkipToTrack.fromUid(str);
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        if (z) {
            if (this.b.a() && c(str)) {
                builder.skipTo(fromUid);
            }
        } else if (c(str)) {
            builder.skipTo(fromUid);
        }
        Boolean c2 = this.b.c();
        PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
        if (z) {
            builder2.shufflingContext(Boolean.TRUE);
        } else if (d2 != null) {
            builder2.shufflingContext(d2);
        }
        if (c2 != null) {
            builder2.repeatingContext(c2);
        }
        builder.playerOptionsOverride(builder2.build());
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        if (!(!this.f && this.e.w()) && this.b.e()) {
            builder3.mo51put("shuffle.algorithm", "weighted");
        }
        if (this.b.b()) {
            builder3.mo51put("license", Context.Metadata.LICENSE_ON_DEMAND_WHEN_FREE);
        }
        String g2 = this.e.g();
        if (!TextUtils.isEmpty(g2)) {
            builder3.mo51put("format_list_type", g2);
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder4 = new ImmutableSet.Builder();
        if (this.b.a()) {
            builder4.mo60add((Object[]) new String[]{"mft/inject_filler_tracks", "mft/inject_random_tracks", "mft/disallow_restart_play"});
        }
        builder.suppressions(builder4.build());
        return this.c.g(builder.build(), this.a, builder3.build(), str2, this.d.get());
    }
}
