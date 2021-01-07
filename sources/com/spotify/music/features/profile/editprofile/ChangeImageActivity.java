package com.spotify.music.features.profile.editprofile;

import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.utils.CroppingImageView;
import com.spotify.music.features.profile.editprofile.utils.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import io.reactivex.disposables.d;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import io.reactivex.z;

public class ChangeImageActivity extends ss2 {
    public static final /* synthetic */ int X = 0;
    y G;
    y H;
    Picasso I;
    a J;
    p K;
    private final d L = new d();
    private CroppingImageView M;
    private Button N;
    private Button O;
    private boolean P;
    private View Q;
    private Uri R;
    private Uri S;
    private Uri T;
    private final View.OnClickListener U = new f(this);
    private final View.OnClickListener V = new d(this);
    private final View.OnClickListener W = new b(this);

    private void V0() {
        this.L.b(z.y(new e(this)).H(this.H).B(this.G).subscribe(new g(this), new c(this)));
    }

    public static void b1(ChangeImageActivity changeImageActivity, Uri uri) {
        changeImageActivity.T = uri;
        CroppingImageView croppingImageView = changeImageActivity.M;
        Picasso picasso = changeImageActivity.I;
        uri.getClass();
        croppingImageView.y(picasso, uri, new l(changeImageActivity));
    }

    private boolean c1() {
        this.R = this.J.b();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.R);
        startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: private */
    public void d1(boolean z) {
        int i = 0;
        if (z) {
            this.M.setVisibility(0);
            this.O.setVisibility(0);
            Button button = this.N;
            if (!this.P) {
                i = 8;
            }
            button.setVisibility(i);
            this.Q.setVisibility(8);
            return;
        }
        this.M.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setVisibility(8);
        this.Q.setVisibility(0);
    }

    public Uri W0() {
        a aVar = this.J;
        Uri uri = this.S;
        uri.getClass();
        Uri e = aVar.e(uri);
        if (e != null) {
            return e;
        }
        throw new RuntimeException("Failed creating preview image");
    }

    public void X0(View view) {
        this.K.q();
        Intent intent = new Intent();
        RectF normalizedRect = this.M.getNormalizedRect();
        a aVar = this.J;
        Uri uri = this.S;
        uri.getClass();
        Uri d = aVar.d(uri, normalizedRect, true);
        if (d == null) {
            setResult(100);
        } else {
            intent.setData(d);
            setResult(-1, intent);
        }
        finish();
    }

    public /* synthetic */ void a1(View view) {
        this.K.p();
        d1(false);
        c1();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 100;
        if (i != 1) {
            if (i != 2) {
                setResult(100);
                finish();
            } else if (i2 != -1) {
                if (i2 == 0) {
                    i3 = 0;
                }
                setResult(i3);
                finish();
            } else if (intent == null || intent.getData() == null) {
                setResult(100);
                finish();
            } else {
                this.S = intent.getData();
                this.M.z();
                V0();
            }
        } else if (i2 == -1) {
            Uri uri = this.R;
            if (uri == null) {
                setResult(100);
                finish();
                return;
            }
            this.S = uri;
            this.M.z();
            V0();
        } else {
            if (i2 == 0) {
                i3 = 0;
            }
            setResult(i3);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = getIntent().getBooleanExtra("using-camera", false);
        if (bundle != null) {
            this.R = (Uri) bundle.getParcelable("camera-output-image-uri");
            this.S = (Uri) bundle.getParcelable("image-uri");
            this.T = (Uri) bundle.getParcelable("preview-image-uri");
        }
        setContentView(C0707R.layout.activity_change_image);
        this.M = (CroppingImageView) findViewById(C0707R.id.preview_image);
        Button button = (Button) findViewById(C0707R.id.btn_use_photo);
        this.O = button;
        button.setOnClickListener(this.U);
        Button button2 = (Button) findViewById(C0707R.id.btn_retake);
        this.N = button2;
        button2.setOnClickListener(this.V);
        this.Q = findViewById(C0707R.id.loading_view_layout);
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.btn_close);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(this, R.color.white));
        imageButton.setImageDrawable(spotifyIconDrawable);
        imageButton.setOnClickListener(this.W);
        d1(false);
        if (this.S != null || bundle != null) {
            Uri uri = this.T;
            if (uri == null) {
                V0();
            } else {
                this.M.y(this.I, uri, new l(this));
            }
        } else if (this.P) {
            c1();
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            startActivityForResult(intent, 2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.L.b(EmptyDisposable.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Uri uri = this.R;
        if (uri != null) {
            bundle.putParcelable("camera-output-image-uri", uri);
        }
        Uri uri2 = this.S;
        if (uri2 != null) {
            bundle.putParcelable("image-uri", uri2);
        }
        Uri uri3 = this.T;
        if (uri3 != null) {
            bundle.putParcelable("preview-image-uri", uri3);
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PROFILE_IMAGEPREVIEW, null);
    }
}
