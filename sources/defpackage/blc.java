package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: blc  reason: default package */
public final class blc implements alc {
    private final dlc a;
    private final flc b;

    public blc(dlc dlc, flc flc) {
        h.e(dlc, "legacyFollowedPodcastsLogger");
        h.e(flc, "ubiFollowedPodcastsLogger");
        this.a = dlc;
        this.b = flc;
    }

    @Override // defpackage.alc
    public void a(String str, int i) {
        h.e(str, "uri");
        this.a.a(str, i);
        this.b.a(str, i);
    }
}
