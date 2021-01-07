package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public enum FieldNamingPolicy implements d {
    IDENTITY {
        @Override // com.google.gson.d
        public String d(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // com.google.gson.d
        public String d(Field field) {
            return FieldNamingPolicy.h(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // com.google.gson.d
        public String d(Field field) {
            return FieldNamingPolicy.h(FieldNamingPolicy.g(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // com.google.gson.d
        public String d(Field field) {
            return FieldNamingPolicy.g(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // com.google.gson.d
        public String d(Field field) {
            return FieldNamingPolicy.g(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // com.google.gson.d
        public String d(Field field) {
            return FieldNamingPolicy.g(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    FieldNamingPolicy(AnonymousClass1 r3) {
    }

    static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String h(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            StringBuilder S0 = je.S0(upperCase);
            S0.append(str.substring(1));
            return S0.toString();
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
