package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.h;
import org.apache.commons.lang3.tuple.ImmutableTriple;

/* renamed from: bt3  reason: default package */
public final /* synthetic */ class bt3 implements h {
    public static final /* synthetic */ bt3 a = new bt3();

    private /* synthetic */ bt3() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        return new ImmutableTriple((Ad) obj, (PlayerState) obj2, (Long) obj3);
    }
}
