package com.example.a126308.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 126308 on 19/5/2017.
 */

public class Note implements Serializable {

    private int id;
    private String noteContent;

    public Note (int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }



    public int getId() { return id; }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

}
