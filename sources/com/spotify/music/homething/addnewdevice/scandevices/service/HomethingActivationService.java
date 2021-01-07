package com.spotify.music.homething.addnewdevice.scandevices.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.adjust.sdk.Constants;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import dagger.android.g;
import io.reactivex.s;
import io.reactivex.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class HomethingActivationService extends g {
    public static final String E = Joiner.on(',').join("streaming", "speech-upload", "client-authorization-universal");
    private BluetoothGatt A;
    private boolean B;
    private Runnable C;
    private final BluetoothGattCallback D = new a();
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final Queue<Runnable> b = new LinkedList();
    private final Handler c = new Handler(Looper.getMainLooper());
    vt9 f;
    ps9 n;
    y o;
    y p;
    private BluetoothManager q;
    private BluetoothAdapter r;
    private String s;
    private UUID t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private rt9 z;

    /* access modifiers changed from: package-private */
    public class a extends BluetoothGattCallback {
        public static final /* synthetic */ int b = 0;

        a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            int length = bluetoothGattCharacteristic.getValue().length;
            byte[] bArr = new byte[length];
            System.arraycopy(bluetoothGattCharacteristic.getValue(), 0, bArr, 0, bluetoothGattCharacteristic.getValue().length);
            Charset charset = Charsets.UTF_8;
            String str = new String(bArr, charset);
            Logger.b("Characteristic changed: %s", str);
            if (str.startsWith("MAC:")) {
                HomethingActivationService.this.u = true;
                HomethingActivationService.this.B();
                HomethingActivationService.this.s = new String(Arrays.copyOfRange(bArr, 4, length - 1), charset);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (i != 0) {
                Logger.d("ERROR: Read failed for characteristic. Status %d", Integer.valueOf(i));
                HomethingActivationService.r(HomethingActivationService.this);
                return;
            }
            Logger.b("Wrote characteristic", new Object[0]);
            HomethingActivationService.r(HomethingActivationService.this);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            if (i != 0) {
                bluetoothGatt.close();
            } else if (i2 == 2) {
                int bondState = bluetoothGatt.getDevice().getBondState();
                if (bondState == 10 || bondState == 12) {
                    int i3 = Build.VERSION.SDK_INT <= 24 ? Constants.ONE_SECOND : 0;
                    if (bondState != 12) {
                        i3 = 0;
                    }
                    HomethingActivationService.this.C = new d(this, bluetoothGatt);
                    HomethingActivationService.this.c.postDelayed(HomethingActivationService.this.C, (long) i3);
                }
                Logger.b("Connected to a device", new Object[0]);
            } else if (i2 == 0) {
                bluetoothGatt.close();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (i != 0) {
                Logger.d("ERROR: Write descriptor failed", new Object[0]);
            }
            HomethingActivationService.r(HomethingActivationService.this);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            Logger.b("Services discovered.", new Object[0]);
            if (i != 0) {
                HomethingActivationService.this.u();
                return;
            }
            BluetoothGattCharacteristic characteristic = HomethingActivationService.this.A.getService(UUID.fromString("000018AA-0000-1000-8000-00805f9b34fb")).getCharacteristic(UUID.fromString("00002aaa-0000-1000-8000-00805f9b34fb"));
            io.reactivex.disposables.a aVar = HomethingActivationService.this.a;
            HomethingActivationService homethingActivationService = HomethingActivationService.this;
            aVar.b(homethingActivationService.f.a("3d4698036571452eb3d2fdf18ce7f1e6", HomethingActivationService.E, "json").H(homethingActivationService.p).B(homethingActivationService.o).subscribe(new c(this, characteristic), a.a));
        }
    }

    private void A() {
        BluetoothGatt bluetoothGatt;
        this.a.f();
        if (!(this.r == null || (bluetoothGatt = this.A) == null)) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.A;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
            this.A = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B() {
        Intent intent = new Intent("ACTION_ACTIVATION_UPDATE");
        intent.putExtra("KEY_SENT_WIFI", this.u);
        intent.putExtra("KEY_SENT_SPOTIFY_TOKEN", this.v);
        intent.putExtra("KEY_WAITED_FOR_REBOOT", this.w);
        intent.putExtra("KEY_ACTIVATION_FAILED", this.x);
        intent.putExtra("KEY_PROGRESS", this.y);
        intent.putExtra("KEY_UUID", this.t);
        sendStickyBroadcast(intent);
    }

    static boolean j(HomethingActivationService homethingActivationService, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (homethingActivationService.A == null) {
            Logger.d("ERROR: Gatt is 'null', ignoring read request", new Object[0]);
            return false;
        } else if (bluetoothGattCharacteristic == null) {
            Logger.d("ERROR: Characteristic is 'null', ignoring read request", new Object[0]);
            return false;
        } else {
            boolean add = homethingActivationService.b.add(new k(homethingActivationService, bluetoothGattCharacteristic, bArr));
            if (add) {
                homethingActivationService.z();
            } else {
                Logger.d("ERROR: Could not enqueue read characteristic command", new Object[0]);
            }
            return add;
        }
    }

    static void k(HomethingActivationService homethingActivationService) {
        homethingActivationService.a.b(s.h0(4, TimeUnit.SECONDS, homethingActivationService.p).W(new l(homethingActivationService), false, Integer.MAX_VALUE).q0(h.a).j0(i.a).o0(homethingActivationService.o).subscribe(new f(homethingActivationService)));
    }

    static void r(HomethingActivationService homethingActivationService) {
        homethingActivationService.B = false;
        homethingActivationService.b.poll();
        homethingActivationService.z();
    }

    /* access modifiers changed from: private */
    public void z() {
        if (!this.B) {
            if (this.A == null) {
                Logger.d("ERROR: GATT is 'null' for peripheral, clearing command queue", new Object[0]);
                this.b.clear();
                this.B = false;
            } else if (!this.b.isEmpty()) {
                this.B = true;
                this.c.postDelayed(new j(this.b.peek()), 500);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        A();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        A();
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        if (this.q == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
            this.q = bluetoothManager;
            if (bluetoothManager == null) {
                Logger.d("Unable to initialize BluetoothManager.", new Object[0]);
                this.z = (rt9) intent.getParcelableExtra("com.spotify.music.homething.addnewdevice.scandevices.service.ACTIVATION_INFO");
                this.t = (UUID) intent.getSerializableExtra("com.spotify.music.homething.addnewdevice.scandevices.service.SESSION_UUID");
                io.reactivex.disposables.a aVar = this.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                aVar.b(s.W0(120000, timeUnit).o0(this.o).subscribe(new g(this)));
                this.a.b(s.g0(500, timeUnit).o0(this.o).subscribe(new e(this)));
                String stringExtra = intent.getStringExtra("com.spotify.music.homething.addnewdevice.scandevices.service.DEVICE_ADDRESS");
                if (this.r != null || stringExtra == null) {
                    Logger.d("BluetoothAdapter not initialized or unspecified address.", new Object[0]);
                    return 2;
                } else if (!stringExtra.equals(this.s) || this.A == null) {
                    BluetoothDevice remoteDevice = this.r.getRemoteDevice(stringExtra);
                    if (remoteDevice == null) {
                        Logger.b("Device not found. Unable to connect.", new Object[0]);
                        return 2;
                    }
                    this.A = remoteDevice.connectGatt(this, false, this.D);
                    Logger.b("Trying to create a new connection.", new Object[0]);
                    this.s = stringExtra;
                    return 2;
                } else {
                    Logger.b("Trying to use an existing mBluetoothGatt for connection.", new Object[0]);
                    this.A.connect();
                    return 2;
                }
            }
        }
        BluetoothAdapter adapter = this.q.getAdapter();
        this.r = adapter;
        if (adapter == null) {
            Logger.d("Unable to obtain a BluetoothAdapter.", new Object[0]);
        }
        this.z = (rt9) intent.getParcelableExtra("com.spotify.music.homething.addnewdevice.scandevices.service.ACTIVATION_INFO");
        this.t = (UUID) intent.getSerializableExtra("com.spotify.music.homething.addnewdevice.scandevices.service.SESSION_UUID");
        io.reactivex.disposables.a aVar2 = this.a;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        aVar2.b(s.W0(120000, timeUnit2).o0(this.o).subscribe(new g(this)));
        this.a.b(s.g0(500, timeUnit2).o0(this.o).subscribe(new e(this)));
        String stringExtra2 = intent.getStringExtra("com.spotify.music.homething.addnewdevice.scandevices.service.DEVICE_ADDRESS");
        if (this.r != null) {
        }
        Logger.d("BluetoothAdapter not initialized or unspecified address.", new Object[0]);
        return 2;
    }

    public void u() {
        BluetoothGatt bluetoothGatt;
        if (this.r != null && (bluetoothGatt = this.A) != null) {
            bluetoothGatt.disconnect();
        }
    }

    public /* synthetic */ void v(ArrayList arrayList) {
        if (arrayList.contains(this.s)) {
            this.w = true;
            B();
            A();
            stopSelf();
        }
    }

    public /* synthetic */ void w(Long l) {
        this.y = (int) ((l.longValue() * 50000) / 120000);
        B();
    }

    public /* synthetic */ void x(Long l) {
        Logger.d("We waited for two minutes and it failed. Something went wrong.", new Object[0]);
        this.x = true;
        B();
        A();
        stopSelf();
    }

    public void y(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            bluetoothGattCharacteristic.setValue(bArr);
            bluetoothGattCharacteristic.setWriteType(2);
            if (!this.A.writeCharacteristic(bluetoothGattCharacteristic)) {
                Logger.d("ERROR: writeCharacteristic failed for characteristic: %s", bluetoothGattCharacteristic.getUuid());
                this.B = false;
                this.b.poll();
                z();
                return;
            }
            Logger.b("writing <%s> to characteristic <%s>", new String(bArr, Charsets.UTF_8), bluetoothGattCharacteristic.getUuid());
        }
    }
}
