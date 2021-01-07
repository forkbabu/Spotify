package com.spotify.player.options;

import com.google.common.base.Optional;
import com.spotify.player.internal.c;
import com.spotify.player.model.command.SetOptionsCommand;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class a implements d {
    private final c a;
    private final com.spotify.player.internal.a b;

    public a(c cVar, com.spotify.player.internal.a aVar) {
        h.e(cVar, "commandResolver");
        h.e(aVar, "loggingParamsFactory");
        this.a = cVar;
        this.b = aVar;
    }

    private final z<zwd> b(boolean z, boolean z2) {
        SetOptionsCommand build = SetOptionsCommand.builder().repeatingContext(z).repeatingTrack(z2).build();
        h.d(build, "setOptionsCommand");
        h.e(build, "command");
        SetOptionsCommand.Builder builder = build.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = build.loggingParams();
        h.d(loggingParams, "command.loggingParams()");
        SetOptionsCommand build2 = builder.loggingParams(aVar.c(loggingParams)).build();
        h.d(build2, "command.toBuilder()\n    …()))\n            .build()");
        return this.a.b("set_options", build2);
    }

    @Override // com.spotify.player.options.d
    public z<zwd> a(boolean z) {
        SetShufflingContextCommand create = SetShufflingContextCommand.create(z);
        h.d(create, "SetShufflingContextCommand.create(enabled)");
        h.e(create, "command");
        SetShufflingContextCommand.Builder builder = create.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = create.loggingParams();
        h.d(loggingParams, "command.loggingParams()");
        SetShufflingContextCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        h.d(build, "command.toBuilder()\n    …()))\n            .build()");
        return this.a.b("set_shuffling_context", build);
    }

    @Override // com.spotify.player.options.d
    public z<zwd> setRepeatMode(RepeatMode repeatMode) {
        h.e(repeatMode, "repeatMode");
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return b(false, false);
        }
        if (ordinal == 1) {
            return b(true, false);
        }
        if (ordinal == 2) {
            return b(true, true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
