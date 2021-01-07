package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;

/* renamed from: a4d  reason: default package */
public final class a4d {
    private static final ImmutableMap<Integer, Long> a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_5_mins), 300000L);
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_10_mins), 600000L);
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_15_mins), 900000L);
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_30_mins), 1800000L);
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_45_mins), 2700000L);
        builder.mo51put(Integer.valueOf((int) C0707R.id.menu_item_sleep_timer_1_hour), 3600000L);
        a = builder.build();
    }

    public static long a(int i) {
        ImmutableMap<Integer, Long> immutableMap = a;
        if (immutableMap.containsKey(Integer.valueOf(i))) {
            return immutableMap.get(Integer.valueOf(i)).longValue();
        }
        return -1;
    }
}
