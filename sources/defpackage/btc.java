package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: btc  reason: default package */
public final class btc implements atc {
    private final ysc a;
    private final rsc b;

    public btc(ysc ysc, rsc rsc) {
        h.e(ysc, "ubiUnfinishedEpisodeLogger");
        h.e(rsc, "legacyPodcastEpisodeRowLogger");
        this.a = ysc;
        this.b = rsc;
    }

    @Override // defpackage.atc
    public String a(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.b.a(str, str2, i);
        return this.a.a(str, str2, i);
    }

    @Override // defpackage.atc
    public String b(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.b.b(str, str2, i);
        return this.a.b(str, str2, i);
    }

    @Override // defpackage.atc
    public String c(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.b.c(str, str2, i);
        return this.a.c(str, str2, i);
    }
}
