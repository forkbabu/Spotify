package defpackage;

import android.view.View;
import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.b;

/* renamed from: nnf  reason: default package */
public final class nnf implements Component {
    private final onf a;

    public nnf(onf onf) {
        h.e(onf, "viewBinder");
        this.a = onf;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a.a();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super PromoCardWrapped$Events, f> nmf) {
        h.e(nmf, "event");
        this.a.c(nmf);
    }

    @Override // com.spotify.encore.Item
    public void render(Object obj) {
        b bVar = (b) obj;
        h.e(bVar, "model");
        this.a.b(bVar);
    }
}
