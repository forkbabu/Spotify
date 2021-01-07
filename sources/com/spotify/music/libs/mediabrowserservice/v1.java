package com.spotify.music.libs.mediabrowserservice;

import com.google.common.base.Optional;
import java.util.Set;

public class v1 {
    private final Set<u1> a;

    public v1(Set<u1> set) {
        this.a = set;
    }

    public Optional<yda> a(String str) {
        for (u1 u1Var : this.a) {
            if (u1Var.d(str)) {
                return Optional.fromNullable(u1Var.c(str));
            }
        }
        return Optional.absent();
    }
}
