package com.spotify.mobile.android.spotlets.bixbyhomecards.cards;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.music.C0707R;

public enum BixbyHomeCardType {
    STREAMING(C0707R.integer.streaming_card_id),
    STREAMING_US(C0707R.integer.streaming_card_us_id);
    
    private final int mCardResId;

    static {
        values();
    }

    private BixbyHomeCardType(int i) {
        this.mCardResId = i;
    }

    public int d(Context context) {
        try {
            return context.getResources().getInteger(this.mCardResId);
        } catch (Resources.NotFoundException unused) {
            return -1;
        }
    }
}
