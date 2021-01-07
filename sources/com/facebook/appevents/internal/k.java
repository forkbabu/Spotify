package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class k {
    private static final HashMap<String, Method> a = new HashMap<>();
    private static final HashMap<String, Class<?>> b = new HashMap<>();
    private static final String c = com.facebook.k.d().getPackageName();
    private static final SharedPreferences d = com.facebook.k.d().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences e = com.facebook.k.d().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    public static final /* synthetic */ int f = 0;

    static Object a(Context context, IBinder iBinder) {
        return k(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    static void b() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = d;
        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
        if (j == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    private static ArrayList<String> c(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = e.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    private static Class<?> d(Context context, String str) {
        HashMap<String, Class<?>> hashMap = b;
        Class<?> cls = hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            hashMap.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    private static Method e(Class<?> cls, String str) {
        HashMap<String, Method> hashMap = a;
        Method method = hashMap.get(str);
        if (method != null) {
            return method;
        }
        Class<?>[] clsArr = null;
        char c2 = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c2 == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (c2 == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (c2 == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (c2 == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            hashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return method;
        }
    }

    static ArrayList<String> f(Context context, Object obj) {
        Class<?> d2;
        ArrayList<String> stringArrayList;
        long j;
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null || (d2 = d(context, "com.android.vending.billing.IInAppBillingService")) == null || e(d2, "getPurchaseHistory") == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (l(context, obj, "inapp").booleanValue()) {
            char c2 = 0;
            String str = null;
            int i = 0;
            boolean z = false;
            while (true) {
                Object[] objArr = new Object[5];
                objArr[c2] = 6;
                objArr[1] = c;
                objArr[2] = "inapp";
                objArr[3] = str;
                objArr[4] = new Bundle();
                Object k = k(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                if (k != null) {
                    long j2 = 1000;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) k;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                try {
                                    j = 1000;
                                    try {
                                        if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                            z = true;
                                            break;
                                        }
                                        arrayList2.add(next);
                                        i++;
                                        j2 = j;
                                    } catch (JSONException unused) {
                                        continue;
                                    }
                                } catch (JSONException unused2) {
                                    j = 1000;
                                }
                            } catch (JSONException unused3) {
                                j = j2;
                            }
                        }
                        str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || str == null || z) {
                            break;
                        }
                        c2 = 0;
                    }
                }
                str = null;
                c2 = 0;
            }
        }
        return c(arrayList2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> g(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = l(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r2] = r7
            r7 = 1
            java.lang.String r8 = com.facebook.appevents.internal.k.c
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = k(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.k.g(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    static ArrayList<String> h(Context context, Object obj) {
        return c(g(context, obj, "inapp"));
    }

    static ArrayList<String> i(Context context, Object obj) {
        return c(g(context, obj, SubSampleInformationBox.TYPE));
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0092: APUT  (r7v3 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r11v1 java.lang.String) */
    static Map<String, String> j(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String string = d.getString(next, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(next, split[1]);
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!hashMap.containsKey(next2)) {
                arrayList2.add(next2);
            }
        }
        HashMap hashMap2 = new HashMap();
        if (obj != null && !arrayList2.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = c;
            objArr[2] = z ? SubSampleInformationBox.TYPE : "inapp";
            objArr[3] = bundle;
            Object k = k(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (k != null) {
                Bundle bundle2 = (Bundle) k;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList2.size() == stringArrayList.size()) {
                        for (i = 0; i < arrayList2.size(); i++) {
                            hashMap2.put(arrayList2.get(i), stringArrayList.get(i));
                        }
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor edit = d.edit();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        edit.putString((String) entry.getKey(), currentTimeMillis2 + ";" + ((String) entry.getValue()));
                    }
                    edit.apply();
                }
            }
        }
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    private static Object k(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e2;
        Class<?> d2 = d(context, str);
        if (d2 == null || (e2 = e(d2, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = d2.cast(obj);
        }
        try {
            return e2.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Boolean l(Context context, Object obj, String str) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Object k = k(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, c, str});
        if (k != null && ((Integer) k).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
