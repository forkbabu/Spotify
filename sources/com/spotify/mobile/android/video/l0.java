package com.spotify.mobile.android.video;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l0 {
    public static final /* synthetic */ int d = 0;
    private final View.OnAttachStateChangeListener a = new a();
    private final List<VideoSurfaceView> b = new ArrayList();
    private final Set<c> c = new HashSet();

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            MoreObjects.checkArgument(view instanceof VideoSurfaceView, "The view must be an instance of VideoSurfaceView");
            l0.this.k((VideoSurfaceView) view);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements TextureView.SurfaceTextureListener {
        final /* synthetic */ VideoSurfaceView a;

        b(VideoSurfaceView videoSurfaceView) {
            this.a = videoSurfaceView;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            l0.a(l0.this, this.a);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            l0.this.b.remove(this.a);
            l0.this.j(this.a);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            l0.b(l0.this, this.a);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
        void B(VideoSurfaceView videoSurfaceView);

        void J(VideoSurfaceView videoSurfaceView);

        void X(VideoSurfaceView videoSurfaceView);

        void s(VideoSurfaceView videoSurfaceView);

        void u(VideoSurfaceView videoSurfaceView);
    }

    static void a(l0 l0Var, VideoSurfaceView videoSurfaceView) {
        for (c cVar : l0Var.c) {
            cVar.X(videoSurfaceView);
        }
    }

    static void b(l0 l0Var, VideoSurfaceView videoSurfaceView) {
        for (c cVar : l0Var.c) {
            cVar.s(videoSurfaceView);
        }
    }

    public static void i(l0 l0Var, VideoSurfaceView videoSurfaceView) {
        for (c cVar : l0Var.c) {
            cVar.u(videoSurfaceView);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j(VideoSurfaceView videoSurfaceView) {
        for (c cVar : this.c) {
            cVar.B(videoSurfaceView);
        }
    }

    public void e(VideoSurfaceView videoSurfaceView) {
        if (!this.b.contains(videoSurfaceView)) {
            this.b.add(0, videoSurfaceView);
            Collections.sort(this.b, j.a);
            for (c cVar : this.c) {
                cVar.J(videoSurfaceView);
            }
            videoSurfaceView.setOnPredicateChangedListener(new k(this));
            videoSurfaceView.addOnAttachStateChangeListener(this.a);
            videoSurfaceView.m(new b(videoSurfaceView));
        }
    }

    /* access modifiers changed from: package-private */
    public void f(c cVar) {
        this.c.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public VideoSurfaceView g(d0 d0Var) {
        for (VideoSurfaceView videoSurfaceView : this.b) {
            if (videoSurfaceView.f(d0Var)) {
                return videoSurfaceView;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<VideoSurfaceView> h() {
        return Collections.unmodifiableList(this.b);
    }

    public void k(VideoSurfaceView videoSurfaceView) {
        if (this.b.remove(videoSurfaceView)) {
            videoSurfaceView.setOnPredicateChangedListener(null);
            videoSurfaceView.removeOnAttachStateChangeListener(this.a);
            j(videoSurfaceView);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(c cVar) {
        this.c.remove(cVar);
    }
}
