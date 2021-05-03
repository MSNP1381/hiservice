package com.app.wordpress.realm.table;

import com.app.wordpress.model.Attachment;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class AttachmentRealm extends RealmObject {

    @PrimaryKey
    public int id = -1;
    public String url;
    public String mime_type;

    public Attachment getOriginal() {
        Attachment a = new Attachment();
        a.id = id;
        a.url = url;
        a.mime_type = mime_type;
        return a;
    }

}
