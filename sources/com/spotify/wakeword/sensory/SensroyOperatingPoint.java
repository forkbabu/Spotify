package com.spotify.wakeword.sensory;

public enum SensroyOperatingPoint {
    DEFAULT("default", 0),
    ONE("one", 1),
    TWO("two", 2),
    THREE("three", 3),
    FOUR("four", 4),
    FIVE("five", 5),
    SIX("six", 6),
    SEVEN("seven", 7),
    EIGHT("eight", 8),
    NINE("nine", 9),
    TEN("ten", 10),
    ELEVEN("eleven", 11),
    TWELVE("twelve", 12),
    THIRTEEN("thirteen", 13),
    FOURTEEN("fourteen", 14),
    FIFTEEN("fifteen", 15),
    SIXTEEN("sixteen", 16),
    SEVENTEEN("seventeen", 17),
    EIGHTEEN("eighteen", 18),
    NINETEEN("nineteen", 19),
    TWENTY("twenty", 20),
    TWENTYONE("twentyone", 21);
    
    private final String mName;
    private final int mValue;

    private SensroyOperatingPoint(String str, int i) {
        this.mName = str;
        this.mValue = i;
    }

    public static SensroyOperatingPoint d(String str) {
        SensroyOperatingPoint[] values = values();
        for (int i = 0; i < 22; i++) {
            SensroyOperatingPoint sensroyOperatingPoint = values[i];
            if (sensroyOperatingPoint.mName.equals(str)) {
                return sensroyOperatingPoint;
            }
        }
        return DEFAULT;
    }

    public int g() {
        return this.mValue;
    }
}
