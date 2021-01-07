package com.spotify.music.share.v2;

import android.content.DialogInterface;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import dagger.android.support.DaggerAppCompatDialogFragment;
import kotlin.jvm.internal.h;

public final class ShareMenuV2Fragment extends DaggerAppCompatDialogFragment {
    public static final /* synthetic */ int B0 = 0;
    private qzc A0;
    public ShareMenuInjector v0;
    public SnackbarManager w0;
    public ShareMenuLogger x0;
    private MobiusLoop.g<k2d, i2d> y0;
    private rzc z0;

    static final class a implements Runnable {
        final /* synthetic */ ShareMenuV2Fragment a;

        a(ShareMenuV2Fragment shareMenuV2Fragment) {
            this.a = shareMenuV2Fragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.M4();
        }
    }

    public ShareMenuV2Fragment() {
        V4(0, C0707R.style.res_2132083512_theme_glue_noactionbar_sharemenuv2);
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<k2d, i2d> gVar = this.y0;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        MobiusLoop.g<k2d, i2d> gVar = this.y0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        h.e(dialogInterface, "dialog");
        rzc rzc = this.z0;
        if (rzc != null) {
            rzc.c();
        }
        ShareMenuLogger shareMenuLogger = this.x0;
        if (shareMenuLogger != null) {
            shareMenuLogger.h();
        } else {
            h.k("shareMenuLogger");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View w3(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.share.v2.ShareMenuV2Fragment.w3(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<k2d, i2d> gVar = this.y0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
