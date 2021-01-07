package com.spotify.music.appprotocol.api;

public class b {
    private final int a;

    private b(int i) {
        this.a = i;
    }

    public static b b(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return new b(i);
    }

    public void a(int i) {
        if (!((this.a & i) == i)) {
            throw new NotAuthorizedException(i, this.a);
        }
    }

    public b c(int i) {
        return new b(i | this.a);
    }
}
