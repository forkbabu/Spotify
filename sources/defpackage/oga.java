package defpackage;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCardImpl;
import com.spotify.music.libs.fullscreen.story.promo.encore.a;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import com.squareup.picasso.Picasso;

/* renamed from: oga  reason: default package */
public final class oga implements ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, a> {
    final /* synthetic */ Activity a;
    final /* synthetic */ Picasso b;

    oga(Activity activity, Picasso picasso) {
        this.a = activity;
        this.b = picasso;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<b, FullscreenStoryPromoCard$Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.Component' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.encore.ComponentConfiguration] */
    @Override // com.spotify.encore.ComponentFactory
    public Component<b, FullscreenStoryPromoCard$Events> make(a aVar) {
        return new FullscreenStoryPromoCardImpl(this.a, this.b);
    }
}
