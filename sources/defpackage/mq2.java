package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;

/* renamed from: mq2  reason: default package */
public final class mq2 {
    private static final ImmutableMap<Integer, Integer> a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(je.a0(C0707R.drawable.ic_playback_speed_3x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_2point5x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_2x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_1point8x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_1point5x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_1point2x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_1x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_0point8x_32, builder, je.a0(C0707R.drawable.ic_playback_speed_0point5x_32, builder, 50, 80), 100), 120), AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), 180), 200), 250), 300), 350), Integer.valueOf((int) C0707R.drawable.ic_playback_speed_3point5x_32));
        a = builder.build();
    }

    public static Integer a(int i) {
        return a.get(Integer.valueOf(i));
    }
}
