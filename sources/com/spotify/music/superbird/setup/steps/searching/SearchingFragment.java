package com.spotify.music.superbird.setup.steps.searching;

import android.bluetooth.BluetoothDevice;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
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
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.SetupView;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.domain.q;
import com.spotify.music.superbird.setup.j;
import dagger.android.support.DaggerFragment;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class SearchingFragment extends DaggerFragment implements s {
    private final d h0 = kotlin.a.a(LazyThreadSafetyMode.NONE, new SearchingFragment$deviceManager$2(this));
    public j i0;
    private g<p, f, com.spotify.music.superbird.setup.domain.d, q> j0;
    public TextView k0;
    public TextView l0;
    private ProgressBar m0;
    private SetupView n0;
    private final io.reactivex.disposables.a o0 = new io.reactivex.disposables.a();

    static final class a<T> implements v<q> {
        final /* synthetic */ SearchingFragment a;

        a(SearchingFragment searchingFragment) {
            this.a = searchingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(q qVar) {
            SearchingFragment.L4(this.a, qVar);
        }
    }

    static final class b<T> implements v<Iterable<? extends q>> {
        final /* synthetic */ SearchingFragment a;

        b(SearchingFragment searchingFragment) {
            this.a = searchingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(Iterable<? extends q> iterable) {
            Iterable<? extends q> iterable2 = iterable;
            h.d(iterable2, "effects");
            SearchingFragment searchingFragment = this.a;
            for (q qVar : iterable2) {
                SearchingFragment.L4(searchingFragment, qVar);
            }
        }
    }

    public SearchingFragment() {
        super(C0707R.layout.fragment_searching);
    }

    public static final /* synthetic */ g K4(SearchingFragment searchingFragment) {
        g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar = searchingFragment.j0;
        if (gVar != null) {
            return gVar;
        }
        h.k("mobiusLoopViewModel");
        throw null;
    }

    public static final void L4(SearchingFragment searchingFragment, q qVar) {
        searchingFragment.getClass();
        if (qVar instanceof q.h) {
            SetupView setupView = searchingFragment.n0;
            if (setupView != null) {
                setupView.setButtonVisible(false);
                ProgressBar progressBar = searchingFragment.m0;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    TextView textView = searchingFragment.k0;
                    if (textView != null) {
                        textView.setText(C0707R.string.searching_for_car_thing);
                        TextView textView2 = searchingFragment.l0;
                        if (textView2 != null) {
                            textView2.setText(C0707R.string.searching_tap_car_thing_when_it_appears_below);
                            BluetoothDeviceFilter build = new BluetoothDeviceFilter.Builder().setNamePattern(Pattern.compile("Car Thing")).build();
                            h.d(build, "BluetoothDeviceFilter.Bu…g\"))\n            .build()");
                            AssociationRequest build2 = new AssociationRequest.Builder().addDeviceFilter(build).setSingleDevice(false).build();
                            h.d(build2, "AssociationRequest.Build…lse)\n            .build()");
                            ((CompanionDeviceManager) searchingFragment.h0.getValue()).associate(build2, new a(searchingFragment), null);
                            return;
                        }
                        h.k("description");
                        throw null;
                    }
                    h.k("title");
                    throw null;
                }
                h.k("loadingIndicator");
                throw null;
            }
            h.k("setupView");
            throw null;
        } else if (qVar instanceof q.e) {
            searchingFragment.I4(((q.e) qVar).a(), 123, null, 0, 0, 0, null);
        } else if (qVar instanceof q.f) {
            TextView textView3 = searchingFragment.k0;
            if (textView3 != null) {
                textView3.setText(searchingFragment.V2(C0707R.string.searching_failed_to_connect_timeout_title));
                TextView textView4 = searchingFragment.l0;
                if (textView4 != null) {
                    textView4.setText(searchingFragment.V2(C0707R.string.searching_failed_to_connect_timeout_description));
                    SetupView setupView2 = searchingFragment.n0;
                    if (setupView2 != null) {
                        setupView2.setButtonVisible(true);
                        ProgressBar progressBar2 = searchingFragment.m0;
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(4);
                        } else {
                            h.k("loadingIndicator");
                            throw null;
                        }
                    } else {
                        h.k("setupView");
                        throw null;
                    }
                } else {
                    h.k("description");
                    throw null;
                }
            } else {
                h.k("title");
                throw null;
            }
        } else if (qVar instanceof q.d) {
            TextView textView5 = searchingFragment.k0;
            if (textView5 != null) {
                textView5.setText(searchingFragment.V2(C0707R.string.searching_failed_to_connect));
                TextView textView6 = searchingFragment.l0;
                if (textView6 != null) {
                    textView6.setText(searchingFragment.V2(C0707R.string.searching_failed_to_connect_description));
                    SetupView setupView3 = searchingFragment.n0;
                    if (setupView3 != null) {
                        setupView3.setButtonVisible(true);
                        ProgressBar progressBar3 = searchingFragment.m0;
                        if (progressBar3 != null) {
                            progressBar3.setVisibility(4);
                        } else {
                            h.k("loadingIndicator");
                            throw null;
                        }
                    } else {
                        h.k("setupView");
                        throw null;
                    }
                } else {
                    h.k("description");
                    throw null;
                }
            } else {
                h.k("title");
                throw null;
            }
        } else if (qVar instanceof q.c) {
            TextView textView7 = searchingFragment.k0;
            if (textView7 != null) {
                textView7.setText(searchingFragment.V2(C0707R.string.searching_connecting_to_car_thing));
                TextView textView8 = searchingFragment.l0;
                if (textView8 != null) {
                    textView8.setText(searchingFragment.V2(C0707R.string.searching_connecting_car_thing_instructions));
                } else {
                    h.k("description");
                    throw null;
                }
            } else {
                h.k("title");
                throw null;
            }
        }
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
        this.k0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.description);
        h.d(findViewById2, "view.findViewById(R.id.description)");
        this.l0 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.loading_progress_bar);
        h.d(findViewById3, "view.findViewById(R.id.loading_progress_bar)");
        this.m0 = (ProgressBar) findViewById3;
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.i0;
        if (jVar != null) {
            e0 a2 = new g0(j4, jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            this.j0 = (g) a2;
            SetupView setupView = (SetupView) view.findViewById(C0707R.id.searching_setup_view);
            h.d(setupView, "this");
            this.n0 = setupView;
            setupView.setOnButtonClick(new SearchingFragment$onViewCreated$$inlined$apply$lambda$1(this));
            setupView.setOnCloseClick(new SearchingFragment$onViewCreated$$inlined$apply$lambda$2(this));
            g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar = this.j0;
            if (gVar != null) {
                gVar.j().a(this, new a(this), new b(this));
                g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar2 = this.j0;
                if (gVar2 != null) {
                    gVar2.h(f.q.a);
                } else {
                    h.k("mobiusLoopViewModel");
                    throw null;
                }
            } else {
                h.k("mobiusLoopViewModel");
                throw null;
            }
        } else {
            h.k("viewModelFactory");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_SEARCHING.name();
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (i == 123) {
            if (i2 == -1) {
                BluetoothDevice bluetoothDevice = intent != null ? (BluetoothDevice) intent.getParcelableExtra("android.companion.extra.DEVICE") : null;
                h.c(bluetoothDevice);
                g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar = this.j0;
                if (gVar != null) {
                    gVar.h(new f.z(bluetoothDevice));
                } else {
                    h.k("mobiusLoopViewModel");
                    throw null;
                }
            } else if (i2 == 0) {
                g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar2 = this.j0;
                if (gVar2 != null) {
                    gVar2.h(f.h.a);
                } else {
                    h.k("mobiusLoopViewModel");
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_SEARCHING, ViewUris.r2.toString());
        h.d(b2, "PageViewObservable.creat…EARCHING.toString()\n    )");
        return b2;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        g<p, f, com.spotify.music.superbird.setup.domain.d, q> gVar = this.j0;
        if (gVar != null) {
            gVar.h(f.w.a);
            this.o0.dispose();
            super.x3();
            return;
        }
        h.k("mobiusLoopViewModel");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
