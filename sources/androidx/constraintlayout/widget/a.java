package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a {
    private final ConstraintLayout a;
    int b = -1;
    int c = -1;
    private SparseArray<C0023a> d = new SparseArray<>();
    private SparseArray<b> e = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public static class C0023a {
        int a;
        ArrayList<b> b = new ArrayList<>();
        int c = -1;
        b d;

        public C0023a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 1) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        b bVar = new b();
                        this.d = bVar;
                        bVar.h(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        float a = Float.NaN;
        float b = Float.NaN;
        float c = Float.NaN;
        float d = Float.NaN;
        int e = -1;
        b f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        b bVar = new b();
                        this.f = bVar;
                        bVar.h(context, this.e);
                    }
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f2, float f3) {
            if (!Float.isNaN(this.a) && f2 < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f3 < this.b) {
                return false;
            }
            if (!Float.isNaN(this.c) && f2 > this.c) {
                return false;
            }
            if (Float.isNaN(this.d) || f3 <= this.d) {
                return true;
            }
            return false;
        }
    }

    a(Context context, ConstraintLayout constraintLayout, int i) {
        char c2;
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0023a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (!(c2 == 0 || c2 == 1)) {
                        if (c2 == 2) {
                            C0023a aVar2 = new C0023a(context, xml);
                            this.d.put(aVar2.a, aVar2);
                            aVar = aVar2;
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.b.add(bVar);
                            }
                        } else if (c2 == 4) {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        b bVar = new b();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                bVar.z(context, xmlPullParser);
                this.e.put(identifier, bVar);
                return;
            }
        }
    }

    public void b(int i, float f, float f2) {
        b bVar;
        C0023a aVar;
        int a2;
        b bVar2;
        int i2 = this.b;
        if (i2 == i) {
            if (i == -1) {
                aVar = this.d.valueAt(0);
            } else {
                aVar = this.d.get(i2);
            }
            int i3 = this.c;
            if ((i3 == -1 || !aVar.b.get(i3).a(f, f2)) && this.c != (a2 = aVar.a(f, f2))) {
                if (a2 == -1) {
                    bVar2 = null;
                } else {
                    bVar2 = aVar.b.get(a2).f;
                }
                if (a2 != -1) {
                    int i4 = aVar.b.get(a2).e;
                }
                if (bVar2 != null) {
                    this.c = a2;
                    bVar2.c(this.a);
                    return;
                }
                return;
            }
            return;
        }
        this.b = i;
        C0023a aVar2 = this.d.get(i);
        int a3 = aVar2.a(f, f2);
        if (a3 == -1) {
            bVar = aVar2.d;
        } else {
            bVar = aVar2.b.get(a3).f;
        }
        if (a3 != -1) {
            int i5 = aVar2.b.get(a3).e;
        }
        if (bVar != null) {
            this.c = a3;
            bVar.c(this.a);
        }
    }
}
