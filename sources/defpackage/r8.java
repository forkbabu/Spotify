package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.p8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r8  reason: default package */
final class r8 implements p8 {
    private SidecarInterface a;

    /* renamed from: r8$a */
    class a implements SidecarInterface.SidecarCallback {
        a(r8 r8Var, p8.a aVar) {
        }
    }

    r8(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context);
        this.a = sidecarImpl;
        if (sidecarImpl == null) {
            throw new IllegalArgumentException("Sidecar provider returned null");
        }
    }

    private static m8 f(SidecarDisplayFeature sidecarDisplayFeature) {
        return new m8(sidecarDisplayFeature.getRect(), sidecarDisplayFeature.getType());
    }

    private static List<m8> g(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        ArrayList arrayList = new ArrayList();
        if (sidecarWindowLayoutInfo.displayFeatures == null) {
            return arrayList;
        }
        for (SidecarDisplayFeature sidecarDisplayFeature : sidecarWindowLayoutInfo.displayFeatures) {
            arrayList.add(f(sidecarDisplayFeature));
        }
        return arrayList;
    }

    static s8 h() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                return s8.g(apiVersion);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    private static int i(SidecarDeviceState sidecarDeviceState) {
        int i = sidecarDeviceState.posture;
        if (i > 4) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.p8
    public l8 a() {
        SidecarDeviceState deviceState = this.a.getDeviceState();
        if (deviceState == null) {
            return new l8(0);
        }
        return new l8(i(deviceState));
    }

    @Override // defpackage.p8
    public void b(p8.a aVar) {
        this.a.setSidecarCallback(new a(this, aVar));
    }

    @Override // defpackage.p8
    public u8 c(IBinder iBinder) {
        SidecarWindowLayoutInfo windowLayoutInfo = this.a.getWindowLayoutInfo(iBinder);
        if (windowLayoutInfo == null) {
            return new u8(new ArrayList());
        }
        return new u8(g(windowLayoutInfo));
    }

    @Override // defpackage.p8
    public void d(boolean z) {
        this.a.onDeviceStateListenersChanged(z);
    }

    @Override // defpackage.p8
    public boolean e() {
        try {
            Class<?> returnType = this.a.getClass().getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class).getReturnType();
            if (returnType.equals(Void.TYPE)) {
                this.a.getDeviceState();
                this.a.onDeviceStateListenersChanged(true);
                Class<?> returnType2 = this.a.getClass().getMethod("getWindowLayoutInfo", IBinder.class).getReturnType();
                if (returnType2.equals(SidecarWindowLayoutInfo.class)) {
                    Class<?> returnType3 = this.a.getClass().getMethod("onWindowLayoutChangeListenerAdded", IBinder.class).getReturnType();
                    if (returnType3.equals(Void.TYPE)) {
                        Class<?> returnType4 = this.a.getClass().getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class).getReturnType();
                        if (returnType4.equals(Void.TYPE)) {
                            new SidecarDeviceState().posture = 3;
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            sidecarDisplayFeature.setRect(sidecarDisplayFeature.getRect());
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            List list = new SidecarWindowLayoutInfo().displayFeatures;
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
        } catch (Exception unused) {
            return false;
        }
    }
}
