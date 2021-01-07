package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import java.util.EnumMap;

/* renamed from: fc6  reason: default package */
public final class fc6 implements fjf<EnumMap<HomeMixTuning.Style, String>> {
    private final wlf<Context> a;

    public fc6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        return new EnumMap(ImmutableMap.of(HomeMixTuning.Style.CHILL, context.getString(C0707R.string.home_mix_chill_empty_tracks_message), HomeMixTuning.Style.UPBEAT, context.getString(C0707R.string.home_mix_upbeat_empty_tracks_message)));
    }
}
