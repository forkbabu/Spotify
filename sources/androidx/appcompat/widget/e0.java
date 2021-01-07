package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class e0 extends ContextWrapper {
    private static final Object b = new Object();
    private static ArrayList<WeakReference<e0>> c;
    private final Resources a;

    private e0(Context context) {
        super(context);
        int i = n0.a;
        this.a = new g0(this, context.getResources());
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof e0) && !(context.getResources() instanceof g0)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = n0.a;
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (b) {
            ArrayList<WeakReference<e0>> arrayList = c;
            if (arrayList == null) {
                c = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<e0> weakReference = c.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        c.remove(size);
                    }
                }
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    WeakReference<e0> weakReference2 = c.get(size2);
                    e0 e0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (e0Var != null && e0Var.getBaseContext() == context) {
                        return e0Var;
                    }
                }
            }
            e0 e0Var2 = new e0(context);
            c.add(new WeakReference<>(e0Var2));
            return e0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
    }
}
