package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.r;
import com.facebook.internal.s;
import com.facebook.internal.t;
import com.facebook.internal.y;
import com.facebook.k;
import com.spotify.music.C0707R;
import java.util.Locale;

public class ProfilePictureView extends FrameLayout {
    public static final String s = ProfilePictureView.class.getSimpleName();
    private String a;
    private int b = 0;
    private int c = 0;
    private boolean f = true;
    private ImageView n;
    private int o = -1;
    private s p;
    private b q;
    private Bitmap r = null;

    /* access modifiers changed from: package-private */
    public class a implements s.c {
        a() {
        }

        @Override // com.facebook.internal.s.c
        public void a(t tVar) {
            ProfilePictureView.a(ProfilePictureView.this, tVar);
        }
    }

    public interface b {
        void a(FacebookException facebookException);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
        d(attributeSet);
    }

    static void a(ProfilePictureView profilePictureView, t tVar) {
        profilePictureView.getClass();
        if (tVar.c() == profilePictureView.p) {
            profilePictureView.p = null;
            Bitmap a2 = tVar.a();
            Exception b2 = tVar.b();
            if (b2 != null) {
                b bVar = profilePictureView.q;
                if (bVar != null) {
                    StringBuilder V0 = je.V0("Error in downloading profile picture for profileId: ");
                    V0.append(profilePictureView.getProfileId());
                    bVar.a(new FacebookException(V0.toString(), b2));
                    return;
                }
                LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
                b2.toString();
                int i = y.e;
                k.v(loggingBehavior);
            } else if (a2 != null) {
                profilePictureView.setImageBitmap(a2);
                if (tVar.d()) {
                    profilePictureView.f(false);
                }
            }
        }
    }

    private int b(boolean z) {
        int i = this.o;
        int i2 = C0707R.dimen.com_facebook_profilepictureview_preset_size_normal;
        if (i == -4) {
            i2 = C0707R.dimen.com_facebook_profilepictureview_preset_size_large;
        } else if (i != -3) {
            if (i == -2) {
                i2 = C0707R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else if (i != -1 || !z) {
                return 0;
            }
        }
        return getResources().getDimensionPixelSize(i2);
    }

    private void c(Context context) {
        removeAllViews();
        this.n = new ImageView(context);
        this.n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.n.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.n);
    }

    private void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.facebook.login.t.b);
        setPresetSize(obtainStyledAttributes.getInt(1, -1));
        this.f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void e(boolean z) {
        boolean h = h();
        String str = this.a;
        if (str == null || str.length() == 0 || (this.c == 0 && this.b == 0)) {
            g();
        } else if (h || z) {
            f(true);
        }
    }

    private void f(boolean z) {
        String n2 = com.facebook.a.p() ? com.facebook.a.e().n() : "";
        Context context = getContext();
        String str = this.a;
        int i = this.c;
        int i2 = this.b;
        h0.g(str, "userId");
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Uri.Builder path = Uri.parse(d0.b()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", k.n(), str));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        if (!f0.C(n2)) {
            path.appendQueryParameter("access_token", n2);
        }
        s.b bVar = new s.b(context, path.build());
        bVar.g(z);
        bVar.i(this);
        bVar.h(new a());
        s f2 = bVar.f();
        s sVar = this.p;
        if (sVar != null) {
            r.c(sVar);
        }
        this.p = f2;
        r.d(f2);
    }

    private void g() {
        s sVar = this.p;
        if (sVar != null) {
            r.c(sVar);
        }
        if (this.r == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), this.f ? C0707R.drawable.com_facebook_profile_picture_blank_square : C0707R.drawable.com_facebook_profile_picture_blank_portrait));
            return;
        }
        h();
        setImageBitmap(Bitmap.createScaledBitmap(this.r, this.c, this.b, false));
    }

    private boolean h() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int b2 = b(false);
        if (b2 != 0) {
            height = b2;
            width = height;
        }
        if (width <= height) {
            height = this.f ? width : 0;
        } else {
            width = this.f ? height : 0;
        }
        if (width == this.c && height == this.b) {
            z = false;
        }
        this.c = width;
        this.b = height;
        return z;
    }

    private void setImageBitmap(Bitmap bitmap) {
        ImageView imageView = this.n;
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final b getOnErrorListener() {
        return this.q;
    }

    public final int getPresetSize() {
        return this.o;
    }

    public final String getProfileId() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = null;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(false);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = b(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = b(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.a = bundle.getString("ProfilePictureView_profileId");
        this.o = bundle.getInt("ProfilePictureView_presetSize");
        this.f = bundle.getBoolean("ProfilePictureView_isCropped");
        this.c = bundle.getInt("ProfilePictureView_width");
        this.b = bundle.getInt("ProfilePictureView_height");
        e(true);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.a);
        bundle.putInt("ProfilePictureView_presetSize", this.o);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f);
        bundle.putInt("ProfilePictureView_width", this.c);
        bundle.putInt("ProfilePictureView_height", this.b);
        bundle.putBoolean("ProfilePictureView_refresh", this.p != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f = z;
        e(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.r = bitmap;
    }

    public final void setOnErrorListener(b bVar) {
        this.q = bVar;
    }

    public final void setPresetSize(int i) {
        if (i == -4 || i == -3 || i == -2 || i == -1) {
            this.o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final void setProfileId(String str) {
        boolean z;
        if (f0.C(this.a) || !this.a.equalsIgnoreCase(str)) {
            g();
            z = true;
        } else {
            z = false;
        }
        this.a = str;
        e(z);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
        d(attributeSet);
    }
}
