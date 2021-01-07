package com.spotify.music.superbird.setup;

import android.bluetooth.BluetoothAdapter;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.mobius.s;
import com.spotify.mobius.t;
import com.spotify.music.superbird.setup.domain.SetupStep;
import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.e;
import com.spotify.music.superbird.setup.domain.g;
import com.spotify.music.superbird.setup.domain.p;
import kotlin.jvm.internal.h;

public final class j implements g0.b {
    private final e a;
    private final v b;
    private final vne c;
    private final g d;

    static final class a<M, F> implements t<p, d> {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        /* Return type fixed from 'com.spotify.mobius.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobius.t
        public s<p, d> a(p pVar) {
            return s.c(p.a(pVar, SetupStep.WELCOME, this.a, false, false, false, false, null, false, false, null, 1020), z42.l(new d.e(SetupSubscriptionEvent.c)));
        }
    }

    public j(e eVar, v vVar, vne vne, g gVar) {
        h.e(eVar, "effectHandler");
        h.e(vVar, "connectivityListener");
        h.e(vne, "superbirdOtaDownloadManager");
        h.e(gVar, "eventSources");
        this.a = eVar;
        this.b = vVar;
        this.c = vne;
        this.d = gVar;
    }

    @Override // androidx.lifecycle.g0.b
    public <T extends e0> T a(Class<T> cls) {
        h.e(cls, "modelClass");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        h.d(defaultAdapter, "BluetoothAdapter.getDefaultAdapter()");
        boolean isEnabled = defaultAdapter.isEnabled();
        return com.spotify.mobius.android.g.g(new k(this), new p(SetupStep.WELCOME, isEnabled, false, true, false, this.b.c() == ConnectionType.CONNECTION_TYPE_WLAN, null, this.c.h(), false, null, 768), new a(isEnabled));
    }
}
