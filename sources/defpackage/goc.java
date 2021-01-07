package defpackage;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;

/* renamed from: goc  reason: default package */
public final class goc {
    private final ImmutableBiMap<Integer, Integer> a;
    private final ImmutableBiMap<Integer, Integer> b;

    public goc(ImmutableList<Integer> immutableList) {
        ImmutableBiMap.Builder builder = new ImmutableBiMap.Builder();
        builder.mo51put((ImmutableBiMap.Builder) 50, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_50));
        builder.mo51put((ImmutableBiMap.Builder) 80, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_80));
        builder.mo51put((ImmutableBiMap.Builder) 100, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_100));
        builder.mo51put((ImmutableBiMap.Builder) 120, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_120));
        builder.mo51put((ImmutableBiMap.Builder) Integer.valueOf((int) AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), Integer.valueOf((int) C0707R.id.menu_item_speed_control_150));
        if (immutableList.contains(180)) {
            builder.mo51put((ImmutableBiMap.Builder) 180, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_180));
        }
        builder.mo51put((ImmutableBiMap.Builder) 200, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_200));
        if (immutableList.contains(250)) {
            builder.mo51put((ImmutableBiMap.Builder) 250, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_250));
        }
        builder.mo51put((ImmutableBiMap.Builder) 300, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_300));
        if (immutableList.contains(350)) {
            builder.mo51put((ImmutableBiMap.Builder) 350, (int) Integer.valueOf((int) C0707R.id.menu_item_speed_control_350));
        }
        ImmutableBiMap<Integer, Integer> build = builder.build();
        this.a = build;
        this.b = build.mo68inverse();
    }

    /* access modifiers changed from: package-private */
    public Integer a(Integer num) {
        return this.a.get(num);
    }

    /* access modifiers changed from: package-private */
    public Integer b(int i) {
        return this.b.get(Integer.valueOf(i));
    }
}
