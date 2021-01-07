package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediasession.i0;

public class i3 implements i0 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public i3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.music.libs.mediasession.i0
    public boolean a() {
        return this.c;
    }

    @Override // com.spotify.music.libs.mediasession.i0
    public boolean b() {
        return this.a;
    }

    @Override // com.spotify.music.libs.mediasession.i0
    public boolean c() {
        return this.b;
    }
}
