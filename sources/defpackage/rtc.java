package defpackage;

import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;

/* renamed from: rtc  reason: default package */
public final class rtc implements fjf<qtc> {
    private final wlf<PollContainerPageIdProvider.ContainerPageId> a;

    public rtc(wlf<PollContainerPageIdProvider.ContainerPageId> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qtc(this.a.get());
    }
}
