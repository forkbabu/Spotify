package defpackage;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import defpackage.vy4;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: zy4  reason: default package */
final class zy4<T> implements g<vy4.b> {
    final /* synthetic */ tg0 a;
    final /* synthetic */ SnackbarManager b;

    zy4(tg0 tg0, SnackbarManager snackbarManager) {
        this.a = tg0;
        this.b = snackbarManager;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(vy4.b bVar) {
        View view;
        vy4.b bVar2 = bVar;
        try {
            view = (View) this.a.get();
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            String a2 = bVar2.a();
            if (a2 == null) {
                a2 = view.getContext().getString(C0707R.string.default_list_name);
                h.d(a2, "it.context.getString(R.string.default_list_name)");
            }
            String string = view.getContext().getString(C0707R.string.add_item_to_list, a2);
            h.d(string, "it.context.getString(\n  …       name\n            )");
            SnackbarManager snackbarManager = this.b;
            SnackbarConfiguration build = SnackbarConfiguration.builder(string).build();
            h.d(build, "SnackbarConfiguration.bu…(snackbarMessage).build()");
            snackbarManager.showInView(build, view);
        }
    }
}
