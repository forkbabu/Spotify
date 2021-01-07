package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter;
import com.spotify.music.features.playlist.participants.ui.d;
import kotlin.f;

/* renamed from: p06  reason: default package */
public final class p06 implements fjf<o06> {
    private final wlf<PlaylistParticipantsAdapter.b> a;
    private final wlf<d.a> b;
    private final wlf<Component<SectionHeading2.Model, f>> c;

    public p06(wlf<PlaylistParticipantsAdapter.b> wlf, wlf<d.a> wlf2, wlf<Component<SectionHeading2.Model, f>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o06(this.a.get(), this.b.get(), this.c);
    }
}
