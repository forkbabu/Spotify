package com.facebook.login;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class s {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        if (!(xmlPullParser.getEventType() == 3) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (!(xmlPullParser.getEventType() == 2) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static void d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(je.p0("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }
}
