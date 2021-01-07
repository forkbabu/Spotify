package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import java.util.EnumMap;

/* renamed from: hc6  reason: default package */
public final class hc6 implements fjf<EnumMap<HomeMixTuning.Style, String>> {
    private final wlf<Context> a;

    public hc6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        return new EnumMap(ImmutableMap.of(HomeMixTuning.Style.CHILL, context.getString(C0707R.string.home_mix_chill_text), HomeMixTuning.Style.UPBEAT, context.getString(C0707R.string.home_mix_upbeat_text), HomeMixTuning.Style.DEFAULT, ""));
    }
}
