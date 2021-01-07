package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.appevents.codeless.internal.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: se  reason: default package */
public final class se {
    se() {
    }

    static List<String> a(View view) {
        if (uf.c(se.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            uf.b(th, se.class);
            return null;
        }
    }

    static List<String> b(View view) {
        if (uf.c(se.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View view2 : c.a(view)) {
                arrayList.addAll(b(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            uf.b(th, se.class);
            return null;
        }
    }

    static boolean c(List<String> list, List<String> list2) {
        boolean z;
        if (uf.c(se.class)) {
            return false;
        }
        try {
            for (String str : list) {
                if (!uf.c(se.class)) {
                    try {
                        Iterator<String> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str.contains(it.next())) {
                                    z = true;
                                    continue;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        uf.b(th, se.class);
                    }
                }
                z = false;
                continue;
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            uf.b(th2, se.class);
            return false;
        }
    }
}
