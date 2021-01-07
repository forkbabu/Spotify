package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;
import com.spotify.music.features.imagerecs.model.TrackRecsEntity;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import io.reactivex.z;
import java.util.Collection;
import java.util.UUID;

/* renamed from: vl5  reason: default package */
public class vl5 {
    private final f a;
    private final lxd b;
    private final Context c;
    private final String d = UUID.randomUUID().toString();

    public vl5(f fVar, lxd lxd, Context context) {
        this.a = fVar;
        this.b = lxd;
        this.c = context;
    }

    public z<zwd> a(TrackRecsEntity trackRecsEntity) {
        if (trackRecsEntity.getTrackList().isEmpty()) {
            return z.z(zwd.a("Empty track Result"));
        }
        f fVar = this.a;
        StringBuilder V0 = je.V0("context://spotify:image-recs:");
        V0.append(this.d);
        return fVar.a(this.b.a(com.spotify.player.model.Context.fromTrackUris(V0.toString(), ImmutableList.copyOf((Collection) trackRecsEntity.getTrackList())).toBuilder().metadata(ImmutableMap.of(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false", "context_description", this.c.getString(C0707R.string.queue_playing_from))).build()).options(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build()).build());
    }
}
