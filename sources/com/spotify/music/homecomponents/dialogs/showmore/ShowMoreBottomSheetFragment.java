package com.spotify.music.homecomponents.dialogs.showmore;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.ifd;
import kotlin.jvm.internal.h;

public final class ShowMoreBottomSheetFragment extends BottomSheetDialogFragment implements c.a, ifd.b, mfd {
    public f v0;
    public c w0;
    private d x0;
    private b y0;

    static final class a implements DialogInterface.OnShowListener {
        final /* synthetic */ com.google.android.material.bottomsheet.c a;

        a(com.google.android.material.bottomsheet.c cVar) {
            this.a = cVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior<FrameLayout> e = this.a.e();
            h.d(e, "bottomSheetDialog.behavior");
            e.x(3);
        }
    }

    public static final class b extends BottomSheetBehavior.d {
        final /* synthetic */ com.google.android.material.bottomsheet.c a;

        b(com.google.android.material.bottomsheet.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void a(View view, float f) {
            h.e(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void b(View view, int i) {
            h.e(view, "bottomSheet");
            if (i == 4) {
                BottomSheetBehavior<FrameLayout> e = this.a.e();
                h.d(e, "bottomSheetDialog.behavior");
                e.x(5);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        Dialog P4 = P4();
        if (P4 != null) {
            P4.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        a aVar;
        super.O3();
        Bundle D2 = D2();
        if (D2 == null || (aVar = (a) D2.getParcelable("BottomSheetDialogFragment.showMoreBottomSheetData")) == null) {
            aVar = new a(null, null, null, 7);
        }
        b bVar = this.y0;
        if (bVar != null) {
            ((ShowMoreBottomSheetPresenterImpl) bVar).a(aVar);
        } else {
            h.k("showMoreBottomSheetPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.HomeBottomSheetTheme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        com.google.android.material.bottomsheet.c cVar = (com.google.android.material.bottomsheet.c) super.R4(bundle);
        cVar.g(true);
        BottomSheetBehavior<FrameLayout> e = cVar.e();
        h.d(e, "bottomSheetDialog.behavior");
        e.v(0);
        cVar.setOnShowListener(new a(cVar));
        cVar.e().i(new b(cVar));
        return cVar;
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.HOME;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.d;
        h.d(cVar, "ViewUris.HOME");
        return cVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        h.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        b bVar = this.y0;
        if (bVar != null) {
            ((ShowMoreBottomSheetPresenterImpl) bVar).getClass();
        } else {
            h.k("showMoreBottomSheetPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            M4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        f fVar = this.v0;
        if (fVar != null) {
            d b2 = fVar.b();
            this.x0 = b2;
            c cVar = this.w0;
            if (cVar == null) {
                h.k("presenterFactory");
                throw null;
            } else if (b2 != null) {
                cVar.getClass();
                if (b2 != null) {
                    this.y0 = new ShowMoreBottomSheetPresenterImpl(b2);
                    d dVar = this.x0;
                    if (dVar != null) {
                        dVar.a2(new ShowMoreBottomSheetFragment$onCreateView$1(this));
                        d dVar2 = this.x0;
                        if (dVar2 != null) {
                            return dVar2.getView();
                        }
                        h.k("showMoreBottomSheetViewBinder");
                        throw null;
                    }
                    h.k("showMoreBottomSheetViewBinder");
                    throw null;
                }
                throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
            } else {
                h.k("showMoreBottomSheetViewBinder");
                throw null;
            }
        } else {
            h.k("viewBinderFactory");
            throw null;
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.q0;
        h.d(ifd, "FeatureIdentifiers.HOME");
        return ifd;
    }
}
