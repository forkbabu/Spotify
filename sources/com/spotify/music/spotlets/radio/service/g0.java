package com.spotify.music.spotlets.radio.service;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

public class g0 {
    private ifd a;
    private yn0 b;
    private RadioStationModel c;
    private c d;
    private String[] e;
    private String[] f;
    private Integer g;
    private Long h;
    private Boolean i;
    private Boolean j;

    public Intent a(Context context) {
        context.getClass();
        boolean z = false;
        MoreObjects.checkArgument((this.e == null && this.c == null) ? false : true, "Need seeds or station model");
        MoreObjects.checkArgument(this.e == null || this.c == null, "Cannot play both seeds and station model");
        Intent intent = new Intent(context, RadioActionsService.class);
        if (this.c != null) {
            intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY");
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", this.c);
        } else {
            String[] strArr = this.e;
            if (strArr != null) {
                if (strArr.length > 0) {
                    z = true;
                }
                MoreObjects.checkArgument(z);
                intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION");
                intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds", this.e);
            }
        }
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", this.d);
        Boolean bool = this.i;
        if (bool != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", bool.booleanValue());
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.createStation", bool2.booleanValue());
        }
        Integer num = this.g;
        if (num != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", num.intValue());
        }
        Long l = this.h;
        if (l != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", l.longValue());
        }
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier", this.a);
        yn0 yn0 = this.b;
        if (yn0 != null) {
            yn0.getClass();
            intent.putExtra("FeatureIdentifier.InternalReferrer", yn0);
        }
        String[] strArr2 = this.f;
        if (strArr2 != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.trackUrisToFilter", strArr2);
        }
        return intent;
    }

    public g0 b(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public g0 c(ifd ifd) {
        this.a = ifd;
        return this;
    }

    public g0 d(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public g0 e(yn0 yn0) {
        this.b = yn0;
        return this;
    }

    public g0 f(String[] strArr) {
        this.e = strArr;
        return this;
    }

    public g0 g(long j2) {
        this.h = Long.valueOf(j2);
        return this;
    }

    public g0 h(int i2) {
        this.g = Integer.valueOf(i2);
        return this;
    }

    public g0 i(RadioStationModel radioStationModel) {
        this.c = radioStationModel;
        return this;
    }

    public g0 j(String[] strArr) {
        this.f = strArr;
        return this;
    }

    public g0 k(c cVar) {
        this.d = cVar;
        return this;
    }
}
