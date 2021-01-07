package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public abstract class b {
    int a = -1;
    int b = -1;
    String c = null;
    HashMap<String, ConstraintAttribute> d;

    public abstract void a(HashMap<String, q> hashMap);

    /* access modifiers changed from: package-private */
    public abstract void b(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    public abstract void c(Context context, AttributeSet attributeSet);

    public void d(HashMap<String, Integer> hashMap) {
    }
}
