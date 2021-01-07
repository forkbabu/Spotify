package com.spotify.magiclink;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.magiclink.setpassword.MagiclinkSetPasswordActivity;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ MagiclinkBottomSheetDialog a;
    public final /* synthetic */ String b;

    public /* synthetic */ i(MagiclinkBottomSheetDialog magiclinkBottomSheetDialog, String str) {
        this.a = magiclinkBottomSheetDialog;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MagiclinkBottomSheetDialog magiclinkBottomSheetDialog = this.a;
        String str = this.b;
        magiclinkBottomSheetDialog.v0.a(i11.a(p11.e(), j11.d(), k11.d()));
        Context context = view.getContext();
        int i = MagiclinkSetPasswordActivity.F;
        Intent intent = new Intent(context, MagiclinkSetPasswordActivity.class);
        intent.putExtra("t", MoreObjects.nullToEmpty(str));
        magiclinkBottomSheetDialog.H4(intent, 567, null);
    }
}
