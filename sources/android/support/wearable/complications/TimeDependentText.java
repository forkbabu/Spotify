package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcelable;

public interface TimeDependentText extends Parcelable {
    CharSequence L1(Context context, long j);

    boolean x0(long j, long j2);
}
