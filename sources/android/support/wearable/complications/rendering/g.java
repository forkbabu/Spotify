package android.support.wearable.complications.rendering;

/* access modifiers changed from: package-private */
public final class g {
    private static final int[][] a = {new int[]{169, 169}, new int[]{8252, 8252}, new int[]{8265, 8265}, new int[]{8482, 8482}, new int[]{8505, 8505}, new int[]{8596, 8618}, new int[]{8986, 9000}, new int[]{9167, 9210}, new int[]{9410, 9410}, new int[]{9642, 10175}, new int[]{10548, 10549}, new int[]{11013, 11093}, new int[]{12336, 12336}, new int[]{12349, 12349}, new int[]{12951, 12953}, new int[]{126980, 126980}, new int[]{127183, 127183}, new int[]{127344, 127569}, new int[]{127744, 128758}, new int[]{129296, 129472}};

    static boolean a(int i) {
        int[][] iArr = a;
        for (int[] iArr2 : iArr) {
            if (i >= iArr2[0] && i <= iArr2[1]) {
                return true;
            }
        }
        return false;
    }
}
