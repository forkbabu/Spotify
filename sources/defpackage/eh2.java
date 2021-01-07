package defpackage;

import com.spotify.music.appprotocol.superbird.setup.model.SetupAppProtocol$SetupEvent;
import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import io.reactivex.functions.l;

/* renamed from: eh2  reason: default package */
public final /* synthetic */ class eh2 implements l {
    public static final /* synthetic */ eh2 a = new eh2();

    private /* synthetic */ eh2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return SetupAppProtocol$SetupEvent.create((SetupSubscriptionEvent) obj);
    }
}
