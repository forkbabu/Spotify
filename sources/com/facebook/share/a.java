package com.facebook.share;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.i;
import com.facebook.internal.q;
import com.facebook.k;
import com.facebook.share.model.d;
import com.facebook.share.model.f;
import com.facebook.share.model.l;
import java.util.List;

public class a extends i<d, Object> {
    private static final int f = CallbackManagerImpl.RequestCodeOffset.DeviceShare.d();

    public a(Activity activity) {
        super(activity, f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public boolean b(d dVar, Object obj) {
        d dVar2 = dVar;
        return (dVar2 instanceof f) || (dVar2 instanceof l);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public com.facebook.internal.a c() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public List<i<d, Object>.a> e() {
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public void h(d dVar, Object obj) {
        d dVar2 = dVar;
        if (dVar2 == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if ((dVar2 instanceof f) || (dVar2 instanceof l)) {
            Intent intent = new Intent();
            intent.setClass(k.d(), FacebookActivity.class);
            intent.setAction("DeviceShareDialogFragment");
            intent.putExtra("content", dVar2);
            i(intent, f());
        } else {
            throw new FacebookException(je.m0(a.class, new StringBuilder(), " only supports ShareLinkContent or ShareOpenGraphContent"));
        }
    }

    public a(Fragment fragment) {
        super(new q(fragment), f);
    }

    public a(androidx.fragment.app.Fragment fragment) {
        super(new q(fragment), f);
    }
}
