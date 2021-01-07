package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.view.ViewGroup;
import com.spotify.music.spotlets.scannables.view.CameraPreview;
import io.reactivex.h;

/* renamed from: ihd  reason: default package */
public class ihd {
    private Camera a;

    public /* synthetic */ void a() {
        Camera camera = this.a;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.a.stopPreview();
            this.a.release();
        }
    }

    public void b(Context context, ViewGroup viewGroup, h hVar) {
        try {
            this.a = Camera.open(0);
            int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            Camera camera = this.a;
            camera.getClass();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
            camera.setDisplayOrientation((cameraInfo.orientation - (rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90)) % 360);
            fhd fhd = new fhd(hVar, viewGroup);
            CameraPreview cameraPreview = new CameraPreview(context);
            cameraPreview.f(this.a, fhd);
            viewGroup.addView(cameraPreview, 0);
        } catch (Exception e) {
            hVar.onError(e);
        }
        hVar.e(new ehd(this));
    }
}
