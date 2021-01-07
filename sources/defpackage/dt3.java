package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import org.apache.commons.lang3.tuple.Triple;

/* renamed from: dt3  reason: default package */
public final /* synthetic */ class dt3 implements l {
    public static final /* synthetic */ dt3 a = new dt3();

    private /* synthetic */ dt3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Triple triple = (Triple) obj;
        if (((Ad) triple.d()).uri().equals(((PlayerState) triple.g()).track().isPresent() ? ((PlayerState) triple.g()).track().get().uri() : "")) {
            return Optional.of(Long.valueOf(((long) ((Ad) triple.d()).getSkippableAdDelay()) - (((Long) triple.h()).longValue() / 1000)));
        }
        return Optional.absent();
    }
}
