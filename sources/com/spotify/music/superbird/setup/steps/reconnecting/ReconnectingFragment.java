package com.spotify.music.superbird.setup.steps.reconnecting;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
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
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.domain.q;
import com.spotify.music.superbird.setup.j;
import dagger.android.support.DaggerFragment;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class ReconnectingFragment extends DaggerFragment implements s {
    private final io.reactivex.disposables.a h0 = new io.reactivex.disposables.a();
    public y i0;
    public j j0;
    private g<p, f, d, q> k0;
    private TextView l0;
    private ProgressBar m0;
    private SetupView n0;

    static final class a<T> implements v<q> {
        final /* synthetic */ ReconnectingFragment a;

        a(ReconnectingFragment reconnectingFragment) {
            this.a = reconnectingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(q qVar) {
            q qVar2 = qVar;
            if (qVar2 instanceof q.g) {
                ReconnectingFragment.M4(this.a, ((q.g) qVar2).a());
            } else if (qVar2 instanceof q.d) {
                ReconnectingFragment.L4(this.a);
            }
        }
    }

    public ReconnectingFragment() {
        super(C0707R.layout.fragment_reconnecting);
    }

    public static final /* synthetic */ g K4(ReconnectingFragment reconnectingFragment) {
        g<p, f, d, q> gVar = reconnectingFragment.k0;
        if (gVar != null) {
            return gVar;
        }
        h.k("mobiusLoopViewModel");
        throw null;
    }

    public static final void L4(ReconnectingFragment reconnectingFragment) {
        TextView textView = reconnectingFragment.l0;
        if (textView != null) {
            textView.setText(reconnectingFragment.V2(C0707R.string.reconnecting_failed_to_connect));
            SetupView setupView = reconnectingFragment.n0;
            if (setupView != null) {
                setupView.setButtonVisible(true);
                ProgressBar progressBar = reconnectingFragment.m0;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                } else {
                    h.k("loadingIndicator");
                    throw null;
                }
            } else {
                h.k("setupView");
                throw null;
            }
        } else {
            h.k("title");
            throw null;
        }
    }

    public static final void M4(ReconnectingFragment reconnectingFragment, BluetoothDevice bluetoothDevice) {
        TextView textView = reconnectingFragment.l0;
        if (textView != null) {
            textView.setText(reconnectingFragment.V2(C0707R.string.reconnecting_title));
            SetupView setupView = reconnectingFragment.n0;
            if (setupView != null) {
                setupView.setButtonVisible(false);
                ProgressBar progressBar = reconnectingFragment.m0;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    Intent intent = new Intent("com.spotify.music.service.bluetooth.action.START_APP_PROTOCOL_SERVER");
                    intent.setComponent(new ComponentName(reconnectingFragment.l4(), "com.spotify.mobile.android.spotlets.appprotocol.service.InterAppStartServerReceiver"));
                    intent.putExtra("device_address", bluetoothDevice.getAddress());
                    intent.putExtra("device_name", bluetoothDevice.getName());
                    reconnectingFragment.l4().sendBroadcast(intent);
                    reconnectingFragment.h0.f();
                    io.reactivex.disposables.a aVar = reconnectingFragment.h0;
                    io.reactivex.s d1 = io.reactivex.s.d1(io.reactivex.s.e0(0, 3, TimeUnit.SECONDS).N0((long) 3), io.reactivex.s.u0(1, 3), a.a);
                    y yVar = reconnectingFragment.i0;
                    if (yVar != null) {
                        aVar.b(d1.I0(yVar).subscribe(new b(reconnectingFragment, bluetoothDevice)));
                    } else {
                        h.k("computationScheduler");
                        throw null;
                    }
                } else {
                    h.k("loadingIndicator");
                    throw null;
                }
            } else {
                h.k("setupView");
                throw null;
            }
        } else {
            h.k("title");
            throw null;
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
        this.l0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.description);
        h.d(findViewById2, "view.findViewById(R.id.description)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.loading_progress_bar);
        h.d(findViewById3, "view.findViewById(R.id.loading_progress_bar)");
        this.m0 = (ProgressBar) findViewById3;
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.j0;
        if (jVar != null) {
            e0 a2 = new g0(j4, jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            this.k0 = (g) a2;
            SetupView setupView = (SetupView) view.findViewById(C0707R.id.reconnecting_setup_view);
            h.d(setupView, "this");
            this.n0 = setupView;
            setupView.setOnCloseClick(new ReconnectingFragment$onViewCreated$$inlined$apply$lambda$1(this));
            setupView.setOnButtonClick(new ReconnectingFragment$onViewCreated$$inlined$apply$lambda$2(this));
            g<p, f, d, q> gVar = this.k0;
            if (gVar != null) {
                gVar.j().b(b3(), new a(this));
                g<p, f, d, q> gVar2 = this.k0;
                if (gVar2 != null) {
                    gVar2.h(f.r.a);
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
        return PageIdentifiers.SUPERBIRD_SETUP_RECONNECTING.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_RECONNECTING, ViewUris.A2.toString());
        h.d(b, "PageViewObservable.creat…NNECTING.toString()\n    )");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.h0.dispose();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
