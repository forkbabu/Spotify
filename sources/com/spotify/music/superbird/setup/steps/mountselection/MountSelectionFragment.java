package com.spotify.music.superbird.setup.steps.mountselection;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.domain.Mount;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class MountSelectionFragment extends DaggerFragment implements s {
    public m h0;
    private Button i0;
    private Button j0;
    private Button k0;
    private ImageButton l0;

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
                ((MountSelectionFragment) this.b).K4().b(Mount.OPTION_1);
            } else if (i == 1) {
                ((MountSelectionFragment) this.b).K4().b(Mount.OPTION_2);
            } else if (i == 2) {
                ((MountSelectionFragment) this.b).K4().b(Mount.OPTION_3);
            } else if (i == 3) {
                ((MountSelectionFragment) this.b).K4().g();
            } else {
                throw null;
            }
        }
    }

    public MountSelectionFragment() {
        super(C0707R.layout.fragment_mount_selection);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    public final m K4() {
        m mVar = this.h0;
        if (mVar != null) {
            return mVar;
        }
        h.k("delegate");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        View findViewById = view.findViewById(C0707R.id.mount_option_one);
        h.d(findViewById, "view.findViewById(R.id.mount_option_one)");
        this.i0 = (Button) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.mount_option_two);
        h.d(findViewById2, "view.findViewById(R.id.mount_option_two)");
        this.j0 = (Button) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.mount_option_three);
        h.d(findViewById3, "view.findViewById(R.id.mount_option_three)");
        this.k0 = (Button) findViewById3;
        View findViewById4 = view.findViewById(C0707R.id.button_close);
        h.d(findViewById4, "view.findViewById(R.id.button_close)");
        this.l0 = (ImageButton) findViewById4;
        Button button = this.i0;
        if (button != null) {
            button.setOnClickListener(new a(0, this));
            Button button2 = this.j0;
            if (button2 != null) {
                button2.setOnClickListener(new a(1, this));
                Button button3 = this.k0;
                if (button3 != null) {
                    button3.setOnClickListener(new a(2, this));
                    ImageButton imageButton = this.l0;
                    if (imageButton != null) {
                        imageButton.setOnClickListener(new a(3, this));
                    } else {
                        h.k("closeButton");
                        throw null;
                    }
                } else {
                    h.k("optionThreeButton");
                    throw null;
                }
            } else {
                h.k("optionTwoButton");
                throw null;
            }
        } else {
            h.k("optionOneButton");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_MOUNTSELECTION.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_MOUNTSELECTION, null);
        h.d(b, "PageViewObservable.creat…ETUP_MOUNTSELECTION\n    )");
        return b;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
