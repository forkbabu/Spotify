package com.spotify.mobile.android.ui.fragments.logic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaTransferError;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.connect.m;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offlinetrials.capped.k;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.p;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;

public class PlaybackErrorDialogFragment extends PresentableDialogFragment {
    private static final Optional<String> A0 = Optional.of("premium");
    public static final /* synthetic */ int B0 = 0;
    o0 j0;
    l6a k0;
    ExplicitContentFacade l0;
    AgeRestrictedContentFacade m0;
    n n0;
    l o0;
    w p0;
    k q0;
    g<c> r0;
    y s0;
    private b t0;
    private b u0;
    private final p v0 = new p();
    private c w0;
    private boolean x0;
    private final mha y0 = new mha();
    private final BroadcastReceiver z0 = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("error_code", -1);
            GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("connect_device");
            GaiaTransferError gaiaTransferError = new GaiaTransferError(intExtra, gaiaDevice.getCosmosIdentifier());
            PlaybackErrorDialogFragment playbackErrorDialogFragment = PlaybackErrorDialogFragment.this;
            int i = PlaybackErrorDialogFragment.B0;
            playbackErrorDialogFragment.getClass();
            m.d(context, gaiaDevice, gaiaTransferError, ViewUris.a);
        }
    }

    public PlaybackErrorDialogFragment() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.t0 = emptyDisposable;
        this.u0 = emptyDisposable;
    }

    public static void M4(PlaybackErrorDialogFragment playbackErrorDialogFragment, boolean z) {
        playbackErrorDialogFragment.x0 = z;
    }

    private void P4(Context context, int i, String str) {
        LinkType q = l0.z(str).q();
        if (i == 2) {
            this.j0.c(C0707R.string.toast_feature_premium_discovered, new Object[0]);
        } else if (i == 14) {
            this.j0.c(C0707R.string.toast_feature_premium_discovered, new Object[0]);
        } else if (i == 16) {
            this.j0.c(C0707R.string.toast_feature_premium_discovered, new Object[0]);
        } else if (i != 17) {
            switch (i) {
                case 20:
                    this.j0.d(C0707R.string.toast_unavailable_video_playback_error, new Object[0]);
                    return;
                case 21:
                case 26:
                    this.j0.d(C0707R.string.toast_unavailable_video_georestricted_error, new Object[0]);
                    return;
                case 22:
                    this.j0.d(C0707R.string.toast_unavailable_video_unsupported_platform_error, new Object[0]);
                    return;
                case 23:
                    this.j0.d(C0707R.string.toast_unavailable_video_unsupported_client_error, new Object[0]);
                    return;
                case 24:
                    this.j0.d(C0707R.string.toast_unavailable_video_manifest_deleted, new Object[0]);
                    return;
                case 25:
                    m.c(context, ViewUris.a);
                    return;
                case 27:
                    this.j0.d(C0707R.string.toast_unavailable_video_unavailable, new Object[0]);
                    return;
                case 28:
                    this.j0.c(C0707R.string.toast_feature_premium_discovered, new Object[0]);
                    return;
                case 29:
                case 30:
                    this.l0.e(str, str);
                    return;
                default:
                    switch (i) {
                        case 32:
                        case 33:
                            this.m0.d(str, null);
                            return;
                        case 34:
                            this.q0.b();
                            return;
                        case 35:
                            mha mha = this.y0;
                            com.spotify.music.libs.viewuri.c cVar = ViewUris.a;
                            mha.b(context);
                            return;
                        default:
                            if (q == LinkType.SHOW_EPISODE) {
                                this.j0.d(C0707R.string.toast_unavailable_episode, new Object[0]);
                                return;
                            } else {
                                this.j0.d(C0707R.string.toast_unavailable_track, new Object[0]);
                                return;
                            }
                    }
            }
        } else {
            this.j0.d(C0707R.string.toast_feature_premium_discovered, new Object[0]);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.v0.a();
        this.n0.b();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (this.n0.e()) {
            int c = this.n0.c();
            String d = this.n0.d();
            if (!this.x0) {
                P4(B2(), c, d);
            }
        }
        p pVar = this.v0;
        s<Optional<String>> c2 = this.p0.c("type");
        Optional<String> optional = A0;
        optional.getClass();
        pVar.b(c2.j0(new a(optional)).E().J0(new d(this)).o0(io.reactivex.android.schedulers.a.b()).subscribe(new h(this), e.a));
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", this.w0);
    }

    public /* synthetic */ void N4(c cVar) {
        this.w0 = cVar;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.t0 = this.r0.Q(this.s0).subscribe(new f(this));
        this.u0 = this.k0.b().o0(this.s0).subscribe(new g(this));
        androidx.fragment.app.c B2 = B2();
        BroadcastReceiver broadcastReceiver = this.z0;
        IntentFilter intentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        B2.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void O4(m mVar) {
        Context F2 = F2();
        if (mVar.a() != 99) {
            String b = mVar.b();
            Assertion.j(je.x0("unexpected track or context uri: ", b), b.isEmpty() || b.startsWith("spotify:track:") || b.startsWith("spotify:local:") || b.startsWith("spotify:ad:") || b.startsWith("spotify:episode:") || b.startsWith(InterruptionUtil.INTERRUPTION_PREFIX) || b.startsWith("spotify:live:") || b.startsWith("spotify:user:") || b.startsWith("spotify:album:") || b.startsWith("spotify:vdebug"));
            if (!this.x0) {
                P4(F2, mVar.a(), b);
            }
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.t0.dispose();
        this.u0.dispose();
        B2().unregisterReceiver(this.z0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.w0 = d.c(this);
        if (bundle != null) {
            Assertion.e(bundle);
            Assertion.j("The Bundle must have a Flags argument", bundle.containsKey("FlagsArgumentHelper.Flags"));
            this.w0 = (c) bundle.getParcelable("FlagsArgumentHelper.Flags");
        }
    }
}
