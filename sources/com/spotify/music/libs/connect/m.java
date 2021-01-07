package com.spotify.music.libs.connect;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.android.paste.app.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaTransferError;
import com.spotify.music.C0707R;
import java.util.Map;

public final class m {
    private static final Map<String, com.spotify.android.paste.app.a> a = gf0.b();

    /* access modifiers changed from: package-private */
    public static class a implements DialogInterface.OnDismissListener {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            m.a.remove(this.a);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements DialogInterface.OnCancelListener {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            m.a.remove(this.a);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements DialogInterface.OnClickListener {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            m.a.remove(this.a);
            dialogInterface.dismiss();
        }
    }

    private static com.spotify.android.paste.app.a b(Context context, String str, int i, String str2, com.spotify.music.libs.viewuri.c cVar) {
        Map<String, com.spotify.android.paste.app.a> map = a;
        com.spotify.android.paste.app.a aVar = map.get(str);
        if (aVar != null && aVar.isShowing()) {
            return aVar;
        }
        a.C0151a aVar2 = new a.C0151a(context, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar2.l(i);
        aVar2.e(str2);
        aVar2.j(C0707R.string.dialog_content_not_supported_button, new c(str));
        aVar2.h(new b(str));
        aVar2.i(new a(str));
        aVar2.f((dj9) context, PageIdentifiers.DIALOG_CONNECT_PLAYBACK_ERROR.path(), cVar.toString());
        com.spotify.android.paste.app.a c2 = aVar2.c();
        c2.show();
        map.put(str, c2);
        return c2;
    }

    public static com.spotify.android.paste.app.a c(Context context, com.spotify.music.libs.viewuri.c cVar) {
        return b(context, "gaia.content_not_supported", C0707R.string.dialog_content_not_supported_title, context.getString(C0707R.string.dialog_content_not_supported_body), cVar);
    }

    public static com.spotify.android.paste.app.a d(Context context, GaiaDevice gaiaDevice, GaiaTransferError gaiaTransferError, com.spotify.music.libs.viewuri.c cVar) {
        int i;
        switch (gaiaTransferError.getErrorCode().ordinal()) {
            case 8:
                i = C0707R.string.connect_transfer_error_can_not_load;
                break;
            case 9:
                i = C0707R.string.connect_transfer_error_update_required;
                break;
            case 10:
                i = C0707R.string.connect_transfer_error_spotify_update_required;
                break;
            default:
                return null;
        }
        return b(context, gaiaTransferError.toString(), C0707R.string.connect_transfer_error_heading, context.getString(i, gaiaDevice.getModelName()), cVar);
    }
}
