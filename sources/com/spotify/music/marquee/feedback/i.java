package com.spotify.music.marquee.feedback;

import android.os.Parcelable;
import com.spotify.music.C0707R;
import com.spotify.music.marquee.MarqueeActivity;
import com.spotify.music.marquee.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class i {
    private final l a;
    private final com.spotify.music.marquee.i b;
    Random c;

    public i(l lVar, com.spotify.music.marquee.i iVar) {
        this.a = lVar;
        this.b = iVar;
    }

    public List<h> a() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(6);
        arrayList.add(new c("not_interested_releases", this.a.i(C0707R.string.marquee_feedback_menu_option_new_releases)));
        arrayList.add(new c("not_interested_artist", this.a.i(C0707R.string.marquee_feedback_menu_option_artist)));
        arrayList.add(new c("notifications", this.a.i(C0707R.string.marquee_feedback_menu_option_notifications)));
        arrayList.add(new c("not_intersted_sponsored_content", this.a.i(C0707R.string.marquee_feedback_menu_option_sponsored_content)));
        if (!((MarqueeActivity) this.b).U0().isEmpty()) {
            return ((MarqueeActivity) this.b).U0();
        }
        Collections.shuffle(arrayList, this.c);
        arrayList.add(new c("none", this.a.i(C0707R.string.marquee_feedback_menu_option_none_of_above)));
        arrayList.add(new c("opt_out_confirm", this.a.i(C0707R.string.marquee_feedback_menu_option_opt_out)));
        MarqueeActivity marqueeActivity = (MarqueeActivity) this.b;
        if (marqueeActivity.getIntent() == null) {
            return arrayList;
        }
        marqueeActivity.getIntent().putParcelableArrayListExtra("extra_marquee_randomized_feedback_list", arrayList);
        return arrayList;
    }
}
