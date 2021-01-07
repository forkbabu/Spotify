package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.music.libs.viewuri.c;
import defpackage.wjb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: zjb  reason: default package */
public final class zjb {
    public static yjb a(c cVar, String str, PlayerStateCompat playerStateCompat) {
        wjb.a aVar = new wjb.a();
        aVar.b(Collections.emptyList());
        aVar.c(cVar);
        ArrayList arrayList = new ArrayList();
        LegacyPlayerState mostRecentPlayerState = playerStateCompat.getMostRecentPlayerState();
        if (mostRecentPlayerState != null) {
            PlayerTrack track = mostRecentPlayerState.track();
            boolean z = true;
            if (track != null && track.uri().equals(str)) {
                StringBuilder V0 = je.V0(str);
                long currentPlaybackPosition = mostRecentPlayerState.currentPlaybackPosition();
                Locale locale = Locale.US;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                String format = String.format(locale, "%02d:%02d:%02d", Long.valueOf(timeUnit.toHours(currentPlaybackPosition)), Long.valueOf(timeUnit.toMinutes(currentPlaybackPosition) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(timeUnit.toSeconds(currentPlaybackPosition) % TimeUnit.MINUTES.toSeconds(1)));
                V0.append('#' + format);
                arrayList.add(V0.toString());
                PlayerTrack track2 = mostRecentPlayerState.track();
                if (track2 == null || track2.metadata().get("canvas.type") == null) {
                    z = false;
                }
                if (z) {
                    PlayerTrack track3 = mostRecentPlayerState.track();
                    arrayList.add(track3 != null ? track3.metadata().get("canvas.canvasUri") : "");
                }
                aVar.b(arrayList);
                return aVar.a();
            }
        }
        arrayList.add(str);
        aVar.b(arrayList);
        return aVar.a();
    }
}
