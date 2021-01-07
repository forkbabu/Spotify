package defpackage;

import com.spotify.music.C0707R;

/* renamed from: mdd  reason: default package */
public final class mdd {
    private static final int[] a = {C0707R.color.face_background_salmon, C0707R.color.face_background_electric_seafoam, C0707R.color.face_background_azure, C0707R.color.face_background_lavenader, C0707R.color.face_background_orange, C0707R.color.face_background_brown};

    public static int a(String str) {
        int length = str.length();
        int[] iArr = a;
        return iArr[length % iArr.length];
    }
}
