package com.spotify.music.libs.googleassistantaccountlinking;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class GoogleAssistantAccountLinkingPresentableDialogFragment extends PresentableDialogFragment {
    public static final /* synthetic */ int n0 = 0;
    public h j0;
    public g k0;
    private final p l0 = new p();
    private final PublishSubject<Intent> m0;

    static final class a<T> implements g<Intent> {
        final /* synthetic */ GoogleAssistantAccountLinkingPresentableDialogFragment a;

        a(GoogleAssistantAccountLinkingPresentableDialogFragment googleAssistantAccountLinkingPresentableDialogFragment) {
            this.a = googleAssistantAccountLinkingPresentableDialogFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Intent intent) {
            ((PresentableDialogFragment) this.a).h0.M4(this.a);
        }
    }

    public GoogleAssistantAccountLinkingPresentableDialogFragment() {
        PublishSubject<Intent> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<Intent>()");
        this.m0 = h1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        h hVar = this.j0;
        if (hVar != null) {
            ((k) hVar).a(this, this.i0);
            return;
        }
        h.k("googleAssistantLinkingFlow");
        throw null;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.l0.b(this.m0.subscribe(new a(this)));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.l0.a();
        super.P3();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i == this.i0) {
            if (i2 == -1) {
                g gVar = this.k0;
                if (gVar != null) {
                    gVar.b();
                } else {
                    h.k("googleAssistantLinker");
                    throw null;
                }
            } else {
                g gVar2 = this.k0;
                if (gVar2 != null) {
                    gVar2.a();
                } else {
                    h.k("googleAssistantLinker");
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
        u0e.a(context, f.a).subscribe(this.m0);
    }
}
