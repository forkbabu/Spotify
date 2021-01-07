package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import defpackage.rrd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: nrd  reason: default package */
public class nrd implements urd {
    private final Map<String, ArrayList<qrd>> a = new HashMap(5);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, java.util.ArrayList<qrd>> */
    /* JADX WARN: Multi-variable type inference failed */
    nrd(Set<prd> set) {
        for (prd prd : set) {
            Map<String, ArrayList<qrd>> map = this.a;
            XmlResourceParser xmlResourceParser = prd.get();
            HashMap hashMap = new HashMap(5);
            try {
                for (int next = xmlResourceParser.next(); next != 1; next = xmlResourceParser.next()) {
                    if (next == 2) {
                        qrd qrd = null;
                        if (xmlResourceParser.getName().equals("signing_certificate")) {
                            qrd = d(xmlResourceParser);
                        } else if (xmlResourceParser.getName().equals("signature")) {
                            qrd = e(xmlResourceParser);
                        }
                        if (qrd != null) {
                            b(qrd, hashMap);
                        }
                    }
                }
            } catch (IOException | XmlPullParserException e) {
                Logger.e(e, "Could not read allowed callers from XML.", new Object[0]);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Collection collection = (Collection) map.get(entry.getKey());
                if (collection != null) {
                    collection.addAll((Collection) entry.getValue());
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private static void b(qrd qrd, HashMap<String, ArrayList<qrd>> hashMap) {
        ArrayList<qrd> arrayList = hashMap.get(qrd.e());
        if (arrayList == null) {
            arrayList = new ArrayList<>(5);
            hashMap.put(qrd.e(), arrayList);
        }
        arrayList.add(qrd);
    }

    private static PackageInfo c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d("Package %s is not found", str);
            return null;
        }
    }

    private static qrd d(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
        Set<String> emptySet = Collections.emptySet();
        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "allowedResources");
        if (!MoreObjects.isNullOrEmpty(attributeValue3)) {
            emptySet = Collections2.newHashSet(attributeValue3.split(","));
        }
        String replaceAll = xmlResourceParser.nextText().replaceAll("\\s|\\n", "");
        rrd.b bVar = new rrd.b();
        bVar.c(attributeValue);
        bVar.d(attributeValue2);
        bVar.e(attributeBooleanValue);
        bVar.f(replaceAll);
        bVar.a(emptySet);
        return bVar.b();
    }

    private static qrd e(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        Set<String> emptySet = Collections.emptySet();
        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "allowedResources");
        if (!MoreObjects.isNullOrEmpty(attributeValue3)) {
            emptySet = Collections2.newHashSet(attributeValue3.split(","));
        }
        int next = xmlResourceParser.next();
        String str = "";
        boolean z = false;
        while (next != 3) {
            z = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
            str = xmlResourceParser.nextText().replaceAll("\\s|\\n", "").replaceAll(":", "").toLowerCase(Locale.ENGLISH);
            next = xmlResourceParser.next();
        }
        rrd.b bVar = new rrd.b();
        bVar.c(attributeValue);
        bVar.d(attributeValue2);
        bVar.e(z);
        bVar.f(str);
        bVar.a(emptySet);
        return bVar.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1 A[RETURN] */
    @Override // defpackage.urd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.Context r12, defpackage.trd r13) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrd.a(android.content.Context, trd):boolean");
    }
}
