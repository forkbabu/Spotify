package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* renamed from: tl1  reason: default package */
public final class tl1 {
    public static PreparePlayOptions a(String str, Bundle bundle) {
        String string = bundle.getString("com.spotify.music.extra.CONTEXT_URI");
        int i = bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 3);
        int i2 = bundle.getInt("com.spotify.music.extra.TRACK_INDEX", -1);
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        boolean z = true;
        if (i2 >= 0 || (string != null && !str.equals(string))) {
            if (string == null) {
                z = false;
            }
            long j = 0;
            if (z) {
                SkipToTrack.Builder trackUri = SkipToTrack.builder().pageIndex(0L).trackUri(str);
                if (b(string)) {
                    j = (long) i2;
                }
                builder.skipTo(trackUri.trackIndex(Long.valueOf(j)).build());
            } else if (b(str)) {
                builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf((long) i2)).build());
            }
        }
        AudioStream audioStream = i == 4 ? AudioStream.ALARM : AudioStream.DEFAULT;
        if (audioStream == AudioStream.ALARM) {
            builder.playerOptionsOverride(PlayerOptionOverrides.builder().repeatingContext(Boolean.TRUE).build());
        }
        builder.audioStream(audioStream);
        if (bundle.containsKey("com.spotify.music.extra.SHUFFLE")) {
            builder.playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.valueOf(bundle.getBoolean("com.spotify.music.extra.SHUFFLE"))).build());
        }
        return builder.build();
    }

    private static boolean b(String str) {
        return l0.b(str, LinkType.ALBUM) || l0.b(str, LinkType.PLAYLIST_V2);
    }
}
