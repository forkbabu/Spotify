package com.google.thirdparty.publicsuffix;

public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    private final char innerNodeCode;
    private final char leafNodeCode;

    private PublicSuffixType(char c2, char c3) {
        this.innerNodeCode = c2;
        this.leafNodeCode = c3;
    }

    static PublicSuffixType d(char c2) {
        PublicSuffixType[] values = values();
        for (int i = 0; i < 2; i++) {
            PublicSuffixType publicSuffixType = values[i];
            if (publicSuffixType.innerNodeCode == c2 || publicSuffixType.leafNodeCode == c2) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException(je.o0("No enum corresponding to given code: ", c2));
    }
}
