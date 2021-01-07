package com.spotify.music.podcast.ui.topic;

/* access modifiers changed from: package-private */
public final class c extends g {
    private final String a;
    private final String b;

    c(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.music.podcast.ui.topic.g
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.ui.topic.g
    public String c() {
        return this.b;
    }
}
