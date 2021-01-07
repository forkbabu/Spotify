package com.spotify.mobile.android.spotlets.appprotocol.service;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.z1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;
import com.spotify.mobile.android.sso.m;
import com.spotify.mobile.android.util.t;
import com.spotify.music.builtinauth.authenticator.f0;
import com.spotify.music.json.g;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import io.reactivex.y;

public final class e0 {
    public static void a(AppProtocolRemoteService appProtocolRemoteService, f0 f0Var) {
        appProtocolRemoteService.x = f0Var;
    }

    public static void b(BluetoothAclReceiver bluetoothAclReceiver, f0 f0Var) {
        bluetoothAclReceiver.a = f0Var;
    }

    public static void c(AppProtocolRemoteService appProtocolRemoteService, m mVar) {
        appProtocolRemoteService.n = mVar;
    }

    public static void d(AppProtocolRemoteService appProtocolRemoteService, t tVar) {
        appProtocolRemoteService.w = tVar;
    }

    public static void e(AppProtocolRemoteService appProtocolRemoteService, cqe cqe) {
        appProtocolRemoteService.A = cqe;
    }

    public static void f(AppProtocolRemoteService appProtocolRemoteService, z1 z1Var) {
        appProtocolRemoteService.c = z1Var;
    }

    public static void g(AppProtocolBluetoothService appProtocolBluetoothService, j0 j0Var) {
        appProtocolBluetoothService.c = j0Var;
    }

    public static void h(AppProtocolRemoteService appProtocolRemoteService, y yVar) {
        appProtocolRemoteService.p = yVar;
    }

    public static void i(AppProtocolRemoteService appProtocolRemoteService, wlf<c> wlf) {
        appProtocolRemoteService.s = wlf;
    }

    public static void j(AppProtocolRemoteService appProtocolRemoteService, y yVar) {
        appProtocolRemoteService.o = yVar;
    }

    public static void k(AppProtocolRemoteService appProtocolRemoteService, g gVar) {
        appProtocolRemoteService.a = gVar;
    }

    public static void l(AppProtocolRemoteService appProtocolRemoteService, io.reactivex.g<PlayerState> gVar) {
        appProtocolRemoteService.f = gVar;
    }

    public static void m(AppProtocolRemoteService appProtocolRemoteService, pea pea) {
        appProtocolRemoteService.B = pea;
    }

    public static void n(AppProtocolBluetoothService appProtocolBluetoothService, g7 g7Var) {
        appProtocolBluetoothService.f = g7Var;
    }

    public static void o(AppProtocolRemoteService appProtocolRemoteService, w wVar) {
        appProtocolRemoteService.y = wVar;
    }

    public static void p(AppProtocolBluetoothService appProtocolBluetoothService, ul1 ul1) {
        appProtocolBluetoothService.a = ul1;
    }

    public static void q(AppProtocolRemoteService appProtocolRemoteService, ul1 ul1) {
        appProtocolRemoteService.q = ul1;
    }

    public static void r(AppProtocolBluetoothService appProtocolBluetoothService, h2e h2e) {
        appProtocolBluetoothService.b = h2e;
    }

    public static void s(AppProtocolRemoteService appProtocolRemoteService, h2e h2e) {
        appProtocolRemoteService.t = h2e;
    }

    public static void t(InterAppStartServerReceiver interAppStartServerReceiver, h2e h2e) {
        interAppStartServerReceiver.a = h2e;
    }

    public static void u(AppProtocolRemoteService appProtocolRemoteService, io.reactivex.g<SessionState> gVar) {
        appProtocolRemoteService.z = gVar;
    }

    public static void v(AppProtocolRemoteService appProtocolRemoteService, k0 k0Var) {
        appProtocolRemoteService.u = k0Var;
    }

    public static void w(AppProtocolRemoteService appProtocolRemoteService, SpeedControlInteractor speedControlInteractor) {
        appProtocolRemoteService.r = speedControlInteractor;
    }

    public static void x(AppProtocolRemoteService appProtocolRemoteService, kd0 kd0) {
        appProtocolRemoteService.v = kd0;
    }

    public static void y(AppProtocolRemoteService appProtocolRemoteService, ls1 ls1) {
        appProtocolRemoteService.b = ls1;
    }
}
