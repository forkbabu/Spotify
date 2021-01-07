package android.support.wearable.complications.rendering;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.rendering.ComplicationStyle;
import android.support.wearable.complications.rendering.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.spotify.music.C0707R;
import org.xmlpull.v1.XmlPullParser;

public class ComplicationDrawable extends Drawable implements Parcelable {
    public static final int BORDER_STYLE_DASHED = 2;
    public static final int BORDER_STYLE_NONE = 0;
    public static final int BORDER_STYLE_SOLID = 1;
    public static final Parcelable.Creator<ComplicationDrawable> CREATOR = new a();
    private static final String FIELD_ACTIVE_STYLE_BUILDER = "active_style_builder";
    private static final String FIELD_AMBIENT_STYLE_BUILDER = "ambient_style_builder";
    private static final String FIELD_BOUNDS = "bounds";
    private static final String FIELD_HIGHLIGHT_DURATION = "highlight_duration";
    private static final String FIELD_NO_DATA_TEXT = "no_data_text";
    private static final String FIELD_RANGED_VALUE_PROGRESS_HIDDEN = "ranged_value_progress_hidden";
    private static final String TAG = "ComplicationDrawable";
    private final ComplicationStyle.Builder mActiveStyleBuilder;
    private boolean mAlreadyStyled;
    private final ComplicationStyle.Builder mAmbientStyleBuilder;
    private boolean mBurnInProtection;
    private f mComplicationRenderer;
    private Context mContext;
    private long mCurrentTimeMillis;
    private long mHighlightDuration;
    private boolean mInAmbientMode;
    private boolean mIsHighlighted;
    private boolean mIsInflatedFromXml;
    private boolean mIsStyleUpToDate;
    private boolean mLowBitAmbient;
    private final Handler mMainThreadHandler;
    private CharSequence mNoDataText;
    private boolean mRangedValueProgressHidden;
    private final f.a mRendererInvalidateListener;
    private final Runnable mUnhighlightRunnable;

