package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.window.extensions.ExtensionDeviceState;
import androidx.window.extensions.ExtensionDisplayFeature;
import androidx.window.extensions.ExtensionInterface;
import androidx.window.extensions.ExtensionProvider;
import androidx.window.extensions.ExtensionWindowLayoutInfo;
import defpackage.p8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n8  reason: default package */
final class n8 implements p8 {
    private ExtensionInterface a;

    /* renamed from: n8$a */
    class a implements ExtensionInterface.ExtensionCallback {
        a(n8 n8Var, p8.a aVar) {
        }
    }

    n8(Context context) {
        ExtensionInterface extensionImpl = ExtensionProvider.getExtensionImpl(context);
        this.a = extensionImpl;
        if (extensionImpl == null) {
            throw new IllegalArgumentException("Extension provider returned null");
        }
    }

    private static m8 f(ExtensionDisplayFeature extensionDisplayFeature) {
        return new m8(extensionDisplayFeature.getBounds(), extensionDisplayFeature.getType());
    }

    private static List<m8> g(ExtensionWindowLayoutInfo extensionWindowLayoutInfo) {
        ArrayList arrayList = new ArrayList();
        List<ExtensionDisplayFeature> displayFeatures = extensionWindowLayoutInfo.getDisplayFeatures();
        if (displayFeatures == null) {
            return arrayList;
        }
        for (ExtensionDisplayFeature extensionDisplayFeature : displayFeatures) {
            arrayList.add(f(extensionDisplayFeature));
        }
        return arrayList;
    }

    static s8 h() {
        try {
            String apiVersion = ExtensionProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                return s8.g(apiVersion);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    private static int i(ExtensionDeviceState extensionDeviceState) {
        int posture = extensionDeviceState.getPosture();
        if (posture > 4) {
            return 0;
        }
        return posture;
    }

    @Override // defpackage.p8
    public l8 a() {
        ExtensionDeviceState deviceState = this.a.getDeviceState();
        if (deviceState == null) {
            return new l8(0);
        }
        return new l8(i(deviceState));
    }

    @Override // defpackage.p8
    public void b(p8.a aVar) {
        this.a.setExtensionCallback(new a(this, aVar));
    }

    @Override // defpackage.p8
    public u8 c(IBinder iBinder) {
        ExtensionWindowLayoutInfo windowLayoutInfo = this.a.getWindowLayoutInfo(iBinder);
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
            Class<?> returnType = this.a.getClass().getMethod("setExtensionCallback", ExtensionInterface.ExtensionCallback.class).getReturnType();
            if (returnType.equals(Void.TYPE)) {
                this.a.getDeviceState();
                this.a.onDeviceStateListenersChanged(true);
                Class<?> returnType2 = this.a.getClass().getMethod("getWindowLayoutInfo", IBinder.class).getReturnType();
                if (returnType2.equals(ExtensionWindowLayoutInfo.class)) {
                    Class<?> returnType3 = this.a.getClass().getMethod("onWindowLayoutChangeListenerAdded", IBinder.class).getReturnType();
                    if (returnType3.equals(Void.TYPE)) {
                        Class<?> returnType4 = this.a.getClass().getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class).getReturnType();
                        if (returnType4.equals(Void.TYPE)) {
                            new ExtensionDeviceState(0).getPosture();
                            ExtensionDisplayFeature extensionDisplayFeature = new ExtensionDisplayFeature(new Rect(0, 0, 0, 0), 1);
                            extensionDisplayFeature.getBounds();
                            extensionDisplayFeature.getType();
                            new ExtensionWindowLayoutInfo(new ArrayList()).getDisplayFeatures();
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setExtensionCallback': " + returnType);
        } catch (Exception unused) {
            return false;
        }
    }
}
