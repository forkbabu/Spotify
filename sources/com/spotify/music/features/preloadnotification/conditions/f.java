package com.spotify.music.features.preloadnotification.conditions;

/* access modifiers changed from: package-private */
public class f implements a {
    private final yyd a;

    public f(yyd yyd) {
        this.a = yyd;
    }

    @Override // com.spotify.music.features.preloadnotification.conditions.a
    public boolean a() {
        return this.a.c() && PreloadedPartner.d(this.a.a());
    }
}
