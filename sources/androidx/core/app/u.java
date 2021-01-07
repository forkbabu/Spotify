package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class u implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    public interface a {
        Intent y();
    }

    private u(Context context) {
        this.b = context;
    }

    public static u h(Context context) {
        return new u(context);
    }

    public u c(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public u d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        this.a.add(intent);
        return this;
    }

    public u e(Activity activity) {
        Intent y = ((a) activity).y();
        if (y == null) {
            y = e2.l(activity);
        }
        if (y != null) {
            ComponentName component = y.getComponent();
            if (component == null) {
                component = y.resolveActivity(this.b.getPackageManager());
            }
            f(component);
            this.a.add(y);
        }
        return this;
    }

    public u f(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent m = e2.m(this.b, componentName);
            while (m != null) {
                this.a.add(size, m);
                m = e2.m(this.b, m.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public PendingIntent i(int i, int i2) {
        if (!this.a.isEmpty()) {
            ArrayList<Intent> arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            int i3 = Build.VERSION.SDK_INT;
            return PendingIntent.getActivities(this.b, i, intentArr, i2, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public void j() {
        if (!this.a.isEmpty()) {
            ArrayList<Intent> arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.b;
            int i = androidx.core.content.a.b;
            int i2 = Build.VERSION.SDK_INT;
            context.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
