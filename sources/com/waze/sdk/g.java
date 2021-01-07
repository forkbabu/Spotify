package com.waze.sdk;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64;
import com.waze.sdk.a;
import java.lang.ref.WeakReference;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.KeyGenerator;

/* access modifiers changed from: package-private */
public class g {
    protected static final ComponentName l = new ComponentName("com.waze", "com.waze.sdk.SdkService");
    private static final e m = new e(null);
    private final Context a;
    private i b;
    private String c;
    private Messenger d;
    private Messenger e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final h i;
    private c j;
    private final ServiceConnection k = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (g.this.e == null) {
                g gVar = g.this;
                g gVar2 = g.this;
                gVar2.getClass();
                gVar.e = new Messenger(new e(gVar2));
            }
            g gVar3 = g.this;
            new b(gVar3, gVar3.c, g.this.b, g.this.e).execute(a.AbstractBinderC0584a.C3(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g.this.f(4);
        }
    }

    private static class b extends AsyncTask<a, Void, Messenger> {
        private final g a;
        private final String b;
        private final i c;
        private final Messenger d;

        b(g gVar, String str, i iVar, Messenger messenger) {
            this.a = gVar;
            this.b = str;
            this.c = iVar;
            this.d = messenger;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Messenger doInBackground(a[] aVarArr) {
            try {
                a aVar = aVarArr[0];
                String str = this.b;
                i iVar = this.c;
                iVar.getClass();
                Bundle bundle = new Bundle();
                PendingIntent pendingIntent = iVar.a;
                if (pendingIntent != null) {
                    bundle.putParcelable("openMeIntent", pendingIntent);
                }
                Integer num = iVar.b;
                if (num != null) {
                    bundle.putInt("themeColor", num.intValue());
                }
                bundle.putInt("versionCode", 10);
                return aVar.l1(str, bundle, this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Messenger messenger) {
            Messenger messenger2 = messenger;
            if (messenger2 != null) {
                this.a.m(messenger2);
            } else {
                this.a.f(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
        void b(String str);

        void c(int i);

        void e(WazeSdkConstants$WazeInstructions wazeSdkConstants$WazeInstructions);

        void f(boolean z);

        void g(boolean z);

        void h(String str, int i);
    }

    /* access modifiers changed from: package-private */
    public interface d extends h, c {
    }

    /* access modifiers changed from: private */
    public static class e implements Iterable<d> {
        private final Set<WeakReference<d>> a = new HashSet();

        /* access modifiers changed from: package-private */
        public class a implements Iterator<d> {
            private Iterator<WeakReference<d>> a;
            private d b;

            a() {
                this.a = e.this.a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.b != null) {
                    return true;
                }
                while (this.a.hasNext()) {
                    d dVar = this.a.next().get();
                    this.b = dVar;
                    if (dVar != null) {
                        return true;
                    }
                    this.a.remove();
                }
                return false;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.Iterator
            public d next() {
                if (this.b == null && !hasNext()) {
                    return null;
                }
                d dVar = this.b;
                this.b = null;
                return dVar;
            }
        }

        e(a aVar) {
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return new a();
        }
    }

    g(Context context, i iVar, h hVar) {
        new WeakReference(this);
        this.a = context.getApplicationContext();
        this.b = iVar;
        this.i = hVar;
        e();
    }

    private void r() {
        Messenger messenger = this.d;
        if (messenger != null) {
            try {
                String str = this.c;
                boolean h2 = h();
                Message obtain = Message.obtain((Handler) null, 102);
                Bundle bundle = new Bundle();
                bundle.putString("token", str);
                bundle.putBoolean("request", h2);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public void e() {
        String str;
        if (!this.g && !this.h) {
            this.h = true;
            try {
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                instance.init(128);
                str = Base64.encodeToString(instance.generateKey().getEncoded(), 0);
            } catch (NoSuchAlgorithmException unused) {
                str = null;
            }
            this.c = str;
            Intent intent = new Intent();
            intent.setComponent(l);
            this.a.bindService(intent, this.k, 1);
            this.f = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        if (this.f) {
            Messenger messenger = this.d;
            if (messenger != null) {
                try {
                    String str = this.c;
                    Message obtain = Message.obtain((Handler) null, 103);
                    Bundle bundle = new Bundle();
                    bundle.putString("token", str);
                    obtain.setData(bundle);
                    messenger.send(obtain);
                } catch (RemoteException unused) {
                }
            }
            this.a.unbindService(this.k);
            this.f = false;
        }
        if (this.g) {
            this.g = false;
            this.h = false;
            this.d = null;
            this.c = null;
            e eVar = m;
            eVar.getClass();
            e.a aVar = new e.a();
            while (aVar.hasNext()) {
                ((d) aVar.next()).a(i2);
            }
            h hVar = this.i;
            if (hVar != null) {
                hVar.a(i2);
            }
        }
    }

    public boolean g() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        if (this.j == null) {
            e eVar = m;
            eVar.getClass();
            if (!new e.a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void i(String str, int i2) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).h(str, i2);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.h(str, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(WazeSdkConstants$WazeInstructions wazeSdkConstants$WazeInstructions) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).e(wazeSdkConstants$WazeInstructions);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.e(wazeSdkConstants$WazeInstructions);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(boolean z) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).f(z);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.f(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).c(i2);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.c(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Messenger messenger) {
        this.d = messenger;
        this.g = true;
        this.h = false;
        r();
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).d();
        }
        h hVar = this.i;
        if (hVar != null) {
            hVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).b(str);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.b(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z) {
        e eVar = m;
        eVar.getClass();
        e.a aVar = new e.a();
        while (aVar.hasNext()) {
            ((d) aVar.next()).g(z);
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.g(z);
        }
    }

    public boolean p() {
        Messenger messenger = this.d;
        if (messenger == null) {
            return false;
        }
        try {
            String str = this.c;
            Message obtain = Message.obtain((Handler) null, 101);
            Bundle bundle = new Bundle();
            bundle.putString("token", str);
            obtain.setData(bundle);
            messenger.send(obtain);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(c cVar) {
        this.j = cVar;
        r();
    }
}
