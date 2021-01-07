package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import kotlin.jvm.internal.h;

/* renamed from: lxd  reason: default package */
public final class lxd {
    private final PlayOrigin a;

    public lxd(PlayOrigin playOrigin) {
        h.e(playOrigin, "playOrigin");
        this.a = playOrigin;
    }

    public final PlayCommand.Builder a(Context context) {
        h.e(context, "context");
        PlayCommand.Builder builder = PlayCommand.builder(context, this.a);
        h.d(builder, "PlayCommand.builder(context, playOrigin)");
        return builder;
    }
}
