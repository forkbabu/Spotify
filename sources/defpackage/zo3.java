package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;
import com.comscore.UsagePropertiesAutoUpdateMode;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: zo3  reason: default package */
public class zo3 implements Handler.Callback {
    private Handler a;
    private final a b;
    private final Context c;
    private boolean f = false;
    private boolean n = false;
    private boolean o = false;

    /* renamed from: zo3$a */
    public static class a {
    }

    public zo3(Application application) {
        a aVar = new a();
        this.c = application;
        this.b = aVar;
    }

    public synchronized void a() {
        if (this.o) {
            this.a.sendEmptyMessage(3);
        }
        this.n = true;
    }

    public synchronized void b() {
        if (this.o) {
            this.a.sendEmptyMessage(4);
        }
        this.n = false;
    }

    public void c() {
        if (this.o && this.f) {
            this.a.sendEmptyMessage(2);
        }
    }

    public void d() {
        if (this.o && !this.f) {
            this.a.sendEmptyMessage(1);
        }
    }

    public synchronized void e(boolean z) {
        if (this.a == null) {
            if (ig0.b()) {
                this.a = new Handler(Looper.getMainLooper(), this);
            } else {
                HandlerThread handlerThread = new HandlerThread("ComScoreBackgroundThread");
                handlerThread.start();
                this.a = new Handler(handlerThread.getLooper(), this);
            }
        }
        this.n = z;
        if (!this.o && z) {
            this.a.sendEmptyMessage(0);
            this.o = true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            a aVar = this.b;
            Context context = this.c;
            aVar.getClass();
            Analytics.getConfiguration().addClient(new PublisherConfiguration.Builder().publisherId("15654041").build());
            Analytics.getConfiguration().setUsagePropertiesAutoUpdateMode(UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND);
            Analytics.start(context);
        } else if (i == 1) {
            this.b.getClass();
            Analytics.notifyUxActive();
            this.f = true;
        } else if (i == 2) {
            this.b.getClass();
            Analytics.notifyUxInactive();
            this.f = false;
        } else if (i == 3) {
            this.b.getClass();
            Analytics.notifyEnterForeground();
        } else if (i != 4) {
            StringBuilder V0 = je.V0("Unexpected message ");
            V0.append(message.what);
            Assertion.p(V0.toString());
        } else {
            this.b.getClass();
            Analytics.notifyExitForeground();
        }
        return true;
    }
}
