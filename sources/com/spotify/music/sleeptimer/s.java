package com.spotify.music.sleeptimer;

import com.spotify.music.C0707R;

public class s {
    private final jz1 a;
    private final cqe b;

    public s(jz1 jz1, cqe cqe) {
        this.a = jz1;
        this.b = cqe;
    }

    @Deprecated
    public void a(int i, String str) {
        String valueOf = i == C0707R.id.menu_item_sleep_timer_turn_off ? "turn_off_timer" : i == C0707R.id.menu_item_sleep_timer_end_of_episode ? "end_of_episode" : i == C0707R.id.menu_item_sleep_timer_end_of_track ? "end_of_track" : String.valueOf(a4d.a(i));
        this.a.a(new fa1(null, "sleeptimer", "spotify:contextmenu:sleeptimer", "", 0, str + ':' + valueOf, "hit", "set-sleep-timer", (double) this.b.d()));
    }
}
