package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import defpackage.rbd;
import io.reactivex.functions.l;

/* renamed from: bcd  reason: default package */
public final /* synthetic */ class bcd implements l {
    public final /* synthetic */ SnackbarManager a;
    public final /* synthetic */ Context b;

    public /* synthetic */ bcd(SnackbarManager snackbarManager, Context context) {
        this.a = snackbarManager;
        this.b = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return pcd.g(this.a, this.b.getString(C0707R.string.social_listening_notification_snack_participant_left_multi_output_design, ((rbd.d) obj).a())).N();
    }
}
