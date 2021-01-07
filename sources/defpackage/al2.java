package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.a;
import io.reactivex.z;

/* renamed from: al2  reason: default package */
public class al2 implements zk2 {
    private final vk2 a;

    public al2(vk2 vk2) {
        this.a = vk2;
    }

    public z<Optional<TracksAndResources>> a() {
        if (this.a.c()) {
            return z.z(Optional.absent());
        }
        return this.a.read().A(uk2.a);
    }

    public a b(TracksAndResources tracksAndResources) {
        return this.a.b(tracksAndResources);
    }
}
