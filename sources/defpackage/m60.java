package defpackage;

import java.util.TimeZone;

/* renamed from: m60  reason: default package */
public class m60 {
    public String a = "UNKNOWN";
    public boolean b = false;
    public long c = -1;
    public long d = -1;
    public String e = TimeZone.getDefault().getID();
    public float f = 1.0f;
    public long g = -1;
    public long h = -1;

    public String toString() {
        StringBuilder V0 = je.V0("TpoContextEvent{mTpoContextList=");
        V0.append(this.a);
        V0.append(", mIsTriggerContext=");
        V0.append(this.b);
        V0.append(", mTime=");
        V0.append(i.a(this.c));
        V0.append(", mExpiredTime=");
        V0.append(i.a(this.d));
        V0.append(", mTimeZoneId=");
        V0.append(this.e);
        V0.append(", mConfidence=");
        V0.append(this.f);
        V0.append(", mBaseTime=");
        V0.append(this.g);
        V0.append(", mEventTime=");
        V0.append(i.a(this.h));
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }
}
