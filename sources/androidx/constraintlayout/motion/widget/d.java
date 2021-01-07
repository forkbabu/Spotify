package androidx.constraintlayout.motion.widget;

import java.util.HashMap;

public class d {
    HashMap<Object, HashMap<String, float[]>> a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public float a(Object obj, String str, int i) {
        if (!this.a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> hashMap = this.a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = hashMap.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }
}
