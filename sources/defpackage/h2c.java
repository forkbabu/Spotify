package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;

/* renamed from: h2c  reason: default package */
class h2c {
    private final ImmutableMap<Integer, Integer> a;
    private final ImmutableList<Integer> b;

    h2c(ImmutableList<Integer> immutableList) {
        this.b = immutableList;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(je.a0(C0707R.string.player_overlay_speed_30x, builder, je.a0(C0707R.string.player_overlay_speed_25x, builder, je.a0(C0707R.string.player_overlay_speed_20x, builder, je.a0(C0707R.string.player_overlay_speed_18x, builder, je.a0(C0707R.string.player_overlay_speed_15x, builder, je.a0(C0707R.string.player_overlay_speed_12x, builder, je.a0(C0707R.string.player_overlay_speed_10x, builder, je.a0(C0707R.string.player_overlay_speed_08x, builder, je.a0(C0707R.string.player_overlay_speed_05x, builder, 50, 80), 100), 120), AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), 180), 200), 250), 300), 350), Integer.valueOf((int) C0707R.string.player_overlay_speed_35x));
        this.a = builder.build();
    }

    /* access modifiers changed from: package-private */
    public Integer a(int i) {
        if (this.b.contains(Integer.valueOf(i))) {
            return this.a.get(Integer.valueOf(i));
        }
        return null;
    }
}
