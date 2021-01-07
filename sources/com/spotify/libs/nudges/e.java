package com.spotify.libs.nudges;

public final class e implements fjf<DefaultNudgeManager> {
    private final wlf<rv0> a;

    public e(wlf<rv0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultNudgeManager(this.a.get());
    }
}
