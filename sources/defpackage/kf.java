package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.appevents.codeless.internal.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kf  reason: default package */
class kf {
    private static final List<Class<? extends View>> a = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    kf() {
    }

    static List<View> a(View view) {
        if (uf.c(kf.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : a) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : c.a(view)) {
                arrayList.addAll(a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            uf.b(th, kf.class);
            return null;
        }
    }

    static JSONObject b(View view, View view2) {
        if (uf.c(kf.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> a2 = c.a(view);
            for (int i = 0; i < a2.size(); i++) {
                jSONArray.put(b(a2.get(i), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            uf.b(th, kf.class);
            return null;
        }
    }

    private static List<String> c(View view) {
        if (uf.c(kf.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : c.a(view)) {
                String j = c.j(view2);
                if (!j.isEmpty()) {
                    arrayList.add(j);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            uf.b(th, kf.class);
            return null;
        }
    }

    static String d(View view) {
        if (uf.c(kf.class)) {
            return null;
        }
        try {
            String j = c.j(view);
            if (!j.isEmpty()) {
                return j;
            }
            return TextUtils.join(" ", c(view));
        } catch (Throwable th) {
            uf.b(th, kf.class);
            return null;
        }
    }

    static void e(View view, JSONObject jSONObject) {
        if (!uf.c(kf.class)) {
            try {
                String j = c.j(view);
                String h = c.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", c.b(view));
                if (!j.isEmpty()) {
                    jSONObject.put("text", j);
                }
                if (!h.isEmpty()) {
                    jSONObject.put("hint", h);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                uf.b(th, kf.class);
            }
        }
    }
}
