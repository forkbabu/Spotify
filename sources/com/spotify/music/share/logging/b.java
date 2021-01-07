package com.spotify.music.share.logging;

import com.spotify.music.share.logging.LegacyShareEventEmitterImpl;
import java.util.List;

public class b implements b8e {
    private final jz1 a;

    public b(jz1 jz1) {
        this.a = jz1;
    }

    public void a(String str, String str2, String str3, String str4, String str5, long j, String str6, List<String> list) {
        LegacyShareEventEmitterImpl.m(str4, str5, j, LegacyShareEventEmitterImpl.Interaction.HIT, LegacyShareEventEmitterImpl.UserIntent.DEEPLINK, LegacyShareEventEmitterImpl.Result.NO_RESULT, str, str2, str6, false, list, str3, null, this.a);
    }
}
