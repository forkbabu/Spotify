package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* renamed from: g0  reason: default package */
public final class g0 {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder V0 = je.V0(".(");
        V0.append(stackTraceElement.getFileName());
        V0.append(":");
        V0.append(stackTraceElement.getLineNumber());
        V0.append(")");
        return V0.toString();
    }

    public static String b(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return je.p0("?", i);
        }
    }

    public static String c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String d(MotionLayout motionLayout, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i);
    }
}
