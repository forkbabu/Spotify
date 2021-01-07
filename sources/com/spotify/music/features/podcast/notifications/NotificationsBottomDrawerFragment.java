package com.spotify.music.features.podcast.notifications;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class NotificationsBottomDrawerFragment extends BottomSheetDialogFragment implements c.a {
    public String v0;
    public String w0;
    public NotificationsBottomDrawerInjector x0;
    private MobiusLoop.g<ig7, gg7> y0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<ig7, gg7> gVar = this.y0;
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
        MobiusLoop.g<ig7, gg7> gVar = this.y0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.NotificationsDialogTheme;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.d2;
        h.d(cVar, "ViewUris.PODCAST_EPISODE_NOTIFICATIONS");
        return cVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        nh7 nh7 = new nh7(layoutInflater, viewGroup);
        String str = this.v0;
        if (str != null) {
            String str2 = this.w0;
            if (str2 != null) {
                ig7 ig7 = new ig7(false, false, null, new rg7(str, str2), 7);
                NotificationsBottomDrawerInjector notificationsBottomDrawerInjector = this.x0;
                if (notificationsBottomDrawerInjector != null) {
                    MobiusLoop.g<ig7, gg7> b = notificationsBottomDrawerInjector.b(ig7, nh7);
                    this.y0 = b;
                    if (b != null) {
                        b.c(nh7);
                        return nh7.g();
                    }
                    h.k("controller");
                    throw null;
                }
                h.k("injector");
                throw null;
            }
            h.k("showName");
            throw null;
        }
        h.k("showUri");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<ig7, gg7> gVar = this.y0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
