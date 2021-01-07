package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    public final String a;
    public final String b;
    public final List<PathComponent> c;
    public final String d;

    public a(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new PathComponent(optJSONArray.getJSONObject(i)));
            }
        }
        this.c = arrayList;
        this.d = jSONObject.optString("path_type", "absolute");
    }
}
