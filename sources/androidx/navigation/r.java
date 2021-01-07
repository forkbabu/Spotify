package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.k;
import org.xmlpull.v1.XmlPullParserException;

public final class r {
    private static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    private Context a;
    private w b;

    public r(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
    }

    private static t a(TypedValue typedValue, t tVar, t tVar2, String str, String str2) {
        if (tVar == null || tVar == tVar2) {
            return tVar != null ? tVar : tVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private m b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        int i2;
        int[] iArr = c7.b;
        m a2 = this.b.c(xmlResourceParser.getName()).a();
        a2.t(this.a, attributeSet);
        int i3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        a2.c(string, d(obtainAttributes, resources, i));
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, c7.c);
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i3);
                    String string4 = obtainAttributes2.getString(2);
                    if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                        k.a aVar = new k.a();
                        if (string2 != null) {
                            aVar.d(string2.replace("${applicationId}", this.a.getPackageName()));
                        }
                        if (!TextUtils.isEmpty(string3)) {
                            aVar.b(string3.replace("${applicationId}", this.a.getPackageName()));
                        }
                        if (string4 != null) {
                            aVar.c(string4.replace("${applicationId}", this.a.getPackageName()));
                        }
                        a2.d(aVar.a());
                        obtainAttributes2.recycle();
                    } else {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                } else {
                    if ("action".equals(name)) {
                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, c7.a);
                        int resourceId = obtainAttributes3.getResourceId(0, 0);
                        c cVar = new c(obtainAttributes3.getResourceId(i3, 0));
                        cVar.e(new s(obtainAttributes3.getBoolean(4, false), obtainAttributes3.getResourceId(7, -1), obtainAttributes3.getBoolean(8, false), obtainAttributes3.getResourceId(2, -1), obtainAttributes3.getResourceId(3, -1), obtainAttributes3.getResourceId(5, -1), obtainAttributes3.getResourceId(6, -1)));
                        Bundle bundle = new Bundle();
                        int i4 = 1;
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i4) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3 && "argument".equals(xmlResourceParser.getName())) {
                                TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, iArr);
                                String string5 = obtainAttributes4.getString(0);
                                if (string5 != null) {
                                    g d = d(obtainAttributes4, resources, i);
                                    if (d.c()) {
                                        d.e(string5, bundle);
                                    }
                                    obtainAttributes4.recycle();
                                } else {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                            }
                            depth2 = i2;
                            i4 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            cVar.d(bundle);
                        }
                        a2.u(resourceId, cVar);
                        obtainAttributes3.recycle();
                    } else {
                        i2 = depth2;
                        if ("include".equals(name) && (a2 instanceof o)) {
                            TypedArray obtainAttributes5 = resources.obtainAttributes(attributeSet, x.c);
                            ((o) a2).z(c(obtainAttributes5.getResourceId(0, 0)));
                            obtainAttributes5.recycle();
                        } else if (a2 instanceof o) {
                            ((o) a2).z(b(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    depth2 = i2;
                    i3 = 1;
                }
                i2 = depth2;
                depth2 = i2;
                i3 = 1;
            }
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: androidx.navigation.t<java.lang.Long>, androidx.navigation.t */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.navigation.g d(android.content.res.TypedArray r19, android.content.res.Resources r20, int r21) {
        /*
        // Method dump skipped, instructions count: 651
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.r.d(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.g");
    }

    public o c(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                next = xml.next();
            } catch (Exception e) {
                throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
            if (next == 2 || next == 1) {
                break;
            }
        }
        if (next == 2) {
            String name = xml.getName();
            m b2 = b(resources, xml, asAttributeSet, i);
            if (b2 instanceof o) {
                o oVar = (o) b2;
                xml.close();
                return oVar;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }
}
