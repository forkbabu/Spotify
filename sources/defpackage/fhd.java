package defpackage;

import android.hardware.Camera;
import android.view.ViewGroup;
import com.spotify.music.spotlets.scannables.model.a;
import io.reactivex.h;

/* renamed from: fhd  reason: default package */
public final /* synthetic */ class fhd implements Camera.PreviewCallback {
    public final /* synthetic */ h a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ fhd(h hVar, ViewGroup viewGroup) {
        this.a = hVar;
        this.b = viewGroup;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        h hVar = this.a;
        ViewGroup viewGroup = this.b;
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        hVar.onNext(new a(bArr, previewSize.width, previewSize.height));
        if (viewGroup.getChildCount() > 1) {
            viewGroup.removeViewAt(1);
        }
    }
}
