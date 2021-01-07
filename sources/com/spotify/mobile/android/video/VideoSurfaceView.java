package com.spotify.mobile.android.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.exoplayer2.text.i;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.thumbnails.ThumbnailView;
import com.spotify.music.C0707R;
import java.util.List;

public class VideoSurfaceView extends FrameLayout implements i {
    private final Runnable A = new a();
    private final TextureView.SurfaceTextureListener B;
    private TextureView a;
    private SubtitlesView b;
    private ProgressBar c;
    private b0 f;
    private k0 n;
    private VideoSurfacePriority o;
    private ScaleType p = ScaleType.ASPECT_FIT;
    private Surface q;
    private TextureView.SurfaceTextureListener r;
    private Matrix s;
    private Handler t = new Handler();
    private int u;
    private int v;
    private boolean w;
    private View x;
    private c y;
    private boolean z = true;

    public enum ScaleType {
        ASPECT_FIT(16),
        ASPECT_FILL(32),
        STRETCH(64);
        
        private final int mType;

        private ScaleType(int i) {
            this.mType = i;
        }

        public int d() {
            return this.mType;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoSurfaceView.this.c != null && VideoSurfaceView.this.z) {
                VideoSurfaceView.this.c.setVisibility(0);
            }
        }
    }

    class b implements TextureView.SurfaceTextureListener {
        b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VideoSurfaceView.this.setSurface(new Surface(surfaceTexture));
            if (VideoSurfaceView.this.r != null) {
                VideoSurfaceView.this.r.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VideoSurfaceView.this.k();
            boolean onSurfaceTextureDestroyed = VideoSurfaceView.this.r != null ? VideoSurfaceView.this.r.onSurfaceTextureDestroyed(surfaceTexture) : true;
            if (VideoSurfaceView.this.getSurface() != null) {
                VideoSurfaceView.this.getSurface().release();
            }
            return onSurfaceTextureDestroyed;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VideoSurfaceView.this.r != null) {
                VideoSurfaceView.this.r.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (VideoSurfaceView.this.r != null) {
                VideoSurfaceView.this.r.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
    }

    /* JADX INFO: finally extract failed */
    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VideoSurfacePriority videoSurfacePriority = VideoSurfacePriority.MEDIUM;
        this.o = videoSurfacePriority;
        b bVar = new b();
        this.B = bVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, dl2.a, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(0)) {
                Assertion.g("fullscreen attribute on VideoSurfaceView must be explicitly defined!");
            }
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            VideoSurfacePriority d = VideoSurfacePriority.d(obtainStyledAttributes.getInt(1, videoSurfacePriority.g()));
            obtainStyledAttributes.recycle();
            this.w = z2;
            this.o = d;
            this.s = new Matrix();
            LayoutInflater.from(context).inflate(C0707R.layout.video_surface_view, (ViewGroup) this, true);
            this.a = (TextureView) findViewById(C0707R.id.texture_view);
            this.b = (SubtitlesView) findViewById(C0707R.id.subtitle_view);
            this.c = (ProgressBar) findViewById(C0707R.id.throbber);
            this.x = findViewById(C0707R.id.seek_thumbnail);
            ThumbnailView thumbnailView = (ThumbnailView) findViewById(C0707R.id.seek_thumbnail_image);
            TextView textView = (TextView) findViewById(C0707R.id.seek_thumbnail_timestamp);
            this.a.setSurfaceTextureListener(bVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.text.i
    public void a(List<com.google.android.exoplayer2.text.a> list) {
        SubtitlesView subtitlesView = this.b;
        if (subtitlesView != null) {
            subtitlesView.getClass();
            if (list.size() > 0) {
                subtitlesView.setText(Joiner.on("\n").join(Collections2.transform((List) list, (Function) new j0(subtitlesView))));
                subtitlesView.setVisibility(0);
                return;
            }
            subtitlesView.setText("");
            subtitlesView.setVisibility(4);
        }
    }

    public boolean e() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d0 d0Var) {
        if (this.a == null) {
            return false;
        }
        b0 b0Var = this.f;
        if (b0Var != null) {
            return b0Var.a(d0Var);
        }
        return true;
    }

    public void g() {
        c cVar = this.y;
        if (cVar != null) {
            l0.i(((k) cVar).a, this);
        }
    }

    public String getCurrentRenderedSubtitlesText() {
        SubtitlesView subtitlesView = this.b;
        return (subtitlesView == null || subtitlesView.getText() == null) ? "" : this.b.getText().toString();
    }

    public VideoSurfacePriority getPriority() {
        return this.o;
    }

    public Surface getSurface() {
        return this.q;
    }

    public SurfaceTexture getSurfaceTexture() {
        TextureView textureView = this.a;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    public TextureView getTextureView() {
        return this.a;
    }

    public void h(com.spotify.mobile.android.video.thumbnails.b bVar) {
        SubtitlesView subtitlesView = this.b;
        subtitlesView.setText("");
        subtitlesView.setVisibility(4);
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.c(this);
        }
    }

    public void i() {
        setIsBuffering(false);
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.a(this);
        }
    }

    public void j() {
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.b(this);
        }
    }

    public void k() {
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.d(this);
        }
    }

    public void l(int i, int i2) {
        if (this.u != i || this.v != i2) {
            this.u = i;
            this.v = i2;
            forceLayout();
            (getParent() != null ? getParent() : this).requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void m(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.r = surfaceTextureListener;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (this.z) {
            this.c.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (((i3 - i) - getPaddingRight()) - paddingLeft) / 2;
        int paddingBottom = (((i4 - i2) - getPaddingBottom()) - paddingTop) / 2;
        int measuredWidth = this.c.getMeasuredWidth() / 2;
        int measuredHeight = this.c.getMeasuredHeight() / 2;
        this.c.layout(paddingRight - measuredWidth, paddingBottom - measuredHeight, paddingRight + measuredWidth, paddingBottom + measuredHeight);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (r6 == r0) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.VideoSurfaceView.onMeasure(int, int):void");
    }

    public void setBufferingThrobberEnabled(boolean z2) {
        this.z = z2;
        if (!z2) {
            this.c.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void setHandler(Handler handler) {
        this.t = handler;
    }

    /* access modifiers changed from: package-private */
    public void setIsBuffering(boolean z2) {
        if (!this.z) {
            return;
        }
        if (z2) {
            this.t.postDelayed(this.A, 800);
            return;
        }
        this.t.removeCallbacks(this.A);
        this.c.setVisibility(8);
    }

    public void setOnPredicateChangedListener(c cVar) {
        this.y = cVar;
    }

    public void setPlayablePredicate(b0 b0Var) {
        this.f = b0Var;
    }

    public void setScaleType(ScaleType scaleType) {
        this.p = scaleType;
        this.B.onSurfaceTextureSizeChanged(getSurfaceTexture(), getWidth(), getHeight());
    }

    public void setSurface(Surface surface) {
        this.q = surface;
    }

    /* access modifiers changed from: package-private */
    public void setTransform(Matrix matrix) {
        this.s = matrix;
    }

    public void setVideoSurfaceCallback(k0 k0Var) {
        this.n = k0Var;
    }
}
