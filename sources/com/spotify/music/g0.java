package com.spotify.music;

import com.google.common.base.Optional;

public class g0 implements xgb, vf3 {
    private final bhb a;
    private int b;

    public g0(bhb bhb) {
        this.a = bhb;
    }

    @Override // defpackage.vf3
    public void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            this.a.J();
        }
    }

    @Override // defpackage.xgb
    public Optional<Integer> b() {
        if (this.b > 0) {
            return Optional.of(1);
        }
        return Optional.absent();
    }

    @Override // defpackage.vf3
    public void reset() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.a.J();
        }
    }
}
