package defpackage;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events;
import com.spotify.music.libs.fullscreen.story.promo.encore.a;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

/* renamed from: pga  reason: default package */
public final class pga implements fjf<ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, a>> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;

    public pga(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        Picasso picasso = this.b.get();
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        return new oga(activity, picasso);
    }
}
