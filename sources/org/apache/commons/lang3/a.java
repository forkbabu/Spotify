package org.apache.commons.lang3;

public class a {
    public static final Object[] a = new Object[0];
    public static final String[] b = new String[0];
    public static final long[] c = new long[0];
    public static final Long[] d = new Long[0];
    public static final int[] e = new int[0];
    public static final Integer[] f = new Integer[0];
    public static final double[] g = new double[0];
    public static final Double[] h = new Double[0];
    public static final float[] i = new float[0];
    public static final Float[] j = new Float[0];
    public static final boolean[] k = new boolean[0];
    public static final Boolean[] l = new Boolean[0];

    public static int a(int[] iArr, int i2) {
        if (iArr == null) {
            return -1;
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static int b(Object[] objArr, Object obj) {
        if (objArr != null) {
            int i2 = 0;
            if (obj == null) {
                while (i2 < objArr.length) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                    i2++;
                }
            } else if (objArr.getClass().getComponentType().isInstance(obj)) {
                while (i2 < objArr.length) {
                    if (obj.equals(objArr[i2])) {
                        return i2;
                    }
                    i2++;
                }
            }
        }
        return -1;
    }

    public static Boolean[] c(boolean[] zArr) {
        if (zArr.length == 0) {
            return l;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = zArr[i2] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static Double[] d(double[] dArr) {
        if (dArr.length == 0) {
            return h;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public static Float[] e(float[] fArr) {
        if (fArr.length == 0) {
            return j;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static Integer[] f(int[] iArr) {
        if (iArr.length == 0) {
            return f;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Long[] g(long[] jArr) {
        if (jArr.length == 0) {
            return d;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static double[] h(Double[] dArr) {
        if (dArr.length == 0) {
            return g;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    public static float[] i(Float[] fArr) {
        if (fArr.length == 0) {
            return i;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    public static int[] j(Integer[] numArr) {
        if (numArr.length == 0) {
            return e;
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public static long[] k(Long[] lArr) {
        if (lArr.length == 0) {
            return c;
        }
        long[] jArr = new long[lArr.length];
        for (int i2 = 0; i2 < lArr.length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    public static boolean[] l(Boolean[] boolArr) {
        if (boolArr.length == 0) {
            return k;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i2 = 0; i2 < boolArr.length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }
}
