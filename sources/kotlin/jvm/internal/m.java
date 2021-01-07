package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.b;

public class m {
    public static Collection a(Object obj) {
        if (!(obj instanceof zmf)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                h.i(e, m.class.getName());
                throw e;
            }
        } else {
            d(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public static List b(Object obj) {
        if (!(obj instanceof zmf)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                h.i(e, m.class.getName());
                throw e;
            }
        } else {
            d(obj, "kotlin.collections.MutableList");
            throw null;
        }
    }

    public static boolean c(Object obj, int i) {
        int i2;
        if (obj instanceof b) {
            if (obj instanceof g) {
                i2 = ((g) obj).getArity();
            } else if (obj instanceof cmf) {
                i2 = 0;
            } else if (obj instanceof nmf) {
                i2 = 1;
            } else if (obj instanceof rmf) {
                i2 = 2;
            } else if (obj instanceof smf) {
                i2 = 3;
            } else if (obj instanceof tmf) {
                i2 = 4;
            } else if (obj instanceof umf) {
                i2 = 5;
            } else if (obj instanceof vmf) {
                i2 = 6;
            } else if (obj instanceof wmf) {
                i2 = 7;
            } else if (obj instanceof xmf) {
                i2 = 8;
            } else if (obj instanceof ymf) {
                i2 = 9;
            } else if (obj instanceof dmf) {
                i2 = 10;
            } else if (obj instanceof emf) {
                i2 = 11;
            } else if (obj instanceof fmf) {
                i2 = 12;
            } else if (obj instanceof gmf) {
                i2 = 13;
            } else if (obj instanceof hmf) {
                i2 = 14;
            } else if (obj instanceof imf) {
                i2 = 15;
            } else if (obj instanceof jmf) {
                i2 = 16;
            } else if (obj instanceof kmf) {
                i2 = 17;
            } else if (obj instanceof lmf) {
                i2 = 18;
            } else if (obj instanceof mmf) {
                i2 = 19;
            } else if (obj instanceof omf) {
                i2 = 20;
            } else if (obj instanceof pmf) {
                i2 = 21;
            } else {
                i2 = obj instanceof qmf ? 22 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(je.y0(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.i(classCastException, m.class.getName());
        throw classCastException;
    }
}
