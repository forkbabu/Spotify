package com.spotify.music.libs.connect;

import com.spotify.libs.connect.nudge.d;
import kotlin.jvm.internal.h;

public final class s implements d {
    private final uba a;

    public s(uba uba) {
        h.e(uba, "connectNavigator");
        this.a = uba;
    }

    @Override // com.spotify.libs.connect.nudge.d
    public void b() {
        this.a.b();
    }
}
