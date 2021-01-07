package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.player.model.Context;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.z;
import java.util.Collections;
import java.util.HashSet;

public final class f4 {
    private final v1 a;

    public f4(v1 v1Var) {
        this.a = v1Var;
    }

    public z<zwd> a(String str, PreparePlayOptions preparePlayOptions) {
        h2.a c = h2.c(str);
        c.e(ImmutableMap.of(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"));
        if (preparePlayOptions == null) {
            preparePlayOptions = PreparePlayOptions.builder().build();
        }
        Suppressions orNull = preparePlayOptions.suppressions().orNull();
        HashSet hashSet = new HashSet(orNull != null ? orNull.providers() : Collections.emptySet());
        hashSet.add("mft/inject_random_tracks");
        Suppressions create = Suppressions.create(hashSet);
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        c.g(preparePlayOptions.toBuilder().suppressions(create).playerOptionsOverride(builder.repeatingContext(bool).repeatingTrack(bool).shufflingContext(bool).build()).build());
        return this.a.Z2().p(c.b());
    }
}
