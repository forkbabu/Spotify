package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import defpackage.rbd;
import io.reactivex.functions.l;

/* renamed from: vbd  reason: default package */
public final /* synthetic */ class vbd implements l {
    public final /* synthetic */ SnackbarManager a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vbd(SnackbarManager snackbarManager, Context context) {
        this.a = snackbarManager;
        this.b = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SnackbarManager snackbarManager = this.a;
        Context context = this.b;
        return ((rbd.a) obj).getClass();
    }
}
