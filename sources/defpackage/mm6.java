package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;
import defpackage.hm6;
import defpackage.km6;
import defpackage.sm6;

/* renamed from: mm6  reason: default package */
public final class mm6 implements km6.a {
    private final wlf<Context> a;
    private final wlf<hm6.a> b;
    private final wlf<sm6.a> c;
    private final wlf<w> d;
    private final wlf<xk6> e;
    private final wlf<vk6> f;
    private final wlf<OfflineUserMixImpressionLogger.a> g;

    public mm6(wlf<Context> wlf, wlf<hm6.a> wlf2, wlf<sm6.a> wlf3, wlf<w> wlf4, wlf<xk6> wlf5, wlf<vk6> wlf6, wlf<OfflineUserMixImpressionLogger.a> wlf7) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.km6.a
    public km6 a(ItemListConfiguration itemListConfiguration) {
        Context context = this.a.get();
        b(context, 1);
        Context context2 = context;
        hm6.a aVar = this.b.get();
        b(aVar, 2);
        hm6.a aVar2 = aVar;
        sm6.a aVar3 = this.c.get();
        b(aVar3, 3);
        sm6.a aVar4 = aVar3;
        w wVar = this.d.get();
        b(wVar, 4);
        w wVar2 = wVar;
        xk6 xk6 = this.e.get();
        b(xk6, 5);
        xk6 xk62 = xk6;
        vk6 vk6 = this.f.get();
        b(vk6, 6);
        vk6 vk62 = vk6;
        OfflineUserMixImpressionLogger.a aVar5 = this.g.get();
        b(aVar5, 7);
        b(itemListConfiguration, 8);
        return new lm6(context2, aVar2, aVar4, wVar2, xk62, vk62, aVar5, itemListConfiguration);
    }
}
