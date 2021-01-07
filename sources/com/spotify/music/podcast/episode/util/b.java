package com.spotify.music.podcast.episode.util;

/* access modifiers changed from: package-private */
public final class b extends g {
    private final String a;
    private final int b;
    private final int c;
    private final Integer d;
    private final boolean e;

    b(String str, int i, int i2, Integer num, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = z;
            return;
        }
        throw new NullPointerException("Null podcastName");
    }

    @Override // com.spotify.music.podcast.episode.util.g
    public boolean a() {
        return this.e;
    }

    @Override // com.spotify.music.podcast.episode.util.g
    public int b() {
        return this.c;
    }

    @Override // com.spotify.music.podcast.episode.util.g
    public String c() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.episode.util.g
    public int d() {
        return this.b;
    }

    @Override // com.spotify.music.podcast.episode.util.g
    public Integer e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a.equals(gVar.c()) && this.b == gVar.d() && this.c == gVar.b() && ((num = this.d) != null ? num.equals(gVar.e()) : gVar.e() == null) && this.e == gVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        Integer num = this.d;
        return ((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeSubtitle{podcastName=");
        V0.append(this.a);
        V0.append(", publishDate=");
        V0.append(this.b);
        V0.append(", length=");
        V0.append(this.c);
        V0.append(", timeLeft=");
        V0.append(this.d);
        V0.append(", isPlayed=");
        return je.P0(V0, this.e, "}");
    }
}
