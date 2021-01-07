package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: cla  reason: default package */
public abstract class cla {
    @JsonCreator
    public static cla create(boolean z, String str, String str2) {
        return new ala(Boolean.valueOf(z), str, str2);
    }

    public abstract String a();

    public abstract Boolean b();

    public abstract String c();
}
