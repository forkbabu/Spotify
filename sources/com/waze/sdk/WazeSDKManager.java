package com.waze.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64;
import defpackage.zif;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

public class WazeSDKManager {
    private static WazeSDKManager q;
    private Messenger a;
    private boolean b;
    private boolean c;
    private Messenger d;
    private f e;
    private String f;
    private Context g;
    private Messenger h;
    private double i = -1.0d;
    private double j = -1.0d;
    private zif k;
    private Intent l;
    private Intent m;
    private boolean n;
    private ServiceConnection o = new a();
    private ServiceConnection p = new b();

    public enum Waze_Message {
        Waze_Message_ROUTE,
        Waze_Message_DISTANCE,
        Waze_Message_ETA,
        Waze_Message_INSTRUCTION,
        Waze_Message_CONNECTION_STATUS,
        Waze_Message_UNUSED,
        Waze_Message_INSTRUCTION_EXIT,
        Waze_Message_DIRECTION_SIDE,
        Waze_Message_ETA_DISTANCE,
        Waze_Message_NAVIGATION_STATUS
    }

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WazeSDKManager.this.k = zif.a.C3(iBinder);
            WazeSDKManager.this.c = true;
            try {
                WazeSDKManager.this.k.G2(WazeSDKManager.this.f);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            WazeSDKManager.this.k = null;
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WazeSDKManager.this.a = new Messenger(iBinder);
            WazeSDKManager.this.b = true;
            if (WazeSDKManager.this.c) {
                WazeSDKManager.l(WazeSDKManager.this);
            }
            WazeSDKManager.i(WazeSDKManager.this, 4, "STATUS", "true");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            WazeSDKManager.this.a = null;
            WazeSDKManager.i(WazeSDKManager.this, 4, "STATUS", "false");
        }
    }

    static class c extends Handler {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String a2;
            if (WazeSDKManager.q.b) {
                switch (message.what) {
                    case 0:
                        String a3 = b.a(message.getData().getByteArray("GeoJson"), this.a);
                        if (a3 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 0, "GeoJson", a3);
                            return;
                        }
                        return;
                    case 1:
                        String a4 = b.a(message.getData().getByteArray("DISTANCE_METERS"), this.a);
                        if (a4 != null && (a2 = b.a(message.getData().getByteArray("DISTANCE_DISPLAY"), this.a)) != null) {
                            WazeSDKManager.o(WazeSDKManager.q, 1, je.F("DISTANCE_METERS", a4, "DISTANCE_DISPLAY", a2));
                            return;
                        }
                        return;
                    case 2:
                        String a5 = b.a(message.getData().getByteArray("ETA_MINUTES"), this.a);
                        if (a5 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 2, "ETA_MINUTES", a5);
                            return;
                        }
                        return;
                    case 3:
                        String a6 = b.a(message.getData().getByteArray("INSTRUCTION"), this.a);
                        if (a6 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 3, "INSTRUCTION", a6);
                            return;
                        }
                        return;
                    case 4:
                        b.a(message.getData().getByteArray("NEXT_TURN"), this.a);
                        return;
                    case 5:
                    case 8:
                    default:
                        return;
                    case 6:
                        String a7 = b.a(message.getData().getByteArray("INSTRUCTION_EXIT"), this.a);
                        if (a7 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 6, "INSTRUCTION_EXIT", a7);
                            return;
                        }
                        return;
                    case 7:
                        String a8 = b.a(message.getData().getByteArray("AGREEMENT"), this.a);
                        if (a8 != null && Boolean.valueOf(a8).booleanValue()) {
                            WazeSDKManager.n(WazeSDKManager.q);
                            return;
                        }
                        return;
                    case 9:
                        String a9 = b.a(message.getData().getByteArray("CONNECTION"), this.a);
                        if (a9 != null && !Boolean.valueOf(a9).booleanValue() && WazeSDKManager.q.b) {
                            WazeSDKManager.i(WazeSDKManager.q, 4, "STATUS", "false");
                            return;
                        }
                        return;
                    case 10:
                        String a10 = b.a(message.getData().getByteArray("LEFT_LANE"), this.a);
                        if (a10 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 7, "LEFT_LANE", a10);
                            return;
                        }
                        return;
                    case 11:
                        String a11 = b.a(message.getData().getByteArray("ETA_DISTANCE"), this.a);
                        if (a11 != null) {
                            WazeSDKManager.i(WazeSDKManager.q, 8, "ETA_DISTANCE", a11);
                            return;
                        }
                        return;
                    case 12:
                        try {
                            WazeSDKManager.q.n = Boolean.valueOf(b.a(message.getData().getByteArray("IS_NAVIGATING"), this.a)).booleanValue();
                        } catch (Exception unused) {
                        }
                        WazeSDKManager.i(WazeSDKManager.q, 9, "IS_NAVIGATING", Boolean.toString(WazeSDKManager.q.n));
                        return;
                }
            }
        }
    }

    static void i(WazeSDKManager wazeSDKManager, int i2, String str, String str2) {
        wazeSDKManager.getClass();
        Message obtain = Message.obtain(null, i2, 0, 0);
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        obtain.setData(bundle);
        try {
            wazeSDKManager.h.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    static void l(WazeSDKManager wazeSDKManager) {
        wazeSDKManager.getClass();
        try {
            wazeSDKManager.c = false;
            Message obtain = Message.obtain(null, 5, 0, 0);
            obtain.setData(wazeSDKManager.e.a());
            obtain.replyTo = wazeSDKManager.d;
            wazeSDKManager.a.send(obtain);
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage("com.waze");
            intent.setData(Uri.parse("waze://?a="));
            wazeSDKManager.g.startActivity(intent);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    static void n(WazeSDKManager wazeSDKManager) {
        wazeSDKManager.getClass();
        double d2 = wazeSDKManager.j;
        if (d2 != -1.0d) {
            double d3 = wazeSDKManager.i;
            if (d3 != -1.0d) {
                wazeSDKManager.s(Uri.parse("waze://?ll=" + d2 + "," + d3 + "&n=T"));
            }
        }
        wazeSDKManager.j = -1.0d;
        wazeSDKManager.i = -1.0d;
    }

    static void o(WazeSDKManager wazeSDKManager, int i2, Bundle bundle) {
        wazeSDKManager.getClass();
        Message obtain = Message.obtain(null, i2, 0, 0);
        obtain.setData(bundle);
        try {
            wazeSDKManager.h.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    public static WazeSDKManager p() {
        if (q == null) {
            q = new WazeSDKManager();
        }
        return q;
    }

    private void s(Uri uri) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.waze", "com.waze.FreeMapAppActivity"));
        intent.addFlags(268435456);
        intent.setData(uri);
        this.g.startActivity(intent);
    }

    public boolean q(Context context, Messenger messenger, f fVar) {
        String str;
        this.g = context.getApplicationContext();
        this.h = messenger;
        this.e = fVar;
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            str = Base64.encodeToString(instance.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            str = null;
        }
        this.f = str;
        this.d = new Messenger(new c(this.f));
        Intent intent = new Intent();
        this.m = intent;
        intent.setComponent(new ComponentName("com.waze", "com.waze.AIDLService"));
        this.g.bindService(this.m, this.o, 1);
        Intent intent2 = new Intent();
        this.l = intent2;
        intent2.setComponent(new ComponentName("com.waze", "com.waze.BoundService"));
        this.g.bindService(this.l, this.p, 1);
        return true;
    }

    public void r() {
        s(null);
    }

    public void t() {
        if (this.b) {
            this.b = false;
            this.j = -1.0d;
            this.i = -1.0d;
            this.f = null;
            this.g.unbindService(this.p);
            this.g.stopService(this.l);
            this.g.unbindService(this.o);
            this.g.stopService(this.m);
        }
    }
}
