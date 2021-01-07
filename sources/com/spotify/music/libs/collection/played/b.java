package com.spotify.music.libs.collection.played;

public class b implements a {
    private final d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // com.spotify.music.libs.collection.played.a
    public void a(String str) {
        this.a.a(new String[]{str}, true);
    }

    @Override // com.spotify.music.libs.collection.played.a
    public void b(String str) {
        this.a.a(new String[]{str}, false);
    }
}
