package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* access modifiers changed from: package-private */
public class q0 implements r0 {
    private final WindowId a;

    q0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof q0) && ((q0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
