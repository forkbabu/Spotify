package com.spotify.music.features.profile.editprofile;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.lm7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final /* synthetic */ class a implements g0 {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.spotify.mobius.g0
    public final e0 a(Object obj, Object obj2) {
        Object obj3;
        mm7 mm7 = (mm7) obj;
        lm7 lm7 = (lm7) obj2;
        em7 em7 = new em7(mm7);
        am7 am7 = am7.a;
        tl7 tl7 = tl7.a;
        pl7 pl7 = new pl7(mm7);
        rl7 rl7 = new rl7(mm7);
        wl7 wl7 = new wl7(mm7);
        dm7 dm7 = new dm7(mm7);
        bm7 bm7 = new bm7(mm7);
        ql7 ql7 = new ql7(mm7);
        gm7 gm7 = gm7.a;
        yl7 yl7 = yl7.a;
        vl7 vl7 = new vl7(mm7);
        hm7 hm7 = new hm7(mm7);
        fm7 fm7 = new fm7(mm7);
        sl7 sl7 = sl7.a;
        ml7 ml7 = ml7.a;
        ul7 ul7 = new ul7(mm7);
        im7 im7 = new im7(mm7);
        cm7 cm7 = cm7.a;
        zl7 zl7 = zl7.a;
        ol7 ol7 = new ol7(mm7);
        nl7 nl7 = new nl7(mm7);
        xl7 xl7 = xl7.a;
        lm7.getClass();
        h.e(em7, "closeClicked");
        h.e(am7, "closeCanceled");
        h.e(tl7, "closeConfirmed");
        h.e(pl7, "saveClicked");
        h.e(rl7, "cancelSaveClicked");
        h.e(wl7, "retrySaveClicked");
        h.e(dm7, "saveProfileStatus");
        h.e(bm7, "imageClicked");
        h.e(ql7, "changePhotoClicked");
        h.e(gm7, "choosePhotoClicked");
        h.e(yl7, "takePhotoClicked");
        h.e(vl7, "removeCurrentPhotoClicked");
        h.e(hm7, "readExternalStoragePermissionChecked");
        h.e(fm7, "readExternalStoragePermissionRequestResult");
        h.e(sl7, "photosAccessSettingsClicked");
        h.e(ml7, "photosAccessSettingsCanceled");
        h.e(ul7, "cameraPermissionChecked");
        h.e(im7, "cameraPermissionRequestResult");
        h.e(cm7, "cameraAccessSettingsClicked");
        h.e(zl7, "cameraAccessSettingsCanceled");
        h.e(ol7, "displayNameChanged");
        h.e(nl7, "imageChanged");
        h.e(xl7, "genericError");
        if (lm7 instanceof lm7.i) {
            obj3 = em7.invoke(lm7);
        } else if (lm7 instanceof lm7.h) {
            obj3 = am7.invoke(lm7);
        } else if (lm7 instanceof lm7.j) {
            obj3 = tl7.invoke(lm7);
        } else if (lm7 instanceof lm7.u) {
            obj3 = pl7.invoke(lm7);
        } else if (lm7 instanceof lm7.e) {
            obj3 = rl7.invoke(lm7);
        } else if (lm7 instanceof lm7.t) {
            obj3 = wl7.invoke(lm7);
        } else if (lm7 instanceof lm7.v) {
            obj3 = dm7.invoke(lm7);
        } else if (lm7 instanceof lm7.n) {
            obj3 = bm7.invoke(lm7);
        } else if (lm7 instanceof lm7.f) {
            obj3 = ql7.invoke(lm7);
        } else if (lm7 instanceof lm7.g) {
            obj3 = gm7.invoke(lm7);
        } else if (lm7 instanceof lm7.w) {
            obj3 = yl7.invoke(lm7);
        } else if (lm7 instanceof lm7.s) {
            obj3 = vl7.invoke(lm7);
        } else if (lm7 instanceof lm7.q) {
            obj3 = hm7.invoke(lm7);
        } else if (lm7 instanceof lm7.r) {
            obj3 = fm7.invoke(lm7);
        } else if (lm7 instanceof lm7.p) {
            obj3 = sl7.invoke(lm7);
        } else if (lm7 instanceof lm7.o) {
            obj3 = ml7.invoke(lm7);
        } else if (lm7 instanceof lm7.c) {
            obj3 = ul7.invoke(lm7);
        } else if (lm7 instanceof lm7.d) {
            obj3 = im7.invoke(lm7);
        } else if (lm7 instanceof lm7.b) {
            obj3 = cm7.invoke(lm7);
        } else if (lm7 instanceof lm7.a) {
            obj3 = zl7.invoke(lm7);
        } else if (lm7 instanceof lm7.k) {
            obj3 = ol7.invoke(lm7);
        } else if (lm7 instanceof lm7.m) {
            obj3 = nl7.invoke(lm7);
        } else if (lm7 instanceof lm7.l) {
            obj3 = xl7.invoke(lm7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (e0) obj3;
    }
}
