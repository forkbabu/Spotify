package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: acd  reason: default package */
public final /* synthetic */ class acd implements w {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SnackbarManager b;

    public /* synthetic */ acd(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new ubd(this.a, this.b), false, Integer.MAX_VALUE);
    }
}
