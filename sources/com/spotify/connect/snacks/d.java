package com.spotify.connect.snacks;

import com.spotify.libs.connect.ConnectManager;
import kotlin.jvm.internal.h;

public final class d implements c {
    private final ConnectManager a;
    private final uba b;

    public d(ConnectManager connectManager, uba uba) {
        h.e(connectManager, "manager");
        h.e(uba, "navigator");
        this.a = connectManager;
        this.b = uba;
    }

    @Override // com.spotify.connect.snacks.c
    public void a() {
        this.a.a();
    }

    @Override // com.spotify.connect.snacks.c
    public void b() {
        this.b.b();
    }

    @Override // com.spotify.connect.snacks.c
    public void c(String str) {
        h.e(str, "deviceId");
        this.a.c(str);
    }
}
