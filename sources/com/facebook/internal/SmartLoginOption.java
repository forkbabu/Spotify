package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<SmartLoginOption> f = EnumSet.allOf(SmartLoginOption.class);
    private final long mValue;

    private SmartLoginOption(long j) {
        this.mValue = j;
    }

    public static EnumSet<SmartLoginOption> d(long j) {
        EnumSet<SmartLoginOption> noneOf = EnumSet.noneOf(SmartLoginOption.class);
        Iterator it = f.iterator();
        while (it.hasNext()) {
            SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
            if ((smartLoginOption.mValue & j) != 0) {
                noneOf.add(smartLoginOption);
            }
        }
        return noneOf;
    }
}
