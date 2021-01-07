package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.t;
import defpackage.b4e;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: i5e  reason: default package */
public class i5e implements i6e {
    private final SnackbarManager a;
    private final Optional<tg0<View>> b;
    private final y c;
    private final x3e d;

    public i5e(SnackbarManager snackbarManager, Optional<tg0<View>> optional, y yVar, x3e x3e) {
        this.a = snackbarManager;
        this.b = optional;
        this.c = yVar;
        this.d = x3e;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return true;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        b4e.a a2 = b4e.a(tVar.g());
        a2.c(tVar.a());
        a2.d(r3e.a(tVar.c()));
        a2.a(tVar.f());
        return this.d.a(a2.build()).B(this.c).s(new x4e(this, activity, z7e, j, d8e, tVar, o8e));
    }

    public d0 d(Activity activity, z7e z7e, long j, d8e d8e, t tVar, o8e o8e, w3e w3e) {
        V v;
        ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(activity.getString(C0707R.string.share_contextmenu_copy_link_label), w3e.d()));
        try {
            v = this.b.transform(e5e.a).orNull();
        } catch (Exception unused) {
            v = null;
        }
        if (v != null) {
            this.a.showInView(SnackbarConfiguration.builder((int) C0707R.string.toast_copy_link).build(), v);
        } else {
            je.e(C0707R.string.toast_copy_link, this.a);
        }
        z7e.d(w3e.b(), j);
        d8e.a(tVar, o8e.a(), w3e.b(), null);
        return z.z(w3e.b());
    }
}
