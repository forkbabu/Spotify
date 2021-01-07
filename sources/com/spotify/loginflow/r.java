package com.spotify.loginflow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import com.spotify.loginflow.navigation.Destination;

public final class r extends e0 {
    private final u<p<Destination>> c = new u<>();

    public final LiveData<p<Destination>> g() {
        return this.c;
    }

    public final void h(Destination destination) {
        this.c.n(new p<>(destination));
    }
}
