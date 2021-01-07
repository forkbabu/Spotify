package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g {
    static HashMap<String, Constructor<? extends b>> b;
    private HashMap<Integer, ArrayList<b>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends b>> hashMap = new HashMap<>();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", c.class.getConstructor(new Class[0]));
            b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            b.put("KeyCycle", e.class.getConstructor(new Class[0]));
            b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        b bVar;
        Exception e;
        try {
            int eventType = xmlPullParser.getEventType();
            b bVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (b.containsKey(name)) {
                        try {
                            bVar = (b) b.get(name).newInstance(new Object[0]);
                            try {
                                bVar.c(context, Xml.asAttributeSet(xmlPullParser));
                                b(bVar);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bVar = bVar2;
                            Log.e("KeyFrames", "unable to create ", e);
                            bVar2 = bVar;
                            eventType = xmlPullParser.next();
                        }
                        bVar2 = bVar;
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || bVar2 == null || (hashMap = bVar2.d) == null)) {
                        ConstraintAttribute.f(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    private void b(b bVar) {
        if (!this.a.containsKey(Integer.valueOf(bVar.b))) {
            this.a.put(Integer.valueOf(bVar.b), new ArrayList<>());
        }
        this.a.get(Integer.valueOf(bVar.b)).add(bVar);
    }

    public void a(m mVar) {
        ArrayList<b> arrayList = this.a.get(Integer.valueOf(mVar.b));
        if (arrayList != null) {
            mVar.b(arrayList);
        }
        ArrayList<b> arrayList2 = this.a.get(-1);
        if (arrayList2 != null) {
            Iterator<b> it = arrayList2.iterator();
            while (it.hasNext()) {
                b next = it.next();
                String str = ((ConstraintLayout.LayoutParams) mVar.a.getLayoutParams()).U;
                String str2 = next.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    mVar.a(next);
                }
            }
        }
    }
}
