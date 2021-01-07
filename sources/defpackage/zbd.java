package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: zbd  reason: default package */
public final /* synthetic */ class zbd implements w {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SnackbarManager b;
    public final /* synthetic */ y c;

    public /* synthetic */ zbd(Context context, SnackbarManager snackbarManager, y yVar) {
        this.a = context;
        this.b = snackbarManager;
        this.c = yVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new ocd(this.a, this.b, this.c), false, Integer.MAX_VALUE);
    }
}
