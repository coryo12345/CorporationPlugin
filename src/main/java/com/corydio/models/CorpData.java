package com.corydio.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CorpData implements Serializable {
    // static factory
    private static CorpData data = null;

    public static CorpData getCorpData() {
        if (data == null) {
            data = new CorpData();
        }
        return data;
    }

    public static List<Corporation> getCorporations() {
        return data.corporations;
    }

    // instance properties
    private final List<Corporation> corporations;

    private CorpData() {
        this.corporations = new ArrayList<Corporation>();
    }
}
