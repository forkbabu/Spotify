package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.wearable.input.RotaryEncoderHelper;

/* renamed from: z  reason: default package */
public class z {
    public static float a(MotionEvent motionEvent) {
        if (d()) {
            return RotaryEncoderHelper.getRotaryAxisValue(motionEvent);
        }
        return 0.0f;
    }

    @Deprecated
    public static float b(Context context) {
        if (d()) {
            return RotaryEncoderHelper.getScaledScrollFactor(context);
        }
        return 64.0f;
    }

    public static boolean c(MotionEvent motionEvent) {
        return d() && RotaryEncoderHelper.isFromRotaryEncoder(motionEvent);
    }

    private static boolean d() {
        return a0.a() >= 1;
    }
}
