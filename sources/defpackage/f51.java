package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.Context;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* renamed from: f51  reason: default package */
public final class f51 {
    public static Context a(p81 p81) {
        p81 bundle = p81.bundle("player");
        if (bundle != null) {
            return b81.d(bundle.bundle("context"));
        }
        return null;
    }

    public static PreparePlayOptions b(p81 p81) {
        p81 bundle;
        SkipToTrack skipToTrack;
        PlayerOptionOverrides playerOptionOverrides;
        String[] stringArray;
        p81 bundle2 = p81.bundle("player");
        Suppressions suppressions = null;
        if (bundle2 == null || (bundle = bundle2.bundle("options")) == null) {
            return null;
        }
        p81 bundle3 = bundle.bundle("skip_to");
        if (bundle3 == null) {
            skipToTrack = null;
        } else {
            String string = bundle3.string("page_url");
            Long longValue = bundle3.longValue("page_index");
            String string2 = bundle3.string("track_uid");
            String string3 = bundle3.string(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
            Long longValue2 = bundle3.longValue("track_index");
            SkipToTrack.Builder builder = SkipToTrack.builder();
            if (string != null) {
                builder.pageUrl(string);
            }
            if (longValue != null) {
                builder.pageIndex(longValue);
            }
            if (string2 != null) {
                builder.trackUid(string2);
            }
            if (string3 != null) {
                builder.trackUri(string3);
            }
            if (longValue2 != null) {
                builder.trackIndex(longValue2);
            }
            skipToTrack = builder.build();
        }
        Long longValue3 = bundle.longValue("seek_to");
        Boolean boolValue = bundle.boolValue("initially_paused");
        p81 bundle4 = bundle.bundle("player_options_override");
        if (bundle4 == null) {
            playerOptionOverrides = null;
        } else {
            Boolean boolValue2 = bundle4.boolValue("shuffling_context");
            Boolean boolValue3 = bundle4.boolValue("repeating_context");
            Boolean boolValue4 = bundle4.boolValue("repeating_track");
            PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
            if (boolValue2 != null) {
                builder2.shufflingContext(boolValue2);
            }
            if (boolValue3 != null) {
                builder2.repeatingContext(boolValue3);
            }
            if (boolValue4 != null) {
                builder2.repeatingTrack(boolValue4);
            }
            playerOptionOverrides = builder2.build();
        }
        p81 bundle5 = bundle.bundle("suppressions");
        if (!(bundle5 == null || (stringArray = bundle5.stringArray("providers")) == null)) {
            suppressions = Suppressions.create(ImmutableSet.copyOf(stringArray));
        }
        PreparePlayOptions.Builder builder3 = PreparePlayOptions.builder();
        if (longValue3 != null) {
            builder3.seekTo(longValue3);
        }
        if (boolValue != null) {
            builder3.initiallyPaused(boolValue.booleanValue());
        }
        if (playerOptionOverrides != null) {
            builder3.playerOptionsOverride(playerOptionOverrides);
        }
        if (suppressions != null) {
            builder3.suppressions(suppressions);
        }
        if (skipToTrack != null) {
            builder3.skipTo(skipToTrack);
        }
        return builder3.build();
    }
}
