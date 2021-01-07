package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.Executor;

/* renamed from: v8  reason: default package */
public final class v8 {
    private Context a;
    private t8 b;

    public v8(Context context, t8 t8Var) {
        if (a(context) != null) {
            this.a = context;
            this.b = q8.b(context);
            return;
        }
        throw new IllegalArgumentException("Used non-visual Context to obtain an instance of WindowManager. Please use an Activity or a ContextWrapper around one instead.");
    }

    static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public l8 b() {
        return ((q8) this.b).a();
    }

    public u8 c() {
        return ((q8) this.b).c(this.a);
    }

    public void d(Executor executor, s3<l8> s3Var) {
        ((q8) this.b).d(executor, s3Var);
    }

    public void e(s3<l8> s3Var) {
        ((q8) this.b).e(s3Var);
    }
}
