package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;
import com.google.android.gms.wearable.e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dw  reason: default package */
public final class dw extends c {
    private final int d;

    public dw(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] a = a("data");
        HashMap hashMap = new HashMap(this.d);
        for (int i = 0; i < this.d; i++) {
            cw cwVar = new cw(this.a, this.b + i);
            if (cwVar.d() != null) {
                hashMap.put(cwVar.d(), cwVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(Uri.parse(c("path")));
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        if (a == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(a.length);
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = hashMap.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !hashMap.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String id = ((e) entry.getValue()).getId();
                StringBuilder sb5 = new StringBuilder(String.valueOf(id).length() + String.valueOf(str2).length() + str.length() + 2);
                sb5.append(str);
                sb5.append(str2);
                sb5.append(": ");
                sb5.append(id);
                sb.append(sb5.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
