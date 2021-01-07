package com.spotify.music.features.yourepisodes.interactor;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.music.features.yourepisodes.domain.a;
import java.util.List;
import kotlin.jvm.internal.h;

public final class c {
    private final List<a> a;
    private final int b;
    private final jnf c;
    private final DownloadState d;

    public c(List<a> list, int i, jnf jnf, DownloadState downloadState) {
        h.e(list, "episodes");
        h.e(jnf, "availableRange");
        h.e(downloadState, "downloadState");
        this.a = list;
        this.b = i;
        this.c = jnf;
        this.d = downloadState;
    }

    public final DownloadState a() {
        return this.d;
    }

    public final List<a> b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && this.b == cVar.b && h.a(this.c, cVar.c) && h.a(this.d, cVar.d);
    }

    public int hashCode() {
        List<a> list = this.a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.b) * 31;
        jnf jnf = this.c;
        int hashCode2 = (hashCode + (jnf != null ? jnf.hashCode() : 0)) * 31;
        DownloadState downloadState = this.d;
        if (downloadState != null) {
            i = downloadState.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodesSubscription(episodes=");
        V0.append(this.a);
        V0.append(", numberOfItems=");
        V0.append(this.b);
        V0.append(", availableRange=");
        V0.append(this.c);
        V0.append(", downloadState=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
