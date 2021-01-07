package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: u02  reason: default package */
public class u02 extends URLSpan {
    public static final Parcelable.Creator<u02> CREATOR = new a();

    /* renamed from: u02$a */
    static class a implements Parcelable.Creator<u02> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public u02 createFromParcel(Parcel parcel) {
            return new u02(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public u02[] newArray(int i) {
            return new u02[i];
        }
    }

    public u02(Parcel parcel) {
        super(parcel);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u02)) {
            return false;
        }
        return ((u02) obj).getURL().equals(getURL());
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getURL().hashCode();
    }

    @Override // android.text.style.CharacterStyle, android.text.style.ClickableSpan
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public u02(String str) {
        super(str);
    }
}
