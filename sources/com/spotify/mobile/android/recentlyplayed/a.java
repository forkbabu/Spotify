package com.spotify.mobile.android.recentlyplayed;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.playlist.model.policy.RadioPolicy;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.recentlyplayed.model.d;
import com.spotify.player.model.ContextTrack;
import io.reactivex.s;

public class a {
    static final Policy c;
    private final d a;
    private final fb1 b;

    static {
        RadioPolicy radioPolicy = new RadioPolicy();
        radioPolicy.setImageStyle(RadioPolicy.IMAGE_STYLE_GRADIENT_OVERLAY);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put(ContextTrack.Metadata.KEY_SUBTITLE, bool);
        builder.mo51put("imageUri", bool);
        builder.mo51put("type", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("syncProgress", bool);
        builder.mo51put("available", bool);
        radioPolicy.setAttributes(builder.build());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setRadioPolicy(radioPolicy);
        c = new Policy(decorationPolicy);
    }

    public a(fb1 fb1, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(fb1, i, z, z2, z3, z4, z5, false, false, false, 750);
    }

    public s<RecentlyPlayedItems> a() {
        return this.b.a(this.a.a(), c).P();
    }

    public s<RecentlyPlayedItems> b() {
        return this.b.c(this.a.a(), c);
    }

    public a(fb1 fb1, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this(fb1, i, z, z2, z3, z4, z5, z6, z7, z8, 750);
    }

    private a(fb1 fb1, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2) {
        this.b = fb1;
        this.a = d.b(i2, i, z, z2, z3, z4, z5, z6, z7, z8);
    }
}
