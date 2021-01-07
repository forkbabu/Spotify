package defpackage;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: q40  reason: default package */
public class q40 {
    protected static Logger a = Logger.getLogger(q40.class.getName());
    protected static Map<Integer, Map<Integer, Class<? extends g40>>> b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(k40.class);
        hashSet.add(s40.class);
        hashSet.add(g40.class);
        hashSet.add(n40.class);
        hashSet.add(p40.class);
        hashSet.add(r40.class);
        hashSet.add(f40.class);
        hashSet.add(o40.class);
        hashSet.add(m40.class);
        hashSet.add(j40.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class<? extends g40> cls = (Class) it.next();
            l40 l40 = (l40) cls.getAnnotation(l40.class);
            int[] tags = l40.tags();
            int objectTypeIndication = l40.objectTypeIndication();
            Map<Integer, Class<? extends g40>> map = b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static g40 a(int i, ByteBuffer byteBuffer) {
        g40 g40;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        Map<Integer, Class<? extends g40>> map = b.get(Integer.valueOf(i));
        if (map == null) {
            map = b.get(-1);
        }
        Class<? extends g40> cls = map.get(Integer.valueOf(i2));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = a;
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(i2) + " found: " + cls);
            g40 = new t40();
        } else {
            try {
                g40 = (g40) cls.newInstance();
            } catch (Exception e) {
                Logger logger2 = a;
                Level level = Level.SEVERE;
                logger2.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + i2, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        g40.d(i2, byteBuffer);
        return g40;
    }
}
