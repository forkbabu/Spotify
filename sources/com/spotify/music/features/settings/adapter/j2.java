package com.spotify.music.features.settings.adapter;

import com.google.common.base.Optional;
import defpackage.jk8;

public final class j2 extends n2 implements jk8.c {
    int[] a = {1, 2, 3, 4};

    @Override // defpackage.jk8.c
    public Optional<Integer> a(int i) {
        if (i == 1) {
            return Optional.of(0);
        }
        if (i == 2) {
            return Optional.of(1);
        }
        if (i == 3) {
            return Optional.of(2);
        }
        if (i == 4) {
            return Optional.of(3);
        }
        return Optional.absent();
    }

    @Override // defpackage.jk8.c
    public int b(int i) {
        return this.a[i];
    }

    @Override // defpackage.jk8.c
    public int c() {
        return a(2).get().intValue();
    }
}
