package com.alexazhu.callblocker.blockednumber;

import android.arch.persistence.room.TypeConverter;

public enum BlockedNumberType {
    EXACT_MATCH("Exact match"),
    REGEX_MATCH("Prefix match");

    private BlockedNumberType(final String displayText) {
        this.displayText = displayText;
    }

    private final String displayText;

    public String getDisplayText() {
        return displayText;
    }
}