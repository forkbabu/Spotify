package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import io.reactivex.z;

/* renamed from: an3  reason: default package */
public class an3 {
    private final f a;
    private final lxd b;

    public an3(f fVar, lxd lxd) {
        this.a = fVar;
        this.b = lxd;
    }

    public z<zwd> a(String str) {
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        return this.a.a(this.b.a(Context.fromUri(str)).options(builder.playerOptionsOverride(builder2.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build()).build());
    }
}
