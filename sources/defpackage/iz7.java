package defpackage;

import com.spotify.inappmessaging.TriggerType;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.music.inappmessaging.a;
import io.reactivex.functions.l;

/* renamed from: iz7  reason: default package */
public final /* synthetic */ class iz7 implements l {
    public static final /* synthetic */ iz7 a = new iz7();

    private /* synthetic */ iz7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        return h.f(((a.b) aVar).a(), TriggerType.CLIENT_EVENT);
    }
}
