package com.spotify.music.superbird.setup.steps.mountinstructions;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.domain.Mount;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.j;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class MountInstructionsFragment extends DaggerFragment implements s {
    public j h0;
    public m i0;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                m mVar = ((MountInstructionsFragment) this.b).i0;
                if (mVar != null) {
                    mVar.c();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else if (i == 1) {
                m mVar2 = ((MountInstructionsFragment) this.b).i0;
                if (mVar2 != null) {
                    mVar2.g();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    static final class b<T> implements v<p> {
        final /* synthetic */ TextView a;

        b(TextView textView) {
            this.a = textView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(p pVar) {
            String str;
            TextView textView = this.a;
            h.d(textView, "mountName");
            Mount e = pVar.e();
            if (e == null || (str = e.name()) == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    public MountInstructionsFragment() {
        super(C0707R.layout.fragment_mount_instructions);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.h0;
        if (jVar != null) {
            e0 a2 = new g0(j4.Z(), jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            ((Button) view.findViewById(C0707R.id.next)).setOnClickListener(new a(0, this));
            ((ImageButton) view.findViewById(C0707R.id.button_close)).setOnClickListener(new a(1, this));
            ((g) a2).i().h(b3(), new b((TextView) view.findViewById(C0707R.id.option_name)));
            return;
        }
        h.k("viewModelFactory");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_MOUNTINSTRUCTIONS.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_MOUNTINSTRUCTIONS, null);
        h.d(b2, "PageViewObservable.creat…P_MOUNTINSTRUCTIONS\n    )");
        return b2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
