package defpackage;

import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;

/* renamed from: ptc  reason: default package */
public final class ptc implements fjf<otc> {
    private final wlf<PollContainerPageIdProvider.ContainerPageId> a;

    public ptc(wlf<PollContainerPageIdProvider.ContainerPageId> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new otc(this.a.get());
    }
}
