package defpackage;

import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vf  reason: default package */
public final class vf {
    private String a;
    private String b;
    private Long c;

    public vf(String str) {
        this.c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.c);
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    public void a() {
        InstrumentData.b.b(this.a);
    }

    public int b(vf vfVar) {
        Long l = this.c;
        if (l == null) {
            return -1;
        }
        Long l2 = vfVar.c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    public boolean c() {
        return (this.b == null || this.c == null) ? false : true;
    }

    public void d() {
        if ((this.b == null || this.c == null) ? false : true) {
            InstrumentData.b.i(this.a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public vf(File file) {
        String name = file.getName();
        this.a = name;
        JSONObject f = InstrumentData.b.f(name, true);
        if (f != null) {
            this.c = Long.valueOf(f.optLong("timestamp", 0));
            this.b = f.optString("error_message", null);
        }
    }
}
