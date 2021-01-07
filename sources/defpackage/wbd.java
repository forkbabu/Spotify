package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: wbd  reason: default package */
public final /* synthetic */ class wbd implements w {
    public final /* synthetic */ SnackbarManager a;
    public final /* synthetic */ Context b;

    public /* synthetic */ wbd(SnackbarManager snackbarManager, Context context) {
        this.a = snackbarManager;
        this.b = context;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new bcd(this.a, this.b), false, Integer.MAX_VALUE);
    }
}
