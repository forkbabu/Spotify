package defpackage;

import defpackage.x60;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x60  reason: default package */
public abstract class x60<T extends x60> {
    private final JSONObject a = new JSONObject();

    public String a() {
        return this.a.toString();
    }

    /* access modifiers changed from: protected */
    public T b(String str, int i) {
        try {
            this.a.put(str, i);
        } catch (JSONException e) {
            e.getMessage();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public T c(String str, String str2) {
        if (str2 != null) {
            try {
                this.a.put(str, str2);
            } catch (JSONException e) {
                e.getMessage();
            }
            return this;
        }
        throw new IllegalArgumentException(je.x0(str, " value is null"));
    }

    /* access modifiers changed from: protected */
    public void d(String str) {
        if (this.a.has(str)) {
            this.a.remove(str);
        }
    }
}
