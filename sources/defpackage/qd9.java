package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.a;
import java.util.Map;

/* renamed from: qd9  reason: default package */
public class qd9 {
    private final faa a;
    private final PlayOrigin b;

    public qd9(faa faa, PlayOrigin playOrigin) {
        this.a = faa;
        this.b = playOrigin;
    }

    public a a(MusicItem musicItem, Map<String, String> map, qpd qpd, String str, String str2) {
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        if (musicItem != null && musicItem.o()) {
            builder.skipTo(SkipToTrack.builder().trackUri(musicItem.A()).trackIndex(0L).build());
        }
        if (qpd.a() != null) {
            this.a.b().g(qpd.a());
        }
        return this.a.h(builder.build(), this.b, map, str, str2);
    }

    public a b(Map<String, String> map, String str, String str2) {
        return this.a.h(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build(), this.b, map, str, str2);
    }
}
