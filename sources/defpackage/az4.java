package defpackage;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.entityselector.container.EntitySelectorFragment;
import defpackage.vy4;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: az4  reason: default package */
public final class az4 {

    /* renamed from: az4$a */
    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ EntitySelectorFragment a;

        a(EntitySelectorFragment entitySelectorFragment) {
            this.a = entitySelectorFragment;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.M4();
        }
    }

    public static final w<vy4, wy4> a(EntitySelectorFragment entitySelectorFragment, SnackbarManager snackbarManager, tg0<View> tg0) {
        h.e(entitySelectorFragment, "entitySelectorFragment");
        h.e(snackbarManager, "snackbarManager");
        h.e(tg0, "snackbarViewProducer");
        m f = i.f();
        f.b(vy4.a.class, new a(entitySelectorFragment));
        h.e(tg0, "snackbarViewProducer");
        h.e(snackbarManager, "snackbarManager");
        f.e(vy4.b.class, new zy4(tg0, snackbarManager), io.reactivex.android.schedulers.a.b());
        return f.i();
    }
}
