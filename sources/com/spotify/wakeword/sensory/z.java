package com.spotify.wakeword.sensory;

import java.util.UUID;

public class z {
    private String a = UUID.randomUUID().toString();

    public String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        String uuid = UUID.randomUUID().toString();
        this.a = uuid;
        return uuid;
    }
}
