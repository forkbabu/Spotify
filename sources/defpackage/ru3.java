package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: ru3  reason: default package */
public final /* synthetic */ class ru3 implements View.OnClickListener {
    public final /* synthetic */ Fragment a;

    public /* synthetic */ ru3(Fragment fragment) {
        this.a = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.a;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", fragment.B2().getPackageName(), null));
        fragment.G4(intent, null);
    }
}
