package defpackage;

import android.text.TextUtils;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.android.flags.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hx9  reason: default package */
class hx9 extends uw9 {
    hx9() {
    }

    private static List<String> d(Map<String, Serializable> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=\"" + entry.getValue().toString() + '\"');
        }
        return arrayList;
    }

    @Override // defpackage.uw9, defpackage.xw9
    public void b(FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        List<String> d;
        Map<String, Serializable> b = f.b();
        synchronized (b) {
            d = d(b);
        }
        ArrayList arrayList = (ArrayList) d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i2 += str.length() + 1;
            if (i2 < 1024) {
                arrayList3.add(str);
            } else {
                arrayList2.add(TextUtils.join(",", arrayList3));
                arrayList3.clear();
                arrayList3.add(str);
                i2 = str.length() + 1;
            }
        }
        if (arrayList3.size() > 0) {
            arrayList2.add(TextUtils.join(",", arrayList3));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList2.size());
        while (i < arrayList2.size()) {
            linkedHashMap.put(i == arrayList2.size() + -1 ? je.q0("flag-set-", i, "-most-recently-read") : i == 0 ? "flag-set-0-least-recently-read" : je.p0("flag-set-", i), arrayList2.get(i));
            i++;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            firebaseCrashlytics.setCustomKey((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
