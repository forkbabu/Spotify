package com.spotify.music.superbird.setup.steps.checkforupdates;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.domain.c;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.j;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class CheckForUpdatesFragment extends DaggerFragment implements s {
    public j h0;
    public m i0;
    private TextView j0;
    private TextView k0;
    private ProgressBar l0;
    private Button m0;
    private Button n0;

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
                ((CheckForUpdatesFragment) this.b).R4().g();
            } else if (i == 1) {
                ((CheckForUpdatesFragment) this.b).R4().h();
            } else if (i == 2) {
                ((CheckForUpdatesFragment) this.b).R4().d();
            } else {
                throw null;
            }
        }
    }

    static final class b<T> implements v<p> {
        final /* synthetic */ CheckForUpdatesFragment a;

        b(CheckForUpdatesFragment checkForUpdatesFragment) {
            this.a = checkForUpdatesFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(p pVar) {
            p pVar2 = pVar;
            c b = pVar2.b();
            if ((b != null ? b.c() : null) == null || pVar2.b().d()) {
                CheckForUpdatesFragment.P4(this.a).setVisibility(0);
                CheckForUpdatesFragment.L4(this.a);
                CheckForUpdatesFragment.K4(this.a);
                return;
            }
            double sizeBytes = (double) pVar2.b().c().sizeBytes();
            double pow = Math.pow(1024.0d, 2.0d);
            Double.isNaN(sizeBytes);
            Double.isNaN(sizeBytes);
            CheckForUpdatesFragment.Q4(this.a).setText(C0707R.string.check_for_updates_title);
            CheckForUpdatesFragment.O4(this.a).setText(this.a.R2().getString(C0707R.string.check_for_updates_description, Integer.valueOf((int) (sizeBytes / pow))));
            CheckForUpdatesFragment.P4(this.a).setVisibility(4);
            CheckForUpdatesFragment.M4(this.a);
            CheckForUpdatesFragment.N4(this.a);
        }
    }

    public CheckForUpdatesFragment() {
        super(C0707R.layout.fragment_check_for_updates);
    }

    public static final void K4(CheckForUpdatesFragment checkForUpdatesFragment) {
        Button button = checkForUpdatesFragment.n0;
        if (button != null) {
            button.setVisibility(8);
        } else {
            h.k("useCellularButton");
            throw null;
        }
    }

    public static final void L4(CheckForUpdatesFragment checkForUpdatesFragment) {
        Button button = checkForUpdatesFragment.m0;
        if (button != null) {
            button.setVisibility(8);
        } else {
            h.k("connectToWifiButton");
            throw null;
        }
    }

    public static final void M4(CheckForUpdatesFragment checkForUpdatesFragment) {
        Button button = checkForUpdatesFragment.n0;
        if (button != null) {
            button.setVisibility(0);
        } else {
            h.k("useCellularButton");
            throw null;
        }
    }

    public static final void N4(CheckForUpdatesFragment checkForUpdatesFragment) {
        Button button = checkForUpdatesFragment.m0;
        if (button != null) {
            button.setVisibility(0);
        } else {
            h.k("connectToWifiButton");
            throw null;
        }
    }

    public static final /* synthetic */ TextView O4(CheckForUpdatesFragment checkForUpdatesFragment) {
        TextView textView = checkForUpdatesFragment.k0;
        if (textView != null) {
            return textView;
        }
        h.k("description");
        throw null;
    }

    public static final /* synthetic */ ProgressBar P4(CheckForUpdatesFragment checkForUpdatesFragment) {
        ProgressBar progressBar = checkForUpdatesFragment.l0;
        if (progressBar != null) {
            return progressBar;
        }
        h.k("loadingIndicator");
        throw null;
    }

    public static final /* synthetic */ TextView Q4(CheckForUpdatesFragment checkForUpdatesFragment) {
        TextView textView = checkForUpdatesFragment.j0;
        if (textView != null) {
            return textView;
        }
        h.k("title");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        View findViewById = view.findViewById(C0707R.id.title);
        h.d(findViewById, "view.findViewById(R.id.title)");
        this.j0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.description);
        h.d(findViewById2, "view.findViewById(R.id.description)");
        this.k0 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.loading_progress_bar);
        h.d(findViewById3, "view.findViewById(R.id.loading_progress_bar)");
        this.l0 = (ProgressBar) findViewById3;
        View findViewById4 = view.findViewById(C0707R.id.button_connect_to_wifi);
        h.d(findViewById4, "view.findViewById(R.id.button_connect_to_wifi)");
        this.m0 = (Button) findViewById4;
        View findViewById5 = view.findViewById(C0707R.id.button_use_cellular);
        h.d(findViewById5, "view.findViewById(R.id.button_use_cellular)");
        this.n0 = (Button) findViewById5;
        androidx.fragment.app.c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.h0;
        if (jVar != null) {
            e0 a2 = new g0(j4.Z(), jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            g gVar = (g) a2;
            ((ImageButton) view.findViewById(C0707R.id.button_close)).setOnClickListener(new a(0, this));
            Button button = this.m0;
            if (button != null) {
                button.setOnClickListener(new a(1, this));
                Button button2 = this.n0;
                if (button2 != null) {
                    button2.setOnClickListener(new a(2, this));
                    gVar.i().h(b3(), new b(this));
                    return;
                }
                h.k("useCellularButton");
                throw null;
            }
            h.k("connectToWifiButton");
            throw null;
        }
        h.k("viewModelFactory");
        throw null;
    }

    public final m R4() {
        m mVar = this.i0;
        if (mVar != null) {
            return mVar;
        }
        h.k("delegate");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_CHECKFORUPDATES.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_CHECKFORUPDATES, ViewUris.t2.toString());
        h.d(b2, "PageViewObservable.creat…RUPDATES.toString()\n    )");
        return b2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
