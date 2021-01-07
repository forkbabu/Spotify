package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.imagepicker.view.CroppingImageView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

/* renamed from: pu9  reason: default package */
public final class pu9 implements qu9 {
    private View a;
    private CroppingImageView b;
    private Button c;
    private Button d;
    private View e;
    private boolean f;
    public ju9 g;
    private final com.spotify.music.imagepicker.a h;
    private final Picasso i;
    private final eu9 j;
    private final hu9 k;
    private final SnackbarManager l;

    /* renamed from: pu9$a */
    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((pu9) this.b).k.g();
                ((pu9) this.b).l().g();
            } else if (i == 1) {
                ((pu9) this.b).k.e();
                ((pu9) this.b).m(false);
                ((pu9) this.b).l().e();
            } else if (i == 2) {
                ((pu9) this.b).k.b();
                ((pu9) this.b).l().a();
            } else {
                throw null;
            }
        }
    }

    /* renamed from: pu9$b */
    public static final class b implements CroppingImageView.b {
        final /* synthetic */ pu9 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(pu9 pu9) {
            this.a = pu9;
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void a() {
            this.a.m(true);
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void b() {
            this.a.k.d();
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void c() {
            this.a.k.c();
        }

        @Override // com.spotify.music.imagepicker.view.CroppingImageView.b
        public void d() {
            this.a.k.f();
        }
    }

    public pu9(com.spotify.music.imagepicker.a aVar, Picasso picasso, eu9 eu9, hu9 hu9, SnackbarManager snackbarManager) {
        h.e(aVar, "activityHandler");
        h.e(picasso, "picasso");
        h.e(eu9, "imageFileHelper");
        h.e(hu9, "logger");
        h.e(snackbarManager, "snackbarManager");
        this.h = aVar;
        this.i = picasso;
        this.j = eu9;
        this.k = hu9;
        this.l = snackbarManager;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void m(boolean z) {
        int i2 = 0;
        if (z) {
            CroppingImageView croppingImageView = this.b;
            if (croppingImageView != null) {
                croppingImageView.setVisibility(0);
                Button button = this.d;
                if (button != null) {
                    button.setVisibility(0);
                    Button button2 = this.c;
                    if (button2 != null) {
                        if (!this.f) {
                            i2 = 8;
                        }
                        button2.setVisibility(i2);
                        View view = this.e;
                        if (view != null) {
                            view.setVisibility(8);
                        } else {
                            h.k("loadingView");
                            throw null;
                        }
                    } else {
                        h.k("retakeButton");
                        throw null;
                    }
                } else {
                    h.k("usePhotoButton");
                    throw null;
                }
            } else {
                h.k("croppingImageView");
                throw null;
            }
        } else {
            CroppingImageView croppingImageView2 = this.b;
            if (croppingImageView2 != null) {
                croppingImageView2.setVisibility(8);
                Button button3 = this.d;
                if (button3 != null) {
                    button3.setVisibility(8);
                    Button button4 = this.c;
                    if (button4 != null) {
                        button4.setVisibility(8);
                        View view2 = this.e;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        } else {
                            h.k("loadingView");
                            throw null;
                        }
                    } else {
                        h.k("retakeButton");
                        throw null;
                    }
                } else {
                    h.k("usePhotoButton");
                    throw null;
                }
            } else {
                h.k("croppingImageView");
                throw null;
            }
        }
    }

    @Override // defpackage.qu9
    public void b(int i2, int i3, Intent intent) {
        int i4 = 1;
        if (i3 != -1) {
            com.spotify.music.imagepicker.a aVar = this.h;
            if (i3 == 0) {
                i4 = 0;
            }
            aVar.setResult(i4);
            this.h.finish();
        } else if (i2 == 1) {
            l().b();
        } else if (i2 == 2) {
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                l().f(data);
                return;
            }
            this.h.setResult(1);
            this.h.finish();
        }
    }

    @Override // defpackage.qu9
    public void d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(context, "context");
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.activity_image_picker, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.cropping_image);
        h.d(findViewById, "it.findViewById(R.id.cropping_image)");
        this.b = (CroppingImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.btn_use_photo);
        h.d(findViewById2, "it.findViewById(R.id.btn_use_photo)");
        this.d = (Button) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.btn_retake);
        h.d(findViewById3, "it.findViewById(R.id.btn_retake)");
        this.c = (Button) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.loading_view_layout);
        h.d(findViewById4, "it.findViewById(R.id.loading_view_layout)");
        this.e = findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.btn_close);
        h.d(findViewById5, "it.findViewById(R.id.btn_close)");
        ImageButton imageButton = (ImageButton) findViewById5;
        this.a = inflate;
        Button button = this.d;
        if (button != null) {
            button.setOnClickListener(new a(0, this));
            Button button2 = this.c;
            if (button2 != null) {
                button2.setOnClickListener(new a(1, this));
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
                spotifyIconDrawable.r(androidx.core.content.a.b(context, R.color.white));
                imageButton.setImageDrawable(spotifyIconDrawable);
                imageButton.setOnClickListener(new a(2, this));
                m(false);
                return;
            }
            h.k("retakeButton");
            throw null;
        }
        h.k("usePhotoButton");
        throw null;
    }

    @Override // defpackage.qu9
    public void e() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT > 18) {
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
        }
        this.h.startActivityForResult(intent, 2);
    }

    @Override // defpackage.qu9
    public void f(Uri uri) {
        if (uri != null) {
            Intent intent = new Intent();
            CroppingImageView croppingImageView = this.b;
            if (croppingImageView != null) {
                Uri c2 = this.j.c(uri, croppingImageView.getNormalizedRect(), true);
                if (Uri.EMPTY.equals(c2)) {
                    this.l.showOnNextAttach(SnackbarConfiguration.builder((int) C0707R.string.image_conversion_error).build());
                    this.h.setResult(0);
                } else {
                    intent.setData(c2);
                    this.h.setResult(-1, intent);
                }
            } else {
                h.k("croppingImageView");
                throw null;
            }
        } else {
            this.h.setResult(0);
        }
        this.h.finish();
    }

    @Override // defpackage.qu9
    public void g(boolean z) {
        this.f = z;
    }

    @Override // defpackage.qu9
    public View getView() {
        return this.a;
    }

    @Override // defpackage.qu9
    public void h(Uri uri) {
        h.e(uri, "cameraOutputImageUri");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        this.h.startActivityForResult(intent, 1);
    }

    @Override // defpackage.qu9
    public void i(ju9 ju9) {
        h.e(ju9, "<set-?>");
        this.g = ju9;
    }

    @Override // defpackage.qu9
    public void j(boolean z) {
        CroppingImageView croppingImageView = this.b;
        if (croppingImageView != null) {
            croppingImageView.setShowCircularOverlay(z);
        } else {
            h.k("croppingImageView");
            throw null;
        }
    }

    @Override // defpackage.qu9
    public void k(Uri uri) {
        h.e(uri, "previewUri");
        CroppingImageView croppingImageView = this.b;
        if (croppingImageView != null) {
            croppingImageView.y(this.i, uri, new b(this));
        } else {
            h.k("croppingImageView");
            throw null;
        }
    }

    public ju9 l() {
        ju9 ju9 = this.g;
        if (ju9 != null) {
            return ju9;
        }
        h.k("presenter");
        throw null;
    }
}
