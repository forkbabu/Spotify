package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.g4;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executors;

public class d0 {
    private static final UUID h = UUID.fromString("E3CCCCCD-33B7-457D-A03C-AA1C54BF617F");
    private static final UUID i = UUID.fromString("7FBE865E-518B-462A-B31B-90ACF6A472FC");
    private final c0 a;
    private b0 b;
    private b0 c;
    private b0 d;
    private b0 e;
    private final a f;
    private final Handler g = new Handler(Looper.getMainLooper());

    interface a {
    }

    public d0(c0 c0Var, a aVar, boolean z) {
        this.a = c0Var;
        this.f = aVar;
    }

    private static u3 a(InputStream inputStream, OutputStream outputStream) {
        return new nq1(new jq1(inputStream, Executors.newSingleThreadExecutor(), new iq1()), new mq1(outputStream, Executors.newSingleThreadScheduledExecutor(), new iq1()));
    }

    public /* synthetic */ void b(BluetoothSocket bluetoothSocket) {
        try {
            this.g.post(new b(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    public /* synthetic */ void c(BluetoothSocket bluetoothSocket) {
        try {
            this.g.post(new c(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    public void d(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        ((AppProtocolBluetoothService) this.f).i(new g4(inputStream, outputStream, Executors.newSingleThreadExecutor()), bluetoothSocket.getRemoteDevice().getAddress());
    }

    public /* synthetic */ void e(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        ((AppProtocolBluetoothService) this.f).i(a(inputStream, outputStream), bluetoothSocket.getRemoteDevice().getAddress());
    }

    public void f() {
        b0 b0Var = this.b;
        boolean z = b0Var != null && !b0Var.l();
        b0 b0Var2 = this.c;
        boolean z2 = b0Var2 != null && !b0Var2.l();
        b0 b0Var3 = this.d;
        boolean z3 = b0Var3 != null && !b0Var3.l();
        b0 b0Var4 = this.e;
        boolean z4 = b0Var4 != null && !b0Var4.l();
        Logger.l("mAcceptThread isAlive %b", Boolean.valueOf(z));
        Logger.l("mAcceptThreadWithFraming isAlive %b", Boolean.valueOf(z2));
        Logger.l("mTcpAcceptThread isAlive %b", Boolean.valueOf(z3));
        Logger.l("mTcpAcceptThreadWithFraming isAlive %b", Boolean.valueOf(z4));
        b0 b0Var5 = this.b;
        if (b0Var5 == null || b0Var5.l()) {
            b0 a2 = this.a.a(h, new d(this));
            this.b = a2;
            ((Thread) a2).start();
        }
        b0 b0Var6 = this.c;
        if (b0Var6 == null || b0Var6.l()) {
            b0 a3 = this.a.a(i, new e(this));
            this.c = a3;
            ((Thread) a3).start();
        }
    }

    public void g() {
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.cancel();
            this.b = null;
        }
        b0 b0Var2 = this.c;
        if (b0Var2 != null) {
            b0Var2.cancel();
            this.c = null;
        }
        b0 b0Var3 = this.d;
        if (b0Var3 != null) {
            b0Var3.cancel();
            this.d = null;
        }
        b0 b0Var4 = this.e;
        if (b0Var4 != null) {
            b0Var4.cancel();
            this.e = null;
        }
    }
}
