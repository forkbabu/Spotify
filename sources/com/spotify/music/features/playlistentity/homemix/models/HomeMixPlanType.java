package com.spotify.music.features.playlistentity.homemix.models;

import android.content.Context;
import android.net.Uri;
import com.spotify.music.C0707R;

public enum HomeMixPlanType {
    FAMILY("FAMILY", C0707R.string.home_mix_name_family_mix, C0707R.string.home_mix_name_family, C0707R.string.home_mix_family_mix_learn_more_url),
    DUO("DUO", C0707R.string.home_mix_name_duo_mix, C0707R.string.home_mix_name_duo, C0707R.string.home_mix_duo_mix_learn_more_url),
    OTHER("", C0707R.string.home_mix_name_family_mix, C0707R.string.home_mix_name_family, C0707R.string.home_mix_family_mix_learn_more_url);
    
    private final String mKey;
    private final int mMixNameResId;
    private final int mNameResId;
    private final int mUrlResId;

    private HomeMixPlanType(String str, int i, int i2, int i3) {
        this.mKey = str;
        this.mMixNameResId = i;
        this.mNameResId = i2;
        this.mUrlResId = i3;
    }

    public static HomeMixPlanType d(String str) {
        if (str != null) {
            HomeMixPlanType[] values = values();
            for (int i = 0; i < 3; i++) {
                HomeMixPlanType homeMixPlanType = values[i];
                if (homeMixPlanType.mKey.equals(str)) {
                    return homeMixPlanType;
                }
            }
        }
        return OTHER;
    }

    public Uri g(Context context) {
        return Uri.parse(context.getString(this.mUrlResId));
    }

    public String h(Context context) {
        return context.getString(this.mMixNameResId);
    }

    public int i() {
        return this.mMixNameResId;
    }

    public String k(Context context) {
        return context.getString(this.mNameResId);
    }
}
