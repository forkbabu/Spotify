package com.facebook.appevents.codeless.internal;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.internal.f0;
import com.facebook.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static final String a = "com.facebook.appevents.codeless.internal.c";
    private static WeakReference<View> b = new WeakReference<>(null);
    private static Method c = null;
    public static final /* synthetic */ int d = 0;

    public static List<View> a(View view) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r5.isInstance(r3) != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.view.View r6) {
        /*
            java.lang.Class<com.facebook.appevents.codeless.internal.c> r0 = com.facebook.appevents.codeless.internal.c.class
            boolean r1 = defpackage.uf.c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = r6 instanceof android.widget.ImageView     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0010
            r1 = 2
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            boolean r3 = r6.isClickable()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0019
            r1 = r1 | 32
        L_0x0019:
            boolean r3 = defpackage.uf.c(r0)     // Catch:{ all -> 0x00a5 }
            r4 = 1
            if (r3 == 0) goto L_0x0021
            goto L_0x004d
        L_0x0021:
            android.view.ViewParent r3 = r6.getParent()     // Catch:{ all -> 0x0049 }
            boolean r5 = r3 instanceof android.widget.AdapterView     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x002a
            goto L_0x0047
        L_0x002a:
            java.lang.String r5 = "android.support.v4.view.NestedScrollingChild"
            java.lang.Class r5 = e(r5)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0039
            boolean r5 = r5.isInstance(r3)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0039
            goto L_0x0047
        L_0x0039:
            java.lang.String r5 = "androidx.core.view.NestedScrollingChild"
            java.lang.Class r5 = e(r5)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x004d
            boolean r3 = r5.isInstance(r3)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x004d
        L_0x0047:
            r3 = 1
            goto L_0x004e
        L_0x0049:
            r3 = move-exception
            defpackage.uf.b(r3, r0)
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0052
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0052:
            boolean r3 = r6 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x0075
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r1 = r1 | r4
            boolean r3 = r6 instanceof android.widget.Button
            if (r3 == 0) goto L_0x006e
            r1 = r1 | 4
            boolean r3 = r6 instanceof android.widget.Switch
            if (r3 == 0) goto L_0x0066
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x006e
        L_0x0066:
            boolean r3 = r6 instanceof android.widget.CheckBox
            if (r3 == 0) goto L_0x006e
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r3
        L_0x006e:
            boolean r6 = r6 instanceof android.widget.EditText
            if (r6 == 0) goto L_0x00a4
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L_0x00a4
        L_0x0075:
            boolean r3 = r6 instanceof android.widget.Spinner
            if (r3 != 0) goto L_0x00a2
            boolean r3 = r6 instanceof android.widget.DatePicker
            if (r3 == 0) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            boolean r3 = r6 instanceof android.widget.RatingBar
            if (r3 == 0) goto L_0x0086
            r6 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r6
            goto L_0x00a4
        L_0x0086:
            boolean r3 = r6 instanceof android.widget.RadioGroup
            if (r3 == 0) goto L_0x008d
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x008d:
            boolean r3 = r6 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x00a4
            java.lang.ref.WeakReference<android.view.View> r3 = com.facebook.appevents.codeless.internal.c.b
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            boolean r6 = m(r6, r3)
            if (r6 == 0) goto L_0x00a4
            r1 = r1 | 64
            goto L_0x00a4
        L_0x00a2:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L_0x00a4:
            return r1
        L_0x00a5:
            r6 = move-exception
            defpackage.uf.b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.c.b(android.view.View):int");
    }

    public static JSONObject c(View view) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                o(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> a2 = a(view);
                for (int i = 0; i < a2.size(); i++) {
                    jSONArray.put(c(a2.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e) {
                Log.e(a, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    private static JSONObject d(View view) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e) {
                Log.e(a, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    private static Class<?> e(String str) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    public static View.OnClickListener f(View view) {
        Field declaredField;
        if (uf.c(c.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    public static View.OnTouchListener g(View view) {
        Field declaredField;
        if (uf.c(c.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (NoSuchFieldException unused) {
            boolean z = k.n;
        } catch (ClassNotFoundException unused2) {
            boolean z2 = k.n;
        } catch (IllegalAccessException unused3) {
            boolean z3 = k.n;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
        return null;
    }

    public static String h(View view) {
        CharSequence charSequence;
        if (uf.c(c.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else {
                charSequence = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    public static ViewGroup i(View view) {
        if (uf.c(c.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd A[Catch:{ all -> 0x00e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(android.view.View r9) {
        /*
            java.lang.Class<com.facebook.appevents.codeless.internal.c> r0 = com.facebook.appevents.codeless.internal.c.class
            boolean r1 = defpackage.uf.c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = r9 instanceof android.widget.TextView     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x0029
            r1 = r9
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x00e2 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ all -> 0x00e2 }
            boolean r3 = r9 instanceof android.widget.Switch     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x00d8
            android.widget.Switch r9 = (android.widget.Switch) r9     // Catch:{ all -> 0x00e2 }
            boolean r9 = r9.isChecked()     // Catch:{ all -> 0x00e2 }
            if (r9 == 0) goto L_0x0024
            java.lang.String r9 = "1"
            goto L_0x0026
        L_0x0024:
            java.lang.String r9 = "0"
        L_0x0026:
            r1 = r9
            goto L_0x00d8
        L_0x0029:
            boolean r1 = r9 instanceof android.widget.Spinner     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x0043
            r1 = r9
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch:{ all -> 0x00e2 }
            int r1 = r1.getCount()     // Catch:{ all -> 0x00e2 }
            if (r1 <= 0) goto L_0x00d7
            android.widget.Spinner r9 = (android.widget.Spinner) r9     // Catch:{ all -> 0x00e2 }
            java.lang.Object r9 = r9.getSelectedItem()     // Catch:{ all -> 0x00e2 }
            if (r9 == 0) goto L_0x00d7
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00e2 }
            goto L_0x0026
        L_0x0043:
            boolean r1 = r9 instanceof android.widget.DatePicker     // Catch:{ all -> 0x00e2 }
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0074
            android.widget.DatePicker r9 = (android.widget.DatePicker) r9     // Catch:{ all -> 0x00e2 }
            int r1 = r9.getYear()     // Catch:{ all -> 0x00e2 }
            int r6 = r9.getMonth()     // Catch:{ all -> 0x00e2 }
            int r9 = r9.getDayOfMonth()     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = "%04d-%02d-%02d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e2 }
            r8[r5] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e2 }
            r8[r4] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            r8[r3] = r9     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x0074:
            boolean r1 = r9 instanceof android.widget.TimePicker     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x009f
            android.widget.TimePicker r9 = (android.widget.TimePicker) r9     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = r9.getCurrentHour()     // Catch:{ all -> 0x00e2 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = r9.getCurrentMinute()     // Catch:{ all -> 0x00e2 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = "%02d:%02d"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e2 }
            r3[r5] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            r3[r4] = r9     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x009f:
            boolean r1 = r9 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00c8
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9     // Catch:{ all -> 0x00e2 }
            int r1 = r9.getCheckedRadioButtonId()     // Catch:{ all -> 0x00e2 }
            int r3 = r9.getChildCount()     // Catch:{ all -> 0x00e2 }
        L_0x00ad:
            if (r5 >= r3) goto L_0x00d7
            android.view.View r4 = r9.getChildAt(r5)     // Catch:{ all -> 0x00e2 }
            int r6 = r4.getId()     // Catch:{ all -> 0x00e2 }
            if (r6 != r1) goto L_0x00c5
            boolean r6 = r4 instanceof android.widget.RadioButton     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00c5
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4     // Catch:{ all -> 0x00e2 }
            java.lang.CharSequence r9 = r4.getText()     // Catch:{ all -> 0x00e2 }
            goto L_0x0026
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00c8:
            boolean r1 = r9 instanceof android.widget.RatingBar     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00d7
            android.widget.RatingBar r9 = (android.widget.RatingBar) r9     // Catch:{ all -> 0x00e2 }
            float r9 = r9.getRating()     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x00d7:
            r1 = r2
        L_0x00d8:
            if (r1 != 0) goto L_0x00dd
            java.lang.String r9 = ""
            goto L_0x00e1
        L_0x00dd:
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            return r9
        L_0x00e2:
            r9 = move-exception
            defpackage.uf.b(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.c.j(android.view.View):java.lang.String");
    }

    public static View k(float[] fArr, View view) {
        View view2;
        if (uf.c(c.class)) {
            return null;
        }
        try {
            l();
            Method method = c;
            if (!(method == null || view == null)) {
                try {
                    View view3 = (View) method.invoke(null, fArr, view);
                    if (view3 == null || view3.getId() <= 0 || (view2 = (View) view3.getParent()) == null) {
                        return null;
                    }
                    return view2;
                } catch (IllegalAccessException unused) {
                    boolean z = k.n;
                } catch (InvocationTargetException unused2) {
                    boolean z2 = k.n;
                }
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    private static void l() {
        if (!uf.c(c.class)) {
            try {
                if (c == null) {
                    try {
                        Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                        c = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (ClassNotFoundException unused) {
                        boolean z = k.n;
                    } catch (NoSuchMethodException unused2) {
                        boolean z2 = k.n;
                    }
                }
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    public static boolean m(View view, View view2) {
        if (uf.c(c.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!uf.c(c.class)) {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{(float) iArr[0], (float) iArr[1]};
                } catch (Throwable th) {
                    uf.b(th, c.class);
                }
            }
            View k = k(fArr, view2);
            if (k == null || k.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            uf.b(th2, c.class);
            return false;
        }
    }

    public static void n(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (!uf.c(c.class)) {
            Object obj = null;
            try {
                field2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                try {
                    field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                field2 = null;
                field = null;
                if (field2 != null) {
                }
                view.setOnClickListener(onClickListener);
                return;
            }
            if (field2 != null || field == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            try {
                field2.setAccessible(true);
                field.setAccessible(true);
                try {
                    field2.setAccessible(true);
                    obj = field2.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                } else {
                    field.set(obj, onClickListener);
                }
            } catch (Exception unused4) {
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    public static void o(View view, JSONObject jSONObject) {
        if (!uf.c(c.class)) {
            try {
                String j = j(view);
                String h = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", b(view));
                jSONObject.put("id", view.getId());
                if (!b.a(view)) {
                    jSONObject.put("text", f0.f(f0.S(j), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", f0.f(f0.S(h), ""));
                if (tag != null) {
                    jSONObject.put("tag", f0.f(f0.S(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", f0.f(f0.S(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", d(view));
            } catch (JSONException unused) {
                boolean z = k.n;
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }
}
