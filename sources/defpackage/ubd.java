package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import defpackage.rbd;
import io.reactivex.functions.l;

/* renamed from: ubd  reason: default package */
public final /* synthetic */ class ubd implements l {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SnackbarManager b;

    public /* synthetic */ ubd(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return pcd.e(this.a, this.b, (rbd.c) obj);
    }
}
