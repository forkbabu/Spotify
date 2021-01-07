package com.spotify.music.mainactivity;

import com.spotify.music.C0707R;

public final class r implements fjf<Integer> {
    private final wlf<Boolean> a;

    public r(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().booleanValue() ? C0707R.id.fragment_container : C0707R.id.content);
    }
}
