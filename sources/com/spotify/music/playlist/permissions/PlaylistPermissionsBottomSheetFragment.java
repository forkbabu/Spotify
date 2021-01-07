package com.spotify.music.playlist.permissions;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.playlist.permissions.f;
import com.spotify.music.playlist.permissions.h;
import com.spotify.music.playlist.permissions.j;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.w0;

public final class PlaylistPermissionsBottomSheetFragment extends BottomSheetDialogFragment {
    public h.a A0;
    public f.a B0;
    private PageLoaderView<j> C0;
    private PageLoaderView.a<j> D0;
    public String v0;
    public t0<j> w0;
    public s x0;
    public zac y0;
    public w0 z0;

    static final class a<T> implements tg0<w0> {
        final /* synthetic */ PlaylistPermissionsBottomSheetFragment a;

        a(PlaylistPermissionsBottomSheetFragment playlistPermissionsBottomSheetFragment) {
            this.a = playlistPermissionsBottomSheetFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            w0 w0Var = this.a.z0;
            if (w0Var != null) {
                return w0Var;
            }
            kotlin.jvm.internal.h.k("placeholderPageElement");
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<I, O> implements sg0<j, s0> {
        final /* synthetic */ PlaylistPermissionsBottomSheetFragment a;

        b(PlaylistPermissionsBottomSheetFragment playlistPermissionsBottomSheetFragment) {
            this.a = playlistPermissionsBottomSheetFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(j jVar) {
            j jVar2 = jVar;
            if (jVar2 instanceof j.b) {
                h.a aVar = this.a.A0;
                if (aVar != null) {
                    return ((i) aVar).b(new PlaylistPermissionsBottomSheetFragment$onCreate$2$1(this), (j.b) jVar2);
                }
                kotlin.jvm.internal.h.k("mPlaylistPermissionsBottomSheetFragmentLoadedPageElementFactory");
                throw null;
            } else if (jVar2 instanceof j.a) {
                f.a aVar2 = this.a.B0;
                if (aVar2 != null) {
                    return ((g) aVar2).b(new PlaylistPermissionsBottomSheetFragment$onCreate$2$2(this));
                }
                kotlin.jvm.internal.h.k("mPlaylistPermissionsBottomSheetFragmentFailedPageElementFactory");
                throw null;
            } else {
                throw new IllegalArgumentException("Unsupported Result " + jVar2 + " for LoadedPageElement");
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<j> pageLoaderView = this.C0;
        if (pageLoaderView != null) {
            t0<j> t0Var = this.w0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<j> t0Var2 = this.w0;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    kotlin.jvm.internal.h.k("pageLoader");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.h.k("pageLoader");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("pageLoaderView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<j> t0Var = this.w0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            kotlin.jvm.internal.h.k("pageLoader");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.PlaylistPermissionsBottomSheetTheme;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        kotlin.jvm.internal.h.e(dialogInterface, "dialog");
        s sVar = this.x0;
        if (sVar != null) {
            sVar.e();
        } else {
            kotlin.jvm.internal.h.k("logger");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        PageIdentifiers pageIdentifiers = PageIdentifiers.PLAYLIST_PERMISSIONS;
        String str = this.v0;
        if (str != null) {
            ij9 b2 = ij9.b(pageIdentifiers, str);
            zac zac = this.y0;
            if (zac != null) {
                PageLoaderView.a<j> b3 = zac.b(ViewUris.V0, b2);
                b3.i(new a(this));
                b3.e(new b(this));
                kotlin.jvm.internal.h.d(b3, "pageLoaderFactory\n      …          }\n            }");
                this.D0 = b3;
                return;
            }
            kotlin.jvm.internal.h.k("pageLoaderFactory");
            throw null;
        }
        kotlin.jvm.internal.h.k("playlistUri");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        PageLoaderView.a<j> aVar = this.D0;
        if (aVar != null) {
            PageLoaderView<j> a2 = aVar.a(l4());
            kotlin.jvm.internal.h.d(a2, "pageLoaderViewBuilder.createView(requireContext())");
            this.C0 = a2;
            if (a2 != null) {
                return a2;
            }
            kotlin.jvm.internal.h.k("pageLoaderView");
            throw null;
        }
        kotlin.jvm.internal.h.k("pageLoaderViewBuilder");
        throw null;
    }
}
