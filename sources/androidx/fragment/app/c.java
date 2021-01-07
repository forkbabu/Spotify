package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.o;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c extends ComponentActivity implements a.b, a.c {
    final j p = j.b(new a());
    final o q = new o(this);
    boolean r;
    boolean s;
    boolean t = true;
    boolean u;
    boolean v;
    boolean w;
    int x;
    u1<String> y;

    class a extends l<c> implements i0, androidx.activity.c {
        public a() {
            super(c.this);
        }

        @Override // androidx.lifecycle.n
        public Lifecycle A() {
            return c.this.q;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher S0() {
            return c.this.S0();
        }

        @Override // androidx.lifecycle.i0
        public h0 Z() {
            return c.this.Z();
        }

        @Override // androidx.fragment.app.i
        public View a(int i) {
            return c.this.findViewById(i);
        }

        @Override // androidx.fragment.app.i
        public boolean b() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.l
        public void f(Fragment fragment) {
            c.this.x0(fragment);
        }

        @Override // androidx.fragment.app.l
        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            c.this.dump(str, null, printWriter, strArr);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.fragment.app.l
        public c h() {
            return c.this;
        }

        @Override // androidx.fragment.app.l
        public LayoutInflater i() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        @Override // androidx.fragment.app.l
        public void j(Fragment fragment, String[] strArr, int i) {
            c.this.C0(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.l
        public boolean k(Fragment fragment) {
            return !c.this.isFinishing();
        }

        @Override // androidx.fragment.app.l
        public void l(Fragment fragment, Intent intent, int i, Bundle bundle) {
            c.this.E0(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.l
        public void m(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            c.this.F0(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        @Override // androidx.fragment.app.l
        public void n() {
            c.this.G0();
        }
    }

    private int s0(Fragment fragment) {
        if (this.y.q() < 65534) {
            while (this.y.j(this.x) >= 0) {
                this.x = (this.x + 1) % 65534;
            }
            int i = this.x;
            this.y.n(i, fragment.n);
            this.x = (this.x + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void t0(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private static boolean w0(o oVar, Lifecycle.State state) {
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        boolean z = false;
        for (Fragment fragment : oVar.b0()) {
            if (fragment != null) {
                l<?> lVar = fragment.B;
                if ((lVar == null ? null : lVar.h()) != null) {
                    z |= w0(fragment.E2(), state);
                }
                k0 k0Var = fragment.a0;
                if (k0Var != null) {
                    if (k0Var.A().b().compareTo(state2) >= 0) {
                        fragment.a0.d(state);
                        z = true;
                    }
                }
                if (fragment.Z.b().compareTo(state2) >= 0) {
                    fragment.Z.k(state);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.i(this, strArr, i);
            return;
        }
        t0(i);
        try {
            this.u = true;
            androidx.core.app.a.i(this, strArr, ((s0(fragment) + 1) << 16) + (i & AudioDriver.SPOTIFY_MAX_VOLUME));
            this.u = false;
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    public void E0(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.w = true;
        if (i == -1) {
            try {
                int i2 = androidx.core.app.a.c;
                int i3 = Build.VERSION.SDK_INT;
                startActivityForResult(intent, -1, bundle);
            } finally {
                this.w = false;
            }
        } else {
            t0(i);
            int s0 = ((s0(fragment) + 1) << 16) + (i & AudioDriver.SPOTIFY_MAX_VOLUME);
            int i4 = androidx.core.app.a.c;
            int i5 = Build.VERSION.SDK_INT;
            startActivityForResult(intent, s0, bundle);
            this.w = false;
        }
    }

    public void F0(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.v = true;
        if (i == -1) {
            try {
                int i5 = androidx.core.app.a.c;
                int i6 = Build.VERSION.SDK_INT;
                startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.v = false;
            }
        } else {
            t0(i);
            int s0 = ((s0(fragment) + 1) << 16) + (i & AudioDriver.SPOTIFY_MAX_VOLUME);
            int i7 = androidx.core.app.a.c;
            int i8 = Build.VERSION.SDK_INT;
            startIntentSenderForResult(intentSender, s0, intent, i2, i3, i4, bundle);
            this.v = false;
        }
    }

    @Deprecated
    public void G0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.a.c
    public final void U(int i) {
        if (!this.u && i != -1) {
            t0(i);
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.r);
        printWriter.print(" mResumed=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        if (getApplication() != null) {
            c6.c(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.p.u().J(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment t2;
        this.p.v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f = this.y.f(i4);
            this.y.o(i4);
            if (f != null && (t2 = this.p.t(f)) != null) {
                t2.n3(i & AudioDriver.SPOTIFY_MAX_VOLUME, i2, intent);
                return;
            }
            return;
        }
        int i5 = androidx.core.app.a.c;
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p.v();
        this.p.d(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.p.a(null);
        if (bundle != null) {
            this.p.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.x = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.y = new u1<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.y.n(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.y == null) {
            this.y = new u1<>(10);
            this.x = 0;
        }
        super.onCreate(bundle);
        this.q.f(Lifecycle.Event.ON_CREATE);
        this.p.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.p.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View w2 = this.p.w(view, str, context, attributeSet);
        return w2 == null ? super.onCreateView(view, str, context, attributeSet) : w2;
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.p.h();
        this.q.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.p.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.p.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.p.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.p.j(z);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.p.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.p.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.s = false;
        this.p.m();
        this.q.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.p.n(z);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        z0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.p.o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment t2;
        this.p.v();
        int i2 = (i >> 16) & AudioDriver.SPOTIFY_MAX_VOLUME;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String f = this.y.f(i3);
            this.y.o(i3);
            if (f != null && (t2 = this.p.t(f)) != null) {
                t2.L3(i & AudioDriver.SPOTIFY_MAX_VOLUME, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.s = true;
        this.p.v();
        this.p.s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (w0(v0(), Lifecycle.State.CREATED));
        this.q.f(Lifecycle.Event.ON_STOP);
        Parcelable y2 = this.p.y();
        if (y2 != null) {
            bundle.putParcelable("android:support:fragments", y2);
        }
        if (this.y.q() > 0) {
            bundle.putInt("android:support:next_request_index", this.x);
            int[] iArr = new int[this.y.q()];
            String[] strArr = new String[this.y.q()];
            for (int i = 0; i < this.y.q(); i++) {
                iArr[i] = this.y.m(i);
                strArr[i] = this.y.r(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.t = false;
        if (!this.r) {
            this.r = true;
            this.p.c();
        }
        this.p.v();
        this.p.s();
        this.q.f(Lifecycle.Event.ON_START);
        this.p.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.p.v();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.t = true;
        do {
        } while (w0(v0(), Lifecycle.State.CREATED));
        this.p.r();
        this.q.f(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.w && i != -1) {
            t0(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.v && i != -1) {
            t0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public o v0() {
        return this.p.u();
    }

    public void x0(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    public void z0() {
        this.q.f(Lifecycle.Event.ON_RESUME);
        this.p.p();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View w2 = this.p.w(null, str, context, attributeSet);
        return w2 == null ? super.onCreateView(str, context, attributeSet) : w2;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.w && i != -1) {
            t0(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.v && i != -1) {
            t0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
