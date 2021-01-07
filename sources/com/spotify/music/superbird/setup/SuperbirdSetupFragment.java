package com.spotify.music.superbird.setup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.SuperbirdSetupFragmentViewModel;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class SuperbirdSetupFragment extends DaggerFragment implements s {
    public SuperbirdSetupFragmentViewModel.a h0;
    private SuperbirdSetupFragmentViewModel i0;
    private Button j0;
    private Button k0;
    private TextView l0;
    private TextView m0;
    private Group n0;
    private ProgressBar o0;
    private Button p0;

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
                SuperbirdSetupFragment.P4((SuperbirdSetupFragment) this.b);
            } else if (i == 1) {
                SuperbirdSetupFragment.P4((SuperbirdSetupFragment) this.b);
            } else {
                throw null;
            }
        }
    }

    static final class b implements View.OnClickListener {
        public static final b a = new b();

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public SuperbirdSetupFragment() {
        super(C0707R.layout.fragment_superbird);
    }

    public static final /* synthetic */ TextView K4(SuperbirdSetupFragment superbirdSetupFragment) {
        TextView textView = superbirdSetupFragment.l0;
        if (textView != null) {
            return textView;
        }
        h.k("appVersion");
        throw null;
    }

    public static final /* synthetic */ Group L4(SuperbirdSetupFragment superbirdSetupFragment) {
        Group group = superbirdSetupFragment.n0;
        if (group != null) {
            return group;
        }
        h.k("checkUpdatesGroup");
        throw null;
    }

    public static final /* synthetic */ ProgressBar M4(SuperbirdSetupFragment superbirdSetupFragment) {
        ProgressBar progressBar = superbirdSetupFragment.o0;
        if (progressBar != null) {
            return progressBar;
        }
        h.k("loadingProgressBar");
        throw null;
    }

    public static final /* synthetic */ TextView N4(SuperbirdSetupFragment superbirdSetupFragment) {
        TextView textView = superbirdSetupFragment.m0;
        if (textView != null) {
            return textView;
        }
        h.k("osVersion");
        throw null;
    }

    public static final /* synthetic */ Button O4(SuperbirdSetupFragment superbirdSetupFragment) {
        Button button = superbirdSetupFragment.j0;
        if (button != null) {
            return button;
        }
        h.k("setupButton");
        throw null;
    }

    public static final void P4(SuperbirdSetupFragment superbirdSetupFragment) {
        Context l4 = superbirdSetupFragment.l4();
        h.d(l4, "requireContext()");
        h.e(l4, "context");
        l4.startActivity(new Intent(l4, SuperbirdSetupActivity.class));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.root_superbird_fragment_title);
        h.d(string, "context.getString(R.stri…superbird_fragment_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        View findViewById = view.findViewById(C0707R.id.loading_progress_bar);
        h.d(findViewById, "view.findViewById<Progre….id.loading_progress_bar)");
        this.o0 = (ProgressBar) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.setupButton);
        h.d(findViewById2, "view.findViewById<Button>(R.id.setupButton)");
        this.j0 = (Button) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.checkUpdatesButton);
        h.d(findViewById3, "view.findViewById<Button>(R.id.checkUpdatesButton)");
        this.k0 = (Button) findViewById3;
        View findViewById4 = view.findViewById(C0707R.id.checkUpdatesGroup);
        h.d(findViewById4, "view.findViewById<Group>(R.id.checkUpdatesGroup)");
        this.n0 = (Group) findViewById4;
        View findViewById5 = view.findViewById(C0707R.id.text_app_version);
        h.d(findViewById5, "view.findViewById<TextView>(R.id.text_app_version)");
        this.l0 = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C0707R.id.text_os_version);
        h.d(findViewById6, "view.findViewById<TextView>(R.id.text_os_version)");
        this.m0 = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0707R.id.setupAnotherCarThingButton);
        h.d(findViewById7, "view.findViewById<Button…tupAnotherCarThingButton)");
        this.p0 = (Button) findViewById7;
        Button button = this.j0;
        if (button != null) {
            button.setOnClickListener(new a(0, this));
            Button button2 = this.p0;
            if (button2 != null) {
                button2.setOnClickListener(new a(1, this));
                Button button3 = this.k0;
                if (button3 != null) {
                    button3.setOnClickListener(b.a);
                    SuperbirdSetupFragmentViewModel.a aVar = this.h0;
                    if (aVar != null) {
                        e0 a2 = new g0(Z(), aVar).a(SuperbirdSetupFragmentViewModel.class);
                        h.d(a2, "ViewModelProvider(this, …entViewModel::class.java)");
                        SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel = (SuperbirdSetupFragmentViewModel) a2;
                        this.i0 = superbirdSetupFragmentViewModel;
                        superbirdSetupFragmentViewModel.j().h(b3(), new e(this));
                        return;
                    }
                    h.k("setupFragmentViewModelFactory");
                    throw null;
                }
                h.k("checkUpdatesButton");
                throw null;
            }
            h.k("setupAnotherCarThingButton");
            throw null;
        }
        h.k("setupButton");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "superbird";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.DEBUG, null);
        h.d(b2, "PageViewObservable.create(PageIdentifiers.DEBUG)");
        return b2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.r1;
    }
}
