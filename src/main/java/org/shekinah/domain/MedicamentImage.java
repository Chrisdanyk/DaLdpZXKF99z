package org.shekinah.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity(name="MedicamentImage")
@Table(name="\"MedicamentImage\"")
public class MedicamentImage extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @Lob
    private byte[] content;

    public byte[] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

}
