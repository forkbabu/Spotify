package com.spotify.music.podcast.ui.topic;

public abstract class g {
    public static g a(String str, String str2) {
        return new c(str, str2);
    }

    public abstract String b();

    public abstract String c();

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!b().equals(gVar.b()) || !c().equals(gVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return b().hashCode() ^ c().hashCode();
    }

    public String toString() {
        return b();
    }
}