    class a implements Parcelable.Creator<ComplicationDrawable> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationDrawable createFromParcel(Parcel parcel) {
            return new ComplicationDrawable(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationDrawable[] newArray(int i) {
            return new ComplicationDrawable[i];
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComplicationDrawable.this.setIsHighlighted(false);
            ComplicationDrawable.this.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements f.a {
        c() {
        }
    }

    /* synthetic */ ComplicationDrawable(Parcel parcel, a aVar) {
        this(parcel);
    }

    private void assertInitialized() {
        if (this.mContext == null) {
            throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
        }
    }

    private ComplicationStyle.Builder getComplicationStyleBuilder(boolean z) {
        return z ? this.mAmbientStyleBuilder : this.mActiveStyleBuilder;
    }

    private void inflateAttributes(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
        setRangedValueProgressHidden(obtainAttributes.getBoolean(11, false));
        obtainAttributes.recycle();
    }

    private void inflateStyle(boolean z, Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.h);
        ComplicationStyle.Builder complicationStyleBuilder = getComplicationStyleBuilder(z);
        if (obtainAttributes.hasValue(0)) {
            complicationStyleBuilder.b(obtainAttributes.getColor(0, resources.getColor(C0707R.color.complicationDrawable_backgroundColor, null)));
        }
        if (obtainAttributes.hasValue(1)) {
            complicationStyleBuilder.c(obtainAttributes.getDrawable(1));
        }
        if (obtainAttributes.hasValue(14)) {
            complicationStyleBuilder.q(obtainAttributes.getColor(14, resources.getColor(C0707R.color.complicationDrawable_textColor, null)));
        }
        if (obtainAttributes.hasValue(17)) {
            complicationStyleBuilder.t(obtainAttributes.getColor(17, resources.getColor(C0707R.color.complicationDrawable_titleColor, null)));
        }
        if (obtainAttributes.hasValue(16)) {
            complicationStyleBuilder.s(Typeface.create(obtainAttributes.getString(16), 0));
        }
        if (obtainAttributes.hasValue(19)) {
            complicationStyleBuilder.v(Typeface.create(obtainAttributes.getString(19), 0));
        }
        if (obtainAttributes.hasValue(15)) {
            complicationStyleBuilder.r(obtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_textSize)));
        }
        if (obtainAttributes.hasValue(18)) {
            complicationStyleBuilder.u(obtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_titleSize)));
        }
        if (obtainAttributes.hasValue(9)) {
            complicationStyleBuilder.m(obtainAttributes.getColor(9, resources.getColor(C0707R.color.complicationDrawable_iconColor, null)));
        }
        if (obtainAttributes.hasValue(2)) {
            complicationStyleBuilder.e(obtainAttributes.getColor(2, resources.getColor(C0707R.color.complicationDrawable_borderColor, null)));
        }
        if (obtainAttributes.hasValue(5)) {
            complicationStyleBuilder.h(obtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderRadius)));
        }
        if (obtainAttributes.hasValue(6)) {
            complicationStyleBuilder.i(obtainAttributes.getInt(6, resources.getInteger(C0707R.integer.complicationDrawable_borderStyle)));
        }
        if (obtainAttributes.hasValue(4)) {
            complicationStyleBuilder.g(obtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderDashWidth)));
        }
        if (obtainAttributes.hasValue(3)) {
            complicationStyleBuilder.f(obtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderDashGap)));
        }
        if (obtainAttributes.hasValue(7)) {
            complicationStyleBuilder.j(obtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderWidth)));
        }
        if (obtainAttributes.hasValue(12)) {
            complicationStyleBuilder.o(obtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_rangedValueRingWidth)));
        }
        if (obtainAttributes.hasValue(10)) {
            complicationStyleBuilder.n(obtainAttributes.getColor(10, resources.getColor(C0707R.color.complicationDrawable_rangedValuePrimaryColor, null)));
        }
        if (obtainAttributes.hasValue(13)) {
            complicationStyleBuilder.p(obtainAttributes.getColor(13, resources.getColor(C0707R.color.complicationDrawable_rangedValueSecondaryColor, null)));
        }
        if (obtainAttributes.hasValue(8)) {
            complicationStyleBuilder.l(obtainAttributes.getColor(8, resources.getColor(C0707R.color.complicationDrawable_highlightColor, null)));
        }
        obtainAttributes.recycle();
    }

    private static void setStyleToDefaultValues(ComplicationStyle.Builder builder, Resources resources) {
        builder.b(resources.getColor(C0707R.color.complicationDrawable_backgroundColor, null));
        builder.q(resources.getColor(C0707R.color.complicationDrawable_textColor, null));
        builder.t(resources.getColor(C0707R.color.complicationDrawable_titleColor, null));
        builder.s(Typeface.create(resources.getString(C0707R.string.complicationDrawable_textTypeface), 0));
        builder.v(Typeface.create(resources.getString(C0707R.string.complicationDrawable_titleTypeface), 0));
        builder.r(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_textSize));
        builder.u(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_titleSize));
        builder.m(resources.getColor(C0707R.color.complicationDrawable_iconColor, null));
        builder.e(resources.getColor(C0707R.color.complicationDrawable_borderColor, null));
        builder.j(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderWidth));
        builder.h(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderRadius));
        builder.i(resources.getInteger(C0707R.integer.complicationDrawable_borderStyle));
        builder.g(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderDashWidth));
        builder.f(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_borderDashGap));
        builder.o(resources.getDimensionPixelSize(C0707R.dimen.complicationDrawable_rangedValueRingWidth));
        builder.n(resources.getColor(C0707R.color.complicationDrawable_rangedValuePrimaryColor, null));
        builder.p(resources.getColor(C0707R.color.complicationDrawable_rangedValueSecondaryColor, null));
        builder.l(resources.getColor(C0707R.color.complicationDrawable_highlightColor, null));
    }

    private void updateStyleIfRequired() {
        if (!this.mIsStyleUpToDate) {
            this.mComplicationRenderer.s(this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
            this.mIsStyleUpToDate = true;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void draw(Canvas canvas, long j) {
        assertInitialized();
        setCurrentTimeMillis(j);
        draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public ComplicationStyle getActiveStyle() {
        return this.mActiveStyleBuilder.a();
    }

    /* access modifiers changed from: package-private */
    public ComplicationStyle getAmbientStyle() {
        return this.mAmbientStyleBuilder.a();
    }

    /* access modifiers changed from: package-private */
    public f getComplicationRenderer() {
        return this.mComplicationRenderer;
    }

    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getNoDataText() {
        return this.mNoDataText;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        this.mIsInflatedFromXml = true;
        int depth = xmlPullParser.getDepth();
        inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        inflateStyle(false, resources, xmlPullParser);
        inflateStyle(true, resources, xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                String name = xmlPullParser.getName();
                if (TextUtils.equals(name, "ambient")) {
                    inflateStyle(true, resources, xmlPullParser);
                } else {
                    String valueOf = String.valueOf(this);
                    String.valueOf(name).length();
                    valueOf.length();
                }
            }
        }
        this.mIsStyleUpToDate = false;
    }

    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }

    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        f fVar = this.mComplicationRenderer;
        if (fVar != null) {
            fVar.n(rect);
        }
    }

    @Deprecated
    public boolean onTap(int i, int i2, long j) {
        return onTap(i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setBackgroundColorActive(int i) {
        getComplicationStyleBuilder(false).b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundColorAmbient(int i) {
        getComplicationStyleBuilder(true).b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableActive(Drawable drawable) {
        getComplicationStyleBuilder(false).c(drawable);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableAmbient(Drawable drawable) {
        getComplicationStyleBuilder(true).c(drawable);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorActive(int i) {
        getComplicationStyleBuilder(false).e(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorAmbient(int i) {
        getComplicationStyleBuilder(true).e(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapActive(int i) {
        getComplicationStyleBuilder(false).f(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapAmbient(int i) {
        getComplicationStyleBuilder(true).f(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthActive(int i) {
        getComplicationStyleBuilder(false).g(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthAmbient(int i) {
        getComplicationStyleBuilder(true).g(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusActive(int i) {
        getComplicationStyleBuilder(false).h(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusAmbient(int i) {
        getComplicationStyleBuilder(true).h(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleActive(int i) {
        getComplicationStyleBuilder(false).i(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleAmbient(int i) {
        getComplicationStyleBuilder(true).i(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthActive(int i) {
        getComplicationStyleBuilder(false).j(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthAmbient(int i) {
        getComplicationStyleBuilder(true).j(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBurnInProtection(boolean z) {
        this.mBurnInProtection = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setComplicationData(ComplicationData complicationData) {
        assertInitialized();
        this.mComplicationRenderer.o(complicationData);
    }

    public void setContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Argument \"context\" should not be null.");
        } else if (!g.a(context, this.mContext)) {
            this.mContext = context;
            if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
                setStyleToDefaultValues(this.mActiveStyleBuilder, context.getResources());
                setStyleToDefaultValues(this.mAmbientStyleBuilder, context.getResources());
            }
            if (!this.mAlreadyStyled) {
                this.mHighlightDuration = (long) context.getResources().getInteger(C0707R.integer.complicationDrawable_highlightDurationMs);
            }
            f fVar = new f(this.mContext, this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
            this.mComplicationRenderer = fVar;
            fVar.q(this.mRendererInvalidateListener);
            CharSequence charSequence = this.mNoDataText;
            if (charSequence == null) {
                setNoDataText(context.getString(C0707R.string.complicationDrawable_noDataText));
            } else {
                this.mComplicationRenderer.p(charSequence);
            }
            this.mComplicationRenderer.r(this.mRangedValueProgressHidden);
            this.mComplicationRenderer.n(getBounds());
            this.mIsStyleUpToDate = true;
        }
    }

    public void setCurrentTimeMillis(long j) {
        this.mCurrentTimeMillis = j;
    }

    public void setHighlightColorActive(int i) {
        getComplicationStyleBuilder(false).l(i);
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightColorAmbient(int i) {
        getComplicationStyleBuilder(true).l(i);
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightDuration(long j) {
        if (j >= 0) {
            this.mHighlightDuration = j;
            return;
        }
        throw new IllegalArgumentException("Highlight duration should be non-negative.");
    }

    public void setIconColorActive(int i) {
        getComplicationStyleBuilder(false).m(i);
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorAmbient(int i) {
        getComplicationStyleBuilder(true).m(i);
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterActive(ColorFilter colorFilter) {
        getComplicationStyleBuilder(false).k(colorFilter);
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterAmbient(ColorFilter colorFilter) {
        getComplicationStyleBuilder(true).k(colorFilter);
        this.mIsStyleUpToDate = false;
    }

    public void setInAmbientMode(boolean z) {
        this.mInAmbientMode = z;
    }

    public void setIsHighlighted(boolean z) {
        this.mIsHighlighted = z;
    }

    public void setLowBitAmbient(boolean z) {
        this.mLowBitAmbient = z;
    }

    public void setNoDataText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mNoDataText = "";
        } else {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        }
        f fVar = this.mComplicationRenderer;
        if (fVar != null) {
            fVar.p(this.mNoDataText);
        }
    }

    public void setRangedValuePrimaryColorActive(int i) {
        getComplicationStyleBuilder(false).n(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).n(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueProgressHidden(boolean z) {
        this.mRangedValueProgressHidden = z;
        f fVar = this.mComplicationRenderer;
        if (fVar != null) {
            fVar.r(z);
        }
    }

    public void setRangedValueRingWidthActive(int i) {
        getComplicationStyleBuilder(false).o(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueRingWidthAmbient(int i) {
        getComplicationStyleBuilder(true).o(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorActive(int i) {
        getComplicationStyleBuilder(false).p(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).p(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorActive(int i) {
        getComplicationStyleBuilder(false).q(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorAmbient(int i) {
        getComplicationStyleBuilder(true).q(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeActive(int i) {
        getComplicationStyleBuilder(false).r(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeAmbient(int i) {
        getComplicationStyleBuilder(true).r(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).s(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).s(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorActive(int i) {
        getComplicationStyleBuilder(false).t(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorAmbient(int i) {
        getComplicationStyleBuilder(true).t(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeActive(int i) {
        getComplicationStyleBuilder(false).u(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeAmbient(int i) {
        getComplicationStyleBuilder(true).u(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).v(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).v(typeface);
        this.mIsStyleUpToDate = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(FIELD_ACTIVE_STYLE_BUILDER, this.mActiveStyleBuilder);
        bundle.putParcelable(FIELD_AMBIENT_STYLE_BUILDER, this.mAmbientStyleBuilder);
        bundle.putCharSequence(FIELD_NO_DATA_TEXT, this.mNoDataText);
        bundle.putLong(FIELD_HIGHLIGHT_DURATION, this.mHighlightDuration);
        bundle.putBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN, this.mRangedValueProgressHidden);
        bundle.putParcelable(FIELD_BOUNDS, getBounds());
        parcel.writeBundle(bundle);
    }

    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new b();
        this.mRendererInvalidateListener = new c();
        this.mActiveStyleBuilder = new ComplicationStyle.Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle.Builder();
    }

    public boolean onTap(int i, int i2) {
        ComplicationData l;
        f fVar = this.mComplicationRenderer;
        if (fVar == null || (l = fVar.l()) == null || ((l.r() == null && l.getType() != 9) || !getBounds().contains(i, i2) || l.getType() == 9)) {
            return false;
        }
        try {
            l.r().send();
            if (getHighlightDuration() > 0) {
                setIsHighlighted(true);
                invalidateSelf();
                this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
                this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, getHighlightDuration());
            }
            return true;
        } catch (PendingIntent.CanceledException unused) {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        assertInitialized();
        updateStyleIfRequired();
        this.mComplicationRenderer.j(canvas, this.mCurrentTimeMillis, this.mInAmbientMode, this.mLowBitAmbient, this.mBurnInProtection, this.mIsHighlighted);
    }

    public ComplicationDrawable(Context context) {
        this();
        setContext(context);
    }

    public ComplicationDrawable(ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new b();
        this.mRendererInvalidateListener = new c();
        this.mActiveStyleBuilder = new ComplicationStyle.Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle.Builder(complicationDrawable.mAmbientStyleBuilder);
        CharSequence charSequence = complicationDrawable.mNoDataText;
        this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }

    private ComplicationDrawable(Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new b();
        this.mRendererInvalidateListener = new c();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle.Builder) readBundle.getParcelable(FIELD_ACTIVE_STYLE_BUILDER);
        this.mAmbientStyleBuilder = (ComplicationStyle.Builder) readBundle.getParcelable(FIELD_AMBIENT_STYLE_BUILDER);
        this.mNoDataText = readBundle.getCharSequence(FIELD_NO_DATA_TEXT);
        this.mHighlightDuration = readBundle.getLong(FIELD_HIGHLIGHT_DURATION);
        this.mRangedValueProgressHidden = readBundle.getBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN);
        setBounds((Rect) readBundle.getParcelable(FIELD_BOUNDS));
        this.mAlreadyStyled = true;
    }
}
