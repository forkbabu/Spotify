package com.spotify.music.spotlets.scannables.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.adjust.sdk.Constants;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    public List<Camera.Size> a;
    private SurfaceHolder b;
    private Camera c;
    private Camera.Size f;
    private Camera.PreviewCallback n;
    private Handler o;
    private final Runnable p = new a();
    private final Camera.AutoFocusCallback q = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (CameraPreview.this.c != null) {
                    Camera.Parameters parameters = CameraPreview.this.c.getParameters();
                    if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                        parameters.setFocusMode("continuous-picture");
                    }
                    CameraPreview.this.c.setParameters(parameters);
                }
            } catch (RuntimeException unused) {
                Logger.n("Camera was released already", new Object[0]);
            }
        }
    }

    class b implements Camera.AutoFocusCallback {
        b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CameraPreview.this.o.removeCallbacks(CameraPreview.this.p);
            CameraPreview.this.o.postDelayed(CameraPreview.this.p, 3000);
        }
    }

    public CameraPreview(Context context) {
        super(context);
    }

    private static int d(int i, int i2) {
        int i3 = i2 / 2;
        if (Math.abs(i) + i3 > 1000) {
            return i > 0 ? Constants.ONE_SECOND - i3 : i3 - 1000;
        }
        return i - i3;
    }

    private void e(int i, int i2) {
        Camera camera = this.c;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
            if (parameters.getMaxNumFocusAreas() > 0) {
                int d = d((int) (((((float) i) / ((float) getWidth())) * 2000.0f) - 1000.0f), 50);
                int d2 = d((int) (((((float) i2) / ((float) getHeight())) * 2000.0f) - 1000.0f), 50);
                Rect rect = new Rect(d, d2, d + 50, d2 + 50);
                RectF rectF = new RectF(rect);
                Matrix matrix = new Matrix();
                matrix.postRotate((float) (360 - cameraInfo.orientation));
                matrix.mapRect(rectF);
                rectF.round(rect);
                parameters.setFocusMode("auto");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new Camera.Area(rect, Constants.ONE_SECOND));
                parameters.setFocusAreas(arrayList);
                this.c.setParameters(parameters);
            }
            this.c.autoFocus(this.q);
        }
    }

    public void f(Camera camera, Camera.PreviewCallback previewCallback) {
        this.c = camera;
        this.n = previewCallback;
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        this.a = supportedPreviewSizes;
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (it.hasNext()) {
            Camera.Size next = it.next();
            if (next.width > 1024 || next.height > 1024) {
                it.remove();
            }
        }
        SurfaceHolder holder = getHolder();
        this.b = holder;
        holder.addCallback(this);
        this.b.setType(3);
        this.o = new Handler();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int resolveSize = SurfaceView.resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = SurfaceView.resolveSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(resolveSize, resolveSize2);
        List<Camera.Size> list = this.a;
        if (!(list == null || list.isEmpty())) {
            List<Camera.Size> list2 = this.a;
            Camera.Size size = null;
            if (list2 != null) {
                double d = (double) resolveSize2;
                double d2 = (double) resolveSize;
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double d4 = Double.MAX_VALUE;
                double d5 = Double.MAX_VALUE;
                for (Camera.Size size2 : list2) {
                    double d6 = (double) size2.width;
                    double d7 = (double) size2.height;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    if (Math.abs((d6 / d7) - d3) <= 0.1d && ((double) Math.abs(size2.height - resolveSize2)) < d5) {
                        d5 = (double) Math.abs(size2.height - resolveSize2);
                        size = size2;
                    }
                }
                if (size == null) {
                    for (Camera.Size size3 : list2) {
                        if (((double) Math.abs(size3.height - resolveSize2)) < d4) {
                            d4 = (double) Math.abs(size3.height - resolveSize2);
                            size = size3;
                        }
                    }
                }
            }
            this.f = size;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            try {
                e((int) motionEvent.getX(), (int) motionEvent.getY());
            } catch (RuntimeException unused) {
                Logger.n("Camera was released already", new Object[0]);
            }
            performClick();
        }
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.b.getSurface() != null) {
            try {
                this.c.stopPreview();
            } catch (Exception e) {
                Logger.d("Could not stop preview %s", e);
            }
            try {
                Camera.Parameters parameters = this.c.getParameters();
                if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                }
                Camera.Size size = this.f;
                if (size != null) {
                    parameters.setPreviewSize(size.width, size.height);
                }
                this.c.setParameters(parameters);
                this.c.setPreviewDisplay(this.b);
                this.c.setPreviewCallback(this.n);
                this.c.startPreview();
            } catch (IOException | RuntimeException e2) {
                Logger.d("Error starting camera preview: %s", e2.getMessage());
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.c.setPreviewDisplay(surfaceHolder);
            this.c.setPreviewCallback(this.n);
            this.c.startPreview();
        } catch (IOException | RuntimeException e) {
            Logger.d("Error setting camera preview: %s", e.getMessage());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.o.removeCallbacks(this.p);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
