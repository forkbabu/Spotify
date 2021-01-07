package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

final class f implements FilenameFilter {
    f() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.matches(String.format("^(%s|%s|%s)[0-9]+.json$", "crash_log_", "shield_log_", "thread_check_log_"));
    }
}
