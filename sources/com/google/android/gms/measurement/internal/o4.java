package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o4 {
    private final String a;
    private final Bundle b = new Bundle();
    private boolean c;
    private Bundle d;
    private final /* synthetic */ n4 e;

    public o4(n4 n4Var, String str) {
        this.e = n4Var;
        g.i(str);
        this.a = str;
    }

    public final Bundle a() {
        if (!this.c) {
            this.c = true;
            String string = this.e.x().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string2 = jSONObject.getString("n");
                        String string3 = jSONObject.getString("t");
                        char c2 = 65535;
                        int hashCode = string3.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c2 = 0;
                                }
                            } else if (string3.equals("l")) {
                                c2 = 2;
                            }
                        } else if (string3.equals("d")) {
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            bundle.putString(string2, jSONObject.getString("v"));
                        } else if (c2 == 1) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        } else if (c2 != 2) {
                            try {
                                this.e.l().E().b("Unrecognized persisted bundle type. Type", string3);
                            } catch (NumberFormatException | JSONException unused) {
                                this.e.l().E().a("Error reading value from SharedPreferences. Value dropped");
                            }
                        } else {
                            bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                        }
                    }
                    this.d = bundle;
                } catch (JSONException unused2) {
                    this.e.l().E().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.d == null) {
                this.d = this.b;
            }
        }
        return this.d;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.e.x().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            String str = this.a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.e.l().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        this.e.l().E().b("Cannot serialize bundle value to SharedPreferences", e2);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.d = bundle;
    }
}
