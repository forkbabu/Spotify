package defpackage;

import com.facebook.internal.f0;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;

/* renamed from: zf  reason: default package */
public final class zf {
    public static void a() {
        File[] fileArr;
        if (k.g() && !f0.A()) {
            File c = InstrumentData.b.c();
            int i = 0;
            if (c == null) {
                fileArr = new File[0];
            } else {
                fileArr = c.listFiles(new yf());
            }
            ArrayList arrayList = new ArrayList();
            for (File file : fileArr) {
                vf vfVar = new vf(file);
                if (vfVar.c()) {
                    arrayList.add(vfVar);
                }
            }
            Collections.sort(arrayList, new wf());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 1000) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            InstrumentData.b.g("error_reports", jSONArray, new xf(arrayList));
        }
    }
}
